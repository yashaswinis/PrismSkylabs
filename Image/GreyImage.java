package main;

public class GreyImage extends Image
{
	//fetches the required pixel data from the buffer
	@Override
	public Object getPixelAt(Integer x, Integer y) 
	{
		
		Integer j = col*x + y;
		
		return buffer.get(j);
				
	}
	
	//sets the required pixel data with the given value in Object o
	@Override
	public void setPixelAt(Integer x, Integer y, Object o)
	{
		Integer j = col*x + y;
		
		buffer.set(j, o);
	}
	
	

}
