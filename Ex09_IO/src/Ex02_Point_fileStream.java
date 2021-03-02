import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  read, write (file) >> 1.txt, 메모.txt
  
  >> fileInputStream
  >> fileOutputStream
  
     
 */
public class Ex02_Point_fileStream {
    public static void main(String[] args) {
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path = "C:\\Temp\\a.txt";
        
        try {
            fs = new FileInputStream(path);
            fos = new FileOutputStream("C:\\Temp\\new.txt",true);
            // FileOutputStream
            // 1. write 하는 파일 존재하지 않으면 파일을 생성.
            // 보이진 않지만 뒤에 false 붙어 있다
            // new FileOutputStream("C:\\Temp\\new.txt", false);
            // overwrite
            
            // append >> true 
            
            int data =0;
            while((data= fs.read()) != -1) { // 더이상 read data가 없으면 -1이 return
                System.out.println("정수 : "+data); // char 정수 변환해서
                // 문자값
                System.out.println("문자 : "+ (char)data);
                
                fos.write(data);
                //new.txt 파일에 data 값을 write 하겠다
                //FileOutputStream은 write 할려는 파일이 없으면 파일을 생성한다.
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            // 정상적으로 실행되든, 비정상 적으로 실행되도 반드시 실행되는 블럭 : return 있어도 실행
            // 자원해제
            // 명시적인 자원 해제(객체) >> 가비지 컬렉터 관리
            // 관리하지 못하는 자원
            // >> I/O, Network ... 개발자가 직접 (명시적으로) 자원을 해제시켜 주어야한다.
            // 엑셀파일 작업 하고 있으면 다른사람이 열면 읽기 전용으로 뜬다 
            // 생성자 <-> 소멸자 호출
            try {
                fs.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
