import java.util.Scanner;

// ALG1

public class CaractereParaNumero{
  Scanner sc = new Scanner(System.in);

    public void caractereNumero(){
      System.out.println("String numérica: ");
      String string = sc.next();
      int n = string.length();
      int decimal = 0;
      int digito;


      for (int i = 0; i < n; i++){
        digito = Character.codePointAt(string, i);
        decimal = decimal * 10 + digito;
        System.out.printf("Formato decimal: %d%n", decimal);
        decimal = 0;
      }
    }
}

// ALG2 Disponível no PDF AVA

// public class CaractereParaNumero{
//   Scanner sc = new Scanner(System.in);

//     public void caractereNumero(){
//       System.out.println("String numérica: ");
//       String string = sc.next();
//       int n = string.length();
//       int decimal = 0;
//       int base = Character.codePointAt(string, 0);
//       int digito;


//       for (int i = 0; i < n; i++){
//         digito = Character.codePointAt(string, i) - base;
//         decimal = decimal * 10 + digito;
//       }
//       System.out.printf("Formato decimal: %d%n", decimal);
//     }
// }
