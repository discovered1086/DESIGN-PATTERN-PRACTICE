package com.kingshuk.designpatterns.soliddesignprinciples;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**Class created to demonstrate the use of the SRP - Single Responsibility Principle
 * Created by CO21321 on 2/26/2018.
 */

class InputStreamConsumer implements Runnable {

    private InputStream is;

    public InputStreamConsumer(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        int read = -1;
        try {
            while ((read = is.read()) != -1) {
                System.out.print((char)read);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

public class SingleResponsibilityPrincipleDemoMac {
    public static void main(String[] args) throws Exception
    {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        
        //Loading file name from scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the full path and file name:");
        
        String filename = scanner.next();
        p.saveToFile(j, filename, true);
        
        scanner.close();

        //Mac!
        openEditor(filename);
    }
    
    
    public static void openEditor(String fileName) throws Exception {
    	String cmd = "/Applications/TextMate.app";
    	
    	ProcessBuilder pb = new ProcessBuilder("open", "-a",cmd, fileName);
    	
    	pb.redirectErrorStream(true);
    	
    	try {
			Process process = pb.start();
			
			Thread t = new Thread(new InputStreamConsumer(process.getInputStream()));
			
			t.start();
			
			int exitCode = process.waitFor();
			
			System.out.println("Exited with " + exitCode);
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			throw e;
		}
    	
    	
    }
}
