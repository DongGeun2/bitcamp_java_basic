import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 File 처리 (Disk) : 원칙 한 Byte 단위로 read, Write
 모아 모아서 한번에 read, write (버스대절 >> 20명 타)
 버스 : Buffer(캐시메모리) 의 장점
 1. I/O 성능(횟수) 개선
 2. Line 단위(엔터)
 
  보조 스트림 : BufferedInputStream (주 클래스의 의존) 독자적인 생존 불가능
  개발자는 의무적으로 사용
 
 
 */
public class Ex04_Stream_Buffer {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        
        try{
            fos = new FileOutputStream("data.txt"); // data.txt 가 없으면 파일을 생성
            bos = new BufferedOutputStream(fos);
            
            for(int i = 0; i < 10; i++) {
                bos.write('A');   
            }
            // bos.flush();
            //JAVA Buffer 크기 : 8kbyte : 8192Byte
            // 1. butter 안에 내용이 채워지면 스스로 출발 (비운다) : flush
            // 2. buffer 강제로 비우는 방법 ( 명시적으로 flush 호출 ) : flush();
            // 3. bos.close() 자원해제 >> 자동으로 flush() 호출 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                bos.close();
                fos.close();
            }catch(Exception e) {
                
            }
        }

    }

}
