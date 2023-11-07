package Heranca;

import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VENDEDOR!");

        Vendedor v1 = new Vendedor();
        System.out.println("Digite o valor do produto:");
        double valorp = scanner.nextDouble();
        System.out.println("Digite o preço do produto:");
        double precop = scanner.nextDouble();
        double lucro = v1.RealizarVenda(valorp, precop);
        System.out.println("O seu lucro foi: " + lucro);
        v1.MostrarEstado();
        v1.BaterCartao();
        v1.MostrarEstado();

        System.out.println("GERENTE!");

        Gerente g1 = new Gerente();

        System.out.println("Abrir o Caixa: 1");
        System.out.println("Fechar o Caixa: 2");
        int caixa = scanner.nextInt();

        if (caixa == 1) {
            boolean abrir = g1.Abrir();
            System.out.println(abrir);
        } else {
            boolean fechar = g1.Fechar();
            System.out.println(fechar);
        }
        g1.MostrarEstado();
        g1.BaterCartao();
        g1.MostrarEstado();

        System.out.println("FAXINEIRO!");

        Faxineiro f1 = new Faxineiro();
        System.out.println("Digite quantos produtos você deseja requisitar:");
        int qt = scanner.nextInt();
        int m = f1.Requisitar(qt);
        System.out.println("Quantidade de produtos requisitados: " + m);
        f1.MostrarEstado();
        f1.BaterCartao();
        f1.MostrarEstado();
        scanner.close();
    }

}
