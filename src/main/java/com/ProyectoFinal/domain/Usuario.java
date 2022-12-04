
package com.ProyectoFinal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String ciudad;
    private String codigopostal;
    private String foto; 

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String contraseña, String ciudad, String codigopostal, String foto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.ciudad = ciudad;
        this.codigopostal = codigopostal;
        this.foto = foto;
    }
    



    
    
    
    
    
    
    
}
