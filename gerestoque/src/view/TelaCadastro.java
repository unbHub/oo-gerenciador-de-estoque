package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{

    //insere os dados da empresa
    private JPanel jpnlemp;
    private JLabel jblemp;
    private JTextField jtxtemp;

    //insere a quantidade de filais existentes
    private JPanel jpnlfilial;
    private JLabel jblfilial;
    private JTextField jtxfilial;

    //insere os dados das filiais
    private JPanel jpnldf;
    private JLabel jlbldf;
    private JTextField jtxtdf;

    //insere os ids dos estoques
    private JPanel jpnlid;
    private JLabel jlblid;
    private JTextField jtxtid;

    //método construtor
    public TelaCadastro(){
        super();
        this.confFrame();
        this.confPainelEmpresa();
        this.add(this.jpnlemp); 
        this.confPainelFilial();
        this.add(this.jpnlfilial);
        this.confPainelDadosFilial();
        this.add(this.jpnldf);
        this.confPainelIdEstoque();
        this.add(this.jpnlid);
    }

    //configuração da janela
    private void confFrame(){
        this.setTitle("Gerenciador de Estroque");
        this.setSize(new Dimension(500, 450));
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    //configuração do painel dos dados da empresa
    private void confPainelEmpresa(){
        this.jpnlemp = new JPanel(new FlowLayout());
        this.jpnlemp.setPreferredSize(new Dimension(400, 100));
        this.confDadosEmpresa();
        this.jpnlemp.add(this.jblemp);
        this.jpnlemp.add(this.jtxtemp);
    }


    private void confDadosEmpresa(){
            this.jblemp = new JLabel("Digite o nome da empresa:");
            this.jtxtemp = new JTextField();
            this.jtxtemp.setPreferredSize(new Dimension(300, 25));
        }


    //configuração do painel dos dados da filial
    private void confPainelFilial(){
        this.jpnlfilial = new JPanel(new FlowLayout());
        this.jpnlfilial.setPreferredSize(new Dimension(400, 100));
        this.confFilial();
        this.jpnlfilial.add(this.jblfilial);
        this.jpnlfilial.add(this.jtxfilial);
        
    }

    private void confFilial(){
        this.jblfilial = new JLabel("Digite a quantidade de filiais existentes: ");
        this.jtxfilial = new JTextField();
        this.jtxfilial.setPreferredSize(new Dimension(300, 25));
    }
    
    //configura os dados da filial
    private void confPainelDadosFilial(){
        this.jpnldf = new JPanel(new FlowLayout());
        this.jpnldf.setPreferredSize(new Dimension(400, 100));
        this.confDadosFilial();
        this.jpnldf.add(this.jlbldf);
        this.jpnldf.add(this.jtxtdf);
        
    }

    private void confDadosFilial(){
        this.jlbldf = new JLabel("Digite os dados das filiais: ");
        this.jtxtdf = new JTextField();
        this.jtxtdf.setPreferredSize(new Dimension(300, 25));
}

    //configura o painel de dados do id de estoque

    private void confPainelIdEstoque(){
        this.jpnlid = new JPanel(new FlowLayout());
        this.jpnlid.setPreferredSize(new Dimension(400, 100));
        this.confIdEstoque();
        this.jpnlid.add(this.jlblid);
        this.jpnlid.add(this.jtxtid);
        
    }

    private void confIdEstoque(){
        this.jlblid = new JLabel("Digite os dados das filiais: ");
        this.jtxtid = new JTextField();
        this.jtxtid.setPreferredSize(new Dimension(300, 25));
}
}