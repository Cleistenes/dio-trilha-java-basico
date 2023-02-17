import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class agendapet2 {
    private List<LocalDate> datasDisponiveis;
    
    public agendapet2() {
        datasDisponiveis = new ArrayList<>();
    }

    public void adicionarData (LocalDate data) {
        datasDisponiveis.add(data);
    }

    public void removerData (LocalDate data) {
        datasDisponiveis.remove(data);
    }

    public List<LocalDate> listarDataDisponiveis() {
        return datasDisponiveis;
    }
}
