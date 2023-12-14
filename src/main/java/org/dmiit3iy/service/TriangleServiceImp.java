package org.dmiit3iy.service;

import org.dmiit3iy.model.Triangle;
import org.dmiit3iy.repository.TriangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriangleServiceImp implements TriangleService {

    private TriangleRepository triangleRepository;

    @Autowired
    public void setTriangleRepository(TriangleRepository triangleRepository) {
        this.triangleRepository = triangleRepository;
    }

    @Override
    public void add(Triangle triangle) {
        try {
            this.triangleRepository.save(triangle);
        } catch (Exception e) {
            throw new IllegalArgumentException("Triangle is already exists");
        }
    }

    @Override
    public List<Triangle> get() {
        return this.triangleRepository.findAll();
    }
}
