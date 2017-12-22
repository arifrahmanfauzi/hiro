
import java.awt.Color;
import javax.swing.JProgressBar;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hiro
 */
public class Running {
    public static void main(String[] args) {
        
         try {
            BeautyEyeLNFHelper.frameBorderStyle =
                    BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            
            
        }
         loader loader =new loader();
         Login2 login =new Login2();
         loader.setVisible(true);
         try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
               
              //loader.persen.setText(Integer.toString(i)+"%");
                
                loader.jProgressBar1.setValue(i);
                if (i==100) {
                    loader.dispose();
                    login.setVisible(true);
                    
                    
                }
            }
             
             
             
        } catch (Exception e) {
        }
        
        
    }
    
}
