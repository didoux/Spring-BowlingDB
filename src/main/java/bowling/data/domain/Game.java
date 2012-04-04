package bowling.data.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: pnamatya
 * Date: 4/1/12
 * Time: 7:24 PM       this is test
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Game")
public class Game implements Serializable {
    private Long id;
    private Player player;
    private Week week;
    private int gameNbr;
    private int score;

    @Id
    @Column(name = "id")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @ManyToOne
    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    @Column(name = "nbr")
    public int getGameNbr() {
        return gameNbr;
    }

    public void setGameNbr(int gameNbr) {
        this.gameNbr = gameNbr;
    }

    @Column(name="score")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
