package prog;

import java.io.*;
import java.util.*;
/*��֪�������ļ��еĴ洢��ʽΪÿ������Ϊһ�У���65536��*/
public class prog3{
	public static void main(String[] args) {					
		System.out.println("�������鳤��(Ĭ����ʼλ�ôӵ�һ�����ݿ�ʼ��ʼ����"); 
		Scanner in = new Scanner(System.in);
		  int a = in.nextInt();		
		System.out.println("���潫�������ָ����Χ����sum");
		System.out.println("���뷶Χ����ʼֵ(�����һ�����ݵ���ʼλ��Ϊ0)��");	
		 int b=in.nextInt();
		 System.out.println("���뷶Χ�Ľ���ֵ��");
		 int c=in.nextInt();	
		 in.close();int flage=0;
		 try{
			 if(b<0||c>=a)
			{
			flage=1;
			System.out.println("������Χ��");throw new IOException();
			}
		 if(b>c)
			{
			 flage=1;
			System.out.println("��Χ�����ҷ�Χ��");throw new IOException();
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
		  while((b/3+1)>1&&(str1=bf1.readLine())!=null){//�ַ������ڿ�,�ҵ�Ҫ���������һ�У�
			  count++;
		  if(b/3==count) break;
		  }
		  str1=bf1.readLine();  count++;               //��ʼ�ۼӵ���ʼ����
		  strI=str1.split(",");
		  int f=b%3;
		  if(c/3>b/3){                        //��ָֹ����Χֻ�ڵ�һ��
		  for(;f<3;f++){                      //����ʼ��Ԫ�����
			   	j=Integer.parseInt(strI[f]);	System.out.print("ǰ��"+j+"\n");				   	
			   	total+=j;
		  }	
		  }
		  else{                                  //�����Χֻ��һ��������Ԫ���ҿ������
			  for(;f<=(c%3);f++){                        
			   	j=Integer.parseInt(strI[f]);	System.out.print("ǰ��"+j+"\n");				   	
			   	total+=j;
			  }		  
		  }
		  if(b/3!=c/3){
		  while((c/3!=count)&&(str1=bf1.readLine())!=null){	//���м����ȫ���				  											     						
				strI=str1.split(",");count++;											
				 for(int i=0;i<3;i++){
					   	j=Integer.parseInt(strI[i]);	System.out.print("�м�"+j+"\n");				   	
					   	total+=j; 	    	            
					   	}	    	            						 				 
			}	
		  }
		  str1=bf1.readLine();               
		  strI=str1.split(",");
		  int y=c%3;
		  if(b/3!=c/3){
		  for(int s=0;s<=y;s++){                        //�����һ��Ԫ�����
			   	j=Integer.parseInt(strI[s]);			System.out.print("���"+j+"\n");		   	
			   	total+=j;
		  }
		  }
		  System.out.print("\n"+total);
		  fr1.close(); bf1.close();
	  }catch (Exception e){
			e.printStackTrace();}
	}
}
	