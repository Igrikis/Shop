package com.shop.config;

import com.shop.exception.JOOQException;
import org.apache.commons.dbcp.BasicDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.shop")
@EnableTransactionManagement
@PropertySource(value = {"classpath:application.properties"})
public class ApplicationContextConfig {

    private final static String JDBC_DRIVER = "jdbc.driverClassName";
    private final static String JDBC_URL = "jdbc.url";
    private final static String JDBC_USER_NAME = "jdbc.username";
    private final static String JDBC_PASSWORD = "jdbc.password";
    private final static String JOOQ_SQL_DIALECT = "jooq.sql.dialect";

    @Autowired
    Environment environment;

    @Bean(name = "dataSource", destroyMethod = "close")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getProperty(JDBC_DRIVER));
        dataSource.setUrl(environment.getProperty(JDBC_URL));
        dataSource.setUsername(environment.getProperty(JDBC_USER_NAME));
        dataSource.setPassword(environment.getProperty(JDBC_PASSWORD));

        return dataSource;
    }

    @Bean
    public LazyConnectionDataSourceProxy lazyConnectionDataSource() {
        return new LazyConnectionDataSourceProxy(getDataSource());
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(lazyConnectionDataSource());
    }

    @Bean
    public TransactionAwareDataSourceProxy transactionAwareDataSource() {
        return new TransactionAwareDataSourceProxy(lazyConnectionDataSource());
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider(transactionAwareDataSource());
    }

    @Bean
    public JOOQException jooqException(){
        return new JOOQException();
    }

    @Bean
    public DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();

        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(new DefaultExecuteListenerProvider(
                jooqException()
        ));

        String sqlDialectName = environment.getRequiredProperty(JOOQ_SQL_DIALECT);
        SQLDialect dialect = SQLDialect.valueOf(sqlDialectName);
        jooqConfiguration.set(dialect);

        return jooqConfiguration;
    }

    @Bean()
    public DSLContext dslContext() {
        return new DefaultDSLContext(configuration());
    }

}