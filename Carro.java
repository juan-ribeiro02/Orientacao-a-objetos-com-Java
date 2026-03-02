public class Carro {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!!!");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+maxSpeed+"km");
    }

    public static void main(String[] args){
        Carro myCar = new Carro();

        myCar.fullThrottle();
        myCar.speed(230);
    }
}
