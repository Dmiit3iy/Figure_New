package org.dmiit3iy.controller;

import org.dmiit3iy.dto.ResponseResult;
import org.dmiit3iy.model.Rectangle;
import org.dmiit3iy.service.RectangleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rectangle")
public class RectangleController {
    private RectangleServiceImp rectangleServiceImp;

    @Autowired
    public RectangleController(RectangleServiceImp rectangleServiceImp) {
        this.rectangleServiceImp = rectangleServiceImp;
    }

    @PostMapping
    public ResponseEntity<ResponseResult<Rectangle>> post(@RequestBody Rectangle rectangle) {
        try {
            this.rectangleServiceImp.add(rectangle);
            return new ResponseEntity<>(new ResponseResult<>(null, rectangle), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseResult<>(e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseResult<List<Rectangle>>> get(){
        List<Rectangle> rectangleList= this.rectangleServiceImp.get();
        return new ResponseEntity<>(new ResponseResult<>(null,rectangleList),HttpStatus.OK);
    }
}
