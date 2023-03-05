package org.generation.app.saborAmor.model;

import jakarta.persistence.*;

@Entity
public class MetodoPago {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTarjeta;

    @Column( unique= true, nullable = false)
    private String numTarjeta;
    @Column( nullable = false)
    private String titularTarjeta;
    @Column( nullable = false)
    private int cvv;

    @Column( nullable = false)
    private String fechaDeExpiracion;

    @ManyToOne
    @JoinColumn(name="fk_idUsario")
    private Usuario fkIdUsuario;

    //Constructor por default
    protected MetodoPago() {

    }




    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(String titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }


    public int getId() {
        return idTarjeta;
    }

    @Override
    public String toString() {
        return "Método de pago del usuario " + titularTarjeta;
    }

}