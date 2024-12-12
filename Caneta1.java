public class Caneta1{
    //ATRIBUTOS
    public String modelo; // +
    public String cor; // +
    private double ponta; // -
    protected int carga; // #
    protected boolean tampada; // #

    //STATUS DO OBJ
    public void status(){
    //this auto referencia = quem chamou o metodo status vai ser substituido por this
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tempada? " + this.tampada);
    }

    //METODOS
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta Tampada. Não posso rabiscar!");
        }
        else{
            System.out.println("Caneta Destampada. Estou rabiscando!");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}