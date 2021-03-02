import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex11_PrintWriter {

    public static void main(String[] args) {
        // 출력형식의 정의
        // printf, String.format
        // 출력물에 대한 형식 정의(레포팅) >> txt >> 이쁘게
        // 현업 : 레포팅 : 툴 >> 오즈, 크리스탈 레포트 소프트웨어
        // PrintWriter 그림을 그릴수 있게 해줌
        try {
            /*
            PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt"); // 생성
            pw.println("****************************************");
            pw.println("****************HOMEWORK****************");
            pw.println("****************************************");
            pw.printf("%3s : %5d  %5d  %5d  %5.1f","아무개",100,90,50,(float)((100+90+50) /3));
            pw.println();
            pw.close();
            */
            //line 단위
            //read 단위
            FileReader fr = new FileReader("C:\\Temp\\homework.txt");
            BufferedReader bf = new BufferedReader(fr);
            String str = "";
            while((str = bf.readLine()) != null){
                System.err.println(str); 
            }
            bf.close();
            fr.close();
        }catch (Exception e) {
            
        }

    }

}
