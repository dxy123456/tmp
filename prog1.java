package prog;

import java.io.*;
public class prog1 {
	public static void main(String[] args) {	
		try{System.out.println("����������100��Ԫ�صĺͣ�");
		  FileReader fr1=new FileReader("data.csv");
		  BufferedReader bf1=new BufferedReader(fr1);
		  String str1 = null;String [] strI=null;int total=0,j=0,count=0;
		  while(count<100&&(str1=bf1.readLine())!=null){	//���м����ȫ���				  											     						
				strI=str1.split(",");	
				count++;										
				j=Integer.parseInt(strI[0]);					   	
				total+=j; 	    	            
				}
		  System.out.print("the 100 number sum is:"+total);
		  fr1.close(); bf1.close();
		}catch (Exception e){
			e.printStackTrace();}
	}
}
