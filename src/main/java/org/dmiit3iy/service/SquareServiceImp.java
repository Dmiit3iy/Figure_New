package org.dmiit3iy.service;

import org.dmiit3iy.model.Square;
import org.dmiit3iy.repository.SquareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquareServiceImp implements SquareService {
    private SquareRepository squareRepository;

    @Autowired
    public void setSquareRepository(SquareRepository squareRepository) {
        this.squareRepository = squareRepository;
    }

    @Override
    public void add(Square square) {
        try {
        this.squareRepository.save(square);
        } catch (Exception e){
            throw new IllegalArgumentException("Circle is already exists");
        }
    }

    @Override
    public List<Square> get() {
        return this.squareRepository.findAll();
    }
}
