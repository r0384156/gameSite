package be.multimedi.gameSite;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamersScoreDAO {
    private static final String url = "jdbc:mariadb://noelvaes.eu/javaeeheverleeDB12";
    private static final String login = "javaeeheverlee";
    private static final String pwd = "j@v@eeheverlee2019";
    private static final String sqlGetAllGamersScore = "SELECT * FROM GamersScore";
    private static final String sqlAddHighscore = "INSERT INTO GamersScore(gamersVoornaam, gamersAchternaam, gamersScore, gamersDatum, gamersPlaytime) " +
            "VALUES(?,?,?,?,?)";

    public List<GamersScore> getAllHighscores() {
        List<GamersScore> gamersScores = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, login, pwd)) {
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery(sqlGetAllGamersScore);

                // Door de query gaan en printen
                while (rs.next()) {
                    gamersScores.add(new GamersScore(rs.getInt("id"),
                            rs.getString("gamersVoornaam"),
                            rs.getString("gamersAchternaam"),
                            rs.getInt("gamersScore"),
                            rs.getDate("gamersDatum"),
                            rs.getFloat("gamersPlaytime")));
                }
            } catch (SQLException se) {
                System.out.println("Could not execute Query");
            }
        } catch (SQLException se) {
            System.out.println("Connection failed");
            System.out.println(se);
        }
        return gamersScores;
    }

    public void addHighscore (GamersScore gamersScore){
        LocalDate date = LocalDate.now();
        try (Connection con = DriverManager.getConnection(url, login, pwd)) {
            try(PreparedStatement stmt = con.prepareStatement(sqlAddHighscore)){
                stmt.setString(1, gamersScore.getGamersVoornaam());
                stmt.setString(2, gamersScore.getGamersNaam());
                stmt.setInt(3, gamersScore.getGamersScore());
                stmt.setDate(4, Date.valueOf(date));
                stmt.setFloat(5, gamersScore.getGamersPlaytime());
                int result = stmt.executeUpdate();
                System.out.println("Updated " + result + " rows");
            }catch (SQLException e){
                System.out.println("Highscore toevoegen is mislukt");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println("verbinding is mislukt");
            System.out.println(e);
        }

    }
}

