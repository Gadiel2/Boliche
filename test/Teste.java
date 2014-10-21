

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
        jogo.roll(3);
        assertEquals(16,jogo.score());
    }
        
        

}
