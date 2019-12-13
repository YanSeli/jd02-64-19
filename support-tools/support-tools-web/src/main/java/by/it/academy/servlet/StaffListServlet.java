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
import java.util.List;

@WebServlet(urlPatterns = "/staff-list")
public class StaffListServlet extends HttpServlet {

    private final StaffService service = StaffServiceImpl.getService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Staff> allStaff = service.getAllStaff();
        req.setAttribute("staff", allStaff);
        req.getRequestDispatcher("/WEB-INF/staff-list.jsp")
                .forward(req, resp);
    }
}
