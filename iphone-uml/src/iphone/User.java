package iphone;

public class User {
    public static void main(String[] args) {
        Iphone user = new Iphone();

        user.ligar("999887766");
        user.iniciarCorreioVoz();
        user.atender();

        user.exibirPagina("https://www.pagina.com"); 
        user.atualizarPagina();
        user.adicionarNovaAba();
       
        user.tocar();
        user.pausar();   
        user.selecionarMusica("minhamusica");
        user.tocar();
    }
}
