import TecnologiasSmartPhone.AparelhoTelefonico;
import TecnologiasSmartPhone.NavegadorInternet;
import TecnologiasSmartPhone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    public static void main(String[] args) {
 
        ReprodutorMusical.selecionarMusica("Cotidiano");
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();

        NavegadorInternet.exibirPagina("www.dio.com");
        NavegadorInternet.atualizarPagina();
        NavegadorInternet.adicionarNovaAba();

        AparelhoTelefonico.ligar(37568989);
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();

    }

}
