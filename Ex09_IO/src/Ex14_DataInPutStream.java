import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInPutStream {

    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        FileInputStream fis = null;
        DataInputStream dis = null;
        
        
        try {
            fis = new FileInputStream("score.txt");
            dis = new DataInputStream(fis);
            
            while(true) {
                score = dis.readInt(); // writeInt()사용 했기 때문에 readInt() 를 사용하여 읽는다.
                System.out.println("score int 데이터 : "  + score);
                sum+=score;
            }    
            
        }catch (Exception e) {
            // dis.readInt() 
            System.out.println(e.getMessage());
            System.out.println("sum 결과 : " + sum);
        }finally {
            try {
                dis.close();
                fis.close();
            }catch (Exception e) {
                
            }
        }
    }

}
