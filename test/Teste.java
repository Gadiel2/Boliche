

import jogodeboliche.Boliche;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Teste {
    
    public Teste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste1(){
        Boliche jogo = new Boliche();
        for (int i = 0; i < 20; i++) {
            jogo.roll(11);
            
        }
       
    }
    
    @Test
    public void teste2(){
        Boliche jogo = new Boliche();
        jogo.roll(5);
        jogo.roll(5);
        jogo.roll(5);
        assertEquals(20,jogo.score());
    }
    @Test
    public void teste3(){
        Boliche jogo = new Boliche();
       /*1*/ jogo.roll(10);
       /*3*/ jogo.roll(4);
       /*4*/ jogo.roll(4);
       /*5*/ jogo.roll(4);
       /*6*/ jogo.roll(4);
       /*7*/ jogo.roll(4);
       /*8*/ jogo.roll(4);
       /*9*/ jogo.roll(4);
       /*10*/jogo.roll(4);
       /*11*/jogo.roll(4);
       /*12*/jogo.roll(4);
       /*13*/jogo.roll(4);
       /*14*/jogo.roll(4);
       /*15*/jogo.roll(4);
       /*16*/jogo.roll(4);
       /*17*/jogo.roll(4);
       /*18*/jogo.roll(4);
       /*19*/jogo.roll(4);
       /*20*/jogo.roll(4);
        assertEquals(90,jogo.score());
    }
        
        

}
