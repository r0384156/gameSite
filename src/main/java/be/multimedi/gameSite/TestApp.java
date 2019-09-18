package be.multimedi.gameSite;

public class TestApp {
    public static void main(String[] args) {
        GamersScoreDAO gsdao = new GamersScoreDAO();
        gsdao.getAllHighscores();
    }
}
