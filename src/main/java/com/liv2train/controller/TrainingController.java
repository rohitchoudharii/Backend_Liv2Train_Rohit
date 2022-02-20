package com.liv2train.controller;


import com.liv2train.domian.TrainingCenter;
import com.liv2train.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("training")
public class TrainingController {

    TrainingService trainingService;
    @Autowired
    public TrainingController(TrainingService trainingService){
        this.trainingService = trainingService;
    }

    @PostMapping(value = "add-training-center")
    public ResponseEntity<TrainingCenter> add(@RequestBody @Valid TrainingCenter trainingCenter){
        System.out.println(trainingCenter.getCenterName());
        return new ResponseEntity<>(trainingService.add(trainingCenter), HttpStatus.OK);
    }

    @RequestMapping(value="training-centers")
    public ResponseEntity<List<TrainingCenter>> list(){
        return new ResponseEntity<>(trainingService.list(),HttpStatus.OK);
    }
}
