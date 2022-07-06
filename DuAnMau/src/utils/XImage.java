/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("\"C:\\\\Users\\\\LENOVO\\\\Desktop\\\\Workspace\\\\SOF204-Duanmau\\\\EduSysNhom3\\\\src\\\\Icon//house.png\"");
        return new ImageIcon(url).getImage();
    }

    public static boolean save(File src) {
        File dst = new File("src\\Icon", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("src\\Icon", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

}
