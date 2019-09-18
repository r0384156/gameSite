package be.multimedi.gameSite;

import java.util.Date;

public class GamersScore {
    // Variabelen
    private int id;
    private String gamersVoornaam;
    private String gamersNaam;
    private int gamersScore;
    private Date gamersDatum;
    private String gamersPlaytime;

    // Constructor met alles zonder ID
    public GamersScore(String gamersVoornaam, String gamersNaam, int gamersScore, Date gamersDatum, String gamersPlaytime) {
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

    public GamersScore(int id, String gamersVoornaam, String gamersNaam, int gamersScore, Date gamersDatum, String gamersPlaytime) {
        this.id = id;
        this.gamersVoornaam = gamersVoornaam;
        this.gamersNaam = gamersNaam;
        this.gamersScore = gamersScore;
        this.gamersDatum = gamersDatum;
        this.gamersPlaytime = gamersPlaytime;
    }

    // Volledige constructor
    public GamersScore(int id, String gamersVoornaam, String gamersNaam, int gamersScore, Date gamersDatum) {
        this (gamersVoornaam, gamersNaam);
        this.id = id;
        this.gamersScore = gamersScore;
        this.gamersDatum = gamersDatum;
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

    // Getters
    public String getGamersVoornaam() {
        return gamersVoornaam;
    }

    public String getGamersNaam() {
        return gamersNaam;
    }

    public int getGamersScore() {
        return gamersScore;
    }

    public String getGamersPlaytime() {
        return gamersPlaytime;
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
