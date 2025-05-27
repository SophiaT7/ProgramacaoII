
package cap7;

public class TesteGerente {
    public static void main(String[] args) {


        Funcionario f = new Funcionario("João", 1, 2000.0);
        System.out.println(f.mostrarSalario(300));


        Gerente g = new Gerente("Maria", 2, 3000.0, 500.0);
        System.out.println(g.mostrarSalario(300));
    }
}
