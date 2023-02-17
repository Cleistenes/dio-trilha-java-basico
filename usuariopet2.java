import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class usuariopet2 {
    private agendapet2 agenda;
    private Scanner scanner;

    public usuariopet2() {
        agenda = new agendapet2();
        scanner = new Scanner(System.in);
    }

    public void executar(){
        agenda.adicionarData(LocalDate.of(0, 0, 0));
        agenda.adicionarData(LocalDate.of(0, 0, 0));
        agenda.adicionarData(LocalDate.of(0, 0, 0));

        while (true) {
            System.out.println("Selecione uma data disponível: ");
            List<LocalDate> datasDisponiveis = agenda.listarDataDisponiveis();
            for (int i = 0; i < datasDisponiveis.size(); i++) {
                System.out.println((i + 1) + ". " + datasDisponiveis.get(i));
            }
        }

        int escolha = scanner.nextInt();
            if (escolha > 0 && escolha <= datasDisponiveis.size()) {
            LocalDate dataSelecionada = datasDisponiveis.get(escolha - 1);
            System.out.println("Você selecionou a data: " + dataSelecionada);
            break;
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }
    }
}
