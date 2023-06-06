package com.prueba.Marathon_BE.services;

import com.prueba.Marathon_BE.models.Enterprise;
import com.prueba.Marathon_BE.repository.EnterpriseRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Override
    public List<Enterprise> listar() {
        return (List<Enterprise>) enterpriseRepository.findAll();
    }

    @Override
    public Enterprise listarId(int id) {
        return enterpriseRepository.findById(id);
    }

    @Override
    public Enterprise add(Enterprise enterprise) {
        return enterpriseRepository.save(enterprise);
    }

    @Override
    public Enterprise edit(Enterprise enterprise) {
        return enterpriseRepository.save(enterprise);
    }

    @Override
    public Enterprise delete(int id) {
        Enterprise enterprise = enterpriseRepository.findById(id);
        if (enterprise != null) {
            enterpriseRepository.delete(enterprise);
        }
        return enterprise;
    }

}
