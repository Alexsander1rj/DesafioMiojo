
public class MDC {
	
	public static int calculoMDC(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return calculoMDC(b, a%b);
		}		
	}

}
