package be.multimedi.gameSite;

import java.util.Date;

public class GamersScore {
    // Variabelen
    private int id;
    private String gamersVoornaam;
    private String gamersNaam;
    private int gamersScore;
    private Date gamersDatum;
    private float gamersPlaytime;

    // Constructor met alles zonder ID
    public GamersScore(String gamersVoornaam, String gamersNaam, int gamersScore, Date gamersDatum, float gamersPlaytime) {
        this.gamersVoornaam = gamersVoornaam;
        this.gamersNaam = gamersNaam;
        this.gamersScore = gamersScore;
        this.gamersDatum = gamersDatum;
        this.gamersPlaytime = gamersPlaytime;
    }

    // Constructor zonder automatisch ontwikkelde waarden
    public GamersScore(String gamersVoornaam, String gamersNaam) {
        this.gamersVoornaam = gamersVoornaam;
        this.gamersNaam = gamersNaam;
    }

    public GamersScore(int id, String gamersVoornaam, String gamersNaam, int gamersScore, Date gamersDatum, float gamersPlaytime) {
        this.id = id;
        this.gamersVoornaam = gamersVoornaam;
        this.gamersNaam = gamersNaam;
        this.gamersScore = gamersScore;
        this.gamersDatum = gamersDatum;
        this.gamersPlaytime = gamersPlaytime;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Date getGamersDatum() {
        return gamersDatum;
    }

    public int getGamersScore() {
        return gamersScore;
    }

    public String getGamersNaam() {
        return gamersNaam;
    }

    public String getGamersVoornaam() {
        return gamersVoornaam;
    }

    public float getGamersPlaytime() {
        return gamersPlaytime;
    }

    // Setters (zonder ID)
    public void setGamersVoornaam(String gamersVoornaam) {
        this.gamersVoornaam = gamersVoornaam;
    }

    public void setGamersNaam(String gamersNaam) {
        this.gamersNaam = gamersNaam;
    }

    public void setGamersScore(int gamersScore) {
        this.gamersScore = gamersScore;
    }

    public void setGamersDatum(Date gamersDatum) {
        this.gamersDatum = gamersDatum;
    }



    // To String Methode
    @Override
    public String toString() {
        return "Gamers{" +
                "id=" + id +
                ", gamersVoornaam='" + gamersVoornaam + '\'' +
                ", gamersNaam='" + gamersNaam + '\'' +
                ", gamersScore=" + gamersScore +
                ", gamersDatum=" + gamersDatum +
                '}';
    }
}
