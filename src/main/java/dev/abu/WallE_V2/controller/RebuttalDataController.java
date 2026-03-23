package dev.abu.WallE_V2.controller;/*
 *Created by Abuthair
 * Date:23/03/2026
 * time:20:45
 *projectName:WallE_V2

 */

import dev.abu.WallE_V2.dto.RebuttalDataDTO;
import dev.abu.WallE_V2.service.RebuttalDataSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rebuttal")
public class RebuttalDataController {
    @Autowired
    RebuttalDataSerive service;
//http://localhost:8080/api/rebuttal/Create
    @PostMapping("/Create")
    public RebuttalDataDTO create(@RequestBody RebuttalDataDTO dto) {
        return service.create(dto);
    }

    //http://localhost:8080/api/rebuttal/Bulk
    @PostMapping("/Bulk")
    List<RebuttalDataDTO> createBulk(@RequestBody List<RebuttalDataDTO> dtos){
        return service.createBulk(dtos);
    }

    //http://localhost:8080/api/rebuttal/All
    @GetMapping("/All")
    List<RebuttalDataDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    List<RebuttalDataDTO> getById(Integer id){
        return service.getAll();
    }
}
