package inciso_1.hoja5;
import java.util.Scanner;
public class Inciso_1Hoja5 {

    public static void main(String[] args) {
        String usuario, password;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("\tInicio de sesion\nTome en cuenta que el usuario es \"Administrador\" y la contrasenia es \"admin1234@\"\nIngrese su usuario:");
        usuario = Teclado.nextLine();
        System.out.println("Ingrese la contrasenia:");
        password = Teclado.nextLine();
        if((usuario.equalsIgnoreCase("Administrador"))&&(password.equalsIgnoreCase("admin1234@"))){
            System.out.println("El inicio de sesion se ha iniciado.");
        }else{
            System.out.println("Error de sesion.");
        }
    }
    
}
