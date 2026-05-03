package ExHeranca.ex1;

public class Moto extends Veiculo{
    protected int cilindradas;

    public Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    @Override
    public void exibeInfo(){
        super.exibeInfo();
        System.out.println("cilindradas: " + cilindradas);
    }

    public static void main(String[] args) {
        Moto m1 = new Moto("HONDA", "CB500", 500);

        m1.exibeInfo();
    }
}
