package by.it.academy.elearning.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/info")
public class InfoServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(InfoServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        log.info("/info");
        resp.getWriter().println("Pong!");
    }
}
