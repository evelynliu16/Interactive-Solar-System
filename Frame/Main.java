package Frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Main {


    /**
     * The main program.
     **/
    public static void main(String[] args) throws IOException {
        jframe = new JFrame("Interactive Solar System");
        BufferedImage myImage = ImageIO.read(new File("src/Background.png"));
        jpanel = new ImagePanel(myImage);
        jframe.setContentPane(jpanel);
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocation(135, 100);
        jframe.setSize(1200, 1200);

        addComponents();

        jframe.setVisible(true);
    }


    /**
     * Change the size of a image.
     **/
    public static void resize(String inputPath, String outputPath, int scaledWidth, int scaledHeight) throws
            IOException {
        File inputFile = new File(inputPath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        String formatName = outputPath.substring(outputPath
                .lastIndexOf(".") + 1);

        ImageIO.write(outputImage, formatName, new File(outputPath));
    }

    /**
     * Convert all the images to appropriate size.
     **/
    public static void resizeComponents() throws IOException {
        resize("src/Sun.png", "src/Sun2.png", 200, 220);
        resize("src/Mercury.png", "src/Mercury2.png", 60, 60);
        resize("src/Venus.png", "src/Venus2.png", 90, 90);
        resize("src/Earth.png", "src/Earth2.png", 100, 100);
        resize("src/Mars.png", "src/Mars2.png", 75, 75);
        resize("src/Jupiter.png", "src/Jupiter2.png", 140, 140);
        resize("src/Saturn.png", "src/Saturn2.png", 270, 140);
        resize("src/Uranus.png", "src/Uranus2.png", 115, 115);
        resize("src/Neptune.png", "src/Neptune2.png", 115, 115);
        resize("src/Pluto.png", "src/Pluto2.png", 40, 40);
        resize("src/Background2.png", "src/Background3.png", 310, 310);
        resize("src/Background2.png", "src/Background3.png", 310, 310);
    }

    /**
     * Add components to the panel.
     **/
    public static void addComponents() throws IOException {
        Icon sun = new ImageIcon("src/Sun2.png");
        Icon mercury = new ImageIcon("src/Mercury2.png");
        Icon venus = new ImageIcon("src/Venus2.png");
        Icon earth = new ImageIcon("src/Earth2.png");
        Icon mars = new ImageIcon("src/Mars2.png");
        Icon jupiter = new ImageIcon("src/Jupiter2.png");
        Icon saturn = new ImageIcon("src/Saturn2.png");
        Icon uranus = new ImageIcon("src/Uranus2.png");
        Icon neptune = new ImageIcon("src/Neptune2.png");
        Icon pluto = new ImageIcon("src/Pluto2.png");
        Icon andromeda = new ImageIcon("src/Andromeda2.png");

        JButton sunLabel = new JButton(sun);
        sunLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Sun" + "\r\n" + "Mass: 1.99 x 10^30 kg" + "\r\n" + "Volumetric mean radius: 695,700 km" +
                    "\r\n" + "Volume: 1.41 x 10^18 km^3" + "\r\n" + "Luminosity: 3.83 x 10^26 J/s");
            f.setVisible(true);
        });

        JButton mercuryLabel = new JButton(mercury);
        mercuryLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Mercury" + "\r\n" + "Mass: 3.30 x 10^23 kg" + "\r\n" + "Volumetric mean radius: 2,439.7 km" +
                    "\r\n" + "Volume: 6.08 x 10^10 km^3" + "\r\n" + "Mean orbital velocity: 47.36 km/s" +
                    "\r\n" + "Perihelion: 4.69 x 10^7 km" + "\r\n" + "Aphelion: 6.98 x 10^7 km");
            f.setVisible(true);
        });

        JButton venusLabel = new JButton(venus);
        venusLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Venus" + "\r\n" + "Mass: 4.87 x 10^24" + "\r\n" + "Volumetric mean radius: 6,051.8 km" +
                    "\r\n" + "Volume: 9.28 x 10^11 km^3" + "\r\n" + "Mean orbital velocity: 35.02 km/s" +
                    "\r\n" + "Perihelion: 1.07 x 10^8 km" + "\r\n" + "Aphelion: 1.09 x 10^8 km");
            f.setVisible(true);
        });

        JButton earthLabel = new JButton(earth);
        earthLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Earth" + "\r\n" + "Mass: 5.97 x 10^24 kg" + "\r\n" + "Volumetric mean radius: 6,371 km" +
                    "\r\n" + "Volume: 1.08 x 10^12 km^3" + "\r\n" + "Mean orbital velocity: 29.78 km/s" +
                    "\r\n" + "Perihelion: 1.47 x 10^8 km" + "\r\n" + "Aphelion: 1.52 x 10^8 km");
            f.setVisible(true);
        });

        JButton marsLabel = new JButton(mars);
        marsLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Mars" + "\r\n" + "Mass: 6.42 x 10^23 kg" + "\r\n" + "Volumetric mean radius: 3,389.5 km" +
                    "\r\n" + "Volume: 1.63 x 10^11 km^3" + "\r\n" + "Mean orbital velocity: 24.07 km/s" +
                    "\r\n" + "Perihelion: 2.07 x 10^8 km" + "\r\n" + "Aphelion: 2.49 x 10^8 km");
            f.setVisible(true);
        });

        JButton jupiterLabel = new JButton(jupiter);
        jupiterLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Jupiter" + "\r\n" + "Mass: 1.90 x 10^27 kg" + "\r\n" + "Volumetric mean radius: 69,911 km" +
                    "\r\n" + "Volume: 1.43 x 10^15 km^3" + "\r\n" + "Mean orbital velocity: 13.6 km/s" +
                    "\r\n" + "Perihelion: 7.41 x 10^8 km" + "\r\n" + "Aphelion: 8.17 x 10^8 km");
            f.setVisible(true);
        });

        JButton saturnLabel = new JButton(saturn);
        saturnLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Saturn" + "\r\n"  + "Mass: 5.68 x 10^26 kg" + "\r\n" + "Volumetric mean radius: 58,232 km" +
                    "\r\n" + "Volume: 8.27 x 10^14 km^3" + "\r\n" + "Mean orbital velocity: 9.68 km/s" +
                    "\r\n" + "Perihelion: 1.35 x 10^9 km" + "\r\n" + "Aphelion: 1.51 x 10^9 km");
            f.setVisible(true);
        });

        JButton uranusLabel = new JButton(uranus);
        uranusLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Uranus" + "\r\n" + "Mass: 8.68 x 10^25 kg" + "\r\n" + "Volumetric mean radius: 25,362 km" +
                    "\r\n" + "Volume: 6.83 x 10^13 km^3" + "\r\n" + "Mean orbital velocity: 6.80 km/s" +
                    "\r\n" + "Perihelion: 2.74 x 10^9 km" + "\r\n" + "Aphelion: 3.00 x 10^9 km");
            f.setVisible(true);
        });

        JButton neptuneLabel = new JButton(neptune);
        neptuneLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Neptune" + "\r\n" + "Mass: 1.02 x 10^26 kg" + "\r\n" + "Volumetric mean radius: 24,622 km" +
                    "\r\n" + "Volume: 6.25 x 10^13 km^3" + "\r\n" + "Mean orbital velocity: 5.43 km/s" +
                    "\r\n" + "Perihelion: 4.44 x 10^9 km" + "\r\n" + "Aphelion: 4.55 x 10^9 km");
            f.setVisible(true);
        });

        JButton plutoLabel = new JButton(pluto);
        plutoLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Pluto" + "\r\n" + "Mass: 1.30 x 10^22 kg" + "\r\n" + "Volumetric mean radius: 1,188 km" +
                    "\r\n" + "Volume: 7.02 x 10^9 km^3" + "\r\n" + "Mean orbital velocity: 4.67 km/s" +
                    "\r\n" + "Perihelion: 4.44 x 10^9 km" + "\r\n" + "Aphelion: 7.38 x 10^9 km");
            f.setVisible(true);
        });

        JButton andromedaLabel = new JButton(andromeda);
        andromedaLabel.addActionListener(e -> {
            ContentFrame f = makeFrame();
            f.setText("Andromeda Galaxy" + "\r\n" + "Type: spiral" + "\r\n" + "Diameter: 220,000 ly" + "\r\n" +
                    "Distance: 2.54 Mly" + "\r\n" + "Group: Local Group" +
                    "\r\n" + "Mass: 1,230 billion M☉(solar mass)");
            f.setVisible(true);
        });

        sunLabel.setBounds(10, 10, 200, 200);
        mercuryLabel.setBounds(190, 155, 60, 60);
        venusLabel.setBounds(260, 170, 90, 90);
        earthLabel.setBounds(345, 230, 100, 100);
        marsLabel.setBounds(440, 300, 75, 75);
        jupiterLabel.setBounds(520, 320, 140, 140);
        saturnLabel.setBounds(670, 390, 270, 140);
        uranusLabel.setBounds(890, 530, 115, 115);
        neptuneLabel.setBounds(1000, 610, 115, 115);
        plutoLabel.setBounds(1120, 710, 40, 40);
        andromedaLabel.setBounds(20, 650, 150, 150);

        jpanel.add(plutoLabel);
        jpanel.add(neptuneLabel);
        jpanel.add(uranusLabel);
        jpanel.add(saturnLabel);
        jpanel.add(jupiterLabel);
        jpanel.add(marsLabel);
        jpanel.add(earthLabel);
        jpanel.add(venusLabel);
        jpanel.add(mercuryLabel);
        jpanel.add(sunLabel);
        jpanel.add(andromedaLabel);
    }

    public static ContentFrame makeFrame() {
        ContentFrame f = null;
        try {
            f = new ContentFrame();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return f;
    }

    /**
     * The frame of the interactive solar system.
     **/
    private static JFrame jframe;

    /**
     * The panel of the interactive solar system.
     **/
    private static JPanel jpanel;
}
