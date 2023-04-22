package inciso_6.hoja5;

public class Clase_Factorial {
    int Factorial (int Numero){
        int Resultado = 1;
        String Auxiliar = "false";
        if (Numero>0){
            Auxiliar = "true";
        }
        switch(Auxiliar){
            case "true":
                for(int i = 1; i<=Numero; i++){
                    Resultado = Resultado*i;
                }
                break;
            default:
                break;
        }
        return Resultado;
    }
}
