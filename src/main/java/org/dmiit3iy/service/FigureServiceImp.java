package org.dmiit3iy.service;

import org.dmiit3iy.model.Figure;
import org.dmiit3iy.repository.FigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FigureServiceImp implements FigureService {
    private FigureRepository figureRepository;

    @Autowired
    public void setFigureRepository(FigureRepository figureRepository) {
        this.figureRepository = figureRepository;
    }

    @Override
    public List<Figure> get() {
        return this.figureRepository.findAll();
    }
}
