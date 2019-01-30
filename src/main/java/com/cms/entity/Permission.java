package com.cms.entity;


public class Permission {
    private int permissionID;
    private String permission;
    private String status;

    @Override
    public String toString() {
        return "Permission{" +
                "permissionID=" + permissionID +
                ", permission='" + permission + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(int permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
