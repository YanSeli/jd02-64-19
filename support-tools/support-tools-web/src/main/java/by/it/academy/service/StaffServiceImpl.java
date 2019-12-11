package by.it.academy.service;

import by.it.academy.staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffServiceImpl implements StaffService {

    private static final StaffService INSTANCE = new StaffServiceImpl();

    private final List<Staff> staffs;

    private StaffServiceImpl() {
        staffs = new ArrayList<>();
        staffs.add(new Staff(1l, "Ivanov", "Ivan", "qa", "day"));
        staffs.add(new Staff(2l, "Petrov", "Petr", "supporter", "night"));
    }

    public static StaffService getService() {
        return INSTANCE;
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffs;
    }

    @Override
    public void addNewStaff(Staff staff) {
        staff.setId((long) staffs.size() +1);
        staffs.add(staff);
    }

}
