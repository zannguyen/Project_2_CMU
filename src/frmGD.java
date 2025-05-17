import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class frmGD extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2;
    private JButton btnSapXep;
    private JLabel lblKetQua;

    public frmGD() {
        setTitle("Sap Xep Giam Dan");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 5, 5));

        txtSo1 = new JTextField();
        txtSo2 = new JTextField();
        btnSapXep = new JButton("Sap Xep");
        lblKetQua = new JLabel("Ket qua: ", SwingConstants.CENTER);

        add(new JLabel("Nhap so thu nhat:"));
        add(txtSo1);
        add(new JLabel("Nhap so thu hai:"));
        add(txtSo2);
        add(btnSapXep);
        add(lblKetQua);

        btnSapXep.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());

            if (so1 > so2) {
                lblKetQua.setText("Ket qua: " + so1 + " > " + so2);
            } else if (so1 < so2) {
                lblKetQua.setText("Ket qua: " + so2 + " > " + so1);
            } else {
                lblKetQua.setText("Ket qua: Hai so bang nhau");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui long nhap dung dinh dang so!", "Loi nhap lieu", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new frmGD();
    }
}
