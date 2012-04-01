package com.idoux.bowlingDB.data.domain;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Dan
 * Date: 3/22/12
 * Time: 11:53 PM
 */

@Entity
@Table(name = "player")
public class Player {

    Long id;
    String externalId;
    String name;
    private Team team;

    @Id
    @Column(name = "id")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "external_id")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
