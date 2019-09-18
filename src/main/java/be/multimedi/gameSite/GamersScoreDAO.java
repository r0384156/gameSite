package be.multimedi.gameSite;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GamersScoreDAO {
    private static final String url = "jdbc:mariadb://noelvaes.eu/javaeeheverleeDB12";
    private static final String login = "javaeeheverlee";
    private static final String pwd = "j@v@eeheverlee2019";
    private static final String sqlGetAllGamersScore = "SELECT * FROM GamersScore";

    public List<GamersScore> getAllHighscores() {
        List<GamersScore> highscores = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, login, pwd)) {
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery(sqlGetAllGamersScore);

                // Door de query gaan en printen
                while (rs.next()) {
                    highscores.add(new GamersScore(rs.getInt("id"),
                            rs.getString("gamersVoornaam"),
                            rs.getString("gamersNaam"),
                            rs.getInt("gamersScore"),
                            rs.getDate("GamersDatum")));
                }
            } catch (SQLException se) {
                System.out.println("Could not execute Query");
            }
        } catch (SQLException se) {
            System.out.println("Connection failed");
        }
        return highscores;
    }
}

