package com.assignments.cg;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {

public static void main(String[] args) {


try {
FileOutputStream file=new FileOutputStream("file.txt");

    //Checking if the file creation is successful or not
        if(file != null) {
 System.out.println("file is created successfully");
 } else
{
 System.out.println("Failed to create a file");
 }
       
//writing byte values into file
file.write(65);
file.write(68);


//writing string
String s= "\nHello! this is Aishwarya";
byte b[]=s.getBytes();
file.write(b);
System.out.println(file.toString());
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}    

}

}


