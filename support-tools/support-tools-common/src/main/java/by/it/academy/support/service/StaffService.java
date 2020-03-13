package by.it.academy.support.service;

import by.it.academy.support.model.Staff;

import java.util.List;

/**
 * Product service
 */
public interface StaffService {

    /**
     * Gets all staff
     *
     * @return list of found staff
     */
    List<Staff> getAllStaff();

    /**
     * Add new staff
     *
     * @param staff staff to save
     * @return staff with generated id
     */
    Staff add(Staff staff);

    /**
     * Deletes staff by Id
     *
     * @param id to delete
     */
    void delete(Long id);

    /**
     * Updates staff
     *
     * @param staff to update
     * @return updated staff
     */
    Staff update(Staff staff);

}
