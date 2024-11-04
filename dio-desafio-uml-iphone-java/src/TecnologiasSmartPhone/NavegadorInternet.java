package TecnologiasSmartPhone;
public interface NavegadorInternet {

    public static void exibirPagina(String url) {
        System.out.println("A págia " + url + " foi acessada com sucesso.");
    }
    public static void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA.");
    }
    public static void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA.");
    }
}
