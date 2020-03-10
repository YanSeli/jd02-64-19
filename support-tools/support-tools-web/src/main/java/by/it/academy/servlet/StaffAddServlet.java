package by.it.academy.servlet;

import by.it.academy.staff.Staff;
import by.it.academy.service.StaffService;
import by.it.academy.service.StaffServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/staff-add")
public class StaffAddServlet extends HttpServlet {

    private StaffService staffService = StaffServiceImpl.getService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/staff-add.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Staff staff = new Staff(null,
                req.getParameter("lastName"),
                req.getParameter("firstName"),
                req.getParameter("post"),
                req.getParameter("shiftEmployee"));
        staffService.add(staff);

        resp.sendRedirect(req.getContextPath() + "/staff-list");
    }
}
