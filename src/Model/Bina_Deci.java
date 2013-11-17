package Model;


public class Bina_Deci {
    public String num;
    public int num_c;
    public String car1[];
    public String car2[];
    public int num_c2;
    public int r;

    public Bina_Deci(String num)
    {
            this.num=num;
            num_c=num.length();
            car1=new String[num_c];
            car2=new String[num_c];
            num_c2=0;
            r=0;
    }
    public int Calcular()
    {

            //Extraer caracter por caracter de la variable num y guardarlo en un arreglo
            for(int a=0;a<num_c;a++)
            {
                    int b=a+1;
                    car1[a]=num.substring(a,b);
            }

            //Ordena al revez los numeros
            for(int a=0;a<num_c;a++)
            {
                    car2[a]=car1[num_c-(a+1)];
            }

            //Calcular lugar de arreglos y pontencias
            for(int a=0;a<num_c;a++)
            {
                    if((a==0)&&(car2[a].equals("1")))
                    {
                            num_c2=num_c2+1;
                    }
                    if((a==1)&&(car2[a].equals("1")))
                    {
                            num_c2=num_c2+2;
                    }
                    if((a>1)&&(car2[a].equals("1")))
                    {
                            int potencia=2;
                            //int suma=0;
                            for(int b=1;b<a;b++)
                            {
                                    potencia=potencia*2;
                            }
                            num_c2=num_c2+potencia;
                    }
            }
            return num_c2;
	}
}

