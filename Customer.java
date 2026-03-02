import java.util.Scanner; 

public class Customer{
    //propriedades do classe Customer
    public String name;
    public int custID;
    public String address;
    public int orderNum;
    public int age;
    public double check;

    //metodos da classe customer
    public void displayCustomer(){
        System.out.println("Cliente: "+name);
    }

    public double requestDiscount(double discount){
        check -= (check * discount/100);
        return check;
    }

    public void showCheck(){
        System.out.println("-----Sua Conta-----");
        System.out.println(name+" - "+custID);
        System.out.println("Endereço: "+address);
        System.out.println("Numero do pedido: "+orderNum);
        System.out.println("Valor da conta: R$"+check);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Customer juan = new Customer();

        juan.name = "Juan Ribeiro";
        juan.custID = 1232;
        juan.address = "Rua Esperança";
        juan.orderNum = 18932;
        juan.age = 19;
        juan.check = 129.0;

        juan.showCheck();

        System.out.println("Gostaria de usar um cupom de desconto? 1 - Sim / 2 - Nao");
        int resposta = scanner.nextInt();

        if(resposta == 1){
            juan.requestDiscount(20);
            juan.showCheck();
        } else {
            System.out.println("Obrigado pela preferência!!!");
        }

        scanner.close();
    }
}
