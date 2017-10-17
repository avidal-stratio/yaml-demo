package com.stratio.yaml.demo.model;

import java.util.HashMap;
import java.util.List;

public class Team {

    private String name;

    private String coach;

    private HashMap<String, Integer> titles;

    private List<Player> players;

    private List<String> history;

    private HashMap<String, List<Player>> positions;

    private HashMap<String, Player> injured;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public HashMap<String, Integer> getTitles() {
        return titles;
    }

    public void setTitles(HashMap<String, Integer> titles) {
        this.titles = titles;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public HashMap<String, List<Player>> getPositions() {
        return positions;
    }

    public void setPositions(HashMap<String, List<Player>> positions) {
        this.positions = positions;
    }

    public HashMap<String, Player> getInjured() {
        return injured;
    }

    public void setInjured(HashMap<String, Player> injured) {
        this.injured = injured;
    }
}
