/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author alexanderdelriscomorales
 */
import java.io.*;
import java.util.*;

public class LeeFichero {

    private String cadena, aux;
    private int j = 0,index;
    private String linea[] = new String[200];
    
    
   public String LeeFichero() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      


      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("/Users/alexanderdelriscomorales/Documents/MATLAB/list.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero

         String aux="";
         //String linea[]= new String[200];
	 //int z = 0;
	 //int j = 0;
	 //int i = 0;
         while((aux=br.readLine())!=null)
         {
            

             for(int columna = 0; columna < aux.length(); columna ++)
	     {

                 aux.substring(columna, columna+1).trim();
                 
                 

	     }

             linea[index] = aux;
             index++;
	     j++;
             
             //System.out.println(aux);
             
             

         }
         
         

         for(index=0;index<=100; index++)
         {
             
             System.out.println("Esta es la cadena " +index + "\n"+linea[index]);
             cadena = linea[index];
             
         }

      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta
         // una excepcion.
         try{
            if( null != fr ){
               fr.close();
            }
         }catch (Exception e2){
            e2.printStackTrace();
         }
      }
      return null;
   }
   
    public String[] getLinea() {
        return linea;
    }

    public void setLinea(String[] linea) {
        this.linea = linea;
    }

    

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }


   

}
