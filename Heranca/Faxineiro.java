package Heranca;

public class Faxineiro extends Funcionario {
    private int produtos;

    public int Requisitar(int qt) {
        this.produtos = qt;
        return this.produtos;
    }
}
