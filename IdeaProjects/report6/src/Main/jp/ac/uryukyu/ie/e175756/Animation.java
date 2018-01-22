package jp.ac.uryukyu.ie.e175756;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {
    @SuppressWarnings("serial")
        //ここからボールの座標をどこから始まるのかを決める
        int x = 0;
        int y = 0;
        private void moveBall() {
            //ボールを動かすために、xとyの座標を変化する
            x = x + 3;
            y = y + 3;
        }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.fillOval(x, y, 30, 30);//ボールのサイズを決める
        }

        public static void main(String[] args) throws InterruptedException {
            JFrame frame = new JFrame("Sample Frame");
            jp.ac.uryukyu.ie.e175756.Animation game = new jp.ac.uryukyu.ie.e175756.Animation();
            frame.add(game);
            frame.setSize(600, 600);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            while (true) {
                game.moveBall();
                game.repaint();
                Thread.sleep(20);

            }
        }
    }
