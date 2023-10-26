package es.upm.miw.bantumi;

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
}
