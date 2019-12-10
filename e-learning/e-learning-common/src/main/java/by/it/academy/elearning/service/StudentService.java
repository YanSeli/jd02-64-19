package by.it.academy.elearning.service;

import by.it.academy.elearning.model.Student;

import java.util.List;

/**
 * Student service interface
 */
public interface StudentService {

    /**
     * Gets all students
     *
     * @return list of found students
     */
    List<Student> getAllStudents();

    /**
     * Add new student
     *
     * @param student student to add
     * @return student with generated id
     */
    Student add(Student student);

    /**
     * Deletes student by Id
     *
     * @param student to delete
     */
    void delete(Student student);

    /**
     * Updates student
     *
     * @param student to update
     * @return updated student
     */
    Student update(Student student);

}

