package iphone;

import iphone.funcionalidades.AparelhoTelefonico;
import iphone.funcionalidades.NavegadorInternet;
import iphone.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {
    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    } 
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    

}
