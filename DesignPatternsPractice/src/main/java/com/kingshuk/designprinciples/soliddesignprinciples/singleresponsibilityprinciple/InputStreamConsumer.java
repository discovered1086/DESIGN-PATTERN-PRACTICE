package com.kingshuk.designprinciples.soliddesignprinciples.singleresponsibilityprinciple;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamConsumer implements Runnable{
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
