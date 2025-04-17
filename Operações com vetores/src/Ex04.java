import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex04 extends JFrame implements ActionListener {
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();

    JTextField nome = new JTextField(20);
    JTextArea conjunto = new JTextArea();
    Container con = new Container();
    JButton salvar = new JButton("Salvar");
    JButton excluir = new JButton("Excluir");
    JLabel anotacao = new JLabel("Usuarios cadastrados: 0 de 10");
    private String[] usarios = new String[10];
    private int quantidade = 0;

    public Ex04() {
        super("Cadastro de Usuários foda");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 300);
        setLayout(layout);
        con.setLayout(new FlowLayout());
        con.add(salvar);
        con.add(excluir);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;

        addC(new JLabel("Nome: "), 0, 0, 1, 1);
        addC(nome, 0, 1, 1, 3);

        constraints.anchor = GridBagConstraints.CENTER;
        addC(con, 1, 0, 1, 4);
        addC(anotacao, 2, 1, 1, 1);
        addC(conjunto, 3, 2, 4, 5);
        salvar.addActionListener(this);
        excluir.addActionListener(this);
        conjunto.setEnabled(false);
        setVisible(true);
    }

    public void addC(Component c, int linha, int coluna, int altura, int largura) {
        constraints.gridy = linha;
        constraints.gridx = coluna;
        constraints.gridheight = altura;
        constraints.gridwidth = largura;
        layout.setConstraints(c, constraints);
        add(c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salvar) {
            String nomeUsuario = nome.getText();
            if (nomeUsuario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite um nome", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (quantidade >= 10) {
                JOptionPane.showMessageDialog(this, "Lista está cheia", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                usarios[quantidade] = nomeUsuario;
                quantidade++;
                atualizarConjuntoTexto();
                anotacao.setText("Usuarios cadastrados: " + quantidade + " de 10.");
                nome.setText("");
            }
        }

        if (e.getSource() == excluir) {
            String nomeUsuario = nome.getText();
            if (nomeUsuario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite o nome do usuário a excluir.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                boolean encontrado = false;
                for (int i = 0; i < quantidade; i++) {
                    if (usarios[i].equals(nomeUsuario)) {
                        encontrado = true;
                        for (int j = i; j < quantidade - 1; j++) {
                            usarios[j] = usarios[j + 1];
                        }
                        usarios[quantidade - 1] = null;
                        quantidade--;
                        atualizarConjuntoTexto();
                        anotacao.setText("Usuarios cadastrados: " + quantidade + " de 10.");
                        nome.setText("");
                        JOptionPane.showMessageDialog(this, "usuário excluído.");
                        break;
                    }
                }
                if (!encontrado)
                    JOptionPane.showMessageDialog(this, "usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    private void atualizarConjuntoTexto() {
        String textoCompleto = "";
        for (int i = 0; i < quantidade; i++) {
            textoCompleto += usarios[i] + "\n";
        }
        conjunto.setText(textoCompleto);
    }

    public static void main(String[] args) {
        new Ex04();
    }
}
