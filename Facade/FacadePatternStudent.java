import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FacadePatternStudent {
private static int choice;
public static void main(String args[]) throws NumberFormatException, IOException{
do{
System.out.print("*** Event Management System ***\n");
System.out.print(" 1. FOREIGN GUEST LECTURE. \n");
System.out.print(" 2.SEMINAR. \n");
System.out.print(" 3. Exit. \n");
System.out.print("Enter your choice: ");
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
choice=Integer.parseInt(br.readLine());
Event_Organizer eo=new Event_Organizer();
switch (choice) {
case 1:
{
eo.Guest_lectureAccess();
}
break;
case 2:
{
eo.Seminar_eveAccess();
}
break;
default:
{
System.out.println("You have not registered for any event
properly");
}
return;
}
}while(choice!=3);
}