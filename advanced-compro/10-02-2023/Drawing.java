import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class DrawingPanel extends JPanel {
    Ellipse2D.Double circle = new Ellipse2D.Double(10, 10, 100, 100);
    Rectangle2D.Double square = new Rectangle2D.Double(55, 55, 10, 10);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(circle);

        g2d.setColor(Color.BLUE);
        g2d.fill(square);
    }
}

public class Drawing {
    public static void main(String[] args) {
        JFrame window = new JFrame("653040462-9");
        DrawingPanel content = new DrawingPanel();

        window.setContentPane(content);
        window.setPreferredSize(new Dimension(120, 160));
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
    }
}
