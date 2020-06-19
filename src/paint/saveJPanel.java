package src.paint;
import java.awt.*;
import javax.swing.*;
import java.text.DateFormat;
import java.util.*;
import java.io.*;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import net.java.dev.designgridlayout.DesignGridLayout;
import java.lang.reflect.Field;

//a#############################################################################################
//a##
//a##           saveJPanel
//a##
//a############################################################################################# 
/**
 * 
 *       Author: Rong Tao
 *     Location: UPC
 *         Time: 2017.04
 *    Modify by: Rong Tao
 */
public class saveJPanel{

    static public void saveImage(JPanel panel, JMenu parent) {
    /*https://stackoverflow.com/questions/19621105/save-image-from-jpanel-after-draw */
        BufferedImage img = new BufferedImage(panel.getWidth(), 
                              panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        panel.paint(img.getGraphics());
        JFileChooser jFile = new JFileChooser();
        jFile.showSaveDialog(parent);
        Path pth = jFile.getSelectedFile().toPath();
        JOptionPane.showMessageDialog(parent, pth.toString());
        try {
            ImageIO.write(img, "png", new File(pth.toString()));
            System.out.println("panel saved as image");

        } catch (Exception e) {
            System.out.println("panel not saved" + e.getMessage());
            }
      }
}

