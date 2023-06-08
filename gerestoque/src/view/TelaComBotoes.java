package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class TelaComBotoes {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Tela com Botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o painel principal com o GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        frame.setLayout(layout);

        // Cria os botões e adiciona ao painel
        for (int i = 0; i < 10; i++) {
            JButton botao = new JButton("Botão " + (i + 1));
            constraints.gridx = i % 5; // Coluna
            constraints.gridy = i / 5; // Linha
            constraints.fill = GridBagConstraints.HORIZONTAL; // Preenchimento horizontal
            constraints.ipadx = 20; // Espaçamento horizontal
            constraints.ipady = 10; // Espaçamento vertical
            layout.setConstraints(botao, constraints);
            frame.add(botao);
        }

        // Cria a frase e adiciona ao painel
        JLabel frase = new JLabel("Minha frase no meio");
        constraints.gridx = 0; // Coluna
        constraints.gridy = 2; // Linha
        constraints.gridwidth = 5; // Largura da célula
        constraints.fill = GridBagConstraints.NONE; // Sem preenchimento
        constraints.anchor = GridBagConstraints.CENTER; // Alinhamento central
        layout.setConstraints(frase, constraints);
        frame.add(frase);

        frame.pack();
        frame.setVisible(true);
    }
}

