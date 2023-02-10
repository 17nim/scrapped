import javax.swing.*;
import java.awt.*;

class NameDisplayPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        String message = "Siraspon Saengnak";
        int width = getWidth();
        int height = getHeight();
        int w = width / 3 - message.length();
        int h = height / 2;

        Font f = new Font("TH Sarabun New", Font.BOLD, 32);
        g.setFont(f);
        g.setColor(Color.decode("#05445E"));
        g.drawString(message, w, h);
    }
}

public class NameDisplayApp {
    public static void main(String[] args) {
        JFrame window = new JFrame("653040462-9");
        NameDisplayPanel content = new NameDisplayPanel();

        window.setContentPane(content);
        window.setPreferredSize(new Dimension(500, 200));
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        //window.setLocationRelativeTo(null);
    }
}
