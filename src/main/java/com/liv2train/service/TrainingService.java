package com.liv2train.service;

import com.liv2train.domian.TrainingCenter;
import com.liv2train.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {

    TrainingCenterRepository trainingCenterRepository;

    @Autowired
    public TrainingService(TrainingCenterRepository trainingCenterRepository){
        this.trainingCenterRepository = trainingCenterRepository;
    }

    public TrainingCenter add(TrainingCenter trainingCenter){
        trainingCenter.setCreateOn(System.currentTimeMillis());
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> list(){
        return (List<TrainingCenter>) trainingCenterRepository.findAll();
    }

}
