package S191220142.task2;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class getRgb{
    int[][] rgb;
    File file = new File("c256.png");

    getRgb(){
        rgb = new int[256][3];
    }

    public void setRgb() throws IOException{
        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();//图片宽度
        int height = image.getHeight();//图片高度
        int num = 0;
        int rgbR, rgbG, rgbB;
        for (int i = 1; i < width; i+=36) {
            for (int j = 0; j < height; j+=27) {
                int pixel = image.getRGB(i, j); // 下面三行代码将一个数字转换为RGB数字
                rgbR = (pixel & 0xff0000) >> 16;
                rgbG = (pixel & 0xff00) >> 8;
                rgbB = (pixel & 0xff);
                rgb[num][0] = rgbR;
                rgb[num][1] = rgbG;
                rgb[num][2] = rgbB;
                num++;
            }
        }
    }

    public int[][] retRgb(){
        return rgb;
    }
}