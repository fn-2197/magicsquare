import java.util.Scanner;


public class Magicsquares {
	
	public static void main(String[] args) {
		int a[][] = new int [4][4];
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i <=3; i++){
			for(int ii = 0; ii <=3; ii++){
				System.out.println("Type the next number:");
				a[i][ii] = kb.nextInt();
				}
		}
		if(v(a) == false){
			System.out.println("Not a Valid Magic Square!");
			}
		else{
			int sum = 0;
			for(int i = 0; i<=3; i++){
				sum += a[0][i];
			}
			boolean t = true;
			int sumb = 0;
			for(int i = 1; i <=3; i++){
			sumb = 0;	
				for(int ii = 0; ii <=3; ii++){
			sumb += a[i][ii];
			
			}
				if(sumb != sum){
					t = false;
					break;
		}
	}
			for(int i = 1; i <=3; i++){
				sumb = 0;	
					for(int ii = 0; ii <=3; ii++){
				sumb += a[ii][i];
				
				}
					if(sumb != sum){
						t = false;
						break;
			}
		}		
		//diagonal one
		for(int i = 0; i <= 3; i++){
			sumb += a[i][i];
		}
		if(sumb != sum){
			t = false;
			}
		for(int i = 3; i >= 0; i--){
			sumb += a[i][i];
		}
		if(sumb != sum){
			t = false;
			}
		if(false == t){
			System.out.println("Not a Magic Square");
		}
		else{
			System.out.println("A Magic Square");
		}
}
		
	
	
	
}
public static boolean v(int a[][]){
boolean v = false;	
for(int n = 1; n<16; n++){
	for(int i = 0; i <=3; i++){
		for(int ii = 0; ii <=3; ii++){
			if(a[i][ii] == n)
				v = true;
			else
				v = false;
		}}
	if(v == false)
		return v;		
}
return v;
}
	
}



