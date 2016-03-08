package prog;

import java.io.*;
import java.util.Scanner;
public class prog2 {
	public static void main(String[] args) {	
		try{System.out.println("请输入数组的长度：");
		  Scanner in = new Scanner(System.in);
		  int a = in.nextInt();
		  in.close();
		  FileReader fr1=new FileReader("data.csv");
		  BufferedReader bf1=new BufferedReader(fr1);
		  String str1 = null;String [] strI=null;int total=0,j=0,count=0;
		  while(count<a&&(str1=bf1.readLine())!=null){	//将中间的数全相加				  											     						
				strI=str1.split(",");	
				count++;										
				j=Integer.parseInt(strI[0]);					   	
				total+=j; 	    	            
				}
		  System.out.print("the"+a+ "number sum is:"+total);
		  fr1.close(); bf1.close();
		}catch (Exception e){
			e.printStackTrace();}
	}
}
