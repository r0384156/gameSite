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
    }
}
