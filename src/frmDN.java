import javax.swing.*;
import java.awt.event.*;

public class frmDN extends JFrame implements ActionListener {
    private JTextField txtA, txtB;
    private JButton btnDao;
    private JLabel lblKetQua;

    public frmDN() {
        setTitle("Đảo ngược 2 số");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(30, 30, 80, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(100, 30, 200, 25);
        add(txtA);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(30, 70, 80, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(100, 70, 200, 25);
        add(txtB);

        btnDao = new JButton("Đảo ngược");
        btnDao.setBounds(120, 110, 130, 30);
        btnDao.addActionListener(this);
        add(btnDao);

        lblKetQua = new JLabel("");
        lblKetQua.setBounds(30, 150, 320, 25);
        add(lblKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Đọc 2 số từ người dùng
            int a = Integer.parseInt(txtA.getText().trim());
            int b = Integer.parseInt(txtB.getText().trim());

            // Đảo ngược (hoán đổi a và b)
            int temp = a;
            a = b;
            b = temp;

            // Cập nhật kết quả ra giao diện
            lblKetQua.setText("Sau khi đảo: A = " + a + ", B = " + b);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
        }
    }

    public static void main(String[] args) {
        new frmDN();
    }
}
