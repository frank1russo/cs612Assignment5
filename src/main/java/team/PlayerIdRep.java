package team;

import org.json.JSONObject;

public class PlayerIdRep {
	
	public PlayerIdRep() {}
	
	public PlayerIdRep(JSONObject json) {
		this.id = json.getString("id");
		this.firstName = json.getString("first_name");
		this.lastName = json.getString("last_name");
	}

	private String id;
	private String firstName;
	private String lastName;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
