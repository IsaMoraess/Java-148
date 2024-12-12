public class matodo1 {
    public static void main(String args[]) {
        // INSTANCIAR OBJETO
        Caneta1 c1 = new Caneta1();
        // CHAMADA DE ATIBUTO
        c1.modelo = "Bic Cristal"; // +
        c1.cor = "Azul"; // +
        //c1.ponta = 0.5; // -
        //aceitou pq e protected e no main ta chamando essa classe
        c1.carga = 80; // #
        c1.tampada = true; // #

        // CHAMADA DE METODO
        c1.rabiscar();
        c1.status();
        
        System.out.println("----------------------------------------------");

                                // CRIANDO OUTRA INSTANCIA
        // CHAMADA DE ATIBUTO
        

        // CHAMADA DE METODO
        
    }
}