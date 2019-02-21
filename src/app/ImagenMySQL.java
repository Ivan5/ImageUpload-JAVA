/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import javax.swing.ImageIcon;

/**
 *
 * @author conve
 */
public class ImagenMySQL extends javax.swing.JPanel{
    
    BufferedImage ruta;
    
    public ImagenMySQL(int tamanoX, int tamanoY, BufferedImage ruta){
        this.setSize(tamanoX,tamanoY);
        this.ruta = ruta;
    }
    
    public void paint(Graphics g){
        //conversion de la imagen
        Dimension height = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        //Image imgExt = new ImageIcon(ruta).getImage();
        BufferedImage img = ruta;
        
        
        g.drawImage(img,0,0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
