package Heranca;

public class Vendedor extends Funcionario {

    public double RealizarVenda(double valorp, double precop) {
        double lucro = precop - valorp;
        return lucro;
    }
}
