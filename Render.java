/*
 * making images with simplex noise
 * Author: Joseph Greshik 
 *
 */
import java.io.*;
import java.util.*;

public class Render {
    public static void main(String[]args)throws Throwable{
        int w=8*1024;
        int h=w;
        Image image = new Image(w,h);
        for(int i=0;i<w;++i){
            for(int j=0;j<h;++j){
                double W=w/12;
                double H=h/24;
                image.red[i][j]=(int)(SimplexNoise.noise(i/W,j/H)*255);
                image.green[i][j]=(int)(SimplexNoise.noise(i/W,j/H)*255);
                image.blue[i][j]=(int)(SimplexNoise.noise(i/W,j/H)*255);
            }
        }
        image.savetofile("simplex.png");
    }
}
