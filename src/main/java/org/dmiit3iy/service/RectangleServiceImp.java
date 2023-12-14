package org.dmiit3iy.service;

import org.dmiit3iy.model.Rectangle;
import org.dmiit3iy.repository.RectangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RectangleServiceImp implements RectangleService {

    private RectangleRepository rectangleRepository;

    @Autowired
    public void setRectangleRepository(RectangleRepository rectangleRepository) {
        this.rectangleRepository = rectangleRepository;
    }

    @Override
    public void add(Rectangle rectangle) {
        try {
            this.rectangleRepository.save(rectangle);
        }catch (Exception e){
            throw new IllegalArgumentException("Rectangle is already exists!");
        }
    }

    @Override
    public List<Rectangle> get() {
        return this.rectangleRepository.findAll();
    }
}
