package ch03_recursion;

import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class IntroductionSnowFlake extends Applet {

    public void drawSnowFlake(
            final Graphics graphics,
            final int startX,
            final int startY,
            final int length,
            final int depth) {

        for (int degree = 0; degree < 360; degree += 60) {
            final double rad = degree * Math.PI / 180;
            final int endX = (int) (startX + Math.cos(rad) + length);
            final int endY = (int) (startY + Math.cos(rad) + length);

            graphics.drawLine(startX, startY, endX, endY);

            if (depth > 0) {
                drawSnowFlake(graphics, startX, startY, endX, endY);
            }
        }
    }

    public static void main(String[] args) {

        JFrame jp1 = new JFrame();

        IntroductionSnowFlake snowFlake = new IntroductionSnowFlake();

        jp1.getContentPane().add(snowFlake, BorderLayout.CENTER);

//        snowFlake.drawSnowFlake(0, 0, 1, 2);

        jp1.setSize(new Dimension(500, 500));
        jp1.setVisible(true);

    }
}
