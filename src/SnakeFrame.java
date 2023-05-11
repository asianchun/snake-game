import javax.swing.*;
import java.awt.*;

public class SnakeFrame extends JFrame {

    JMenuBar menuBar;
    JMenu settings;
    JMenuItem newGame;
    Font font;

    SnakeFrame(){
        this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        menuBar = new JMenuBar();
        settings = new JMenu("Options");
        newGame = new JMenuItem("New Game");
        font = new Font("Ink Free", Font.BOLD, menuBar.getFont().getSize() + 5);

        menuBar.setBackground(Color.black);
        menuBar.setFont(font);

        settings.setForeground(Color.white);
        settings.setBackground(Color.black);
        settings.setBorderPainted(false);
        settings.getPopupMenu().setBorder(null);
        settings.setFont(font);

        newGame.setForeground(Color.white);
        newGame.setBackground(Color.black);
        newGame.setBorderPainted(false);
        newGame.setFont(font);
        newGame.addActionListener(
                (e) -> {
                    this.dispose();
                    new SnakeFrame();
                }
        );

        settings.add(newGame);
        menuBar.add(settings);
        this.setJMenuBar(menuBar);

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
