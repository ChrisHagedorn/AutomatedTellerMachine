/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedtellermachine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author chrishagedorn
 */
public class PasswordSaver {

    final String FILE_NAME = "logins.sdv";
    BufferedReader reader;
    PrintWriter writer;

    public PasswordSaver() {

    }

    String[] readLogins() {
        String[] logins = new String[100];
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader(FILE_NAME));
            String line = reader.readLine();
            while (line != null) {
                logins[count] = line;
                count = count + 1;
                line = reader.readLine();

            }

        } catch (FileNotFoundException f) {
            System.out.print("Task file not found");

        } catch (IOException i) {
            System.out.print("Cannot open tasks file for output");
        }
        return Arrays.copyOfRange(logins, 0, count);
    }

    void writeLogins(String[] lines) {
        
        try {
            writer = new PrintWriter(new FileWriter(FILE_NAME));
            System.out.println("got passed try");

            for (int i = 0; i < lines.length; i++) {
                writer.println(lines[i]);
            }
            writer.close();
            System.out.println("did not close");

            //Instead of printing "hello", can you think of how to print all of the tasks
        } catch (IOException i) {
            System.out.print("Cannot open tasks file for output");
        } catch (NullPointerException i){
            System.out.print("there was a pointer exeption");
        }//Must catch if there is an existing credit card number.
        
    

    }
}
