package prog;

import java.io.*;
import java.util.*;
/*已知数据在文件中的存储方式为每三个数为一行，共65536行*/
public class prog3{
	public static void main(String[] args) {					
		System.out.println("输入数组长度(默认起始位置从第一个数据开始开始）："); 
		Scanner in = new Scanner(System.in);
		  int a = in.nextInt();		
		System.out.println("下面将在数组的指定范围内求sum");
		System.out.println("输入范围的起始值(假设第一个数据的起始位置为0)：");	
		 int b=in.nextInt();
		 System.out.println("输入范围的结束值：");
		 int c=in.nextInt();	
		 in.close();int flage=0;
		 try{
			 if(b<0||c>=a)
			{
			flage=1;
			System.out.println("超出范围！");throw new IOException();
			}
		 if(b>c)
			{
			 flage=1;
			System.out.println("左范围大于右范围！");throw new IOException();
			}
		 }catch(Exception e){e.printStackTrace();}
		 if(flage==0)
		    D(a,b,c);		  
}
	public static void D(int a,int b,int c) {
		try{
		  FileReader fr1=new FileReader("data.csv");
		  BufferedReader bf1=new BufferedReader(fr1);
	      int count=0;
		  String str1 = null;String [] strI=null;int total=0,j=0;
		  while((b/3+1)>1&&(str1=bf1.readLine())!=null){//字符不等于空,找到要求数组的上一行！
			  count++;
		  if(b/3==count) break;
		  }
		  str1=bf1.readLine();  count++;               //开始累加的起始行数
		  strI=str1.split(",");
		  int f=b%3;
		  if(c/3>b/3){                        //防止指定范围只在第一行
		  for(;f<3;f++){                      //将起始行元素相加
			   	j=Integer.parseInt(strI[f]);	System.out.print("前面"+j+"\n");				   	
			   	total+=j;
		  }	
		  }
		  else{                                  //如果范围只有一个或两个元素且靠近左边
			  for(;f<=(c%3);f++){                        
			   	j=Integer.parseInt(strI[f]);	System.out.print("前面"+j+"\n");				   	
			   	total+=j;
			  }		  
		  }
		  if(b/3!=c/3){
		  while((c/3!=count)&&(str1=bf1.readLine())!=null){	//将中间的数全相加				  											     						
				strI=str1.split(",");count++;											
				 for(int i=0;i<3;i++){
					   	j=Integer.parseInt(strI[i]);	System.out.print("中间"+j+"\n");				   	
					   	total+=j; 	    	            
					   	}	    	            						 				 
			}	
		  }
		  str1=bf1.readLine();               
		  strI=str1.split(",");
		  int y=c%3;
		  if(b/3!=c/3){
		  for(int s=0;s<=y;s++){                        //将最后一行元素相加
			   	j=Integer.parseInt(strI[s]);			System.out.print("最后"+j+"\n");		   	
			   	total+=j;
		  }
		  }
		  System.out.print("\n"+total);
		  fr1.close(); bf1.close();
	  }catch (Exception e){
			e.printStackTrace();}
	}
}
	