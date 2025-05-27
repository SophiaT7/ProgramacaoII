
package cap7;

public class TesteCilindro {
     public static void main(String[] args) {
        Cilindro c = new Cilindro(2,2);
        
        System.out.println(c.calcularArea());
        
        Circulo circo = new Circulo(2);
        
        System.out.println(circo.calcularArea());
    }
}
