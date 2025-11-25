package Aula1811.Enum;

public class Main1 {
    public static void main(String[] args) {
        OpcoesMenu tipo = OpcoesMenu.ABRIR;
        switch (tipo) {
            case ABRIR:System.out.println("Abrir");
                break;
            case IMPRIMIR:  System.out.println("Imprimir");
                break;
            default : System.out.println("Error");
                break;
        }
        System.out.println(tipo.getValor());
    }
}
