/**
 * This class is generated by jOOQ
 */
package com.shop.model.tables;


import com.shop.model.Keys;
import com.shop.model.Shop;
import com.shop.model.tables.records.ProfileRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Profile extends TableImpl<ProfileRecord> {

	private static final long serialVersionUID = -1785660137;

	/**
	 * The reference instance of <code>shop.profile</code>
	 */
	public static final Profile PROFILE = new Profile();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileRecord> getRecordType() {
		return ProfileRecord.class;
	}

	/**
	 * The column <code>shop.profile.id</code>.
	 */
	public final TableField<ProfileRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>shop.profile.login</code>.
	 */
	public final TableField<ProfileRecord, String> LOGIN = createField("login", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>shop.profile.password</code>.
	 */
	public final TableField<ProfileRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>shop.profile.firstname</code>.
	 */
	public final TableField<ProfileRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>shop.profile.lastname</code>.
	 */
	public final TableField<ProfileRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>shop.profile.email</code>.
	 */
	public final TableField<ProfileRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * Create a <code>shop.profile</code> table reference
	 */
	public Profile() {
		this("profile", null);
	}

	/**
	 * Create an aliased <code>shop.profile</code> table reference
	 */
	public Profile(String alias) {
		this(alias, PROFILE);
	}

	private Profile(String alias, Table<ProfileRecord> aliased) {
		this(alias, aliased, null);
	}

	private Profile(String alias, Table<ProfileRecord> aliased, Field<?>[] parameters) {
		super(alias, Shop.SHOP, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProfileRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PROFILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileRecord>>asList(Keys.KEY_PROFILE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Profile as(String alias) {
		return new Profile(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Profile rename(String name) {
		return new Profile(name, null);
	}
}
