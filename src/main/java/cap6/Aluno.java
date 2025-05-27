
package cap6;

public class Aluno {
    private String nome;
    private Integer matricula;
    
    public Aluno(){
        nome=" ";
        matricula=0;
    }
    public Aluno(String nome, Integer matricula){
        this.nome=nome;
        this.matricula=matricula;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    public void setMatricula(Integer matricula){
        this.matricula=matricula;
    }
    
    public Integer getMatricula(){
        return matricula;
    }
}
