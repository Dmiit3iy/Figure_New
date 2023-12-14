package org.dmiit3iy.controller;

import org.dmiit3iy.dto.ResponseResult;
import org.dmiit3iy.model.Figure;
import org.dmiit3iy.service.FigureServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/figure")
public class FigureController {
    private FigureServiceImp figureServiceImp;

    @Autowired
    public FigureController(FigureServiceImp figureServiceImp) {
        this.figureServiceImp = figureServiceImp;
    }


    @GetMapping
    public ResponseEntity<ResponseResult<List<Figure>>> get() {
        List<Figure> figureList = this.figureServiceImp.get();
        return new ResponseEntity<>(new ResponseResult<>(null, figureList), HttpStatus.OK);
    }
}
