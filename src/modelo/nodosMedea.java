/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author josec
 */
public class nodosMedea {
    
    String nombre;
    String[] generos;
    String director;
    String año;

    public String getAño() {
        return año;
    }
    
    String direcionMiniatura;
    String direcionVideo;
    
    nodosMedea sigente;
    

    public nodosMedea() {
        sigente = null;
        generos= new String [2];
    }

    public String getDirecionMiniatura() {
        return direcionMiniatura;
    }

    public String getDirecionVideo() {
        return direcionVideo;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getGeneros() {
        return generos;
    }

    public String getDirector() {
        return director;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGeneros(String generos,int i) {
        this.generos[i] = generos;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAño(String año) {
        this.año = año;
    }


    public void setDirecionMiniatura(String direcionMiniatura) {
        this.direcionMiniatura = direcionMiniatura;
    }

    public void setDirecionVideo(String direcionVideo) {
        this.direcionVideo = direcionVideo;
    }
    
    public boolean compararPeliculasNombre(String nombre){
        int resultado = this.nombre.toUpperCase().indexOf(nombre.toUpperCase());
        return resultado!=-1;
    }
        
    @Override
    public String toString(){
        return getNombre()+"\t"+getDirector()+"\t"+getDirecionMiniatura();
    }
}
