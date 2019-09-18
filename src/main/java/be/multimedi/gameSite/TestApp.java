package be.multimedi.gameSite;

public class TestApp {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("org.mariadb.jdbc.Driver");
        GamersScoreDAO gsdao = new GamersScoreDAO();
        gsdao.getAllHighscores();
    }
}
