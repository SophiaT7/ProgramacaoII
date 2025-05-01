
package teste;

public class Main {
    public static void main(String[] args) {
        SimuladorCoxinha maquina = new SimuladorCoxinha();

        maquina.abastecer(10);
        maquina.venda();
        maquina.venda(3);
        maquina.venda(10); 
        maquina.zeraSimulador();
        System.out.println("estoque final: " + maquina.getEstoque());
    }
}

