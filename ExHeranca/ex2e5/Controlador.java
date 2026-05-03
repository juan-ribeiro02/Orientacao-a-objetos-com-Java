package ExHeranca.ex2e5;

public class Controlador{
    public static void main(String[] args) {
        Autenticavel a1 = new Gerente("Carlos", 10000, "RH", "123");
        Autenticavel a2 = new Cliente("João", "abc");

        System.out.println(a1.autenticar("123")); 
        System.out.println(a2.autenticar("abc")); 
    }
}
