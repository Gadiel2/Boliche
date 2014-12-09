

package jogodeboliche;


public class Boliche {

     int score = 0;

     int jogadas[] = new int[21];
     
     int p = 0;
     
     int ultimoSpare = 0;
     
     int bonus = 0;
     
     int STRIKE = 0;

     public Boliche(){

     }
    public int score() {
        int soma = 0;
        if( p <21){
                    for (int i = 0;i < p; i+=2) {
                        
                        int rodadaAtual = jogadas[i] + jogadas [i+1];
                        
                        soma+=rodadaAtual;
                        
                        if(jogadas[i] == 10 && p<20){
                            
                            soma+=jogadas[i+2] + jogadas[i+3];
                            
                        }
                        else if(jogadas[i] == 10 && p==20){
                            soma+=jogadas[i+2];
                        }
                        else if(rodadaAtual == 10){
                                soma+= rodadaAtual + jogadas[i+2];
                            }        
                            
                    }                   
        }
        else{
            System.out.println("FIM DE JOGO");
        }
        return soma;
    }

    public void roll(int pinos) {
        if(pinos > 0 && pinos < 11){
            if(pinos==10){ //Se for um strike 
                jogadas[p] = 10; // 10 pontos da jogada atual
                jogadas[p+1] = 0; // pula a próxima rodada
                p+=2; // indice
                
            }
            else{
                jogadas[p] = pinos;
                p++;
            }
        }
        else if(pinos < 0 & pinos > 11){
            System.out.println("ERRO!!!");;
        }
      
    } 
    
    }

