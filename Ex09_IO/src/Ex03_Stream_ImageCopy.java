import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_Stream_ImageCopy {

    public static void main(String[] args) {
        String orfile = "C:\\Temp\\img.jpg";
        String tarfile = "copy.jpg";
        // default 경로 : 프로젝트 폴더
        // C:\Users\mhy01\eclipse-workspace\Ex09_IO\copy.jpg
        FileInputStream fs = null;
        FileOutputStream fo = null;
        
        try {
            fs = new FileInputStream(orfile);
            fo = new FileOutputStream(tarfile,false); // 파일이 없으면 생성하고 write 
            
            int data = 0;
            while((data = fs.read()) != 1) {
                fo.write(data); // copy.jpg 에서 byte 값을 write 
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fs.close();
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }

    }

}
