import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class usuarioPet {
    private agendaPet agenda;
    private Scanner scanner;

    public usuarioPet() {
        agenda = new agendaPet();
        scanner = new Scanner(System.in);
    }

    public void executar(){
        agenda.adicionarData(LocalDate.of(2023, 02, 17));
        agenda.adicionarData(LocalDate.of(2023, 02, 20));
        agenda.adicionarData(LocalDate.of(2023, 02, 21));

        while (true) {
            System.out.println("Selecione uma data disponível: ");
            List<LocalDate> datasDisponiveis = agenda.getDatasDisponiveis();
            for (int i = 0; i < datasDisponiveis.size(); i++) {
                System.out.println((i + 1) + ". " + datasDisponiveis.get(i));
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
}