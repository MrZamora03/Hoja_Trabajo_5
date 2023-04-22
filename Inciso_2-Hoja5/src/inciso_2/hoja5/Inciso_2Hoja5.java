package inciso_2.hoja5;
import java.util.Scanner;
public class Inciso_2Hoja5 {

    public static void main(String[] args) {
        int a = 0,b = 0,c = 0,d = 0,Resultado;
        boolean Error;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("\tPor favor ingrese 4 numeros a continuacion.\nIngrese los primeros 2 numeros que se sumaran.\nPrimer numero:");
        //Suma
        do{
            Error = false;
            try{
                a = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese solamente numeros enteros.");
            }
        }while(Error==true);
        System.out.println("Segundo numero:");
        do{
            Error = false;
            try{
                b = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese solamente numeros enteros.");
            }
        }while(Error==true);
        Resultado = (a+b);
        System.out.println("La suma de los 2 numeros es: " +Resultado);
        //Multiplicación
        System.out.println("Ingrese los otros 2 numeros que se multiplicaran.\nPrimer numero:");
        do{
            Error = false;
            try{
                c = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese solamente numeros enteros.");
            }
        }while(Error==true);
        System.out.println("Segundo numero:");
        do{
            Error = false;
            try{
                d = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese solamente numeros enteros.");
            }
        }while(Error==true);
        Resultado = (c*d);
        System.out.println("La multiplicacion de los 2 numeros es: " +Resultado);
    }
    
}
