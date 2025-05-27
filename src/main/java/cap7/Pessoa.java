
package cap7;

public class Pessoa {
    private String nome;
    private Integer codigo;
    
    public Pessoa(){
        nome = "";
        codigo=0;
    }
    public Pessoa(String nome, Integer codigo){
        this.nome=nome;
        this.codigo=codigo;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCodigo(Integer codigo){
        this.codigo=codigo;
    }
    public Integer getCodigo(){
        return codigo;
    }
}
