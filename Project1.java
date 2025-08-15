import java.util.Scanner;
class Project1 {
	static int val;
	static long pass;
	static long spass;
	public static void print()
	{
	System.out.print("ENETR 1 ADMIN OR 2 STUDENT : ");
	}
	public static void admin()
	{
	Scanner sc=new Scanner(System.in);
	val=sc.nextInt();
	
	if(val==1)//if 1 for admin
		{  
       		System.out.print("ENTER ADMIN PASSWARD : ");
			pass=sc.nextLong();
			
			for(int pa=1;pa<=2;pa++)
			{
			
			
			int maths1=0,english1=0,science1=0,computer1=0;
			int maths2=0,english2=0,science2=0,computer2=0;
			int maths3=0,english3=0,science3=0,computer3=0;
			int res1,res2,res3;
			if(pass==12345)
			{
				System.out.println("+++++++++++++++++++++++++++++++++++");
				System.out.println("Enter Gangaprasad marks");
				System.out.println("___________________________________");
				for(int i=1;i<=4;i++)
				{
					if(i==1)//maths
					{
					System.out.print(" maths   out off 25  :" );
                      maths1=sc.nextInt();
					   while(maths1>25 || maths1<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						  System.out.print(" maths   out off 25  :" );
                           maths1=sc.nextInt();
						   //int m1=maths1;///////////initialization  storing
					   }	
					}
					else if(i==2)//english
					{
					System.out.print("english  out off 25 :"  );
					english1=sc.nextInt();
					while(english1>25 || english1<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("english  out off 25 :"  );
					       english1=sc.nextInt();
						  // int e1=english1;
					   }
					}
					else if(i==3)//science
					{
					System.out.print("science  out off 25 :" );
					science1=sc.nextInt();
					while(science1>25 || science1<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("science  out off 25 :" );
					       science1=sc.nextInt();
						  // int s1= science1;
					   }
					}
					else//computer
					{
					System.out.print("computer out off 25 :" );
					computer1=sc.nextInt();
					while(computer1>25 || computer1<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("computer out off 25 :" );
					       computer1=sc.nextInt();
						  //int c1=computer1;
					   }
					}///////
					//int res=maths1+science1+english1+computer1;
					
				}
				//int m1=maths1;
				//int e1=english1;
				//int s1= science1;
				//int c1=computer1;////////////////////////////////////////////////////////////////////////////////////////////
				System.out.println("                                   ");
				System.out.println("+++++++++++++++++++++++++++++++++++");
				System.out.println("Enter Maniteja marks ");
				System.out.println("___________________________________");
				for(int j=1;j<=4;j++)
				{
					if(j==1)//maths
					{
					System.out.print(" maths   out off 25  :" );
                      maths2=sc.nextInt();
					  while(maths2>25 || maths2<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print(" maths   out off 25  :" );
                           maths2=sc.nextInt();
						   //int m2= maths2;
					   }
					 // if(maths)
					}
					else if(j==2)//english
					{
					System.out.print("english  out off 25 :"  );
					english2=sc.nextInt();
					while(english2>25 || english2<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("english  out off 25 :"  );
					       english2=sc.nextInt();
						   //int e2=english2;
					   }
					}
					else if(j==3)//science
					{
					System.out.print("science  out off 25 :" );
					science2=sc.nextInt();
					while(science2>25 || science2<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("science  out off 25 :" );
					       science2=sc.nextInt();
						   //int s2=science2;
					   }
					}
					else//computer
					{
					System.out.print("computer out off 25 :" );
					computer2=sc.nextInt();
					while(computer2>25 || computer2<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("computer out off 25 :" );
					       computer2=sc.nextInt();
						 // int c2=computer2;
					   }
					}
				}
				
				System.out.println("                                   ");
				System.out.println("+++++++++++++++++++++++++++++++++++");
				System.out.println("Enter Ajay marks");
				System.out.println("___________________________________");
				for(int k=1;k<=4;k++)
				{
					if(k==1)//maths
					{
					System.out.print(" maths   out off 25  :" );
                      maths3=sc.nextInt();
					  while(maths3>25 || maths3<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print(" maths   out off 25  :" );
                           maths3=sc.nextInt();
						   ///////////////
					   }
					  
					}
					else if(k==2)//english
					{
					System.out.print("english  out off 25 :"  );
					english3=sc.nextInt();
					while(english3>25 || english3<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("english  out off 25 :"  );
					       english3=sc.nextInt();
						   int e3=english3;
					   }
					}
					else if(k==3)//science
					{
					System.out.print("science  out off 25 :" );
					science3=sc.nextInt();
					while(science3>25 || science3<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   	System.out.print("science  out off 25 :" );
					        science3=sc.nextInt();
							//int s3=science3;
					   }
					}
					else//computer
					{
					System.out.print("computer out off 25 :" );
					computer3=sc.nextInt();
					while(computer3>25 || computer3<=-1)
					   {
						   System.out.println("( NOT VALID MARKS ) ");
						   System.out.print("computer out off 25 :" );
					       computer3=sc.nextInt();
						  // int c3=computer3;
					   }
					}///////
				}
				
			
			
			
			
			res1=maths1+english1+science1+computer1;
			res2=maths2+english2+science2+computer2;
			res3=maths3+english3+science3+computer3;
			System.out.println("=========================================");
			System.out.println("=========================================");
			System.out.println("----------GANGAPRASAD MID MARKS------------");
			System.out.println("MATHS         : "+maths1);
			System.out.println("ENGLISH       : "+english1);
			System.out.println("SCIENCE       : "+science1);
		    System.out.println("COMPUTER'S    : "+computer1);
		    System.out.println("-------------------------------------------");
			System.out.println("TOTAL  : "+res1+"   ");
			if(res1>=90)
			{
				System.out.println("GRADE :  A ");
			}
			else if(res1>=80)
		    {
				System.out.println("GRADE :  B ");
			}
			else if(res1>=70)
		    {
				System.out.println("GRADE :  C ");
			}
			else
			{
			System.out.println("GRADE :  D (FAIL)   ");
			}
			System.out.println("=========================================");
			System.out.println("=========================================");
			System.out.println("----------MANITEJA MID MARKS------------");
			System.out.println("MATHS         : "+maths2);
			System.out.println("ENGLISH       : "+english2);
			System.out.println("SCIENCE       : "+science2);
		    System.out.println("COMPUTER'S    : "+computer2);
			System.out.println("TOTAL  : "+res2+"   ");
			if(res2>=90)
			{
				System.out.println("GRADE :  A ");
			}
			else if(res2>=80)
		    {
				System.out.println("GRADE :  B ");
			}
			else if(res2>=70)
		    {
				System.out.println("GRADE :  C ");
			}
			else
			{
			System.out.println("GRADE :  D (FAIL)   ");
			}
			System.out.println("=========================================");
			System.out.println("=========================================");
			System.out.println("----------AJAY MID MARKS------------");
			System.out.println("MATHS         : "+maths3);
			System.out.println("ENGLISH       : "+english3);
			System.out.println("SCIENCE       : "+science3);
		    System.out.println("COMPUTER'S    : "+computer3);
			System.out.println("TOTAL  : "+res3+"   ");
			if(res3>=90)
			{
				System.out.println("GRADE :  A ");
			}
			else if(res3>=80)
		    {
				System.out.println("GRADE :  B ");
			}
			else if(res3>=70)
		    {
				System.out.println("GRADE :  C ");
			}
			else
			{
			System.out.println("GRADE :  D (FAIL)   ");
			}
		}
		else //if(pass!=12345)
			{ while(pass!=12345)
			{
				System.out.println("(INVALID PASSWORD)");
				System.out.print("ENTER ADMIN PASSWORD  :");
				pass=sc.nextLong();
			}
			}
	     }
		}///////////////////////////////
	}
	public static void students()////////////////////////////////////////////student method//////////////////////////////
	{
		int g_maths=25,g_english=24,g_science=23,g_computer=25;
		int m_maths=22,m_english=21,m_science=23,m_computer=25;
		int a_maths=22,a_english=24,a_science=18,a_computer=25;
		int reg=g_maths+g_english+g_science+g_computer;
		int rem=m_maths+m_english+m_science+m_computer;
		int rea=a_maths+a_english+a_science+a_computer;

		
		
	Scanner sc2=new Scanner(System.in);
	//val=sc2.nextInt();
	if(val==2)
	{
	//System.out.print("ENTER STUDENT HALLTICKET NO : ");
	//spass=sc2.nextLong();
	for(int p=1;p<=10;p++)
	{
	System.out.print("ENTER STUDENT HALLTICKET NO : ");
	spass=sc2.nextLong();
		
	 if(spass==123)
	 {	  System.out.println("<-----------MID MARKS-----------> ");
		  System.out.println("==========================================");
		  System.out.println("<--------------GANGAPRASAD----------------");
		  System.out.println("==========================================");
		  System.out.println("MATHS        :  "+g_maths);
		  System.out.println("ENGLISH      :  "+g_english);
		  System.out.println("MATHS        :  "+g_science);
		  System.out.println("COMPUTER'S   :  "+g_computer); 
		  System.out.println("<------------------------------------");
		  System.out.println("TOTAL MARKS  : " +reg );
		 
		  	if(reg>=90)
			{
				System.out.println("GRADE :  A ");
			}
			else if(reg>=80)
		    {
				System.out.println("GRADE :  B ");
			}
			else if(reg>=70)
		    {
				System.out.println("GRADE :  C ");
			}
			else
			{
			System.out.println("GRADE :  D (FAIL)   ");
			}
		   System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		   System.out.println("==========================================");
	 }
     else if(spass==456)
	 {    System.out.println("<-----------MID MARKS-----------> ");
		  System.out.println("==========================================");
		  System.out.println("<--------------MANITEJA----------------");
		  System.out.println("==========================================");
		  System.out.println("MATHS        :  "+g_maths);
		  System.out.println("ENGLISH      :  "+g_english);
		  System.out.println("MATHS        :  "+g_science);
		  System.out.println("COMPUTER'S   :  "+g_computer);
		  System.out.println("<------------------------------------");
		  System.out.println("TOTAL MARKS  : " +rem );
		  if(rem>=90)
			{
				System.out.println("GRADE :  A ");
			}
			else if(rem>=80)
		    {
				System.out.println("GRADE :  B ");
			}
			else if(rem>=70)
		    {
				System.out.println("GRADE :  C ");
			}
			else
			{
			System.out.println("GRADE :  D (FAIL)   ");
			}
           System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		   System.out.println("==========================================");
	 }	
     else if(spass==789)
	 {    System.out.println("<-----------MID MARKS-----------> ");
		  System.out.println("==========================================");
		  System.out.println("<--------------AJAY----------------");
		  System.out.println("==========================================");
		  System.out.println("MATHS        :  "+g_maths);
		  System.out.println("ENGLISH      :  "+g_english);
		  System.out.println("MATHS        :  "+g_science);
		  System.out.println("COMPUTER'S   :  "+g_computer);
		   System.out.println("<------------------------------------");
		  System.out.println("TOTAL MARKS  : " +rea);
		
		  if(rea>=90)
			{
				System.out.println("GRADE :  A ");
			}
			else if(rea>=80)
		    {
				System.out.println("GRADE :  B ");
			}
			else if(rea>=70)
		    {
				System.out.println("GRADE :  C ");
			}
			else
			{
			System.out.println("GRADE :  D (FAIL)   ");
			}
		   System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		    System.out.println("==========================================");
	 }	 
	/*else
	 {
		 while(spass!=123 ||spass!=456||spass!=789)
	    { System.out.println("(INVALID HALLTICKET NO) ");
		System.out.print("ENTER STUDENT HALLTICKET NO : ");
	      spass=sc2.nextLong();
	    }
		//spass=sc2.nextLong(); 
	 }*/ 
	} 
	}	
	}
	public static void wrong()
	{
	
	
	if(val!=1||val!=2)
	{   
	    System.out.println("<------------------------------------");
		System.out.println("(NOT MATCHED CAN YOU EXICUTE AGAIN) ");
	    System.out.println("<------------------------------------");
		
	}
	}

    public static void main(String[] args) 
	{
	  print();
      admin();
	  students();
	  wrong();
	}

}
