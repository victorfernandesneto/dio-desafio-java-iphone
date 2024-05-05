package com.apple;

public class Principal {
    public static void main(String[] args) {
        var iphone = new Iphone();
        iphone.setModelo("6S");
        iphone.setNumeroTelefone("51995212262");
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.exibirPagina("google");
        iphone.iniciarCorreioVoz();
        iphone.ligar("51995212262");
        iphone.pausar();
        iphone.selecionarMusica("Die For You");
        iphone.tocar();
    }
}
