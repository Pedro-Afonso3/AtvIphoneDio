package AtvIphone.Derivados.Telefone;

public class ServicoTelefonia implements Telefone {
    public void ligar(){
        System.out.println("Ligando... ");

    }

    public void atender(){
        System.out.println("Chamada atendida no telefone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado no telefone");
    }
}
