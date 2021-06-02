package com.mukul.jdk9.image;

import java.awt.Image;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.MultiResolutionImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class ImageDemo {
	public static void main(String[] args) throws IOException {
		 
		 String BASEDIR = System.getProperty("user.dir");
		 System.out.println("Base Directory of the project: " + BASEDIR);
		 
		 List<String> imageLocations = List.of(BASEDIR + File.separator + "image.jpg");
		 
		 
		 List<Image> imgList = new ArrayList<Image>();
		 for(String loc: imageLocations) {
		 Image currentImg = ImageIO.read(new File(loc));
		 imgList.add(currentImg);
		 }
		 
		 
		 MultiResolutionImage mrImages = new BaseMultiResolutionImage(imgList.toArray(new Image[0]));
		 
		 List<Image> diffResolutions = mrImages.getResolutionVariants();
		 
		 System.out.println("Number of available resolutions for the same image: " + diffResolutions.size());
		 
		 Image img1 = mrImages.getResolutionVariant(1920, 1080);
		 System.out.printf("\nRetrieved Image variant for a 21.5 inch monitor with high resolution [%d,%d] has resolution [%d,%d]\n", 1920, 1080, img1.getWidth(null),
		 img1.getHeight(null));
		 
		 
		 
		 }
}
