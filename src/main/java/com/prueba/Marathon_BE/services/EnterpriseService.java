package com.prueba.Marathon_BE.services;

import com.prueba.Marathon_BE.models.Enterprise;
import java.util.List;

public interface EnterpriseService {
    // Obtener todos los registros de enterprises

    List<Enterprise> listar();

    // Obtener un registro de enterprise por su id
    Enterprise listarId(int id);

    // Agregar un nuevo registro de enterprise
    Enterprise add(Enterprise enterprise);

    // Editar un registro de enterprise existente
    Enterprise edit(Enterprise enterprise);

    // Eliminar un registro de enterprise por su id
    Enterprise delete(int id);
}
