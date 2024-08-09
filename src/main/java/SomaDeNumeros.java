import java.util.Scanner;

public class SomaDeNumeros {
  Scanner sc = new Scanner(System.in);
  int n, num, soma = 0, i = 0;

      public void SomarNumeros(){
        System.out.println("Quantos números a serem somados: ");
        n = sc.nextInt();
        while(i < n){
          i++;
          System.out.printf("Digite o %dº número: ", i);
          num = sc.nextInt();
          soma += num;
        }
        System.out.printf("A soma dos %d números é %d", n, soma);
      }
}
