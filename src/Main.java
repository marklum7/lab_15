import java.io.*;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            String coms = in.next();
            if (coms == "save"){
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("urav.txt"))) {
                    function urav = new function(in.nextInt());
                    urav.count();
                    oos.writeObject(urav);
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            }
            else if (coms == "upload"){
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("urav.txt"))) {
                    function cal = (function)ois.readObject();
                    System.out.println("y=" + cal.y);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else{
                System.out.println("команда не распознана");
            }
        }
    }
}