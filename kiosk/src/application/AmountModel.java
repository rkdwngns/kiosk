package application;

public class AmountModel
{
	public int asum(int[] ctm)
	{
		int sumt=0;
		int m=0;

		for(int i = 0; i<2; i++)
		{
			if(i==0)
			{
				m = 1000;
			}
			if(i==1)
			{
				m = 2000;
			}
			{
				m = 3000;
			}
			sumt = sumt + ctm[i] * m;
		}
		return sumt;
	}
}
