package org.dmiit3iy.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
@Data
@NoArgsConstructor

public class Square extends Figure {
    public Square(long id, double figureSize) {
        super(id, figureSize);
    }



    @Override
    public double perimeter() {
        return 4 * figureSize;
    }


    @Override
    public double square() {
        return Math.pow(figureSize,2);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - сторона квадрата: " + figureSize;
    }
}
