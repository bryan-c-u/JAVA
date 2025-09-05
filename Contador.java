import java.util.ArrayList;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            System.out.println("Ingrese un numero del valor que desee");
            Integer numero= scanner.nextInt();
            numeros.add(numero);
        }
        for(int i = 0 ; i < numeros.size (); i++){
            if(numeros.get(i) > 0){
                positivos++;
            }else{
                negativos++;
            }
        }
        System.out.println("El numero de positivos son : " + positivos +"\n El numero de negativos son : "+ negativos);
        scanner.close();
    }
}
