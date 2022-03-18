package logicalpro;


public class DuplicateInArray {
	public static void main(String[] args) {
		int[] a= {0,3,7,89,7,9,9,4,3};
		System.out.print("Duplicates no are ");
		
		for(int i=0;i<a.length; i++) {
			
			for(int j=i+1;j<a.length; j++) {
			
				if(a[i]==a[j]) {
					System.out.print(" "+a[j]);
				}
			}
		}
	}
}
