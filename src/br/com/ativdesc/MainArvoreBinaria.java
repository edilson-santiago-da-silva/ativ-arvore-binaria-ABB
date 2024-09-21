package br.com.ativdesc;

import java.util.Scanner;

public class MainArvoreBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("Insira 5 números reais:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            arvore.inserirNo(num);
        }

        System.out.println("Árvore em ordem:");
        arvore.exibirNo();

    }
}
