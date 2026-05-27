package exercicioPratico.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class controle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Funcionario> Funcionarios = new ArrayList<>();

        Funcionarios.add(new Gerente("Jorge", 10000.50, 500));
        Funcionarios.add(new Desenvolvedor("Juan", 7500, 5));

        for(Funcionario f : Funcionarios){
            System.out.println("nome: " + f.getNome());
            System.out.println("Salario: R$" + f.calculaSalario());
        }

        scanner.close();
    }
}