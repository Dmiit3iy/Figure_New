package org.dmiit3iy.controller;

import org.dmiit3iy.dto.ResponseResult;
import org.dmiit3iy.model.Triangle;
import org.dmiit3iy.service.TriangleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/triangle")
public class TriangleController {
    private TriangleServiceImp triangleServiceImp;

    @Autowired
    public TriangleController(TriangleServiceImp triangleServiceImp) {
        this.triangleServiceImp = triangleServiceImp;
    }

    @PostMapping
    public ResponseEntity<ResponseResult<Triangle>> post(@RequestBody Triangle triangle) {
        try {
            this.triangleServiceImp.add(triangle);
            return new ResponseEntity<>(new ResponseResult<>(null, triangle), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseResult<>(e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseResult<List<Triangle>>> get() {
        List<Triangle> triangleList = this.triangleServiceImp.get();
        return new ResponseEntity<>(new ResponseResult<>(null, triangleList), HttpStatus.OK);
    }
}
