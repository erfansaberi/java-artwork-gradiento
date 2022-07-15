import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Gradiento extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gradiento");
        Canvas canvas = new Gradiento();
        canvas.setSize(800, 800);
        frame.add(canvas);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int z = 0; z < 1000; z++) {
            Color c = new Color(0, 0, z/4);
            g.setColor(c);
            draw(0, z, 1, 0, 0, g);
            draw(0, 1, z, 0, 0, g);
        }
        for (int z = 0; z < 1000; z++) {
            Color c = new Color(z/4, 0, 0);
            g.setColor(c);
            draw(0, z, 1, 0, 0, g);
            draw(0, 1, z, 0, 0, g);
        }
        for (int z = 0; z < 1000; z++) {
            Color c = new Color(z/4, z/8, z/4);
            g.setColor(c);
            draw(0, z, 1, 0, 0, g);
            draw(0, 1, z, 0, 0, g);
        }
        for (int z = 0; z < 1000; z++) {
            Color c = new Color(0, z/4, z/4);
            g.setColor(c);
            draw(0, z, 1, 0, 0, g);
            draw(0, 1, z, 0, 0, g);
        }
        for (int z = 0; z < 1000; z++) {
            Color c = new Color(z/4, z/4, 0);
            g.setColor(c);
            draw(0, z, 1, 0, 0, g);
            draw(0, 1, z, 0, 0, g);
        }
        for (int z = 0; z < 1000; z++) {
            Color c = new Color(z/4, z/4, z/4);
            g.setColor(c);
            draw(0, z, 1, 0, 0, g);
            draw(0, 1, z, 0, 0, g);
        }
    }

    public void draw(int i, int x, int y, int width, int height, Graphics g) {
        if (i >= 100) {
            return;
        }
        g.fillOval(x, y, width, height);
        draw(++i, x+width/i, y+width/i, width+3*i, height+3*i, g);
    }
}