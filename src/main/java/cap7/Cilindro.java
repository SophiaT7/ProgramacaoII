
package cap7;

public class Cilindro extends Circulo {
    private Integer altura;
    
    public Cilindro(){
        super();
        altura=0;
    }
    
    public Cilindro( Integer raio,Integer altura){
        super(raio);
        this.altura=altura;
    }
    
    public Integer getAltura(){
        return altura;
    }
    
    public void setAltura(Integer altura){
        this.altura=altura;
    }
    
    @Override
    public double calcularArea(){
        return 2*(Math.pow(getRaio(), 2)*Math.PI)+2*(Math.PI*getRaio()*altura);
    }

}
