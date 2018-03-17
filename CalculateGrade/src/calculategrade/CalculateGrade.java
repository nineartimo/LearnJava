
package calculategrade;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class CalculateGrade {

 
    public static void main(String[] args) {
        PrintWriter output = null;
        try{
            // Assign Class Object
            Scanner input = new Scanner(new File("/Users/nineartist/Documents/test_txt.txt")); //File position .txt File
            System.out.println("Get File Success!!!");
            output = new PrintWriter(new File ("/Users/nineartist/Documents/test_txt_grade.txt")); //positon of .txt output File
            // Assign Variable
            int count = 0;
            int sum = 0;
            String grade = "";
            // Scanning File by while Loop and Write Grade
            while(input.hasNext()){
                // Set importance var    
                String message = input.nextLine();
                int pos = message.indexOf(" ");
                String score = message.substring(pos,message.length());
                double s = Double.parseDouble(score);
                sum += s;
                count ++;
                //Check Grade
                if (s >= 80){
                    grade = "A";
                    }
                else if(s >= 70){
                    grade = "B";
                    }
                else if(s >= 60){
                    grade = "C";
                    }
                else if(s >= 50){
                    grade = "D";
                    }
                else{
                    grade = "F";
                    }
            //Write Grade
            output.println(message+" "+grade);
            }
        }catch(FileNotFoundException e){
            System.out.print("File Not Found :X");
        }
        output.close();
    }

}