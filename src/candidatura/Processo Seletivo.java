package candidatura;
import java.util.Random;
import java.util.concurrenr.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo");

  analisarCandidato(1400.0);
  analisarCandidato(2200.0);
  analisarCandidato(2000.0);

    System.out.println("\n  -- Seleção de candidatos --");
    selecaoCandidatos();

    System.out.println("\n -- Imprimir Selecionados --");
    imprimirSelecionados();

String[] candidatos = {"Maria", "Cassie", "John", "Holly", "Malencia", "Brand", "Clara", "Clary", "Jace", "Juliette"};
    for (String candidato: candidato) {
      entrandoEmContato(candidato);
    }
  }

static void analisarCandidato(double salarioPretendido) {
  double salarioBase = 2000.0;
  if(salarioBase > salarioPretendido) {
    System.out.println("Ligar oara o Candidato");
  }else if(salarioBase == salarioPretendido) {
    System.out.println("Ligar para o candidato com Contraproposta");
  }else {
    Syste,;out.println("Aguardando demais Candidatos");
  }
}

static void selecaoCandidatos() {
  String[] candidatos = {"Maria", "Cassie", "John", "Holly", "Malencia", "Brand", "Clara", "Clary", "Jace", "Juliette"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 2000.0;
  while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
    String candidato = candidatos[candidatosAtual];
    double salarioPretendido = valorPretendido();
  System.out.println("Candidato: " + candidato + " - valor: " + salarioPretendido);
    if(salarioBase >= salarioPretendido) {
      System.out.println(candidato + " selecionado para a vaga!");
      candidatosSelecionados++;
    }
      candidadosAtual++;
  }
}

static double valorPretendido() {
  return ThreadLocalRandom.current().nextDouble(1500, 2500);
}
  static void imprimirSelecionados () {
     String[] candidatos = {"Maria", "Cassie", "John", "Holly", "Malencia", "Brand", "Clara", "Clary", "Jace", "Juliette"};
    System.out.println("Imprimindo a lista de candidatos de acordo com o índice");
    for (int i = 0; i < candidatos.length; i++) {
    System.out.println("O candidato de número " + (i+1) + " é " + candidatos[i]);
    }
  }
  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuaTentando = !atendeu
    if(continuaTentando) {
        tentativasRealizadas++;
      }else {
    System.out.println("Contato realizado com sucesso!");
      }
    } while(continuaTentando && tentaivasRealizadas < 3);
    if(atendeu) {
    System.out.println("Consegumos o contato com " + candidato + " com " + tentativasRealizadas + " tentaivas! ");
    }else {
    System.out.println("não conseguimos o contato com " + candidato + " com " + tentativasRealizadas + " tentativas!");
    }
  }
}
