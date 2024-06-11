import java.util.ArrayList;

public class RegistroDePessoas {
    private ArrayList<AddPessoa> pessoas;

    public RegistroDePessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(AddPessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    public void listarTodas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada.");
        } else {
            for (AddPessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }
}
