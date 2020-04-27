package com.security;

import java.util.Set;

import com.google.common.collect.Sets;
import static com.security.ApplicationUserPermission.*;


public enum ApplicationUserRole {
	 STUDENT(Sets.newHashSet()),
	    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
	    ADMINTRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));

	    private final Set<ApplicationUserPermission> permissions;

	    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
	        this.permissions = permissions;
	    }

	    public Set<ApplicationUserPermission> getPermissions() {
	        return permissions;
	    }
	}