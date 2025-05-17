import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmBCNN extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTinh;

    public frmBCNN() {
        setTitle("Tính BCNN của hai số");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        add(new JLabel("BCNN:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnTinh = new JButton("Tính BCNN");
        add(btnTinh);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtSo1.getText());
                    int b = Integer.parseInt(txtSo2.getText());
                    if (a <= 0 || b <= 0) {
                        JOptionPane.showMessageDialog(frmBCNN.this,
                            "Vui lòng nhập hai số nguyên dương!",
                            "Lỗi nhập",
                            JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    int bcnn = (a * b) / gcd(a, b);
                    txtKetQua.setText(String.valueOf(bcnn));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmBCNN.this,
                        "Vui lòng nhập đúng số nguyên!",
                        "Lỗi nhập",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Hàm tính Ước chung lớn nhất (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmBCNN().setVisible(true);
        });
    }
}
