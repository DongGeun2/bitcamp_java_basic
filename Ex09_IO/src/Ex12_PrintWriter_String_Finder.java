import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex12_PrintWriter_String_Finder {
    String basedir = "C:\\Temp"; // 검색할 폴더
    String word = "HELLO"; // 검색할 단어
    String save = "result.txt"; // HELLO 단어가 들어있는 파일목록 저장
    
    void Fine() throws IOException{
        File dir = new File(basedir);
        if(!dir.isDirectory()) {
            System.out.println("is not Directory");
            System.exit(0);
        }
        
        PrintWriter pr = new PrintWriter(new FileWriter(save));
        BufferedReader br = null;
        
        File[] files = dir.listFiles(); //목록(파일, 폴더)
        for(int i = 0; i < files.length; i++) {
            if(!files[i].isFile()) {
                continue; // 파일이 아닌 경우에는 아래 코드는 (skip)
            }
            // 파일이라면 (a.txt or aaa.txt or hello.txt )
            br = new BufferedReader(new FileReader(files[i]));
            
            // 파일에 한문장씩 read 하면서 검색 (HELLO)
            String line = "";
            while((line = br.readLine()) != null ) {
                if(line.indexOf(word) != -1){ // 현재 read 한 문장에 HELLO 단어가 하나라도 있는 경우
                    System.out.println("I got it.");
                    pr.write("word =" + files[i].getAbsolutePath() + "\n");
                    
                }
            }
            pr.flush();
        }
        pr.close();
        br.close();       
    }
    
    public static void main(String[] args) {
        Ex12_PrintWriter_String_Finder StringFineder = new Ex12_PrintWriter_String_Finder();
        try {
            StringFineder.Fine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }

}
