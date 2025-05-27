
package cap6;

public class SimuladorCoxinha {
    private int estoque;
    
    public SimuladorCoxinha(){
        estoque=0;
    }
    
    public SimuladorCoxinha(int estoque){
        this.estoque=estoque;
    }
    public int getEstoque(){
        return estoque;
    }
    
   public void setEstoque(int estoque){
       if(estoque>=0){
           this.estoque=estoque;
       }
   }
   
   public void abastecer(int n){
       if(n>0){
           estoque+=n;
       }
   }
   
   public void venda(){
       if(estoque>0){
           estoque--;
       }else{
           System.out.println("sem coxinha a venda");
       }
   }
   public void venda(int n){
       if(n<=0){
           System.out.println("quantidade não permitida");
       }else{
           estoque-=n;
       }
   }
   
   public void zeraSimulador(){
       estoque=0;
   }
}
