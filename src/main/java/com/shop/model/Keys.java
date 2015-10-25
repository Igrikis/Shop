/**
 * This class is generated by jOOQ
 */
package com.shop.model;


import com.shop.model.tables.Profile;
import com.shop.model.tables.Role;
import com.shop.model.tables.records.ProfileRecord;
import com.shop.model.tables.records.RoleRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>shop</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<ProfileRecord, Integer> IDENTITY_PROFILE = Identities0.IDENTITY_PROFILE;
	public static final Identity<RoleRecord, Integer> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ProfileRecord> KEY_PROFILE_PRIMARY = UniqueKeys0.KEY_PROFILE_PRIMARY;
	public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<ProfileRecord, Integer> IDENTITY_PROFILE = createIdentity(Profile.PROFILE, Profile.PROFILE.ID);
		public static Identity<RoleRecord, Integer> IDENTITY_ROLE = createIdentity(Role.ROLE, Role.ROLE.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ProfileRecord> KEY_PROFILE_PRIMARY = createUniqueKey(Profile.PROFILE, Profile.PROFILE.ID);
		public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = createUniqueKey(Role.ROLE, Role.ROLE.ID);
	}
}