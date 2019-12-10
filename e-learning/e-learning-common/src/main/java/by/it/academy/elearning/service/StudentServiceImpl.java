package by.it.academy.elearning.service;

import by.it.academy.elearning.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class StudentServiceImpl implements StudentService {

    private static final StudentService INSTANCE = new StudentServiceImpl();
    private final Map<Long, Student> studentRepository = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(10);

    private StudentServiceImpl() {
        studentRepository.put(1L, new Student(1L, "Ivan", "Ivanovich", "Ivanov", "+375-29-111-22-33"));
    }

    public static StudentService getService() {
        return INSTANCE;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentRepository.values());
    }

    @Override
    public Student add(Student student) {
        student.setId(sequence.incrementAndGet());
        studentRepository.put(student.getId(), student);
        return student;
    }

    @Override
    public void delete(Student student) {
        studentRepository.remove(student.getId());
    }

    @Override
    public Student update(Student student) {
        return studentRepository.put(student.getId(), student);
    }
}
