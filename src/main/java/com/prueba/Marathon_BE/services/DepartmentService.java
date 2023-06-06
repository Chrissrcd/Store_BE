package com.prueba.Marathon_BE.services;

import com.prueba.Marathon_BE.models.Department;
import java.util.List;

public interface DepartmentService {
    // Obtener todos los registros de departments
    List<Department> listar();

    // Obtener un registro de department por su id
    Department listarId(int id);

    // Agregar un nuevo registro de department
    Department add(Department department);

    // Editar un registro de department existente
    Department edit(Department department);

    // Eliminar un registro de department por su id
    Department delete(int id);
}