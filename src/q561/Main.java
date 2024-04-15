package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]inp = new int[10];
		
		for(int i=0;i<inp.length;i++) {
			inp[i]=sc.nextInt();
		}sc.close();
		
		//print
//		for(int i=0;i<inp.length;i++) {
//		System.out.print(inp[i]+" ");
//		}
		
		
		int ovHc = 0;
		int[]unH=new int[10];
		int[]ovHt=new int[10];
		
		for(int i=0;i<inp.length;i++) {
			if(inp[i]<100) {
				unH[i]=inp[i];
			}else {
				ovHt[i]=inp[i];
			}
			if(ovHt[i]!=0) {
				ovHc++;
			}
		}
		
//		for(int i=0;i<inp.length;i++) {
//		
//		}
		int[]ovH=new int[ovHc];
		
		
		
		
		
		
//		int max=unH[0];
//		int min=ovH[0];
//		
//		for(int i=1;i<inp.length;i++) {
//			if(max<unH[i]) {
//				max=unH[i];
//			}
//			if(min>ovH[i]) {
//				min=ovH[i];
//			}
//		}
		
		
//		System.out.print(max+" "+min);
		
		int max=inp[0];
		int min=inp[0];
		
		for(int i=0;i<inp.length;i++) {
			if(inp[i]<100) {
				if(max<=inp[i]) {
					max=inp[i];
				}
			}else{
				min=inp[i];
				if(min>inp[i]){
				min=inp[i];
				}
			}
		}
		
		
		System.out.print(max+" "+min);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
