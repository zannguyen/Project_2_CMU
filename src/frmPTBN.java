import javax.swing.*;
import java.awt.event.*;

public class frmPTBN extends JFrame implements ActionListener {
    private JTextField txtA, txtB;
    private JButton btnGiai;
    private JLabel lblKetQua;

    public frmPTBN() {
        setTitle("Giải phương trình bậc nhất");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Hệ số a:");
        lblA.setBounds(30, 30, 80, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(120, 30, 200, 25);
        add(txtA);

        JLabel lblB = new JLabel("Hệ số b:");
        lblB.setBounds(30, 70, 80, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(120, 70, 200, 25);
        add(txtB);

        btnGiai = new JButton("Giải");
        btnGiai.setBounds(140, 110, 100, 30);
        btnGiai.addActionListener(this);
        add(btnGiai);

        lblKetQua = new JLabel("");
        lblKetQua.setBounds(30, 150, 320, 25);
        add(lblKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(txtA.getText().trim());
            double b = Double.parseDouble(txtB.getText().trim());

            if (a == 0) {
                if (b == 0) {
                    lblKetQua.setText("Phương trình có vô số nghiệm.");
                } else {
                    lblKetQua.setText("Phương trình vô nghiệm.");
                }
            } else {
                double x = -b / a;
                lblKetQua.setText("Nghiệm x = " + x);
            }
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Lỗi: Vui lòng nhập số hợp lệ cho a và b.");
        }
    }

    public static void main(String[] args) {
        new frmPTBN();
    }
}
