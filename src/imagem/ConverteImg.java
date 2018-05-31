/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagem;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Manoel Henrique
 */
public class ConverteImg {
 
    //converte bufferdImage em byte[]
    public static byte[] getImgBytes(BufferedImage imagem){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        try{
            ImageIO.write(imagem, "PNG", baos);
            
        }catch(IOException ex){
        
        }
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        
        
    return baos.toByteArray();
    }
}
