import javax.swing.JOptionPane;

public class UsingJOptionPaneDialog {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) {
                JOptionPane.showMessageDialog(null, "Program terminated.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            int confirm = JOptionPane.showConfirmDialog(null, 
                    "Do you want to display your name?", 
                    "Confirmation", 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continue;
            } else {
                JOptionPane.showMessageDialog(null, "Program terminated.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}