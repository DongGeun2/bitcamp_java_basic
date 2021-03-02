import java.io.File;

/*
 파일과 폴더 다루는 클래스
 
 JAVA : 파일, 폴더 하나의 클래스 : File 
 >> a.txt 생성, 삭제, 정보 read 
 >> Temp 폴더 생성, 삭제, 정보 read
 
 C# : File 클래스, Directory 클래스
 
 절대경로 : C:\\    >> 시작점이 드라이브임.
          D:\\
          
 상대경로 : 현재 파일을 중심으로 C:\\Test >> ... /Temp/
 
 */
public class Ex07_File {

    public static void main(String[] args) {
        // String path = "Lotto.txt"; // 절대 경로
        String path = "C:\\Temp\\file.txt";
        File f = new File(path);
        // File 클래스 사용 : file 에 대한 다양한 정보를 얻을 수 있다.
        
        System.out.println("파일명 : " + f.getName());
        System.out.println("전체경로 : " + f.getPath());
        System.out.println("절대경로 : " + f.getAbsolutePath());
        System.out.println("너 폴더 니?  : " + f.isDirectory()); // false
        System.out.println("너 파일이니?  : " + f.isFile()); // true
        System.out.println("파일에 대한 크기 : " + f.length() + "byte");
        System.out.println("부모경로 : " + f.getParent()); // C:\Temp
        System.out.println("파일 폴더 실제 존재 여부 : " + f.exists()); // true
        
        // f.createNewFile(); 파일 생성
        // f.delete(); 파일 삭제
        // f.canRead(); 파일 읽는지 가능여부
        
        
    }

}
