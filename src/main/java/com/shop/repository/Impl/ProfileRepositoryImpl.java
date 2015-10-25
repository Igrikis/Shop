package com.shop.repository.Impl;

import com.shop.model.tables.Profile;
import com.shop.repository.ProfileRepository;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileRepositoryImpl implements ProfileRepository{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileRepositoryImpl.class);

    @Autowired
    DSLContext dslContext;

    @Override
    public Profile findById(Integer id) {
        return null;
    }

    @Override
    public List<Profile> getAllProfiles() {
        return null;
    }

    @Override
    public void updateProfile(Profile profile) {

    }

    @Override
    public void deleteProfile(Integer id) {

    }
}
