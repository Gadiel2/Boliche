

package jogodeboliche;


public class Boliche {

     int score = 0;

     int jogadas[] = new int[21];
     
     int p = 0;
     
     int ultimoSpare = 0;
     
     int bonus = 0;
     
     int STRIKE = 0;
     
     int ultimoStrike = 0;

     public Boliche(){
     }
    public int score() {
        return score;
    }

    public void roll(int pinos) {
        if(pinos > 0 && pinos < 11){
            if(pinos==10){ //Se for um strike
                STRIKE = 2; 
                jogadas[p] = 10; // 10 pontos da jogada atual
                jogadas[p+1] = 0; // pula a próxima rodada
                p+=2; // indice
                ultimoStrike = p;
                
            }
            else if(pinos != 10){ 
                if(STRIKE !=0){ 
                          STRIKE --; 
                          this.score += pinos;
                          
                }
               if(p%2==0){ // um rodada completa
                    int soma = 0; 
                    System.out.println(ultimoStrike + " ultimoStrike");
                    System.out.println(p+ " P");
                    for (int i = ultimoStrike;i < p; i++) { 
                        soma += jogadas[i];  
                    } 
                    if(soma == 10){
                        if( (p - ultimoStrike) ==2){
                            STRIKE++;
                            System.out.println( STRIKE + " STRIKE");
                        }
                        this.ultimoSpare = p; 
                        this.score += pinos; 
                    }
                    else{
                        if( (p - ultimoStrike) ==2){
                            STRIKE++;
                            System.out.println( STRIKE + " STRIKE do else");
                        }
                        this.score += pinos; 
               }
            }
                System.out.println(ultimoSpare + " ultimoSpare");
                if( (p-1)== ultimoSpare ){
                    
                }
            jogadas[p] = pinos;
            this.score += pinos;
            System.out.println(this.score + " Score");
            p++;
        }
        else if(pinos < 0 & pinos > 11){
            System.out.println("ERRO!!!");;
        }
      
    }
    
    
    }
}
