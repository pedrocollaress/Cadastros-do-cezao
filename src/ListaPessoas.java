public class ListaPessoas {
    public void listarTodas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada.");
        } else {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    } 
}
