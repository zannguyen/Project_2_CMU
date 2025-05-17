import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain extends JFrame implements ActionListener {
    private JButton btnBCNN, btnDN, btnGD, btnPTBN, btnSDX, btnSLN, btnSNT, btnUCLN;

    public frmMain() {
        setTitle("Main Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2, 10, 10));

        btnBCNN = new JButton("Bội chung nhỏ nhất");
        btnDN = new JButton("Đảo ngược");
        btnGD = new JButton("Giảm dần");
        btnPTBN = new JButton("Phương trình bậc nhất");
        btnSDX = new JButton("Số đối xứng");
        btnSLN = new JButton("Số lớn nhất");
        btnSNT = new JButton("Số nguyên tố");
        btnUCLN = new JButton("Ước chung lớn nhất");

        add(btnBCNN);
        add(btnDN);
        add(btnGD);
        add(btnPTBN);
        add(btnSDX);
        add(btnSLN);
        add(btnSNT);
        add(btnUCLN);

        btnBCNN.addActionListener(this);
        btnDN.addActionListener(this);
        btnGD.addActionListener(this);
        btnPTBN.addActionListener(this);
        btnSDX.addActionListener(this);
        btnSLN.addActionListener(this);
        btnSNT.addActionListener(this);
        btnUCLN.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBCNN) {
            new frmBCNN().setVisible(true);
        } else if (e.getSource() == btnDN) {
            new frmDN().setVisible(true);
        } else if (e.getSource() == btnGD) {
            new frmGD().setVisible(true);
        } else if (e.getSource() == btnPTBN) {
            new frmPTBN().setVisible(true);
        } else if (e.getSource() == btnSDX) {
            new frmSDX().setVisible(true);
        } else if (e.getSource() == btnSLN) {
            new frmSLN().setVisible(true);
        } else if (e.getSource() == btnSNT) {
            new frmSNT().setVisible(true);
        } else if (e.getSource() == btnUCLN) {
            new frmUCLN().setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }
}
