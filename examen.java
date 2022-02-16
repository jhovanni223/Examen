package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "personajes")

public class Personajes_League_Of_Legends {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false) 

    private String nombre;
    private String rol  ;
    private String raza;
    private Integer dificultad;
    

 public void setnombre(String nombre) {
        this.nombre = nombre;
    }

   public String getnombre() {
        return nombre;
    }

 public void setrol(String rol) {
        this.rol = rol;
    }

 public String getrol() {
        return rol;
    }
 public void setraza(String raza) {
        this.raza = raza;
    }

 public String getraza() {
        return raza;
    }

 public void setPrioridad(Integer dificultad){
        this.dificultad = dificultad;
    }

public Integer getdificultad(){
        return dificultad;
    }




   