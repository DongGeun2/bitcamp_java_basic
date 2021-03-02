package kr.or.bit;

import java.io.Serializable;

/*
 객체 통신 
 객체(Car, Tv) 네트워크, 파일 간에(txt write, read), 프로세스(독립적인 프로그램)간에 통신
 직렬화 : 객체를 분해해서 줄을 세워 보내는 전반적인 과정
 역직렬호 : 객체를 다시 조립하는 과정 
 
 실습
 대상 >> 파일 >> UserInfo 객체 write (직렬화)
 대상 >> 파일 >> 직렬화 된 UserInfo 객체를 read 조립 (역직렬화)
 
 조립식 : 한번 만들면 해제 불가
 레고식 : 만들고 해제하고 가능
 public class UserInfo implements Serializable ( 조립 분해 가능 )
 
 */
public class UserInfo implements Serializable{
    private String name;
    private String pwd;
    private int age;
    
    public UserInfo() {
        
    }
    public UserInfo(String name, String pwd, int age) {
        
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    
    public String getPwd() {
        return pwd;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
    }
    
    
}












