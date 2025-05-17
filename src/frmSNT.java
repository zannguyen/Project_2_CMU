import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmSNT extends JFrame {
    private JTextField txtSo, txtKetQua;
    private JButton btnKiemTra;

    public frmSNT() {
        setTitle("Kiểm tra số nguyên tố");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Nhập số nguyên:"));
        txtSo = new JTextField();
        add(txtSo);

        add(new JLabel("Kết quả:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnKiemTra = new JButton("Kiểm tra");
        add(btnKiemTra);

        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(txtSo.getText());
                    if (n < 2) {
                        txtKetQua.setText(n + " không phải là số nguyên tố");
                    } else {
                        if (laSoNguyenTo(n)) {
                            txtKetQua.setText(n + " là số nguyên tố");
                        } else {
                            txtKetQua.setText(n + " không phải là số nguyên tố");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmSNT.this,
                        "Vui lòng nhập số nguyên hợp lệ!",
                        "Lỗi nhập",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Hàm kiểm tra số nguyên tố
    private boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmSNT().setVisible(true);
        });
    }
}
