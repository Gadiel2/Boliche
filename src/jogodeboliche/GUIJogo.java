

package jogodeboliche;

import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIJogo extends JDialog{
    Container cp = new Container();
    JPanel tela = new JPanel();
    JPanel tela1 = new JPanel();
    JPanel tela2 = new JPanel();
    JLabel rotulo = new JLabel();
    JLabel titulo = new JLabel();
    JLabel nPlayers = new JLabel("Numero de Jogadores: ");
    JTextField camponPlayers = new JTextField();
    JButton botao = new JButton("Começar");
    
    public GUIJogo(String players){
        cp = getContentPane();
        setModal(true);
        setSize(500,500);
        setTitle("Boliche");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        new Apresenta(players);
        
        setVisible(true);
        
    }
}
