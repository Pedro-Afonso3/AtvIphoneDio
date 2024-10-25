package AtvIphone;

import AtvIphone.Derivados.Celular.Celular;

public class Iphone{
    public static void main(String[] args) {
        Celular cell = new Celular();

        cell.atender();
        cell.selecionarMusica();
        cell.pausar();
    }
}
