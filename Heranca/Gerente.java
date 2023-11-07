package Heranca;

public class Gerente extends Funcionario {
    private boolean caixa;

    public boolean Fechar() {
        System.out.println("Você fechou o caixa");
        this.caixa = false;
        return this.caixa;
    }

    public boolean Abrir() {
        System.out.print("Você abriu o caixa: ");
        this.caixa = true;
        return this.caixa;
    }
}
