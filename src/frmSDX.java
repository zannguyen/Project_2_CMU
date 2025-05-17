import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmSDX extends JFrame implements ActionListener {
    private JTextField txtNumber;
    private JLabel lblResult;

    public frmSDX() {
        setTitle("Kiem tra so doi xung");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 5, 5));

        JPanel pnlInput = new JPanel(new FlowLayout());
        pnlInput.add(new JLabel("Nhap so:"));
        txtNumber = new JTextField(20);
        pnlInput.add(txtNumber);

        JPanel pnlButton = new JPanel(new FlowLayout());
        JButton btnCheck = new JButton("Kiem tra");
        btnCheck.addActionListener(this);
        pnlButton.add(btnCheck);

        JPanel pnlResult = new JPanel(new FlowLayout());
        lblResult = new JLabel("");
        pnlResult.add(lblResult);

        add(pnlInput);
        add(pnlButton);
        add(pnlResult);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = txtNumber.getText();
        if (isPalindrome(input)) {
            lblResult.setText(input + " la so doi xung");
        } else {
            lblResult.setText(input + " khong phai so doi xung");
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            frmSDX frame = new frmSDX();
            frame.setVisible(true);
        });
    }
}