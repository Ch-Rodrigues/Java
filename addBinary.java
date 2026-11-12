import java.util.Arrays;

public class addBinary {
    public static void main(String a, String b) {
        String resultado = "";
        int binario = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || binario == 1) {
            
            int soma = binario;

            if (i >= 0) {
                soma = soma + (a.charAt(i) - '0');
                
                i = i - 1;
            }
            if (j >= 0) {
                soma = soma + (b.charAt(j) - '0');

                j = j - 1;
            }
            if (soma == 0) {
                resultado = "0" + resultado;
                binario = 0;
            }else if (soma == 1) {
                resultado = "1" + resultado;
                binario = 0;
            }else if (soma == 2) {
                resultado = "0" + resultado;
                binario = 1;
            }else {
                resultado = "1" + resultado;
                binario = 1;
                
            }
        }
        


    }

}