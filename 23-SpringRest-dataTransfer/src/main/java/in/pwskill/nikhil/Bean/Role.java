package in.pwskill.nikhil.Bean;

public class Role {
private String roleId;
private String rolename;
public String getRoleId() {
	return roleId;
}
public void setRoleId(String roleId) {
	this.roleId = roleId;
}
public String getRolename() {
	return rolename;
}
public void setRolename(String rolename) {
	this.rolename = rolename;
}
@Override
public String toString() {
	return "Role [roleId=" + roleId + ", rolename=" + rolename + "]";
}
public Role(String roleId, String rolename) {
	super();
	this.roleId = roleId;
	this.rolename = rolename;
}

}
