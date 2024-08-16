
import java.util.Scanner;
// import com.sun.xml.internal.ws.api.model.wsdl.WSDLPort;


public class Contagem {
    Scanner prompt = new Scanner(System.in);
    int qtdAlunos, nota, aprovados = 0, i = 0, reprovados = 0;
      public void contar(){
      System.out.println("Quantidade de alunos: ");
      qtdAlunos = prompt.nextInt();

      while(i < qtdAlunos){
        i++;
        System.out.printf("Nota do aluno %d: ", i);
        nota = prompt.nextInt();
        if(nota < 50){
          reprovados++;
        } else {
          aprovados++;
        }

      }

      System.out.printf("São %d alunos.%n", qtdAlunos);
      System.out.printf("São %d alunos aprovados e %d alunos reprovados.%n", aprovados, reprovados);
    }
}

