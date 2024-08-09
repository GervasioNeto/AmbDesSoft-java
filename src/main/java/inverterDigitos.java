import java.util.Scanner;

public class inverterDigitos {
  int n, inverso = 0, digito;

  Scanner sc = new Scanner(System.in);
  
  public void inverter(){
    System.out.println("Digite um número inteiro positivo: ");
    n = sc.nextInt();
    while (n > 0){
      digito = n % 10;
      inverso = inverso * 10 + digito;
      n /= 10;
    }
    System.out.printf("O número invertido é %d", inverso);
  }
}