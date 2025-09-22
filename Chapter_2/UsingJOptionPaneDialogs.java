import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main (String[] a) {

        while (true) {
            String name = JOptionPane.showInputDialog("What is your name?");

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No name entered.");
                break;
            }

            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", 
                                                        "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                break; 
            } 
            
            else if (confirm == JOptionPane.NO_OPTION) {
                continue;
            }
        }

    }
}
        
    
