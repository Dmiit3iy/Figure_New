package org.dmiit3iy.service;

import org.dmiit3iy.model.Circle;
import org.dmiit3iy.repository.CircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircleServiceImp implements CircleService {
    private CircleRepository circleRepository;

    @Autowired
    public void setCircleRepository(CircleRepository circleRepository) {
        this.circleRepository = circleRepository;
    }

    @Override
    public void add(Circle circle) {
        try {
        this.circleRepository.save(circle);
        } catch (Exception e) {
            throw new IllegalArgumentException("Circle is already exists!");
        }
    }

    @Override
    public List<Circle> get() {
        return this.circleRepository.findAll();
    }
}
