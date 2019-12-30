import java.util.Scanner;


class Source
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String ID="ABCCust",id;
		String password="abc@123",pass;
		
		custDetails []cust=new custDetails[10];
		cust[0]=new custDetails(10, "abc", "a@a.com", 1234567890);
		cust[1]=new custDetails(20, "pqr", "p@a.com", 1454567890);
		cust[2]=new custDetails(30, "xyz", "q@a.com", 1756467890);
		

		System.out.println("Enter ID and Password: ");
		id=sc.next();
		pass=sc.next();
		if (id.equals(ID) && pass.equals(password)) 
		{
			System.out.println("Login Successfull!!");
			int id1;
			String name1;
			String email1;
			long mobno;
			
			int choice=0;
			do {
					System.out.println("1.Add Customer");
					System.out.println("2.Print Customer");
					System.out.println("3.Edit Customer");
					System.out.println("4.Delete Customer");
					System.out.println("5.Exit");
					System.out.println("Enter Your Choice: ");
					choice=sc.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("Enter ID,Name,Email,MobileNo: ");
						id1=sc.nextInt();
						name1=sc.next();
						email1=sc.next();
						mobno=sc.nextLong();
						cust[custDetails.count-1]=new custDetails(id1, name1, email1, mobno);
						break;
					case 2:
						System.out.println("Enter ID to be printed:-");
						id1=sc.nextInt();
						
						for(int i=0;i<custDetails.count;i++)
						{
							if(id1==cust[i].getId())
							{
								System.out.println(cust[i]);
							}
						}
						break;
					case 3:
						System.out.println("Enter ID to be edited:-");
						id1=sc.nextInt();
						
						for(int i=0;i<custDetails.count;i++)
						{
							if(id1==cust[i].getId())
							{
								System.out.println(cust[i]);
								System.out.println("Enter Name,Email,MobileNo: ");
								name1=sc.next();
								email1=sc.next();
								mobno=sc.nextLong();
								cust[i].setName(name1);
								cust[i].setEmail(email1);
								cust[i].setMobileNo(mobno);
							}
						}
						break;
					case 4:
						System.out.println("Enter ID to be deleted:-");
						id1=sc.nextInt();
						
						for(int i=0;i<custDetails.count;i++)
						{
							if(id1==cust[i].getId())
							{
								System.out.println(cust[i]);
								cust[i].setId(0);
								cust[i].setName(" ");
								cust[i].setEmail(" ");
								cust[i].setMobileNo(0);
							}
						}
						break;
					case 5:
						System.exit(0);
						
				} 
			} while(choice!=5);
		}
	}
}