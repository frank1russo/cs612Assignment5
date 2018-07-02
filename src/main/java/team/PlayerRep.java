package team;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

public class PlayerRep {
	
	public PlayerRep() {}
	
	public PlayerRep(JSONObject json) {
		this.id = json.getString("id");
		this.firstName = json.getString("first_name");
		this.lastName = json.getString("last_name");
		this.position = json.getString("position");
		this.jersey = Integer.parseInt(json.getString("jersey"));
		this.weight = json.getFloat("weight");
		this.height = json.getInt("height");
		this.birthPlace = json.getString("birth_place");
		this.college = json.getString("college");
		this.collegeConference = json.getString("college_conf");
		this.rookieYear = json.getInt("rookie_year");
		try {
			this.birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(json.getString("birth_date"));
		} catch (ParseException e) {
			this.birthDate = null;
		}
	}

	private String id;
	private String firstName;
	private String lastName;
	private String position;
	private int jersey;
	private Date birthDate; //1994-06-11
	private float weight;
	private int height; 
    private String birthPlace;
    private String college;
    private String collegeConference;
    private int rookieYear;
	
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
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getJersey() {
		return jersey;
	}
	
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getBirthPlace() {
		return birthPlace;
	}
	
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getCollegeConference() {
		return collegeConference;
	}
	
	public void setCollegeConference(String collegeConference) {
		this.collegeConference = collegeConference;
	}
	
	public int getRookieYear() {
		return rookieYear;
	}
	
	public void setRookieYear(int rookieYear) {
		this.rookieYear = rookieYear;
	}
	
}
