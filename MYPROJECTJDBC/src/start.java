import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.student;
import com.student.manage.studentdao;



public class start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("press 1 to add stdents");
			System.out.println("press 2 to display students");
			System.out.println("press 3 to exit");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int x=Integer.parseInt(br.readLine());
			if(x==1)
			{
				System.out.println("Please enter the name of Student");
				String n=br.readLine();
				System.out.println("Please enter the email of Student");
				String e=br.readLine();
				student st=new student(n,e);
				if(studentdao.inserttoDB(st))
				{
					System.out.println("Succesfully executed");
				}
				else
				{
					System.out.println("oops an error occured");
				}
			}
			else if(x==2) {
				if(studentdao.display())
				{
					System.out.println("Succesfully executed");
				}
				else {
					System.out.println("oops an error occured");
				}
			}
			else {
				break;
			}
			
		}
            System.out.println("Thanku for using my application.");
            System.out.println("See you again next time...");
		
		
	}

}
