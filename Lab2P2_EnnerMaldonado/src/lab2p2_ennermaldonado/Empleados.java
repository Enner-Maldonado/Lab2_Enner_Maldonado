/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ennermaldonado;
import java.awt.Color;

public class Empleados {
    //Atributos
    private String nombre;
    private String apellido;
    private String color;
    private int edad;
    private String genero;
    private double altura;
    private double peso;
    private String titulo;
    private String cargo;
    
    //Constructores
    public Empleados(){
    }
    public Empleados(String nombre, String apellido, String color, int edad, String genero, double altura, double peso, String titulo, String cargo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.color=color;
        this.edad=edad;
        this.genero=genero;
        this.altura=altura;
        this.peso=peso;
        this.titulo=titulo;
        this.cargo=cargo;
    }

    Empleados(String nombre, String apellido, String color, int edad, double altura, double peso, String titulo, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String toString(){
        return "Cargo "+cargo+" Nombre "+nombre+" Apellido "+apellido+" color "+color+" Edad "+edad+" Genero "+genero+" Altura "+altura+" Peso "+peso+" Titulo "+titulo;
    }
    
}
