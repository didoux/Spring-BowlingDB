package bowling.data.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: pnamatya
 * Date: 4/1/12
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "frames")
public class Frames implements Serializable {
    private Long id;
    private int downPins;
    private int ball;
    private int target;
    private int position;
    private int laneNumber;
    private String notes;
    private Games games;

    @Id
    @Column(name = "id")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name= "downPins")
    public int getDownPins() {
        return downPins;
    }

    public void setDownPins(int downPins) {
        this.downPins = downPins;
    }

    @Column(name = "ball")
    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Column(name = "target")
    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Column(name = "position")
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Column(name = "laneNumber")
    public int getLaneNumber() {
        return laneNumber;
    }

    public void setLaneNumber(int laneNumber) {
        this.laneNumber = laneNumber;
    }

    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name ="games")
    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }
}
