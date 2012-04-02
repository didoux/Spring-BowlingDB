package bowling.data.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: pnamatya
 * Date: 4/1/12
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "games")
public class Games implements Serializable {
    private Long id;
    private Player player;
    private Weeks weeks;
    private int gameNumber;
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
    public Weeks getWeeks() {
        return weeks;
    }

    public void setWeeks(Weeks weeks) {
        this.weeks = weeks;
    }

    @Column(name = "gameNumber")
    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    @Column(name="score")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
