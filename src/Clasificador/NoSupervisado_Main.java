/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasificador;

import Clustering.Cmeans_memo;
import HerramientasClasificadores.LeerDatos;
import HerramientasClasificadores.Patron;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */

public class NoSupervisado_Main {
    public static void main(String[] args) {
         LeerDatos.leerDatos();
         Cmeans_memo cm = new Cmeans_memo(3);
         cm.entrenar(LeerDatos.instancias,new int[]{0,98,149});
         ArrayList<Patron> aux = (ArrayList<Patron>)LeerDatos.instancias.clone();
         cm.clasificar(aux);
         System.out.println();
    }
    
}    