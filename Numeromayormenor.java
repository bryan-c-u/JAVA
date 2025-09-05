import java.util.ArrayList;
import java.util.Scanner;

public class Numeromayormenor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> mayorymenor = new ArrayList<>();

        Integer numero = scanner.nextInt();
        int mayor = 0;
        int menor = 0;
        for(int i = 0 ; i <= mayorymenor.size(); i++){
            if(mayorymenor.get(i)> mayor){
                mayor= mayorymenor.get(i);
            }
            if(mayorymenor.get(i) < menor){
                menor = mayorymenor.get(i);
            }
        }
        System.out.println("El numero mayor es : "+ mayor + "\n El numero menor es : "+ menor);
        scanner.close();
    }
}
