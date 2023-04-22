package inciso_3.hoja5;
import java.util.Scanner;
public class Inciso_3Hoja5 {

    public static void main(String[] args) {
        int a = 1, b = 1;
        boolean Error;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("\tVamos a hacer una matriz :D\nPrimero necesito que introduzcas 2 numeros, ya que la matriz va a tener un numero de columnas y de filas que ingresara.\nNumero de filas:");
        do{
            Error = false;
            try{
                a = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese numeros enteros.");
            }
            if(a<=0){
                Error = true;
                System.out.println("Por favor ingrese numeros enteros positivos.");
                a = 1;
            }
        }while(Error==true);
        System.out.println("Numero de columnas:");
        do{
            Error = false;
            try{
                b = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                Error = true;
                System.out.println("Por favor ingrese numeros enteros.");
            }
            if(b<=0){
                Error = true;
                System.out.println("Por favor ingrese numeros enteros positivos.");
                b = 1;
            }
        }while(Error==true);
        int Matriz[][] = new int[a][b];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                Matriz[i][j] = (int)(Math.random()*998+1);
                System.out.println("Para [" +i +"][" +j +"]: " +Matriz[i][j]);
            }
        }
    }
    
}
