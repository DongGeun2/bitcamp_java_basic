
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

public class Ex15_ObjectDataOutPutStream {

    public static void main(String[] args) {
        String filename = "Userdata.txt"; // 객체를 직렬화 해서 write
        
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream out = null;
        
        try{
            fos = new FileOutputStream(filename,true);
            bos = new BufferedOutputStream(fos);
            // 직렬화 하고 싶으면
            out = new ObjectOutputStream(bos);
            
            // 직렬화 대상
            UserInfo u1 = new UserInfo("홍길동", "super", 500); // 완제품
            UserInfo u2 = new UserInfo("Scott", "tiger", 50); // 완제품
            
            // 벽에 구멍을 만들고 보낸다
            // 직렬화 "Userdata.txt"
            out.writeObject(u1); // 분해해서 "Userdata.txt" write
            out.writeObject(u2); // 분해해서 "Userdata.txt" write
            
            
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                out.close();
                bos.close();
                fos.close();
                
            }catch (Exception e) {
                // TODO: handle exception
            }
        }
        
        
    }

}
