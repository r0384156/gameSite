package be.multimedi.gameSite;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet(name="Greeting", value = "/Greeting", initParams = @WebInitParam(name = "text", value = "Overschrijving van gegevens?"))
public class IndexServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String page=req.getParameter("page");
        if(page!=null&&page.equals("highscores")) {
            GamersScoreDAO gsdao = new GamersScoreDAO();
            List<GamersScore> highscoreLijst = gsdao.getAllHighscores();
            
            req.setAttribute("lijst", highscoreLijst);
            req.getRequestDispatcher("highscores.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String voornaam = request.getParameter("voornaam");
            String achternaam = request.getParameter("naam");
            try {
                int score = Integer.parseInt(request.getParameter("score"));
                int playtime = Integer.parseInt(request.getParameter("length"));
            //new GamersScoreDAO().addHighscore(new GamersScore(voornaam, achternaam, score, LocalDate.now(),playtime));
            request.getRequestDispatcher("highscores.jsp").forward(request, response);
            }catch(NumberFormatException nfe){
                System.out.println("incorrect input");
            }
    }
}
