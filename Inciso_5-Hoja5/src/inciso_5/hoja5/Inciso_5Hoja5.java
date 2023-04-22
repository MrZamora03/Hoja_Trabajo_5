package inciso_5.hoja5;
import java.util.Scanner;
public class Inciso_5Hoja5 {

    public static void main(String[] args) {
        int ContadorMenor = 0, ContadorEntre = 0, ContadorMayor = 0;
        double peso = 1.0d;
        boolean Exit, Error;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese los pesos de las piezas en kilogramos:");
        do{
            Exit = false;
            Error = false;
            try{
                peso = Double.parseDouble(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese solo numeros.");
            }
            if((peso<0.0d)&&(Error==false)){
                Error = true;
                System.out.println("Por favor ingrese el peso en positivo.");
            }else if(peso==0.0d){
                Exit = true;
            }else if(peso<9.8d){
                ContadorMenor++;
                if((Error==true)||(Exit==true)){
                    ContadorMenor = 0;
                }
            }else if((peso>=9.8d)&&(peso<=10.2d)){
                ContadorEntre++;
            }else if(peso>10.2d){
                ContadorMayor++;
            }
        }while((Exit==false)||(Error==true));
        System.out.println("La cantidad de piezas procesadas son: " +(ContadorMenor+ContadorEntre+ContadorMayor));
    }
    
}
