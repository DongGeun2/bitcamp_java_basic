import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

// 분해된 자료를 복원(객체)하는 작업
// 역직렬화
public class Ex16_ObjectDataInPutStream {

    public static void main(String[] args) {
        String filename="Userdata.txt";
        
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis); // 분해된 부품을 조립(역직렬화)
            
            /*
            UserInfo r1 = (UserInfo)ois.readObject();
            UserInfo r2 = (UserInfo)ois.readObject();
            
            System.out.println(r1.toString());
            System.out.println(r2.toString());
            */
            
            Object users = null;
            while((users = ois.readObject()) != null) {
                System.out.println((UserInfo)users);
            }
        }catch (FileNotFoundException fnfe) {    // 파일이 존재하지 않으면
            System.out.println("파일이 존재하지 않습니다.");
        }catch (EOFException eofe) {   // 파일이 끝이나면
            System.out.println("끝" + eofe.getMessage());
        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
        }finally {
            try {
                ois.close();
                bis.close();
                fis.close();
            }catch (Exception e) {
                // TODO: handle exception
            }
        }
            
            
        
    }

}
