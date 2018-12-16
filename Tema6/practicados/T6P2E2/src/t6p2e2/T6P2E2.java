/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2e2;

import Peliculas.Estudio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tamara
 */
public class T6P2E2 {

    
    private static Estudio[] listaEstudios = new Estudio[4];
    private static ArrayList<Pelicula> listaPeliculas = new ArrayList();
   
    public static void main(String[] args) {
       
        try {
            crearEstudio();
            crearPelicula();
            buscarPeliculaMasLarga();
            buscarEstudioConMasPeliculas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    public static void crearEstudio () throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<String> telefono = new ArrayList();
        telefono.add("111111111");
        telefono.add("111111112");
        listaEstudios[0] = new Estudio("Warner", "EEUU", "c/ a", "www.warner.com", sdf.parse("01/11/1994"), "", telefono);

        ArrayList<String> telefono2 = new ArrayList();
        telefono.add("222222222");
        telefono.add("222222223");
        listaEstudios[0] = new Estudio("Disney", "EEUU", "c/ b", "www.disney.com", sdf.parse("01/11/1994"), "", telefono2);

        ArrayList<String> telefono3 = new ArrayList();
        telefono.add("333333334");
        telefono.add("444444445");
        listaEstudios[0] = new Estudio("Columbia", "EEUU", "c/ c", "www.columbia.com", sdf.parse("01/11/1994"), "", telefono3);

        ArrayList<String> telefono4 = new ArrayList();
        telefono.add("555555555");
        telefono.add("555555556");
            listaEstudios[0] = new Estudio("Paramount Pictures", "EEUU", "c/ d", "www.paramountpictures.com", sdf.parse("01/11/1994"), "", telefono4);

    }
    
    public static void crearPelicula () throws ParseException {
        
        listaPeliculas = new ArrayList();
        ArrayList<Estudio>lista = new ArrayList();
        
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[0]);
        
        char[]año=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='9';
        año[3]='4';
        
        Pelicula p= new Pelicula ("HP",año,123f,"fantasía",lista);
        listaPeliculas.add(p);   
        ArrayList<Estudio>lista2=new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        lista.add(listaEstudios[3]);
        char[]año2=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='9';
        año[3]='7';
        
        
        Pelicula p2=new Pelicula("LOVE ACTUALLY",año2,160f,"romántica",lista2);
        listaPeliculas.add(p2);
        
        ArrayList<Estudio>lista3=new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[1]);        
        char[]año3=new char[4];
        año[0]='2';
        año[1]='0';
        año[2]='0';
        año[3]='4';
        
        
        
        Pelicula p3=new Pelicula("el señor de los anillos",año3,100f,"fantasía",lista3);
        listaPeliculas.add(p3);
        
        ArrayList<Estudio>lista4=new ArrayList();
        lista.add(listaEstudios[0]);        
        char[]año4=new char[4];
        año[0]='2';
        año[1]='0';
        año[2]='0';
        año[3]='2';
        
        Pelicula p4=new Pelicula("minions",año4,200f,"infantil",lista4);
        listaPeliculas.add(p4);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        lista.add(listaEstudios[3]);
        char[]año5=new char[4];
        año[0]='2';
        año[1]='0';
        año[2]='1';
        año[3]='6';
        
    }
    
     public static void buscarPeliculaMasLarga() throws ParseException {
        
        float max=0;
        int pos=0;
        for(int x=0;x<listaPeliculas.size();x++)
        {
            max=listaPeliculas.get().getDuracion();
            pos=x;
        }
        JOptionPane.showMessageDialog(null,"La pelicula mas larga es "+listaPeliculas.get().getTitulo()+" con una duracion de "+listaPeliculas.get().getDuracion());
    }
     
     public static void buscarEstudioConMasPeliculas() throws ParseException {
        
        
    }
}

    
    

