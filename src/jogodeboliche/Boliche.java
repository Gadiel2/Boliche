

package jogodeboliche;


public class Boliche {
     int score = 0;
     int pinos;

    public int score() {
        return score;
    }

    public void roll(int pinos) {
        if(pinos >0 && pinos <11){
            this.score += pinos;
        }
        else{
           throw new IllegalArgumentException();
        }
      
    }
    
    
}
