import java.io.IOException;
import java.util.Scanner;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = leitor.nextInt();
        int xDinheiro = notasInseridas;

        int notas100 = xDinheiro / 100;
        xDinheiro = xDinheiro-(notas100*100);
        
        int notas50 = xDinheiro / 50;
        xDinheiro = xDinheiro-(notas50*50);

        int notas20 = xDinheiro / 20;
        xDinheiro = xDinheiro-(notas20*20);
    
        int notas10 = xDinheiro / 10;
        xDinheiro = xDinheiro-(notas10*10);

        int notas5 = xDinheiro / 5;
        xDinheiro = xDinheiro-(notas5*5);

        int notas2 = xDinheiro / 2;
        xDinheiro = xDinheiro-(notas2*2);

        int notas1 = xDinheiro / 1;
        xDinheiro = xDinheiro-(notas1*1);

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println(  notas100 + " nota(s) de R$ 100,00");
        System.out.println(  notas50 + " nota(s) de R$ 50,00");
        System.out.println(  notas20 + " nota(s) de R$ 20,00");
        System.out.println(  notas10 + " nota(s) de R$ 10,00");
        System.out.println(  notas5 + " nota(s) de R$ 5,00");
        System.out.println(  notas2 + " nota(s) de R$ 2,00");
        System.out.println(  notas1 + " nota(s) de R$ 1,00");
        
    }
	
}