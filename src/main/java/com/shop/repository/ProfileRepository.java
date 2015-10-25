package com.shop.repository;

import com.shop.model.tables.Profile;

import java.util.List;

public interface ProfileRepository {

    public Profile findById(Integer id);

    public List<Profile> getAllProfiles();

    public void updateProfile(Profile profile);

    public void deleteProfile(Integer id);

}
