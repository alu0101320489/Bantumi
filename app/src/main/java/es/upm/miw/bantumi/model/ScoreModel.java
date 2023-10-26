package es.upm.miw.bantumi.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity(tableName = "score")
public class ScoreModel {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String playerName;
    private Date dateTime;
    private int store1;
    private int store2;

    public ScoreModel(String playerName, Date dateTime, int store1, int store2) {
        this.playerName = playerName;
        this.dateTime = dateTime;
        this.store1 = store1;
        this.store2 = store2;
    }

    public int getId() {
        return id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getStore1() {
        return store1;
    }

    public int getStore2() {
        return store2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setStore1(int store1) {
        this.store1 = store1;
    }

    public void setStore2(int store2) {
        this.store2 = store2;
    }
}

