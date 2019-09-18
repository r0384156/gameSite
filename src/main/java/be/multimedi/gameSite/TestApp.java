package be.multimedi.gameSite;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class TestApp {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("org.mariadb.jdbc.Driver");
        GamersScoreDAO gsdao = new GamersScoreDAO();

        List<GamersScore> highscoreLijst = gsdao.getAllHighscores();
        for (GamersScore h : highscoreLijst) {
            System.out.println(h);
        }

        // test voorbeeld gamers
        float tempTijd = 30;
        int tempHighscore = 350;
        GamersScore gamer1 = new GamersScore("Bert", "Wandelseck", tempHighscore++, Date.valueOf(LocalDate.now()), tempTijd++);
        GamersScore gamer2 = new GamersScore("Jan", "Mast", tempHighscore, Date.valueOf(LocalDate.now()), tempTijd);

        // test addHighscores
        gsdao.addHighscore(gamer1);
        System.out.println("Highscore toegevoegd voor : " + gamer1.getGamersVoornaam() + " " + gamer1.getGamersNaam());
        gsdao.addHighscore(gamer2);
        System.out.println("Highscore toegevoegd voor : " + gamer2.getGamersVoornaam() + " " + gamer2.getGamersNaam());
    }
}
