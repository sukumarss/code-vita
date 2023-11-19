import java.util.Scanner;

public class collecting {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
	     int test=sc.nextInt();
	     for(int i=0;i<test;i++){
             int N=sc.nextInt();
	         int[] array=new int[N];
	         for(int j=0;j<N;j++){
	             array[j]=sc.nextInt();
	         }
	         int sum=array[0];
	         int a =seconds(array,N,sum);
	         System.out.println(a);

	     }    
	 }
	 static int seconds(int[] array,int N,int sum) {
		 int sec=0;
		 for(int k = 0;k<N-1;k++) {
			 sum+=array[k+1];
			 sec+=sum;
			 
		 }
		 return sec;
	 }

}
