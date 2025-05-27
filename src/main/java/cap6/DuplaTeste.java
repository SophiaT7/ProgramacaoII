package cap6;

public class DuplaTeste {
    public static void main(String[] args){
        Aluno a1=new Aluno("tico", 1);
        Aluno a2=new Aluno("teco", 2);
        
        Dupla dupla=new Dupla(a1,a2);
        dupla.mostra();
    }
}
