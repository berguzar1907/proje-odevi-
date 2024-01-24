public class proje4 {
    import javax.swing.*;
import java.awt.*;

    class SekilCizimi extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Dikdörtgenin koordinatları ve boyutu
            int x = 50;
            int y = 50;
            int genislik = 100;
            int yukseklik = 60;

            // Dikdörtgeni çiz
            g.drawRect(x, y, genislik, yukseklik);
        }
    }

    public class SekilOlusturma {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Sekil Oluşturma");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                SekilCizimi sekilPanel = new SekilCizimi();
                frame.add(sekilPanel);

                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        }
    }

}
