package ru.itis.maletskov.cassandra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import ru.itis.maletskov.cassandra.api.DepartmentService;
import ru.itis.maletskov.cassandra.entity.Department;
import ru.itis.maletskov.cassandra.repository.DepartmentRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public void saveDepartments(Integer batchSize) {
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < batchSize; i++) {
            departments.add(Department.builder()
                    .id(UUID.randomUUID())
                    .deptName(RandomStringUtils.random(20, true, false))
                    .name(RandomStringUtils.random(10, true, false))
                    .build());
        }
        departmentRepository.saveAll(departments);
        log.info("Successfully saved {} random departments", batchSize);
    }
}
