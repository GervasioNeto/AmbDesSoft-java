import java.util.Scanner;

public class SerieInfinita {
  Scanner sc = new Scanner(System.in);
  int n;
  float x;

  public void sInfinita() {
    System.out.println("Número de termos: ");
    n = sc.nextInt();
    System.out.println("Valor de x: ");
    x = sc.nextFloat();
    float termo = x;
    float s = x;
    int i = 1;
    float x2 = x * x;

    for (int j = 1; j < n; j++) {
      i = i + 2;
      termo = -termo * x2 / (i * (i - 1));
      s = s + termo;
    }
    System.out.printf("S = %f%n", s);
  }
}