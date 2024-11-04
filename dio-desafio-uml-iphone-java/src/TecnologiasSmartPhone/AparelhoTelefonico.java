package TecnologiasSmartPhone;
public interface AparelhoTelefonico {

    public static void ligar(int numero) {
        System.out.println("Ligando para "+ numero + ".");
    }
    public static void atender() {
        System.out.println("Chamada em andamento");
    }
    public static void iniciarCorreioVoz() {
        System.out.println("Iniciando gravação de correio de voz.");
    }
}
