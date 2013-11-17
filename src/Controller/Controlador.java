/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;
import View.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author alexanderdelriscomorales
 */
public class Controlador implements ActionListener {

        private Vista vista;
        private Resultados result;
        private Archivo archivo;
        private Bina_Deci binDec;
        private LeeFichero lFichrro;
        private Logica logica;
        private testNIST pruebas;


        public Controlador(Vista vista,Resultados result,Archivo archivo,Bina_Deci binDec,LeeFichero lFichrro,Logica logica,testNIST pruebas)
        {
            this.vista = vista;
            this.result = result;
            this.archivo = archivo;
            this.binDec = binDec;
            this.lFichrro = lFichrro;
            this.logica = logica;
            this.pruebas = pruebas;
            //iniciar();

        }

        public void go()
        {
            this.vista.setVisible(true);
        }



    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }




	

}





