package ExHeranca.ex1;

public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //setters e getters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    //metodos
    public void exibeInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
