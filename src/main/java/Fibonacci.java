import java.util.Scanner;

// import com.sun.beans.editors.ShortEditor;

  public class Fibonacci {
    int n, a = 0, b = 1, i = 2;
    Scanner sc = new Scanner(System.in);
      public void sequencialFibonacci(){
        System.out.println("Números de termos: ");
        n = sc.nextInt();
        System.out.printf("Lista dos %d primeiros números de Fibonacci%n", n);
        while (i < n){
          System.out.printf("%d, %d, ", a, b);
          a += b;
          b += a;
          i += 2;
        }
        if (i == n){
          System.out.printf("%d, %d", a, b);
        } else {
          System.out.print(a);
        }
      }
  }