import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_Reader_Writer_Buffer {

    public static void main(String[] args) throws IOException {
        //Lotto
        FileWriter fw = new FileWriter("Lotto.txt",true);
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("로또");
        bw.newLine();
        bw.write("1,3,6,8,9");
        bw.newLine();
        bw.flush();
        
    }
//        FileReader fr = null;
//        BufferedReader br = null;
//        FileWriter fw = null;
//        
//        try {
//            fr = new FileReader("Ex01_Stream.java"); // 2byte씩 하나씩 ..
//            br = new BufferedReader(fr); // 한번에 태워서 보내겠다.
//            
//            
//            //line 처리(줄)
//            String line ="";
//            for(int i = 0; (line = br.readLine()) != null; i++) {
//                if(line.indexOf(";") != -1 ) {
//                    System.out.println(line);
//                }
//
//            }
//        }catch (Exception e) {
//            
//        }finally {
//            try {
//                
//            }
//        }
//
//    }

}
