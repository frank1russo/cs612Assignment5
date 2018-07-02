package team;

import java.util.ArrayList;
import java.util.Collection;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeamRep {

	public TeamRep() {
		
	}
	
	public TeamRep(JSONObject json) {
		this.id = json.getString("id");
		this.name = json.getString("name");
		this.market = json.getString("market");
		this.alias = json.getString("alias");
		this.stadium = json.getJSONObject("venue").getString("name");
		this.division = json.getJSONObject("division").getString("name");
		this.conference = json.getJSONObject("conference").getString("name");
		JSONArray playerArray = json.getJSONArray("players");
		this.players = new ArrayList<>(playerArray.length());
		for (int i = 0; i < playerArray.length(); i++) {
			players.add(new PlayerIdRep(playerArray.getJSONObject(i)));
		}
	}
	
	private String id;
	private String name;
	private String market;
	private String alias;
	private String stadium;
	private String division;
	private String conference;
	private Collection<PlayerIdRep> players;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMarket() {
		return market;
	}
	
	public void setMarket(String market) {
		this.market = market;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getStadium() {
		return stadium;
	}
	
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	public String getDivision() {
		return division;
	}
	
	public void setDivision(String division) {
		this.division = division;
	}
	
	public String getConference() {
		return conference;
	}
	
	public void setConference(String conference) {
		this.conference = conference;
	}
	
	public Collection<PlayerIdRep> getPlayers() {
		return players;
	}
	
	public void setPlayers(Collection<PlayerIdRep> players) {
		this.players = players;
	}
	
}
