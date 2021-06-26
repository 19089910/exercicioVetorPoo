package application;

import entities.dadoStudant;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        dadoStudant[] vetor = new dadoStudant[10];//10 quartos

        //ENTRADA DE DADOS
        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Remetente %d#: %n", i);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();
            //CONTRUTOR RECEBE PARAMETROS E QUARDA NO VETOR[QUARTO] QUE O USUARIO COLOCA
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new dadoStudant(nome, email);//toda vez que a ocntagem acontecer(i#)
            //Ex: quarto 2; vetor[2] recebe construtor instanciando um objeto(nome, email) no vetor[2];
        }
        //IMPTIMIR QURTOS ocupados =!null
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);//nao entendi, por que o toString muda o vetor tbm?
            }
        }
    }
}
