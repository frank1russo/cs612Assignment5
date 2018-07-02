package team;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapConfiguration {

	@Bean
	public TeamService getTeamService() {
		return new TeamService();
	}
}
