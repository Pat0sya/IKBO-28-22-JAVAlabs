package mirea.javalabs.lab8wip;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public RandomShapesApp(){
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                drawRandomShape(g);

            }
        };
        getContentPane().add(panel);

    }
    private void drawRandomShape(Graphics g){
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            if (random.nextBoolean()){
                int radius = random.nextInt(50)+10;
                Shape circle = new Circle(color, x, y, radius);
                circle.draw(g);

            }else{
                int width = random.nextInt(100) +20;
                int height = random.nextInt(100)+20;
                Shape rectangle = new Rectangle(color, x, y, width, height);
                rectangle.draw(g);
            }
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(() ->{
            RandomShapesApp app = new RandomShapesApp();
            app.setVisible(true);
        });
    }

}


