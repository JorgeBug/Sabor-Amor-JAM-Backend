package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idEmpleado;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String puesto;

    @Column
    private String fechaNacimiento;

    @Column
    private int salario;

    protected Empleado(){}



}