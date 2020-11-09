
public class Validacao {
	
	public static boolean isTempoValido(int tempoMiojo, int ampulheta1, int ampulheta2) {				
		return ampulheta1 > tempoMiojo && ampulheta2 > tempoMiojo;		
	}
	
	public static boolean isPossivel(int tempoMiojo, int ampulheta1, int ampulheta2) {				
		return (tempoMiojo % MDC.calculoMDC(ampulheta1, ampulheta2)) == 0;		
	}

}
