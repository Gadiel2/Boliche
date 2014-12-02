
package jogodeboliche;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame {
    
    Container cp = new Container();
    
    Random random = new Random();
    
    JPanel PnIn = new JPanel();
    JPanel PnPt = new JPanel();
    JPanel PnBt = new JPanel();
    
    JTextField tfJogadores = new JTextField(15);
    
    JLabel lb1 = new JLabel("0");
    
    JButton btComecar = new JButton("Começar");
    JButton btJogar = new JButton("Jogar");
    

    public GUI(){
        
        cp = getContentPane();
        
        setTitle("Jogo de Boliche");
        setSize(800,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp.setLayout(new BorderLayout());
        
        PnIn.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        PnIn.add(new JLabel("Numero de Jogadores:"));
        PnIn.add(tfJogadores);
        PnIn.add(btComecar);
        
        PnPt.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        PnPt.add(new JLabel("Pontuação:"));
        PnPt.add(lb1);
        
        
        PnBt.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        PnBt.add(btJogar);
        
        cp.add(PnIn, BorderLayout.NORTH);
        cp.add(PnPt, BorderLayout.CENTER);
        cp.add(PnBt, BorderLayout.SOUTH);
        
        Boliche teste1 = new Boliche();
         btJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                
                int pinos = random.nextInt(11);
                
                lb1.setText(String.valueOf(pinos));
                
                
                  }
        });
         
       setVisible(true);  
    }
}


