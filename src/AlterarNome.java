public class AlterarNome {
public void alterarPessoa(String nome, Pessoa pessoaAtualizada) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoa.setNome(pessoaAtualizada.getNome());
                pessoa.setIdade(pessoaAtualizada.getIdade());
                System.out.println("Pessoa alterada com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");

}
