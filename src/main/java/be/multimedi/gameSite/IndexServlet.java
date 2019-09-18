package be.multimedi.gameSite;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name="Greeting", value = "/Greeting", initParams = @WebInitParam(name = "text", value = "Overschrijving van gegevens?"))
public class IndexServlet extends HttpServlet {
    private String text;
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("hello destroy");
        log("hello destroy");
    }

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String page=req.getParameter("page");
        if(page!=null&&page.equals("highscores")) {
            req.getRequestDispatcher("highscores.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

    }
}
