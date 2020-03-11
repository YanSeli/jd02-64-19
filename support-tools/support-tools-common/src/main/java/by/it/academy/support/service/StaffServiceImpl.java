package by.it.academy.support.service;

import by.it.academy.support.model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class StaffServiceImpl implements StaffService {

    private static final StaffService INSTANCE = new StaffServiceImpl();
    private final Map<Long, Staff> staffRepository = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(10);

    private StaffServiceImpl() {
        staffRepository.put(1l, new Staff(1l, "Ivanov", "Ivan", "qa", "day"));
        staffRepository.put(2l, new Staff(2l, "Petrov", "Petr", "supporter", "night"));
    }

    public static StaffService getService() {
        return INSTANCE;
    }

    @Override
    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffRepository.values());
    }

    @Override
    public Staff add(Staff staff) {
        staff.setId(sequence.incrementAndGet());
        staffRepository.put(staff.getId(), staff);
        return staff;
    }

    @Override
    public void delete(Long id) {
        staffRepository.remove(id);
    }

    @Override
    public Staff update(Staff staff) {
        return staffRepository.put(staff.getId(), staff);
    }

}
