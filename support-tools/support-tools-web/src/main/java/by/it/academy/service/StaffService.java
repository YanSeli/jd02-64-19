package by.it.academy.service;

import by.it.academy.staff.Staff;

import java.util.List;

/**
 * Product service
 */
public interface StaffService {

    /**
     * Gets all products
     *
     * @return list of found product
     */
    List<Staff> getAllStaff();

    /**
     * Add new product
     * generates new Id
     *
     * @param staff product to save
     */

    void addNewStaff(Staff staff);

}
