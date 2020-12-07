/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp2020;

import Clasificador.Knn;
import Clasificador.MinimaDistancia;
import HerramientasClasificadores.LeerDatos;
import HerramientasClasificadores.Patron;
//import data.LeerDatos1;
//import data.Patron1;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Gabriel
 */
public class RP2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//    ArrayList<Patron1> instancias = LeerDatos1.tokenizarDataSet();
//        ArrayList<Patron1>  promedios= new ArrayList<>();
//        ArrayList<Patron1>  nombres= new ArrayList<>();
//        ArrayList<Patron1> distancias= new ArrayList<>(); 
//        String res;
//        Patron1 j = new Patron1();
//
//        nombres=j.contarClases(instancias);
//        promedios=  j.entrenamiento(instancias);
//          
//        double[] distanciaMinima = new double[promedios.size()];
//        
//        Patron1 A1 = new Patron1("","", new double[]{355,347,5.0,2});
//        for(int x = 0 ; x<  promedios.size();x++){
//          distanciaMinima[x] =    promedios.get(x).calcularDistanciaMin(A1);
//                             //Claserepresentativos.calsificar(insatncias,j);//debe regresar un string de la clase
//        }
//        
//        res=j.clasificar(promedios ,distanciaMinima);
//           
//        System.out.println();
//         TODO: TOKENIZADOR PARA PODER SEPARAR POR COMAS Y GENERAR UN COLECCION DE PATRONES   
//    }    
//}

        LeerDatos.leerDatos(new int[]{1,1,1,1});
        
        MinimaDistancia minimadistancia = new MinimaDistancia();
        minimadistancia.entrenar(LeerDatos.instancias);
        minimadistancia.clasificar(LeerDatos.instancias);
        System.out.println(minimadistancia.getMc().toString());
        Knn knn = new Knn(4);
        knn.entrenar(LeerDatos.instancias);
        knn.clasificar((ArrayList<Patron>)LeerDatos.instancias.clone());
        System.out.println(knn.getMc().toString());
        
    }
    
}
