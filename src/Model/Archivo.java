/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexanderdelriscomorales
 */
public class Archivo {
    
    private File archivo;
    private FileReader archivoLector;
    private BufferedReader buferLector;
    private String linea;
    
    public Archivo(String rutaArchivo)
    {
        try {
            archivo = new File(rutaArchivo);
            archivoLector = new FileReader(archivo);
            buferLector = new BufferedReader(archivoLector);
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public String leerLinea() throws IOException{
        
        while(buferLector.ready())
        {
            if(!(linea = buferLector.readLine()).equals("\000"))
                return linea;
        
        
        }
        buferLector.close();
        return null;
    
    
    }

    
}
