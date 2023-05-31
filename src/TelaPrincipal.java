import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton calcularIMCButton;
    private JLabel lblResultado;
    private JPanel MainPanel;
    private JLabel lblClassificacao;

    public TelaPrincipal(){
        setContentPane(MainPanel);
        setTitle("Calcular IMC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,200);
        setLocationRelativeTo(null);
        setVisible(true);
        calcularIMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso = Double.parseDouble(txtPeso.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                Calculos calc = new Calculos();
                lblResultado.setText(" " + calc.imc(peso, altura));
                lblClassificacao.setText(" "+calc.Classi());
            }
        });
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
