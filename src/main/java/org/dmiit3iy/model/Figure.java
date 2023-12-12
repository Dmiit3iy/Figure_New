package org.dmiit3iy.model;

import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Figure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    protected double figureSize;


    public abstract double perimeter();

    public abstract double square();

}
