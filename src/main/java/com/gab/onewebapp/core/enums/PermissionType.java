package com.gab.onewebapp.core.enums;


public enum PermissionType {
	PERM_DELETE_FILE("PERM_DELETE_FILE");
     
    private String permissionType;
     
    private PermissionType(String permissionType){
        this.permissionType = permissionType;
    }
    
    @Override
	public String toString() {
		return permissionType;	
	}
}
