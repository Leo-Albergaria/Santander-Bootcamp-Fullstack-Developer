import java.io.*;

public class Desafio {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		do {
			n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String s[] = str.split(" ");

      int maiorSpeed = Integer.parseInt(s[0]);
      
      for (int i = 1; i < n; i++) {
        int lista = Integer.parseInt(s[i]);

        if (lista > maiorSpeed) {
          maiorSpeed = lista;
        }
      }
      
      
      if (maiorSpeed < 10) {
        System.out.println("1");
      } else if (maiorSpeed >= 10 && maiorSpeed < 20) {
        System.out.println("2");
      } else {
        System.out.println("3");
      }  
		} while (br.ready());
  }
}