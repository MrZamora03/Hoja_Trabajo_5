package inciso_6.hoja5;
import java.util.Scanner;
public class Inciso_6Hoja5 {

    public static void main(String[] args) {
        int Numero = 0;
        boolean Error;
        Scanner Teclado = new Scanner(System.in);
        Clase_Factorial Funcion = new Clase_Factorial();
        System.out.println("\tFactorial de un numero\nPor favor ingrese el valor que desea factoriar:");
        do{
            Error = false;
            try{
                Numero = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese solo numeros enteros.");
            }
            if(Numero<0){
                Error = true;
                System.out.println("Por favor ingrese solo numeros enteros positivos.");
                Numero = 0;
            }
        }while((Error==true));
        System.out.println("\nEl resultado es: " +Funcion.Factorial(Numero));
    }
    
}
