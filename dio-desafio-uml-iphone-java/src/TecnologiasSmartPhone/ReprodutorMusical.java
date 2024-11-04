package TecnologiasSmartPhone;
public interface ReprodutorMusical {
 
    public static void tocar() {
        System.out.println("TOCANDO.");
    }
    public static void pausar() {
        System.out.println("PAUSANDO.");
    }
    public static void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " foi selecionada! ");
    
    }
}
