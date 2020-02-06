package g_exception;

import java.io.*;

public class FileOutputStreamTest {

	public static void main(String[] args)throws IOException {
	
		FileOutputStream output = new FileOutputStream("e:/test.txt",false);
        //true로 두면 이어서 쓰고 , false로 쓰면 새로 씀
		OutputStreamWriter writer=new OutputStreamWriter(output,"UTF-8");
        BufferedWriter out=new BufferedWriter(writer);
        
    
            out.write("안녕");
            
        
        
        out.close();
	}

}
