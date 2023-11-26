public class Cliente {
    private String nome;
    private String telefone;
    private String historicoServico;
    private String preferencia;
    public void adicionarInformações(String novoNome, String novoTelefone, String novoHistoricoServico, String novaPreferencia){
        this.nome = novoNome;
        this.telefone = novoTelefone;
        this.historicoServico = novoHistoricoServico;
        this.preferencia = novaPreferencia;
    }
    public void visualizarInformações(){
        System.out.println("Nome: " + nome);
        System.out.println("Telefone:" + telefone);
        System.out.println("Histórico de serviço: " + historicoServico);
        System.out.println("Preferência: " + preferencia);
    }
    public void atualizarInformações(String novoNome, String novoTelefone, String novoHistoricoServico, String novaPreferencia){
         this.nome = novoNome;
        this.telefone = novoTelefone;
        this.historicoServico = novoHistoricoServico;
        this.preferencia = novaPreferencia;
    }
}
