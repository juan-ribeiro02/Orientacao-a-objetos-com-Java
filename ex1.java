public class ex1 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }

        System.out.println("\n----------------");
        
        for (int i : vetor) {
            System.out.print(i+" ");
        }

        System.out.println("\n----------------");

        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        for (int [] linhas : matriz){
            for (int num : linhas){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}