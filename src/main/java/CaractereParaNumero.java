import java.util.Scanner;
public class CaractereParaNumero{
  Scanner sc = new Scanner(System.in);

    public void caractereNumero(){
      System.out.println("String numérica: ");
      String string = sc.next();
      int n = string.length();
      int decimal = 0;
      // int base = Character.codePointAt(string, 0);
      int digito;


      for (int i = 0; i < n; i++){
        digito = Character.codePointAt(string, i);
        decimal = decimal * 10 + digito;
        System.out.printf("Formato decimal: %d%n", decimal);
        decimal = 0;
      }
    }
}