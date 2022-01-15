package DataTypes;

public class datatype {

	public static void main(String[] args) {
		
		
		// type                 memory size              range/ limit
		
		boolean result=true;   //1 bit				   2 values (true/ false)
		result=false;
		System.out.println(result);
		
		char c='#';			   //2 bytes			  single char on keyword
		System.out.println(c);
		
		byte age=127;		  //1 byte  				-128 to 127
		System.out.println(age);
		
		short sh=32767;    	  //2 bytes                -32768 to 32767
		System.out.println(sh);
		
		int mno=2147483647;	  //4 byte	  			  -2147483648 to 2147483647
		System.out.println(mno);
		
		long MobileNo=9876543210L; //8 byte          too long num  
		MobileNo=2375192399238456282l;
		System.out.println(MobileNo);
		
		
		float f=3.14f;          //4 byte  
		System.out.println(f);
		
		double d=25.95;         //8 byte 
		System.out.println(d);
		
		// non primitive
		
		String name="Gabbar Sing";
		System.out.println(name);
		
	}

}
