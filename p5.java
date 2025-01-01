import javax.swing.*;
import java.awt.*;

public class ShapesOnFrame extends JFrame {

    // Constructor to set up the JFrame
    public ShapesOnFrame() {
        setTitle("2D Shapes on Frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding custom drawing component to the frame
        add(new ShapesPanel());
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    // Inner class that extends JPanel for custom rendering
    static class ShapesPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Set background color
            setBackground(Color.WHITE);

            // Drawing a rectangle
            g2d.setColor(Color.BLUE);
            g2d.fillRect(50, 50, 100, 60); // (x, y, width, height)

            // Drawing an oval
            g2d.setColor(Color.RED);
            g2d.fillOval(200, 50, 100, 60);

            // Drawing a line
            g2d.setColor(Color.GREEN);
            g2d.drawLine(50, 150, 150, 200);

            // Drawing a round rectangle
            g2d.setColor(Color.ORANGE);
            g2d.drawRoundRect(50, 250, 100, 60, 25, 25); // Last two are arc-width, arc-height

            // Drawing a polygon
            g2d.setColor(Color.MAGENTA);
            int[] xPoints = {300, 350, 400};
            int[] yPoints = {300, 250, 300};
            g2d.fillPolygon(xPoints, yPoints, 3);
        }
    }

    public static void main(String[] args) {
        // Creating and displaying the frame
        SwingUtilities.invokeLater(() -> {
            ShapesOnFrame frame = new ShapesOnFrame();
            frame.setVisible(true);
        });
    }
}
