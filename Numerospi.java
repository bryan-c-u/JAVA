import java.util.ArrayList;
import java.util.Scanner;

public class Numerospi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el limite hasta donde desea ver los numeros pares e impares que esten en este rango");
        Integer numero = scanner.nextInt();

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(int i = 0 ; i < numero ; i++){
            if(i % 2 == 0){
                pares.add(i);
            }else{
                impares.add(i);
            }
        }
        System.out.println("Los numeros pares son" + pares + "\n Los  numeros impares son : " + impares );
        scanner.close();
    }
}
