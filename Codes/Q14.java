// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */
import java.io.BufferedReader;
import java.io.FileReader;
public class WordCount {
static class MyRunnable implements Runnable {
private String fileName;
public MyRunnable(String fileName){
this.fileName = fileName;
}
public void countWords(){
String line;
int count = 0;
try {
FileReader file = new FileReader(fileName);
BufferedReader br = new BufferedReader(file);
while((line = br.readLine()) != null) {
String words[] = line.split(" ");
count = count + words.length;
} System.out.println("Number of words present in given file: " + count);
br.close();
}
catch (Exception e) {
System.out.println(e); }
} public void run(){
countWords();
}
}public static void main(String[] args) {
MyRunnable myRunnable1 = new MyRunnable("data1.txt");
MyRunnable myRunnable2 = new MyRunnable("data2.java");
new Thread(myRunnable1).start();
new Thread(myRunnable2).start();
}
}