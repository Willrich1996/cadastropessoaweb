
import com.mycompany.cadastropessoaweb.model.Pessoa;
import com.mycompany.cadastropessoaweb.repository.PessoaRepository;


public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("TESTE");
        p.setCpf("12345678910");
        p.setEmail("teste@teste");
        
        PessoaRepository repo = new PessoaRepository();
        try{
            System.out.println("Tentando Salvar");
            repo.salva(p);
            System.out.println("Salvo com sucesso");
            System.out.println("Listando registros do banco:");
            for (Pessoa item : repo.listaTodos()) {
                System.out.println("ID: " + item.getId() + " - Nome: " + item.getNome());
            }
        }catch(Exception e) {
            System.out.println("Erro ao tentar" + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
