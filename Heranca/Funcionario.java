package Heranca;

public class Funcionario {
    private boolean estado;

    public boolean MostrarEstado() {
        return this.estado;
    }

    public void BaterCartao() {
        this.estado = true;
    }
}
