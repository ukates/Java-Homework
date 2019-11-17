import javax.swing.*;
import java.net.*;

public class HelloNameDialog {

    public static void main(String[] args) throws Exception {

        ImageIcon icon = new ImageIcon(new URL("http://www.reactiongifs.com/r/fgwv.gif"));
        String result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!", "Hello Window", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
