package org.dmiit3iy.controller;

import org.dmiit3iy.dto.ResponseResult;
import org.dmiit3iy.model.Circle;
import org.dmiit3iy.service.CircleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/circle")
public class CircleController {
    private CircleServiceImp circleServiceImp;

    @Autowired
    public CircleController(CircleServiceImp circleServiceImp) {
        this.circleServiceImp = circleServiceImp;
    }


    @GetMapping
    public ResponseEntity<ResponseResult<List<Circle>>> get() {
        List<Circle> circleList = circleServiceImp.get();
        return new ResponseEntity<>(new ResponseResult<>(null, circleList), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ResponseResult<Circle>> post(@RequestBody Circle circle) {
        try {
            this.circleServiceImp.add(circle);
            return new ResponseEntity<>(new ResponseResult<>(null, circle), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(new ResponseResult<>(e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
    }
}
