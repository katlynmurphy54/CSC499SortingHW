/*
course: CSC 499
project: HW 1
date: 03/10/21
author: Katlyn Murphy
purpose: The purpose of this assignment is to write a command-line program to
sort the contents of this file in ascending order by the length of the name, 
then alphabetically.
 */

package commandlineprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CommandLineProgram {
    
    //making a class to compare each of the strings by length first
    public static class LengthFirstComparator implements Comparator<String> {
        @Override
        public int compare(String word1, String word2) {  
            if (word1.length() != word2.length()) {
                return word1.length() - word2.length(); //overflow impossible since lengths are non-negative
            }
            return word2.compareTo(word2);
        }
    }
    
    public static void main(String[] args) throws IOException {
        //input variable
        String inputFile = "C:\\Users\\katly\\Desktop\\input.txt";
        //output variable
        String outputFile = "C:\\Users\\katly\\Desktop\\output.txt";
        
        //initalize
        BufferedReader bufferedReader = null;
        FileReader fileReader = null; 
        FileWriter fileWriter = null;

        ArrayList<String> inputList, outputList;
        try {
            //create fileReader and bufferedReader object to read the input text file
            fileReader = new FileReader(inputFile);

            bufferedReader = new BufferedReader(fileReader);
            //create arrayList object which will hold everything from the input text
            String inputLine;
            inputList = new ArrayList<>();
            outputList = new ArrayList<>();
            //read all of the input lines and put them into the array list
            while ((inputLine = bufferedReader.readLine()) != null) {
                inputList.add(inputLine);
            }
            
            //sort the list by length using the comparator which also sorts alphabetically 
            Collections.sort(inputList, new LengthFirstComparator());
            
            //create the filewrite object to write the sorted lines into the output text file
            fileWriter = new FileWriter(outputFile);
            PrintWriter out = new PrintWriter(fileWriter);

            //loop to write every sorted element of the array list into the output file
            inputList.forEach((outputLine) -> {
                out.println(outputLine);
            });
        } catch (IOException e) {
        }
        finally
        {
            //close everything we are done!
            try
            {
                if (fileReader != null)
                {
                    fileReader.close();
                }
                 
                if(fileWriter != null)
                {
                    fileWriter.close();
                }
            } 
            catch (IOException e) 
            {
            }
        }
    }
}