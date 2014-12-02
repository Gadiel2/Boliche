

package jogodeboliche;


public class Boliche {

     int score = 0;

     int jogadas[] = new int[21];
     
     int p = 0;
     
     int ultimoSpare = 0;
     
     int STRIKE = 0;

     public Boliche(){
         
     }
    public int score() {
        return score;
    }

    public void roll(int pinos) {
        if(pinos >0 && pinos <11){
            if(pinos==10){
                STRIKE = 2;
                jogadas[p] = 10;
                jogadas[p+1] = 0;
                p+=2;
                
            }
            else{
                if(STRIKE !=0){
                          STRIKE --;
                          this.score += pinos;
                }
                if(p%2==0){
                    int soma =0;
                    for (int i = ultimoSpare;i < p; i++) {
                        soma += jogadas[i];
                    }
                    if(soma == 10){
                        this.ultimoSpare = p;
                        this.score += pinos;
                    }
                }
                jogadas[p] = pinos;
            
            }
            this.score += pinos;
            p++;
        }
        else{
           throw new IllegalArgumentException();
        }
      
    }
    
}
