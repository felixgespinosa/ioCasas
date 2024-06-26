package com.example.springbootmaven.Controllers;

import com.example.springbootmaven.Entities.Locks;
import com.example.springbootmaven.Entities.Records;
import com.example.springbootmaven.Services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController()
@RequestMapping("/api/records")
public class RecordController {

    @Autowired
    public RecordService recordService;
    //Obtencion de todos los records
    @GetMapping("/record")
    public List<Records> records(){

        return recordService.getAllRecords();

    }
    //Api para obtener las cerraduras de un cierto usuario, recibiendo el token como párametro
    @GetMapping("/locksUser")
    public List<Records> getLocksUser(@RequestParam("token") String token){
        System.out.println(token);
        return recordService.getLocksUSer(token);
    }
}
