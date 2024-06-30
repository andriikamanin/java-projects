package stringhe;

import java.util.Arrays;
import java.util.Random;

public class EffettiStringhe {

	private final int MAX_RIPETIZIONI = 2; 
	private final int MAX_BLINK = 8; 

	private Bacheca bacheca;
	private String messaggio;
	private Random random;

	private int ripeti = 0;
	private int ripetiBlink = 0;

	public EffettiStringhe(String... string) {		
		bacheca = new Bacheca(string);
		random = new Random();
	}


//	public String use(int i) {
//		messaggio = bacheca.getMessaggio(i);
//
//		return messaggio;
//	}

	public String rotazioneCircolareDx(String mostra) {

		messaggio = bacheca.getMessaggio(0);
		String buffer;
		if(mostra == null) 
			buffer = messaggio;
		else buffer = mostra;

		buffer = buffer.substring(1) + buffer.substring(0,1);

		if(buffer.equals(messaggio))
			ripeti++;

		sleep(50);

		if( ripeti != MAX_RIPETIZIONI)
			return buffer;
		else
			return null;
	}


	public String scrumbleInit(String messaggio) {

		char[] buffer = new char[messaggio.length()];

		for(int j = 0; j < messaggio.length(); j++) {
			int x = random.nextInt(56);
			buffer[j] = (char) ( x + 65 );
		}

		sleep(500);

		return new String(buffer);

	}

	public String scrumble(String mostra) {
		String messaggio = bacheca.getMessaggio(2);

		if( mostra == null)
			return scrumbleInit(messaggio);

		char[] scrumbled = mostra.toCharArray();
		
		if(messaggio.equals(mostra)) {
			sleep(1000);
			return null;
		}

		for(int j = 0; j < scrumbled.length; j++) {	

			if(messaggio.charAt(j) == scrumbled[j])
				continue;

			int x = random.nextInt(27);
			char r = (char) ( x + 96 );
			char s = messaggio.charAt(j);

			scrumbled[j] = ( r != s && s != (char) 32)
							? (char) ( x + 96 )
							: s;
		}

		sleep(50);

		return new String(scrumbled);
	}

	public String shiftSx(String mostra) {
		messaggio = bacheca.getMessaggio(1);
		char[] heading = new char[10];
		Arrays.fill(heading, ' ');
		messaggio = new String(heading) + messaggio;
		String empty = messaggio.replaceAll(".", " ");

		String buffer;
		if(mostra == null) 
			buffer = messaggio;
		else buffer = mostra;

		buffer = buffer.substring(1) + " ";

		if(buffer.equalsIgnoreCase(empty))
			return null;

		sleep(50);

		return buffer;
	}


	public String blink() {

		sleep(500);

		messaggio = bacheca.getMessaggio(3);
		String empty = messaggio.replaceAll(".", " ");

		if( ++ripetiBlink == MAX_BLINK) {
			sleep(500);
			return null;
		}

		return ( ripetiBlink % 2 == 1 )? messaggio : empty;
	}

	private void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
