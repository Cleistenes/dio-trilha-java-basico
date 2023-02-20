import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class agendaPet {
    private List<LocalDate> datasDisponiveis;

    public agendaPet() {
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

    public List<LocalDate> getDatasDisponiveis() {
        return datasDisponiveis;
    }
}
