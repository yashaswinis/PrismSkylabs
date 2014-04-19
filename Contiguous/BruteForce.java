package main;

public class BruteForce 
{
	Integer[] inputList;
	
	public BruteForce(Integer[] input)
	{
		if (inputIsNull(input))
			throw new IllegalArgumentException("Input is null");
		
		inputList = input;
		
		printContiguous();
		
	}

	private boolean inputIsNull(Integer[] input) 
	{
		if(input == null || input.length <= 0)
			return true;
		return false;
	}
	
	public Integer[] printContiguous()
	{
		Integer size = inputList.length;
		
		Integer ithMaxIndex = -1;
		Integer jthMaxIndex = -1;
		Integer maxSum = 0;
		
		for(int i = -1; i < size; i++ )
		{
			Integer sum = 0;
			for(int j= i+1 ; j < size; j++)
			{
				sum += inputList[j];
				if(sum > maxSum)
				{
					maxSum = sum;
					ithMaxIndex = i+1;
					jthMaxIndex = j;
				}

			}
		}
		
		size = jthMaxIndex - ithMaxIndex;
		Integer[] outputList = new Integer[size+1];
		int index = 0;
		for(int k = ithMaxIndex; k <= jthMaxIndex ; k++ )
		{
			outputList[index] = inputList[k];
			index++;
		}
		
		return outputList;
	}

}
