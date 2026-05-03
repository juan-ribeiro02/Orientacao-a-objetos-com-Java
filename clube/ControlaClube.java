package clube;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlaClube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Clube> times = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.println("Adicione o "+ (i+1) +"° time:");
            String nomeTime = sc.nextLine();

            System.out.println("numero de vitorias:");
            int vitorias = sc.nextInt();

            System.out.println("numero de empates:");
            int empates = sc.nextInt();         

            System.out.println("numero de derrotas:");
            int derrotas = sc.nextInt();

            sc.nextLine();

            times.add(new Clube(nomeTime, vitorias, empates, derrotas));
        }

        sc.close();
    }
}
