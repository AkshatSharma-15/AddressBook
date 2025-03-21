package com.example.demo.interfaces;

import java.util.*;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entities.EmployeeEntity;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {
    public EmployeeDTO get(Long id);

    public EmployeeDTO create(EmployeeDTO user);

    public String clear();

    public List<EmployeeDTO> getAll();

    public EmployeeDTO edit(EmployeeDTO user, Long id);

    public String delete(Long id);

    public ResponseDTO response(String message, String status);
}
