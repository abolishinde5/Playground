import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int in;
      Scanner sc=new Scanner(System.in);
      in=sc.nextInt();
      int temp;
      for(temp=in;temp>0;)
      {
        if(temp<99)
        {
          System.out.print(temp%10);
          break;
        }
        else
        {
          temp=temp/10;
        }
      }
    }
}