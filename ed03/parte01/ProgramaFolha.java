package ed03.parte01;

public class ProgramaFolha {
    public static void main(String[] args) {
        // Cria um funcionário CLT
        Funcionario funcionario1 = new FuncionarioCLT("Carlos", 2000.0);

        // Cria um funcionário temporário
        Funcionario funcionario2 = new FuncionarioTemporario("Ana", 2000.0);

        // Dados do funcionário CLT
        funcionario1.exibirDados();
        System.out.println("Salário Final: " + funcionario1.calcularSalario());
        System.out.println();

        // Dados do funcionário Temporário
        funcionario2.exibirDados();
        System.out.println("Salário Final: " + funcionario2.calcularSalario());
    }
}
