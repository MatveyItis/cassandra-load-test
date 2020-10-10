package ru.itis.maletskov.cassandra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.maletskov.cassandra.api.DepartmentService;

@RestController
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/api/v0/department")
    public ResponseEntity<Void> saveDepartments(@RequestParam("size") Integer batchSize) {
        departmentService.saveDepartments(batchSize);
        return ResponseEntity.ok().build();
    }
}
