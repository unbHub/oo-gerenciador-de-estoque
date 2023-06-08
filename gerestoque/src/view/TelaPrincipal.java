package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {

    private JLabel jlbl;
    private JPanel jpnl;

    private GridBagConstraints c = new GridBagConstraints();
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;


    ImageIcon img1 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/java/JavaPikaDasGalaxias/lib/images/maizin.png");
    ImageIcon img2 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/java/JavaPikaDasGalaxias/lib/images/menozin.png");
    ImageIcon img3 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/java/JavaPikaDasGalaxias/lib/images/atualizar.png");
    ImageIcon img4 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/java/JavaPikaDasGalaxias/lib/images/uai.png");
    ImageIcon img5 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/java/JavaPikaDasGalaxias/lib/images/ihhh.png");
    ImageIcon img6 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/java/JavaPikaDasGalaxias/lib/images/vem pro fut.png");
    
    //método construtor
    public TelaPrincipal(){
        super();
        confFrame();
        botao1();
        botao2();
        botao3();
        botao4();
        botao5();
        botao6();
        botao7();
        botao8();
        botao9();
        panelConfig();
        this.add(jpnl);
    }

    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();

    private void confFrame(){
        this.setTitle("GERENCIADOR DE ESTOQUE POHAAAA");
        this.setSize(new Dimension(700, 600));
        this.setLayout(this.layout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }


    private void panelConfig(){
        this.jpnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.jpnl.setPreferredSize(new Dimension(100, 50));
        this.add(this.jlbl = new JLabel("GERENCIADOR DE ESTOQUEEEEE!!!!!"));
        this.c.gridx = 1;
        this.c.gridy = 1;
        add(btn1,c);
        this.c.gridy = 2;
        add(btn2,c);
        add(btn3,c);
        add(btn4,c);
        add(btn5,c);
        add(btn6,c);
        add(btn7,c);
        add(btn8,c);
        add(btn9,c);
       }

    //métodos para configurar os botões
    private void botao1(){
        this.btn1 = new JButton("Adicionar mercadoria",img1);
        this.btn1.setBounds(100, 300, 100, 60);
    }

    private void botao2(){
        this.btn2 = new JButton("Remover mercadoria",img2);
        this.btn2.setBounds(0, 0, 100, 60);
    }

    private void botao3(){
        this.btn3 = new JButton("Atualizar mercadoria",img3);
        this.btn3.setBounds(0, 0, 100, 60);
    }

    private void botao4(){
        this.btn4 = new JButton("Buscar mercadoria",img4);
        this.btn4.setBounds(0, 0, 100, 60);
    }

    private void botao5(){
        this.btn5 = new JButton("Listar estoque",img5);
        this.btn5.setBounds(0, 0, 100, 60);
    }
    
    private void botao6(){
        this.btn6 = new JButton("Ver estoque vazio",img6);
        this.btn6.setBounds(0, 0, 100, 60);
    }

    private void botao7(){
        this.btn7 = new JButton("Adicionar filial",img1);
        this.btn7.setBounds(0, 0, 100, 60);
    }

    private void botao8(){
        this.btn8 = new JButton("Remover filial",img2);
        this.btn8.setBounds(0, 0, 100, 60);
    }

    private void botao9(){
        this.btn9 = new JButton("Buscar filial",img4);
        this.btn9.setBounds(0, 0, 100, 60);
    }

    for(int i = 0; i > 10; i++){
        
    }
    
}
