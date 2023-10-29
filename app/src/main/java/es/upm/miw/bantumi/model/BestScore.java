package es.upm.miw.bantumi.model;

public class BestScore {

    private String playerName;
    private int store1;

    public BestScore(String playerName, int store1) {
        this.playerName = playerName;
        this.store1 = store1;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getStore() {
        return store1;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setStore(int store) {
        this.store1 = store;
    }

    public String toString() {
        return playerName + " - " + store1;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof BestScore)) {
            return false;
        }
        BestScore other = (BestScore) o;
        return this.playerName.equals(other.playerName) && this.store1 == other.store1;
    }
}
