public class ExcluirPessoa {
public void removerPessoa(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoas.remove(pessoa);
                System.out.println("Pessoa removida com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}
