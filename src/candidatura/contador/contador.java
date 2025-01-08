package candidatura.contador;
import java.util.Scanner;
public class Contator {
  public static void main(String [] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();
  Try {
    contar (parametroUm, parametroDois);
  }catch ( ParametroInvalidosException excepiton) {
    System.out.println("O segundo parametro dese ser maior que o primeiro");
  }
}

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException 
  {
    if(parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }
  int contagem = parametroDois - paramentoUm;
    for (int i = 0; i < contagem; i++) {
      System.out.println("Imprimindo o número " + i)
    }
  }
}
