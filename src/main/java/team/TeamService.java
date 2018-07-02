package team;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class TeamService {
	
	private JSONObject json;
	
	public TeamService() {
		StringBuilder builder = new StringBuilder();
		try {
			Stream<String> stream = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("classpath:/nyjets.json"))).lines();
			stream.forEach(s -> builder.append(s).append("\n"));
			stream.close();
			this.json = new JSONObject(new JSONTokener(builder.toString()));
		} catch(JSONException e) {
			this.json = null;
			e.printStackTrace();
		}
	}

	public TeamRep getTeam() throws JSONException {
		return new TeamRep(json);
	}
	
	public Collection<PlayerIdRep> getPlayers() {
		JSONArray playerArray = json.getJSONArray("players");
		Collection<PlayerIdRep> players = new ArrayList<>(playerArray.length());
		for (int i = 0; i < playerArray.length(); i++) {
			players.add(new PlayerIdRep(playerArray.getJSONObject(i)));
		}
		return players;
	}
	
	public PlayerRep getPlayer(String id) {
		JSONArray playerArray = json.getJSONArray("players");
		for (int i = 0; i < playerArray.length(); i++) {
			JSONObject obj = playerArray.getJSONObject(i);
			if (obj.getString("id").equalsIgnoreCase(id)) {
				return new PlayerRep(obj);
			}
		}
		return null;
	}
}
