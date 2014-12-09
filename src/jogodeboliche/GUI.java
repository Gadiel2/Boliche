
package jogodeboliche;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame{
    ImageIcon imagemInicial = new javax.swing.ImageIcon(getClass().getResource("/icones/pinos.jpg"));
    Image imagemAux;
    Container cp = new Container();
    JPanel tela = new JPanel();
    JPanel tela1 = new JPanel();
    JPanel tela2 = new JPanel();
    JLabel rotulo = new JLabel(imagemInicial);
    JLabel titulo = new JLabel();
    JLabel nPlayers = new JLabel("Numero de Jogadores: ");
    JTextField camponPlayers = new JTextField();
    JButton botao = new JButton("Começar");
    
    public GUI(){
        imagemAux = imagemInicial.getImage();
        imagemInicial.setImage(imagemAux.getScaledInstance(450,400, Image.SCALE_SMOOTH));
        setSize(500,500);
        setTitle("Boliche");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        tela.setLayout(new GridLayout(1,2));
        tela.add(nPlayers);
        tela.add(camponPlayers);
        tela1.add(botao);
        tela2.setLayout(new GridLayout(2,1));
        tela2.add(tela);
        tela2.add(tela1);
        cp.add(rotulo, BorderLayout.CENTER);
        cp.add(tela2, BorderLayout.SOUTH);
        
        
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new GUIJogo(camponPlayers.getText());
                dispose();
            }
        });
                
        setVisible(true);
    }
}
