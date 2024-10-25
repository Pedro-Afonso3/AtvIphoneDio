package AtvIphone.Derivados.Celular;

import AtvIphone.Derivados.Musica.Musica;
import AtvIphone.Derivados.Navegador.Navegador;
import AtvIphone.Derivados.Telefone.Telefone;

public class Celular implements Telefone, Navegador, Musica {
    public void tocar(){
        System.out.println("Tocar musica pelo smartphone");
    }

    public void pausar(){
        System.out.println("Pausar musica pelo smartphone");
    }

    public void selecionarMusica(){
        System.out.println("Musica selecionada pelo smartphone");
    }

    public void exibirPagina(){
        System.out.println("Pagina exibida pelo smartphone");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada pelo smartphone");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada pelo smartphone");
    }

    public void ligar(){
        System.out.println("Ligação feita pelo smartphone");
    }

    public void atender(){
        System.out.println("Atender pelo smartphone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz por smartphone");
    }
}
