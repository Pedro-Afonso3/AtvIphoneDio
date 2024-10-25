package AtvIphone.Derivados.Navegador;

public class ServicoNavegador implements Navegador{
    public void exibirPagina(){
        System.out.println("Pagina selecionada aberta");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova Aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Pagina Atualizando...");
    }
}
