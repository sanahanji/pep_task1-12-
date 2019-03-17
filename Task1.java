

import java.io.*;
import java.util.*;

public class Task1 {
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static Scanner br = new Scanner(System.in);
    static{
        try {
            bw.newLine();
            bw.write("calulator");
            bw.write("\nEnter first no :");
            bw.flush();
            float a=br.nextFloat();
            bw.write("\nEnter second no :");
            bw.flush();
            float b=br.nextFloat();
            bw.write("\nNow choose the operation \n 1.addition \n 2.substraction \n 3.division \n enter no. : ");
            bw.flush();
            int c=br.nextInt();
            float res;
            switch(c)
            {
            
            case 1:
            	res=a+b;
            	bw.write("\n result : "+res);
            	break;
            case 2:
            	res=a-b;
            	bw.write("\n result : "+res);
            	break;
            case 3:
            	if(b>0)
            	{
            		res=a/b;
                	bw.write("\n result : "+res);
            	}else
            		bw.write("\n invalid divisor");
            	break;
            default:
            	bw.write("\n invalid entry");
            }
            bw.close();
            br.close();
            
        } catch (IOException ex) {
        }
        System.exit(0);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
