/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly.alarm;
import java.util.Scanner;
import java.time.LocalTime;

interface Alarm{
void setAlarm(String time);
void showAlarm();
}
abstract class Weekday implements Alarm{
    
}
public class Monday extends Weekday {

String time;

public void setAlarm(String time){
this.time = time;    
}

public void showAlarm(){
LocalTime alarm = LocalTime.parse(time);
LocalTime now = LocalTime.now();

if(alarm.isBefore(now)){
    System.out.println("Alarm is set for tomorrow!");    
}else{
    System.out.println("I'll wake you up later!");
}
}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
Monday WEEKALARM = new Monday();

String choice = "Yes";

while(choice.equalsIgnoreCase("Yes")){

    System.out.print("\nEnter time for alarm in this format (HH:MM): ");
    String alarm = input.nextLine();
    
    WEEKALARM.setAlarm(alarm);
    WEEKALARM.showAlarm();
    
}
input.close();
    System.out.println("Alarm Program closed.");
}
}
