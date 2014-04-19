package main;

public class RGBImage extends Image
{

	@Override
	public Object getPixelAt(Integer x, Integer y)
	{
		Integer j = ((col*x) +3) + (y+3);
		
		Buffer newBuffer = new Buffer();
		newBuffer.add(buffer.get(j));
		newBuffer.add(buffer.get(j+1));
		newBuffer.add(buffer.get(j+2));
		
		return newBuffer;
		
	}

	@Override
	public void setPixelAt(Integer x, Integer y, Object o)
	{
		Integer j = (col*x) + (y+3);
		
		Buffer newBuffer = (Buffer) o;
		buffer.set(j, newBuffer.get(0));
		buffer.set(j+1, newBuffer.get(1));
		buffer.set(j+2, newBuffer.get(2));
		
	}

	
}
