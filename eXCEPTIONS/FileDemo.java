import java.io.*;
import java.util.*;
class FileDemo {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("File.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();
        }
            finally{
            bout.close();
          }
}         
    catch (Exception e) {
         
         e.printStackTrace();
      }    } }