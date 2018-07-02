package team;

import java.util.Collection;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@Autowired
    private TeamService teamService;

	@RequestMapping("/")
	public ResponseEntity<TeamRep> team() {
		HttpStatus status = HttpStatus.OK;
		TeamRep team = null;
		try {
			team = teamService.getTeam();
		} catch (JSONException e) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<TeamRep>(team, status);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/players")
    public ResponseEntity<Collection<PlayerIdRep>> players() {
		HttpStatus status = HttpStatus.OK;
		Collection<PlayerIdRep> players = null;
		try {
			players = teamService.getPlayers();
		} catch (Exception e) {
			status = HttpStatus.NOT_FOUND;
		}
		return new ResponseEntity<Collection<PlayerIdRep>>(players, status);
    }
	
	@RequestMapping(method=RequestMethod.GET, path="/players/{id}")
    public ResponseEntity<PlayerRep> player(@PathVariable String id) {
		PlayerRep player = teamService.getPlayer(id);
		HttpStatus status = HttpStatus.OK;
		if (player == null) {
			status= HttpStatus.NOT_FOUND;
		}
		return new ResponseEntity<PlayerRep>(player, status);
	}
	
}
