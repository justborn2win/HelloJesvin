import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateClass 

{

public static void main(String[] args) throws NumberFormatException, IOException{

	BufferedReader inReader=new BufferedReader(new InputStreamReader(System.in));
	Date date=new Date();
	SimpleDateFormat format=new SimpleDateFormat("EEEE");
	Calendar calendar=new GregorianCalendar();
	System.out.println("Today: "+format.format(date));
	System.out.println("what day do you want?");
	int d=Integer.parseInt(inReader.readLine());
	calendar.add(Calendar.DATE, d);
	System.out.println(d+ " days later it is: "+format.format(calendar.getTime()));

}
}