package ed03.parte01;

public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - 100;
    }
}
