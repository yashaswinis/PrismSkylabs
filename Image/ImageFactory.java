package main;

public class ImageFactory 
{

	public static Image getImageObject(ImagePixelType imageType)
	{
		if(imageType.equals(ImagePixelType.RGB))
			return new RGBImage();
		else if(imageType.equals(ImagePixelType.GREY))
			return new GreyImage();
		else
			return null;
	}
}
