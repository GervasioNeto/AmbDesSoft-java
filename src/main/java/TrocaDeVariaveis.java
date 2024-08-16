public class TrocaDeVariaveis {
 int a = 10, b = 20, aux;
  public void trocaDeValores(){
    System.out.printf("Valor inicial da variável a = %d%n", a);
    System.out.printf("Valor inicial da variável b = %d%n", b);

    aux = a;
    a = b;
    b = aux;  

    System.out.printf("Valor trocado da variável a = %d%n", a);
    System.out.printf("Valor trocado da variável b = %d%n", b);

  }
}