/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author josec
 */
public class datosMedea {
    
   nodosMedea inicio=null;
   

    public datosMedea() {
        cargarDatosPeliculas();
        buscarPeliculas("noMbre1");
    }
   
     public nodosMedea[] buscarPeliculas(String nombre){
         return buscarPeliculasAlgoritmo(nombre,new nodosMedea[] {},inicio);
     }
    
    public nodosMedea[] buscarPeliculasAlgoritmo(String nombre, nodosMedea[] listaPelisEncontradas, nodosMedea pelicula){
        if(pelicula==null){
            for(int i=0;i<listaPelisEncontradas.length;i++){
                System.out.print(listaPelisEncontradas[i].toString()+"\n");
            }
            return listaPelisEncontradas;
        }
        if(pelicula.compararPeliculasNombre(nombre)){
            listaPelisEncontradas=addAll(listaPelisEncontradas,new nodosMedea[] {pelicula});
        }
       return buscarPeliculasAlgoritmo(nombre,listaPelisEncontradas, pelicula.sigente);
    }
    
    public nodosMedea[] addAll(nodosMedea[] a, nodosMedea[] b){
        nodosMedea[] aux = new nodosMedea[a.length+b.length];
        for(int i=0; i<aux.length;i++){
            if(i<a.length){
                aux[i]=a[i];
            }
            else{
                aux[i]=b[i-a.length];
            }
        }
        return aux;
    }
   
   public void cargarDatosPeliculas(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
        // Apertura del fichero y creacion de BufferedReader 
        archivo = new File ("datos.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);

        // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null){
            cargarPelicula(linea);
        } 
      }
        catch(Exception e){
            e.printStackTrace();
        }finally{
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
      }
   }
   
   public void cargarPelicula(String peli){
       nodosMedea aux;
       nodosMedea nodo = new nodosMedea();
       String[] arrSplit = peli.split(",");   
        for (int i = 0;i < arrSplit.length; i++)    {
            //aqui hay que insertar los datos al nodo
            switch (i) {
                case 0:
                    nodo.setNombre(arrSplit[i]);
                    break;
                case 1:
                    nodo.setDirector(arrSplit[i]);
                    break;
                case 2:
                    nodo.setDirecionVideo(arrSplit[i]);
                    break;
                case 3:
                    nodo.setDirecionMiniatura(arrSplit[i]);
                    break;
                case 4:
                    nodo.setGeneros(arrSplit[i],0);
                    break;
                case 5:
                    nodo.setGeneros(arrSplit[i],1);
                    break;
                case 6:
                    nodo.setAño(arrSplit[i]);
                    break;
            }
        }
        if(inicio != null){
            for(aux=inicio ; aux.sigente!=null; aux=aux.sigente){
            }
            aux.sigente = nodo;
        }
        else{
            inicio=nodo;
        }
   }   
}
