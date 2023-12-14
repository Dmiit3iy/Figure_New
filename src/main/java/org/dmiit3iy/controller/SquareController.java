package org.dmiit3iy.controller;

import org.dmiit3iy.dto.ResponseResult;
import org.dmiit3iy.model.Rectangle;
import org.dmiit3iy.model.Square;
import org.dmiit3iy.service.SquareServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/square")
public class SquareController {
    private SquareServiceImp squareServiceImp;

    @Autowired
    public SquareController(SquareServiceImp squareServiceImp) {
        this.squareServiceImp = squareServiceImp;
    }

    @PostMapping
    public ResponseEntity<ResponseResult<Square>> post(@RequestBody Square square) {
        try {
            this.squareServiceImp.add(square);
            return new ResponseEntity<>(new ResponseResult<>(null, square), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseResult<>(e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseResult<List<Square>>> get(){
        List<Square> squareList= this.squareServiceImp.get();
        return new ResponseEntity<>(new ResponseResult<>(null,squareList),HttpStatus.OK);
    }



}
