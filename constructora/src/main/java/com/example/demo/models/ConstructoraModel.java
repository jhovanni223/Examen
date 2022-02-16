package com.example.demo.models;

import javax.persistence.*;

import antlr.collections.impl.IntRange;

@Entity
@Table(name = "constructora")
public class ConstructoraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer numero_sucursal;
    private String direccion_sucursal;
    private String Telefono_sucursal;

    private String articulo;
    private Integer precio;
    private Integer cantidad;

    private String cuenta;
    private String nombre;
    private String direccion_cliente;
    private Integer telefono_cliente;
    private String correo;

    private String estado;
    private String ultimo_pago;
    private String Capital_restante;
   
  



    public void setnumero_sucursal(Integer numero_sucursal){
        this.numero_sucursal = numero_sucursal;
    }

    public Integer getnumero_sucursal(){
        return numero_sucursal;
    }

    public void setdireccion_sucursal(String direccion_sucursal) {
        this.direccion_sucursal = direccion_sucursal;
    }

    public String getdireccion_sucursal() {
        return direccion_sucursal;
    }
    public void setTelefono_sucursal(Integer Telefono_sucursal){
        this.Telefono_sucursal = Telefono_sucursal;
    }

    public Integer getTelefono_sucursal(){
        return Telefono_sucursal;
    }



    public void setarticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getarticulo() {
        return articulo;
    }


    public void setprecio(Integer precio){
        this.precio = precio;
    }

    public Integer getprecio(){
        return precio;
    }

    public void setcantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    public Integer getcantidad(){
        return cantidad;
    }





    public void setcuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getcuenta() {
        return cuenta;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }

    public void setdireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getdireccion_cliente() {
        return direccion_cliente;
    }

    public void settelefono_cliente(Integer telefono_cliente){
        this.telefono_cliente = telefono_cliente;
    }

    public Integer gettelefono_cliente(){
        return telefono_cliente;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

    public String getcorreo() {
        return correo;
    }



    public void setestado(String estado) {
        this.estado = estado;
    }

    public String getestado() {
        return estado;
    }


    public void setultimo_pago(String ultimo_pago) {
        this.ultimo_pago = ultimo_pago;
    }

    public String getultimo_pago() {
        return ultimo_pago;
    }


    public void setCapital_restante(String Capital_restante) {
        this.Capital_restante = Capital_restante;
    }

    public String getCapital_restante() {
        return Capital_restante;
    }


    
}