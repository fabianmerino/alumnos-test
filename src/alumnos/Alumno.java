/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author fab_a
 */
public class Alumno {

    private String Nombres;
    private float Nota1;
    private float Nota2;
    private float Nota3;

    public Alumno() {
    }

    public Alumno(String Nombres, float Nota1, float Nota2, float Nota3) {
        this.Nombres = Nombres;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public float getNota1() {
        return Nota1;
    }

    public void setNota1(float Nota1) {
        this.Nota1 = Nota1;
    }

    public float getNota2() {
        return Nota2;
    }

    public void setNota2(float Nota2) {
        this.Nota2 = Nota2;
    }

    public float getNota3() {
        return Nota3;
    }

    public void setNota3(float Nota3) {
        this.Nota3 = Nota3;
    }

}
