
package cap7;

public class Circulo {
     private Integer raio;
    
    public Circulo(){
        raio = 0;
    }
    
    public Circulo (Integer raio){
        this.raio=raio;
    }
    
    public void setRaio(Integer raio){
        this.raio=raio;
    }
    //Math.pow(raio, 2)
    public Integer getRaio(){
        return raio;
    }
    
    public double calcularArea(){
        return Math.pow(raio, 2)*Math.PI;
    }

}
