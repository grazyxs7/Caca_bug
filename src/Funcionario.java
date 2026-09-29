public class Funcionario {

    private String nome;
    private double salario;
    private int percentual;

    public Funcionario(String nome, double salario, int percentual) {
         this.nome = nome;
         this.salario = salario;
         this.percentual = percentual;
    }

    public String getNome() {

        return nome;
    }

    public double getSalario() {

        return salario;
    }

    public void aumentarSalario(int percentual) {
        salario = salario + (salario * percentual / 100);;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Percentual: " + percentual);

    }

    public double getPercentual() {
        return percentual;
    }
}