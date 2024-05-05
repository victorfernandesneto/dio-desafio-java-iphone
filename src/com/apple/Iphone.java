package com.apple;

import com.apple.interfaces.AparelhoTelefonico;
import com.apple.interfaces.NavegadorInternet;
import com.apple.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String numeroTelefone;
    private String modelo;
    private String musicaSelecionada = null;

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMusicaSelecionada() {
        return musicaSelecionada;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando mensagens do Correio...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Criando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        if (!this.musicaSelecionada.isEmpty()) {
            System.out.println("Nenhuma música selecionada.");
        } else {
            System.out.println("Tocando " + this.musicaSelecionada);
        }
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");

    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaSelecionada = musica;
    }
}
