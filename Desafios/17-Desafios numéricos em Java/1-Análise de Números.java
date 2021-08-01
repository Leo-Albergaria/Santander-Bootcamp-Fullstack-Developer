import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int xQuem = 0;

//continue a solução
        for (int a = 0; a < 5; a++) {
                      
            xQuem = Integer.parseInt(leitor.nextLine());
            if ( xQuem % 2 == 0 ) {
               x1++;
            }
            if ( xQuem % 2 != 0) {
               x2++;
            }
            if ( xQuem > 0) {
               x3++;
            }
            if ( xQuem < 0) {
               x4++;
            }

        }
//insira suas variaveis corretamente
        System.out.println( x1 + " valor(es) par(es)");
        System.out.println( x2 + " valor(es) impar(es)");
        System.out.println( x3 + " valor(es) positivo(s)");
        System.out.println( x4 + " valor(es) negativo(s)");
    }
	
}