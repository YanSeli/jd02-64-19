package by.it.academy.elearning.web.servlet;

import by.it.academy.elearning.model.Student;
import by.it.academy.elearning.service.StudentService;
import by.it.academy.elearning.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/student-list")
public class StudentListServlet extends HttpServlet {

    private final StudentService service = StudentServiceImpl.getService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> allStudents = service.getAllStudents();
        req.setAttribute("students", allStudents);
        req.getRequestDispatcher("/WEB-INF/jsp/student/student-list.jsp")
                .forward(req, resp);
    }
}
