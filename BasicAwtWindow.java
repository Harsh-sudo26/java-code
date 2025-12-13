import java.awt.*;
import java.awt.event.*;

public class BasicAwtWindow {

    public static void main(String[] args) {
        Frame minFrame = new Frame("main window");
        Label maiLabel = new Label("main label");
        Button b1 = new Button("Click me");

        minFrame.add(maiLabel);
        minFrame.add(b1);
        minFrame.setSize(400, 400);
        minFrame.setVisible(true);
        // minFrame.setBounds(80,100,60,78);

        // Correct closing action here
        minFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
