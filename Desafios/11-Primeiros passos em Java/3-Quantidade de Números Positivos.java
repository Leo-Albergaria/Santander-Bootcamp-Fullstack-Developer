import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {

      Scanner leitor = new Scanner(System.in);
      float xQuemSao;
      int x;
      int xQtde;
  
      x = 0;
      xQtde = 0;
      xQuemSao = 0;
        
      while ( x < 6) {
        xQuemSao = leitor.nextFloat();
        if (xQuemSao > 0 ) {
          xQtde++;
        }
        x++;
      }
      System.out.println(xQtde + " valores positivos");
    }
}