package cap6;

public class Dupla {
    private Aluno a1;
    private Aluno a2;
    
    public Dupla(){
        a1=new Aluno();
        a2=new Aluno();
    }
    public Dupla(Aluno a1, Aluno a2){
        this.a1=a1;
        this.a2=a2;
    }
    
    public void mostra(){
        System.out.println(a1.getNome()+"e"+a2.getNome());
    }
}
