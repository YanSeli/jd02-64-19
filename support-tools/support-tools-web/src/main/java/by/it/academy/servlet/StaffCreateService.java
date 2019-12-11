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

@WebServlet(urlPatterns = "/productCreate")
public class StaffCreateService extends HttpServlet {

    private StaffService staffService = StaffServiceImpl.getService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/productCreate.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastName = req.getParameter("Last name");
        String firstName = req.getParameter("First name");
        String post = req.getParameter("Position");
        String shiftEmployee = req.getParameter("Shift employee");


        Staff staff = new Staff(null, lastName, firstName, post, shiftEmployee);
        staffService.addNewStaff(staff);

        resp.sendRedirect(req.getContextPath() + "/staffList");
    }
}
