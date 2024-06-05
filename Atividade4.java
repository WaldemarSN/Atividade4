import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, soma=0, maior, menor;
        float media;

        System.out.println("Informe o tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int [] vet1 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o valor do índice " + i + ":");
            vet1[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            soma = soma + vet1[i];
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor do índice " + i + ": " + vet1[i]);
        }
        System.out.println("Valor da soma: " + soma);
        media = soma / tamanho;
        System.out.println("Valor da média: " + media);

        maior = vet1[0];
        if (tamanho == 1) {
            System.out.println("O maior valor do vetor: " + vet1[0]);
        } else {
            for (int i = 1; i < tamanho; i++) {
                if (vet1[i] > maior) {
                    maior = vet1[i];
                }
            }
            System.out.println("O maior valor do vetor é: " + maior);
        }

        menor = vet1[0];
        if (tamanho == 1) {
            System.out.println("O menor valor do vetor é: " + vet1[0]);
        } else {
            for (int i = 1; i < tamanho; i++) {
                if (vet1[i] < menor) {
                    menor = vet1[i];
                }
            }
            System.out.println("O menor valor do vetor é: " + menor);
        }
    }
}