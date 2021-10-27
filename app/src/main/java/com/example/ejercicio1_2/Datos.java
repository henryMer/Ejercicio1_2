package com.example.ejercicio1_2;

public class Datos {
  private String d_nombre;
  private String d_apellido;
  private int d_edad;
  private String d_correo;

  public Datos(String d_nombre, String d_apellido, int d_edad, String d_correo){
    this.d_nombre =d_nombre;
    this.d_apellido=d_apellido;
    this.d_edad=d_edad;
    this.d_correo=d_correo;

  }

  public String getD_nombre() {
    return d_nombre;
  }

  public void setD_nombre(String d_nombre) {
    this.d_nombre = d_nombre;
  }

  public String getD_apellido() {
    return d_apellido;
  }

  public void setD_apellido(String d_apellido) {
    this.d_apellido = d_apellido;
  }

  public int getD_edad() {
    return d_edad;
  }

  public void setD_edad(int d_edad) {
    this.d_edad = d_edad;
  }

  public String getD_correo() {
    return d_correo;
  }

  public void setD_correo(String d_correo) {
    this.d_correo = d_correo;
  }



}
