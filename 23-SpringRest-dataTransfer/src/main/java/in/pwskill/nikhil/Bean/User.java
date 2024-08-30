package in.pwskill.nikhil.Bean;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
@JsonFormat
public class User {
private String userId;
private String username;
private String userage;
private String userAddress;
private List<String>friends;
private Map<String,Long>bankDetails;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserage() {
	return userage;
}
public void setUserage(String userage) {
	this.userage = userage;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public List<String> getFriends() {
	return friends;
}
public void setFriends(List<String> friends) {
	this.friends = friends;
}
public Map<String, Long> getBankDetails() {
	return bankDetails;
}
public void setBankDetails(Map<String, Long> bankDetails) {
	this.bankDetails = bankDetails;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", userage=" + userage + ", userAddress=" + userAddress
			+ ", friends=" + friends + ", bankDetails=" + bankDetails + "]";
}
public User(String userId, String username, String userage, String userAddress, List<String> friends,
		Map<String, Long> bankDetails) {
	super();
	this.userId = userId;
	this.username = username;
	this.userage = userage;
	this.userAddress = userAddress;
	this.friends = friends;
	this.bankDetails = bankDetails;
}


}
