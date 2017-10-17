package com.stratio.yaml.demo.controller;

import com.stratio.yaml.demo.model.Team;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "application")
@RestController(value = "/team")
public class TeamController {

    private Team team;

    @GetMapping
    public Team getTeamInformation() {
        return team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
