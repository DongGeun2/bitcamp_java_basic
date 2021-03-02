import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {

    public static void main(String[] args) {
        File dir = new File("C:\\Temp");
        File[] files = dir.listFiles();
        
        for(int i = 0; i < files.length; i++) {
            File file = files[i];
            String name = file.getName(); // 파일명, 폴더명
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");
            String attribute="";
            String size="";
            
            if(files[i].isDirectory()) { // 폴더
                attribute="<DIR>";
                
            }else {
                // 파일
                size = file.length() + "byte";          //크기
                attribute=file.canRead() ? "R":"";      // 읽기 가능한지
                attribute+=file.canWrite() ? "W":"";    // 쓰기 가능한지
                attribute+=file.isHidden() ? "H":"";    // 숨겨져 있는지
            }
            
            System.out.printf("%s    %3s    %10s    %s \n",
                                dt.format(new Date(file.lastModified())), 
                                attribute,
                                size,
                                name); 
            
        }

    }

}
