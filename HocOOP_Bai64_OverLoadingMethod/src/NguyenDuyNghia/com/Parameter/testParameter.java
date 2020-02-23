package NguyenDuyNghia.com.Parameter;

public class testParameter {
	
	public static int Sum(int ...arr)
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			s+=arr[i];
			
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=Sum(1,3,5,2,6);
		System.out.println(s);
	}

}
