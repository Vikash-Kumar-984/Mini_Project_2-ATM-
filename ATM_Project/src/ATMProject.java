import java.util.Scanner;
public class ATMProject {
	 Scanner sc=new Scanner(System.in);
	 
	 void choice1() {
		   System.out.println("The Default Account Details ");
    	   System.out.println("Name= Administrator");
    	   System.out.println("Account No.= 1234567890");
    	   System.out.println("Current Amount= 10000");
    	   System.out.println("PIN No.= 1234");
	 }
	  void choice2(){
		 System.out.println("Please enter your name");
		   String name=sc.nextLine();
		   System.out.println("Please enter preferred account no. ");
    	   int account=sc.nextInt();
    	   System.out.println("Please enter your mobile no.");
    	   int mobile=sc.nextInt();
    	   System.out.println("Please enter amount to deposit");
    	   int balance=sc.nextInt();
    	   System.out.println("Please create your PIN");
    	   int pin=sc.nextInt();
    	   System.out.println("Thank you for creating a account :)");
    	   System.out.println("Your Account Details are:");
    	   System.out.println("Your Name: "+name);
    	   System.out.println("Account no.:" +account  );
    	   System.out.println("Mobile no.: "+mobile);
    	   System.out.println("Your pin:" +pin);
    	   System.out.println("Your balance is: "+balance);
    	   System.out.println("Please don't share your PIN with anyone");
    	   
    	   ATMProject ob3=new ATMProject();
    	     ob3.function();
    	     
    	   int input2=sc.nextInt();
    	   if(input2==1) {
    		   System.out.println("Your balance is: "+balance);
    	   }
    	   else  if(input2==2) {
    		   System.out.println("Account no.:" +account  );
    	   }
    	   else if (input2==3) {
    		   System.out.println("Enter the amount to be withdrawn");
    		   int w=sc.nextInt();
    		   if(w<10000) {
    				  System.out.println("Transaction Successful ");
    				  System.out.println("The remaining amount is :"+(balance-w));
    				  }
    			  else
    			  {
    				  System.out.println("Sorry! Insufficient Balance");
    			  } 
    	   }
    	   else if (input2==4) {
    		   System.out.println("Enter new PIN");
 			  int p=sc.nextInt();
 			  System.out.println("Your new PIN is created : "+p);
    	   }
    	   else
    	   {
 			  System.out.println("Invalid Input \nPlease retry!");
    	   }
	}
	  void function() {
		  System.out.println("\n ENTER");
		  System.out.println("1:Balane Check");
		  System.out.println("2:View Account no.");
		  System.out.println("3:Withdraw");
		  System.out.println("4:Change PIN");
		 }
	  
	  void function1() {
		  int input=sc.nextInt();
		  if(input==1)
		  {
			  System.out.println("AMOUNT= 10000");
		  }
		  else if (input==2) {
			  System.out.println("Account No.= 1234567890");
		  }
		  else  if (input==3)
		  {
			  System.out.println("Enter the amount to be withdrawn");
			  int w=sc.nextInt();
			  if(w<10000) {
			  System.out.println("Transaction Successful ");
			  System.out.println("The remaining amount is :"+(10000-w));
			  }
		  else
		  {
			  System.out.println("Sorry! Insufficient Balance");
		  }
		}
		  else if(input==4) {
			  System.out.println("Enter new PIN");
			  int p=sc.nextInt();
			  System.out.println("Your new PIN is created : "+p);
		  }
		  else
   	   {
			  System.out.println("Invalid Input \nPlease retry!");
   	   }
	  }
	  
	
	
	public static void main(String[] args) {
       System.out.println("*************WELCOME*************");		
       System.out.println("Please enter your choice");
       System.out.println("1:Default Account");
       System.out.println("2:Manual Account(Create your Account)");
       Scanner sc=new Scanner(System.in);
       
  	   int choice=sc.nextInt();
       if(choice==1) {   
    	   ATMProject ob1=new ATMProject();
    	   ob1.choice1();
      	   ATMProject ob3=new ATMProject();
    	   ob3.function();
    	   ATMProject ob4=new ATMProject();
    	   ob4.function1();
       }
       else if(choice==2) {
    	 ATMProject ob2=new ATMProject();
    	 ob2.choice2();
    	// ATMProject ob3=new ATMProject();
  	     //ob3.function();
    	 
       }
      
       
	}

}
