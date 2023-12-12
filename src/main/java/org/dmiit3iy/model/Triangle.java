package org.dmiit3iy.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
public class Triangle extends Figure {

    private double a;

    private double c;

    public Triangle(long id, double figureSize, double a, double c) {
        super(id, figureSize);
        this.a = a;
        this.c = c;
    }

    @Override
    public double square() {
        return (Math.sqrt(this.perimeter() / 2 * (this.perimeter() / 2 - figureSize) * (this.perimeter() / 2 - c) * (this.perimeter() / 2 - a)));
    }

    @Override
    public double perimeter() {
        return figureSize + a + c;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " - длины сторон: " + figureSize + ", " + a + ", " + c;
    }
}
