package Proyecto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import Model.testNIST;
import Model.Bina_Deci;
import Model.Archivo;
import java.io.IOException;



/**
 * @version 1.0
 * @author alexanderdelriscomorales
 * @Proyecto Final
 */
public class Principal {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Archivo archivo                      = new Archivo("/Users/alexanderdelriscomorales/Documents/MATLAB/list.txt");
        
        testNIST approximateEntropy          = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/ApproximateEntropy/stats.txt");
        testNIST testBlockFrequency          = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/BlockFrequency/stats.txt");
        testNIST testCumulativeSums          = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/CumulativeSums/stats.txt");
        testNIST testFFT                     = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/FFT/stats.txt");
        testNIST testFrequency               = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Frequency/stats.txt");
        testNIST testLinearComplexity        = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/LinearComplexity/stats.txt");
        testNIST testLongestRun              = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/LongestRun/stats.txt");
        testNIST testNonOverlappingTemplate  = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/NonOverlappingTemplate/stats.txt");
        testNIST testOverlappingTemplate     = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/OverlappingTemplate/stats.txt");
        testNIST testRandomExcursions        = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/RandomExcursions/stats.txt");
        testNIST testRandomExcursionsVariant = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/RandomExcursionsVariant/stats.txt");
        testNIST testRank                    = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Rank/stats.txt");
        testNIST testRuns                    = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Runs/stats.txt");
        testNIST testSerial                  = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Serial/stats.txt");
        testNIST testUniversal               = new testNIST("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Universal/stats.txt");

        Bina_Deci dec                        = new Bina_Deci(archivo.leerLinea());
        dec.Calcular();
        System.out.println(archivo.leerLinea()+ "\n"+approximateEntropy.leerLinea());
        System.out.println(archivo.leerLinea());
        System.out.println(approximateEntropy.leerLinea());
        System.out.println(testBlockFrequency.leerLinea());
        System.out.println(dec.Calcular());
        System.out.println(dec.Calcular());
        System.out.println(dec.Calcular());
        System.out.println(dec.Calcular());


    }




}
