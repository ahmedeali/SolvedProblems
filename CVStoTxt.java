// a java program for converting a csv file to text file 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CVStoTxt {

  public static void main(String[] args) throws IOException {

      String file = "ABC.csv",txtFile="Pradip.txt";
      BufferedReader br = null;//For Read CSV File
      BufferedWriter br2=null;//For Write a file in which you want to write
      String words = "";
      String separator = "\t";//Here you can use , or space according to your csv file

      try {
          br = new BufferedReader(new FileReader(file));
          br2=new BufferedWriter(new FileWriter(txtFile));
          while ((words = br.readLine()) != null) {
          String[] code = words.split(separator);
          br2.write(code[0]);
          br2.write(" ");
          br2.write(code[1]);
          br2.write("\n");
          System.out.println("code1= " + code[0] + " , code2=" + code[1]);
   
          }

        } catch (FileNotFoundException e) {
              e.printStackTrace();
            } catch (IOException e) {
              e.printStackTrace();
                } finally {
                    if (br != null) {
                        try {
                            br.close();
                        } catch (IOException e) {
                              e.printStackTrace();
                            }
                        }
                        br.close();
                        br2.close();
                  }

    }

}
