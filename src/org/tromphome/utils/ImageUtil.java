package org.tromphome.utils;

import java.awt.image.BufferedImage;

public class ImageUtil {

	/**
	 * Scale == percent
	 * ex: 100 scale == 100%
	 * 
	 * @param image
	 * @param scale
	 * @return
	 */
	public static BufferedImage resize(BufferedImage image, int w2, int h2){
		
		int w1 = image.getWidth();
		int h1 = image.getHeight();
		
		int[] pixels = new int[image.getHeight() * image.getWidth()];
		
		int p = 0;
		for(int x = 0; x < image.getWidth(); x++){
			for(int y = 0; y < image.getHeight(); y++){
				
				pixels[p] = image.getRGB(x, y);
				p++;
			}
		}
		
		int[] temp = new int[w2*h2] ;
	    double x_ratio = w1/(double)w2 ;
	    double y_ratio = h1/(double)h2 ;
	    double px, py ; 
	    for (int i=0;i<h2;i++) {
	        for (int j=0;j<w2;j++) {
	            px = Math.floor(j*x_ratio) ;
	            py = Math.floor(i*y_ratio) ;
	            temp[(i*w2)+j] = pixels[(int)((py*w1)+px)] ;
	        }
	    }
	    
	    int t = 0;
	    BufferedImage image2 = new BufferedImage(w2, h2, BufferedImage.TYPE_INT_RGB);
	    for(int x = 0; x < w2; x++){
			for(int y = 0; y < h2; y++){
				image2.setRGB(x, y, temp[t]);
				t++;
			}
		}
		System.out.println(image.getRGB(0, 0));

	    return image2;
		
		
		
	}
	
	
}
