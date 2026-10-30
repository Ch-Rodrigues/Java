import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        String str = Integer.toString(numero);

        char[] x = str.toCharArray();

        boolean palindromo = true;
        
        int ult = x.length - 1;

        for (int i = 0; i < x.length / 2; i++) {
            if (x[i] != x[ult]) {
                palindromo = false;
                break;
            }
            ult--;
            
        }

        if (palindromo) {
            System.out.println(numero + " é um palindromo.");
        } else {
            System.out.println(numero + " não é um palindromo.");
        }


    }
    
}
