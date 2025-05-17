import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmSoLonNhat extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2;
    private JButton btnTinh;
    private JLabel lblKetQua;

    public frmSoLonNhat() {
        setTitle("Form Tìm Số Lớn Nhất");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Số thứ nhất (a):"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai (b):"));
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
            double a = Double.parseDouble(txtSo1.getText());
            double b = Double.parseDouble(txtSo2.getText());

            double max = Math.max(a, b);
            lblKetQua.setText("Kết quả: Số lớn nhất là " + max);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new frmSoLonNhat();
    }
}
