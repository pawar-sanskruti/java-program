package sample;

public class amazon {
	
	public void shoping(String a,int b) {
		String username=a;
		int  password=b;
		System.out.println(username+""+password);
		
	}
	protected int shoping(int otp)
	{
		int a=otp;
		
		return a;
	}
	public void shoping() {
		System.out.println("online platform to shop ");
	}
	
	public static void main(String args[]) {
		amazon s=new amazon();
		s.shoping("sanskruti",12345);
		System.out.println(s.shoping(4657));
		s.shoping(456);
		s.shoping();
		
	}

}
