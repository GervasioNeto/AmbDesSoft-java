import java.util.Scanner;

public class ConversaoBase{
  Scanner sc = new Scanner(System.in);

    public void Conversao(){
      System.out.println("Número inteiro decimal: ");
      int n = sc.nextInt();
      int q = n;
      int ndigit = 0;
      int novarep [] = new int [100];
      int r;
      do {
        r = q % 2;
        novarep[ndigit] = r;
        ndigit++;
        q = q / 2;          
      } while (q != 0);
      System.out.printf("Número %d na base binária: %n", n);
      for (int i = ndigit - 1; i >= 0; i--){
        System.out.print(novarep[i]);
      }
    }    
  }