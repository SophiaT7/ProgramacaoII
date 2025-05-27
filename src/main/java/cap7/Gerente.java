
package cap7;

public class Gerente extends Funcionario {
    private double grat;

    public Gerente() {
        super();
        grat = 0.0;
    }

    public Gerente(String nome, Integer codigo, double salario, double grat) {
        super(nome, codigo, salario); 
        this.grat = grat;
    }

    public double getGrat() {
        return grat;
    }

    public void setGrat(double grat) {
        this.grat = grat;
    }

    public double calcularSalario(double desconto) {
        return (getSalario()-desconto) + grat;
    }
}
