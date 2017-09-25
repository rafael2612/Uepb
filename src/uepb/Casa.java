package uepb;
public class Casa {
   private String cor;
   Portas porta1 = new Portas();
   Portas porta2 = new Portas();
   Portas porta3 = new Portas();

   void pintar(String cor){
       System.out.println("Cor da casa é : " +cor);
   }
    
    int portasAbertas(){
        int cont = 0;
        if(this.porta1.aberta){
            cont = cont + 1;
        }
        if(this.porta2.aberta){
            cont = cont + 1;
        }
        if(this.porta3.aberta){
            cont = cont + 1;
        }
        return cont;
    }
    
}