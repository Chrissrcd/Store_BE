
package com.prueba.Marathon_BE.controller;

import com.prueba.Marathon_BE.models.Enterprise;
import com.prueba.Marathon_BE.services.EnterpriseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/enterprises")
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;
    
    @GetMapping
    public List<Enterprise>listar(){
        return enterpriseService.listar();
    }
    
    @PostMapping
    public Enterprise agregar(@RequestBody Enterprise enterprise){
        return enterpriseService.add(enterprise);
    }
    
    @GetMapping(path = {"/{id}"})
    public Enterprise listarID(@PathVariable("id") int id) {
        return enterpriseService.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Enterprise editar(@RequestBody Enterprise enterprise, @PathVariable("id") int id) {
        enterprise.setId(id);
        return enterpriseService.edit(enterprise);
    }

    @DeleteMapping(path = {"/{id}"})
    public Enterprise delete(@PathVariable("id") int id) {
        return enterpriseService.delete(id);
    }

}
