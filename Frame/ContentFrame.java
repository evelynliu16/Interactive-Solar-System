package Frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Content frame.
 **/
public class ContentFrame extends JFrame {
    ContentFrame() throws IOException {
        super();

        _panel = new ImagePanel(ImageIO.read(new File("src/Background3.png")));
        add(_panel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        _panel.setSize(310, 310);
        setLocation(600, 250);
        setSize(310, 310);
        textArea();
    }

    /**
     * Create a label and add it to this frame.
     **/
    public void textArea() {
        _text = new JTextArea();
        _text.setLayout(new BorderLayout());
        _text.setOpaque(false);
        _text.setSize(_panel.getSize());
        _text.setForeground(Color.white);
        _text.setFont(new Font("TimesRoman", 3, 19));
        _panel.add(_text);
    }

    /**
     * The label for this frame.
     **/
    public JTextArea getLabel() {
        return _text;
    }

    /**
     * Add text to this frame.
     **/
    public void setText(String text) {
        _text.setText(text);

    }

    /**
     * The panel on the frame.
     **/
    private JPanel _panel;

    /**
     * The text area on the panel.
     **/
    private JTextArea _text;
}
