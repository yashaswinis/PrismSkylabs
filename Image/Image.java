package main;

public abstract class Image<T>
{

	protected T pixelFormat;
	protected Integer row;
	protected Integer col;
	protected ImagePixelType imageType;
	protected Buffer buffer;
	
	public Image()
	{
		
	}
	
	public void createImage(Integer x, Integer y, Interger width, Integer height, T pixelFormat)
	{
		this.row = x;
		this.col = y;
		this.pixelFormat = pixelFormat;
	
		
	    //1. get the screen size. Store the size;
		
		//2. Draw a plane on the screen with the given x, y, height and width values
		
		//3. Draw a canvas  on the plane with the given x,y , height and width values
		
	    //4. set an offset of x from the vertical reference of the screen( this is done by skipping x cols)
		
	    //5. set an offset of y from the horizontal reference of the screen(this is done by skipping y cols)
	    
	    //6. Set an iterator for the list of pixelObjects
		
		
		//7. Start rendering the pixels on the canvas
		
		//Initially, renderedWidth =0, renderedHeight=0
		
		//set an iterator over the pixelData
		
		while(iter.hasNext())
		{
			
			//check if adding the pixel to the rendered width overflows the width of the image
			
			//if it overflows the width, start drawing rendering on the next line. To move to the next line,
			//add the rendered height to the horizontal reference of the screen
			
			//to render, set the brush color and give the draw command
			
		}
	}	
	
	public Integer width()
	{
		return col;
	}
	
	public Integer height()
	{
		return row;
	}

	public Image copy(Image img)
	{
		Image copyImage = ImageFactory.getImageObject(this.imageType);
		copyImage.row = this.row;
		copyImage.col = this.col;
		copyImage.pixelFormat = this.pixelFormat;
		return copyImage;
		
	}
	
	public abstract Object getPixelAt(Integer x, Integer y);
	public abstract void setPixelAt(Integer x, Integer y, Object o);
	
	public Image convolute(int[][] kernelMatrix)
	{
		//As the kernel matrix is of the size 3X3, divide the whole image into 3X3 and multiply each block with the 
		//corresponding kernelMatrix element. 
		
		//Divide the number of rows by 3, divide the number of columns by 3
		
		//Create new pixelData values by multiplying old pixel data values with the corresponding Kernel matrix value
		
		//Create a new image with the new set of pixel data values and return
		
	}
	
	public Image scale(bool scaleUp, int factor)
	{
		if(scaleUp)
		{
			//replace each pixeldata value with 'factor' number of similar pixeldata values
			//Create a new image with the new set of pixel data values and return. The width and height passed to the create 
			//image function will be 'factor' times the original height and width of the image 
		}
		else
		{
			//divide the image [factor X factor] matrices. Replace each matrix with the first element in the matrix
			//The first element in the matrix acts as a representative for the whole matrix
		}
	}
	
}
