package logicalpro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Arrays {
	
	public static void main(String[] args) {
		Set num=new TreeSet();
		List op=new ArrayList();
		
		int n[]= {2,34,66,77,8,9,33,1};
		for(int i=0;i<n.length;i++) {
			System.out.print(" "+n[i]);
			num.add(n[i]);
		}
		System.out.println("\nAssending="+num);
		
		
		
		for(int i=0;i<n.length;i++) {
			if(i!=4) {
				op.add(n[i]);
			}
			else {
				op.add(5);
			}
		}
		System.out.println(op);
	}
}
