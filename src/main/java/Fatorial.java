import java.util.Scanner;

  public class Fatorial {
    Scanner sc = new Scanner(System.in);
    int n, prod = 1, i = 0;

        public void valorFatorial(){
          System.out.println("Entre com o valor: ");
          n = sc.nextInt();
          while (i < n) {
            i++;
            prod *= i;
          }
            System.out.printf("O valor fatorial de %d é %d%n", n, prod);
        }
  }