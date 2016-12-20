package kik.bot.api;

import java.util.Date;

public class UserProfile {
	String displayName;
	String userName;
	String firstName;
	String lastName;
	String profilePicUrl;
	Date profilePicLastModified;

	public String getDisplayName() {
		return displayName;
	}

	public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public Date getProfilePicLastModified() {
		return profilePicLastModified;
	}

}
