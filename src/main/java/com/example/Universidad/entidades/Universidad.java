package com.example.Universidad.entidades;



import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Universidades")

public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UNIVERSIDADES_REL")
    @SequenceGenerator(name = "SEQ_UNIVERSIDADES_REL", sequenceName = "SEQ_UNIVERSIDADES_REL",allocationSize = 1)
    @Column(name = "NIT",nullable = false)
    private long nit;

    @Column(name = "Sedes",nullable = false)
    private int sedes;

    @Column(name = "U_Establecimiento",nullable = false)
    private String establecimiento;

    @Column(name = "num_estudiantes",nullable = false)
    private int numEstudiantes;

    @Column(name = "U_Direccion",nullable = false)
    private String direccion;
}
