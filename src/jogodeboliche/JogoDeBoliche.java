

package jogodeboliche;


public class JogoDeBoliche {

    
    public static void main(String[] args) {
        Boliche partidaA = new Boliche();
        partidaA.roll(10);
        partidaA.roll(10);
        partidaA.roll(5);
        partidaA.roll(5);
        System.out.println(partidaA.score());
        
        GUI teste = new GUI();
        
        
    }
    
}
