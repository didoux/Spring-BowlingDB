package bowling.data.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: didoux2
 * Date: 4/2/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Throw")
public class Throw {
    private int id;
    private int nbr; // 1, 2 or 3 (10th) frame
    private int pins;
    private String ballNameTxt;
    private int target;
    private int position;
    private Frame frame;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public String getBallNameTxt() {
        return ballNameTxt;
    }

    public void setBallNameTxt(String ballNameTxt) {
        this.ballNameTxt = ballNameTxt;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}
