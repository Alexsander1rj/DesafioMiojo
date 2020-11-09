import java.util.Scanner;

public class TestaMiojo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tempoAmpulheta1 = 0;
		int tempoAmpulheta2 = 0;
		int tempoMiojo = 0;

		boolean isPrimeiraVez = true;

		do {
			if(!isPrimeiraVez)
				System.out.println("\nFavor informar o tempo para a(s) ampulheta(s) maior ou igual ao tempo de cozimento do Miojo\n");

			System.out.print("Informe o tempo de preparo Miojo em minutos: ");
			tempoMiojo = in.nextInt();

			System.out.print("Informe o tempo da Ampulheta 1 em minutos: ");
			tempoAmpulheta1 = in.nextInt();

			System.out.print("Informe o tempo da Ampulheta 2 em minutos: ");
			tempoAmpulheta2 = in.nextInt();

			isPrimeiraVez = false;

		} while(!Validacao.isTempoValido(tempoMiojo, tempoAmpulheta1, tempoAmpulheta2));

		if(Validacao.isPossivel(tempoMiojo, tempoAmpulheta1, tempoAmpulheta2)){
			int tempoFinal = 0;
			int amp1 = tempoAmpulheta1;
			int amp2 = tempoAmpulheta2;

			while(true){
				if (amp2 < amp1){
					tempoFinal = tempoFinal + amp2;
					if (amp2 == tempoMiojo)
						break;
					amp1 = amp1 - amp2;
					amp2 = tempoAmpulheta2;
				}
				else {
					tempoFinal = tempoFinal + amp1;
					if (amp1 == tempoMiojo)
						break;
					amp2 = amp2 - amp1;
					amp1 = tempoAmpulheta1;
				}
			}
			
			System.out.println("\nO tempo mínimo necessário para o Miojo ficar pronto em minutos é: " +  tempoFinal);
		} 
		else
			System.out.println("\nNão é possível cozinhar o miojo no tempo exato com as ampulhetas disponíveis.");

		in.close();
	}
}


