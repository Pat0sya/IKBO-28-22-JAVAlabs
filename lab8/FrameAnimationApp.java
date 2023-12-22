package mirea.javalabs.lab8wip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class FrameAnimationApp {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private int currentFrame = 0;
    private Timer timer;
    private ImageIcon[] frames;

    public FrameAnimationApp() {
        JFrame frame = new JFrame("Анимация с кадрами");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загрузка последовательности кадров изображения (frame0.png, frame1.png, и т. д.)
        frames = new ImageIcon[10];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("frame" + i + ".png");
        }

        // Создание и запуск таймера для анимации
        int delay = 100; // Задержка в миллисекундах между кадрами
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                frame.repaint();
            }
        });
        timer.start();

        JPanel animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Отрисовка текущего кадра
                if (currentFrame >= 0 && currentFrame < frames.length) {
                    frames[currentFrame].paintIcon(this, g, 0, 0);
                }
            }
        };

        frame.add(animationPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrameAnimationApp();
        });
    }
}