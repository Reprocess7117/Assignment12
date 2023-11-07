import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main{

  public static void main(String[] args){
//String line = "";
//BufferedReader reader = null;
String[] data = new String[5];
Scanner input = new Scanner(System.in);
//Read File
readInput();
//Collects INput for New File
System.out.println("Enter a Product Name:");
data[0] = input.nextLine();
System.out.println("Enter a Product ID:");
data[1] = input.nextLine();
System.out.println("Enter a Price:");
data[2] = input.nextLine();
System.out.println("Enter a Quantity in Stock:");
data[3] = input.nextLine();
System.out.println("Enter a Manufacturer:");
data[4] = input.nextLine();

//Writes Files
try{
BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.csv", true));
   for (String i : data){
     writer.write(i+", ");
    }
writer.close();
} catch (IOException e){
e.printStackTrace();
} finally {
readInput();
}


}
//Read File Method
static void readInput(){
String line = "";
BufferedReader reader = null;
try {
reader = new BufferedReader(new FileReader("inventory.csv"));
while((line = reader.readLine()) != null) {
String[] row = line.split(",");
for(String i: row){
System.out.printf("%-20s", i);
}
System.out.println();

}

} catch (IOException e) {
e.printStackTrace();
} finally{
        try {
         reader.close();
           }catch (IOException e){
      e.printStackTrace();   }
}

}

}
