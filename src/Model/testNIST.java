package Model;

import Model.Archivo;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testNIST 
{
   public int numeroCadenas;
   private File archivo;
   private FileReader archivoLector;
   private BufferedReader buferLector;
   private String linea;
   private boolean a,b;

   public testNIST(String rutaArchivo)
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
            if((linea = buferLector.readLine())!=null)
            {
                a = linea.contains("SUCCESS");
		b = linea.contains("FAILURE");
                
                if(a==true )
                {
		linea = "SUCCESS" ;
                return linea;
                }
                
                if(b==true)
                {   
		linea = "FAILURE";
                return linea;
                }
            }


        }
        buferLector.close();
        return null;


    }





   /*
	public void testApproximateEntropy()
	{
		
		RandomAccessFile miRAFile;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  


			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/ApproximateEntropy/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test ApproximateEntropy es: \n");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			

	
				miRAFile.close();
				
			
			
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO testApproximateEntropy
	
	public void testBlockFrequency()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/BlockFrequency/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

				System.out.println("\nEl resultado del test BlockFrequency es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO BlockFrequency
	
	public void testCumulativeSums()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/CumulativeSums/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();
			
				System.out.println("\nEl resultado del test CumulativeSums es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
				
				miRAFile.close();
									
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO CumulativeSums
	
	public void testFFT()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/FFT/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test FFT es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
									
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO FFT
	
	public void testFrequency()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Frequency/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test Frequency es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
						
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$		
								
				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO Frequency
	
	public void testLinearComplexity()
	{
		
		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/LinearComplexity/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test LinearComplexity es: ");
				

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		
				//******************************************************

				miRAFile.close();
									
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO LinearComplexity
	
	public void testLongestRun()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/LongestRun/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test LongestRun es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
						
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
									
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO LongestRun
	
	public void testNonOverlappingTemplate()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/NonOverlappingTemplate/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test NonOverlappingTemplate es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO NonOverlappingTemplate
	
	public void testOverlappingTemplate()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/OverlappingTemplate/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test OverlappingTemplate es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO OverlappingTemplate
	
	public void testRandomExcursions()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/RandomExcursions/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test RandomExcursions es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
							
						
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO RandomExcursions
	
	public void testRandomExcursionsVariant()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/RandomExcursionsVariant/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test RandomExcursionsVariant es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
				miRAFile.close();
									
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO RandomExcursionsVariant
	
	public void testRank()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Rank/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			

				System.out.println("\nEl resultado del test Rank es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO Rank
	
	public void testRuns()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Runs/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test Runs es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
						
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue : " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO Runs
	
	public void testSerial()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Serial/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

			 System.out.println("\nEl resultado del test Serial es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
							
						
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue: " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
						
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO Serial
	
	public void testUniversal()
	{

		RandomAccessFile miRAFile;
		
		//int numeroCadenas = 0;
		Scanner scanner = new Scanner(System.in);

		// abrir el archivo
		try {  

			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Universal/stats.txt","r");
			
			System.out.print("\nConfirme el numero de cadenas que tiene el archivo:");
			numeroCadenas = scanner.nextInt();

				System.out.println("\nEl resultado del test Universal es: ");

				String aux="";								
				boolean a,b;
				int z = 0;
				int j = 0;
				int i = 1;
				String linea[] = new String[numeroCadenas+1];
				
				miRAFile.seek(0);

				while ((aux = miRAFile.readLine()) != null)
				{


					for(int columna = 0; columna < aux.length(); )
					{

						a = aux.contains("SUCCESS");
						b = aux.contains("FAILURE");

						if(a==true ){
							linea[i] = "SUCCESS" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						if(b==true){   
							linea[i] = "FAILURE" ;
							System.out.println("Cadena:  " + linea[i] + " Numero de Caneda: " + i);
							i++;
						}
						break;

					}

				}

				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				i=1;								
				if(i<=100)
				{
						
					    
					    System.out.print("\nIngrese el numero de la cadena: " );
					    z = scanner.nextInt();
					    
					while(z<=0){
						System.out.println("\nIngrese un valor mayor a cero \n"  );
						z = scanner.nextInt();
					}
					while(z>numeroCadenas)
					   {
							System.out.println("\n Ingreso un numero de cadena invalido \n" );
							System.out.println("\nIngrese un valor menor o igual a: " + numeroCadenas + "\n" );
							z = scanner.nextInt();
					   }
										
					if(z<=numeroCadenas && z>0)
					{
						j=z;
						i=z;
												
						System.out.println("Cadena: " + j + "\n" + "La cadena seleccionada fue: " +  linea[i] + "\n"  );
						
				   
					}
				
				 }
			
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

				miRAFile.close();
									
		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

	}//FIN DEL METODO Universal
*/
}//FIN DE LA CLASE
