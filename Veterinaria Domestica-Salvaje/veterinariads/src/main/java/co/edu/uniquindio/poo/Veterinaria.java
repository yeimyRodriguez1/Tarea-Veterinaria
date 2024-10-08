package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {

    private String nombre; 
    private String direccion; 
    private String telefono;
    private LinkedList<Gato>gatosv; 
    private LinkedList<Perro>perrosv;
    private LinkedList<Aguila>aguilas;
    private LinkedList<Canario>canarios; 
    private LinkedList<Leon>leonn;
    
    public Veterinaria(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.gatosv = new LinkedList<>(); 
        this.perrosv = new LinkedList<>(); 
        this.aguilas = new LinkedList<>(); 
        this.canarios = new LinkedList<>(); 
        this.leonn = new LinkedList<>(); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n Bienvenidos a la clinica veterinaria " + nombre + " donde atenderemos a tu animal de cualquier especie. \n\n Direccion: " + direccion +
         "\n Telefono: " + telefono;
    } 

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public LinkedList<Gato> getGatosv() {
        return gatosv;
    }

    public void setGatosv(LinkedList<Gato> gatosv) {
        this.gatosv = gatosv;
    }

    public LinkedList<Perro> getPerrosv() {
        return perrosv;
    }

    public void setPerrosv(LinkedList<Perro> perrosv) {
        this.perrosv = perrosv;
    }

    public LinkedList<Aguila> getAguila() {
        return aguilas;
    }

    public void setAguila(LinkedList<Aguila> aguila) {
        this.aguilas = aguila;
    }

    public LinkedList<Canario> getCanarios() {
        return canarios;
    }

    public void setCanarios(LinkedList<Canario> canarios) {
        this.canarios = canarios;
    }

    public LinkedList<Leon> getLeon() {
        return leonn;
    }

    public void setLeon(LinkedList<Leon> leon) {
        this.leonn = leon;
    }

      
    public void AgregarMascota(Gato gato){
        gatosv.add(gato);
    }

    public void AgregarMascota(Perro perro){
        perrosv.add(perro);
    }

    public void AgregarMascota(Aguila aguila){
        aguilas.add(aguila);
    }

    public void AgregarMascota(Canario canario){
        canarios.add(canario);
    }

    public void AgregarMascota(Leon leon){
        leonn.add(leon);
    }
}
