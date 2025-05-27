
package cap7;

public class Funcionario extends Pessoa{
    private double salario;
    
    public Funcionario(){
        super();
        salario=0.0;
    }
    public Funcionario(String nome, Integer codigo, double salario){
        super(nome, codigo);
        this.salario=salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }
    
    public double mostrarSalario(double desconto){
        return salario-desconto;
    }
}
