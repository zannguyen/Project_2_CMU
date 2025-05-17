import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmUCLN extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2;
    private JButton btnTinh;
    private JLabel lblKetQua;

    public frmUCLN() {
        setTitle("Form UCLN");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        btnTinh = new JButton("Tính");
        btnTinh.addActionListener(this);
        add(btnTinh);

        lblKetQua = new JLabel("Kết quả: ");
        add(lblKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int so1 = Integer.parseInt(txtSo1.getText());
            int so2 = Integer.parseInt(txtSo2.getText());

            int ucln = tinhUCLN(so1, so2);
            lblKetQua.setText("Kết quả: " + ucln);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Vui lòng nhập số nguyên hợp lệ!");
        }
    }

    private int tinhUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        new frmUCLN();
    }
}
