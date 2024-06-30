package stringhe;

import java.util.Arrays;

public class Console {

	EffettiStringhe effettiStringhe;		

	public Console(String... args) {
		// TODO Auto-generated constructor stub
		effettiStringhe = new EffettiStringhe(args);		
	}

	public void esegui() {

		//rotazione circolare sx
		rotazioneCircolareDx();

		pause(1000);
		clearLine();

		//shift sx
		shiftSx();
		clearLine();

		pause(1000);

		//scrumble
		scrumble();
		clearLine();

		pause(1000);

		//blink
		blink();
		clearLine();
	}

	private void blink() {
		String mostra;

		do {
			mostra = effettiStringhe.blink();
			if(mostra != null)
				System.out.print( "\r" + mostra );

		} while(mostra != null );
	}

	private void scrumble() {
		String mostra = null;

		do {
			mostra = effettiStringhe.scrumble(mostra);
			if(mostra != null)
				System.out.print("\r" + mostra );

		} while(mostra != null);
	}

	private void shiftSx() {
		String mostra = null;

		do {
			mostra = effettiStringhe.shiftSx(mostra);
			if(mostra != null)
				System.out.print("\r" + mostra );
		} while(mostra != null );
	}

	private void rotazioneCircolareDx() {
		String mostra = null;

		do {
			mostra = effettiStringhe.rotazioneCircolareDx(mostra);
			if(mostra != null)
				System.out.print("\r" + mostra);
		} while(mostra != null );

//		System.out.print("\r" + effettiStringhe.use(0));
	}

	private void pause(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void clearLine() {
		char[] chars = new char[256];
		Arrays.fill(chars, ' '); 
		System.out.print("\r" + new String(chars));
	}
}
