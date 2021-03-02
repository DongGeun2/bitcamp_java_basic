import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 보조 
 DataOutPutStream, DataInPutStream (한쌍)
 장점 : JAVA 8가지 기본타입 형식(Write, read)
 단 지들끼리만 .... 
 >> txt 기록 >> 규칙적인 방법 >> 80,100,22,65 >> split > 배열 > 정수 > 연산
 
 DataOutPutStream 쓴건
 DatainPutStream 으로 사용해야 함
 
 */
public class Ex13_DataOutPutStream {
    public static void main(String[] args) {
        int[] score = {100,60,55,94,23};
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream("score.txt");
            dos = new DataOutputStream(fos);
            for(int i = 0; i < score.length; i++) {
                dos.writeInt(score[i]); // 단 무조건 read DataInPutStream
                // dos.writeUTF(null); 한글, 영문 2또는 3byte 기준
                
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                dos.close();
                fos.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
