package AtvIphone.Derivados.Musica;

public class ServicoMusica implements Musica{
    public void tocar(){
        System.out.println("Tocando musica no Ipod");
    }

    public void pausar(){
        System.out.println("Musica pausada no Ipod");
    }

    public void selecionarMusica(){
        System.out.println("Musica Selecionada no Ipod");
    }
}
