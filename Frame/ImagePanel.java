package Frame;

import javax.swing.*;
import java.awt.*;

/**
 * Background panel.
 **/
public class ImagePanel extends JPanel {
    public ImagePanel(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    /**
     * Background image for the panel.
     **/
    private Image image;
}
