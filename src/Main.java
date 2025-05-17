public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            System.out.println("Dang khoi tao frmMain");
            new frmMain().setVisible(true); // them setVisible
        });
    }
}