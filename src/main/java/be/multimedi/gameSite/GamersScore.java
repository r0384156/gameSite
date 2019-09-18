package be.multimedi.gameSite;

import java.util.Date;

public class GamersScore {
    // Variabelen
    private int id;
    private String gamersVoornaam;
    private String gamersNaam;
    private int gamersScore;
    private Date gamersDatum;

    // Constructor zonder automatisch ontwikkelde waarden
    public GamersScore(String gamersVoornaam, String gamersNaam) {
        this.gamersVoornaam = gamersVoornaam;
        this.gamersNaam = gamersNaam;
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
