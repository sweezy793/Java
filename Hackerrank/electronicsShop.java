import java.util.*;
public class electronicsShop
{
    public static int perfect(int[] m,int[] k,int money){
		int smallest = money;
		boolean canbuy = false;
		for(int i = 0;i<m.length;i++){
			for(int ii=0;ii<k.length;ii++){
				int change = money-(m[i]+k[ii]);
				if(change >= 0 && smallest>change){
					smallest = change;
					canbuy = true;
				}
			}
		}
		return canbuy?(money-smallest):-1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int mouse = scan.nextInt();
		int[] m = new int[mouse];
		int keyboard = scan.nextInt();
		int[] k = new int[keyboard];
		for(int i = 0; i<mouse;i++){
			m[i] = scan.nextInt();
		}
		for(int i = 0; i<keyboard;i++){
			k[i]=scan.nextInt();
		}
		System.out.println(perfect(m,k,money));
	}
}
