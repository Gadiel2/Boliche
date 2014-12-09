

package jogodeboliche;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.*;


public class Apresenta extends JDialog{
    ImageIcon avatar1 = new javax.swing.ImageIcon(getClass().getResource("/icones/avatar1.jpg"));
    ImageIcon avatar2 = new javax.swing.ImageIcon(getClass().getResource("/icones/avatar2.jpg"));
    ImageIcon avatar3 = new javax.swing.ImageIcon(getClass().getResource("/icones/avatar3.jpg"));
    ImageIcon avatar4 = new javax.swing.ImageIcon(getClass().getResource("/icones/avatar4.jpg"));
    Image imagemAux;
    Container cp = new Container();
    JPanel tela = new JPanel();
    JPanel tela1 = new JPanel();
    JLabel rotulo = new JLabel("Jogador 1");
    JLabel cara = new JLabel(avatar1);
    JLabel rotulo1 = new JLabel("Jogador 2");
    JLabel cara1 = new JLabel(avatar2);
    JLabel rotulo2 = new JLabel("Jogador 3");
    JLabel rotulo3 = new JLabel("Jogador 4");
    JButton ok = new JButton();
    
    public Apresenta(String players){
        int jogadores = Integer.parseInt(players);
        cp = getContentPane();
        setSize(500,500);
        setTitle("Boliche");
        setModal(true);
        tela.setLayout(new BorderLayout());
        tela.add(ok, BorderLayout.SOUTH);
        if(jogadores == 2){
            imagemAux = avatar1.getImage();
            avatar1.setImage(imagemAux.getScaledInstance(100,100, Image.SCALE_SMOOTH));
            tela1.setLayout(new GridLayout(2,2));
            tela1.add(rotulo);
            tela1.add(cara);
        }
    }
}
