package by.it.academy.support.web.servlet;

import by.it.academy.support.service.StaffService;
import by.it.academy.support.service.StaffServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/staff-delete")
public class StaffDelete extends HttpServlet {

    private final StaffService service = StaffServiceImpl.getService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        deleteStaff(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        deleteStaff(req, resp);
    }

    private void deleteStaff(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long staffId = Long.valueOf(req.getParameter("id"));
        service.delete(staffId);
        resp.sendRedirect(req.getContextPath() + "/staff-list");
    }
}
