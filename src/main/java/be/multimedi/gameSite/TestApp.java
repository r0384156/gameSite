package be.multimedi.gameSite;

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
        GamersScore gamer1 = new GamersScore("Bert", "Wandelseck");
        GamersScore gamer2 = new GamersScore("Jan", "Mast");

        // test addHighscores
        float tempTijd = 30;
        int tempHighscore = 350;
        gsdao.addHighscore(gamer1, tempHighscore, tempTijd);
        tempTijd++;
        tempHighscore++;
        System.out.println("Highscore toegevoegd voor : " + gamer1.getGamersVoornaam() + " " + gamer1.getGamersNaam());
        gsdao.addHighscore(gamer2, tempHighscore, tempTijd);
        System.out.println("Highscore toegevoegd voor : " + gamer2.getGamersVoornaam() + " " + gamer2.getGamersNaam());
    }
}
