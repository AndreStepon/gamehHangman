import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File ("C:/Users/Vartotojas/eclipse-workspace/ZaidimasHangman/src/zodziai.txt"));
		Scanner sc = new Scanner(System.in);
		
		List<String> zodziai = new ArrayList<>();
		
		while (scan.hasNext()) {
			zodziai.add(scan.nextLine().toUpperCase());
		}
		Random rnd = new Random();
		
		String zodis = zodziai.get(rnd.nextInt(zodziai.size()));
		
		List<Character> zaidejoSpejimas = new ArrayList<>();
//		System.out.println(zodis);
		int bandymas = 0;
		
		while(true) {
		KartuviurRemas.paint(bandymas);
		if (bandymas>=7) {
			System.out.println("Ach, pralaimejote! Zaidimas baigtas");
			break;
		}
		getZodis(zodis, zaidejoSpejimas);
		if (!getZaidejoSpejimas(sc, zodis, zaidejoSpejimas)) {
			bandymas++;
		}
		
		if (getZodis(zodis, zaidejoSpejimas)){
			System.out.println("Zaidima laimejote!");
			break;
			
		}
		}
//		System.out.println("Spekite visa zodzi: ");
//		if (sc.nextLine().equals(zodis)) {
//			System.out.println("Zaidima laimejote!");
//			break;
//		} else {
//			System.out.println("Neatspejote. bandykite darkart :)");
//		}
		//}
		
}

	private static boolean getZaidejoSpejimas(Scanner sc, String zodis, List<Character> zaidejoSpejimas) {
		System.out.println("Iveskite raide:");
		String raidesSpejimas = sc.nextLine();
		zaidejoSpejimas.add(raidesSpejimas.toUpperCase().charAt(0));
		
		return zodis.contains(raidesSpejimas);
	}

	private static boolean getZodis(String zodis, List<Character> zaidejoSpejimas) {
		int teisingiSpejimai = 0;
		for (int i = 0; i < zodis.length(); i++) {
			if (zaidejoSpejimas.contains(zodis.charAt(i))) {
				System.out.print(zodis.charAt(i));
				teisingiSpejimai++;
			} else {
				System.out.print("_ ");
			}
		}
		System.out.println();
		return (zodis.length() == teisingiSpejimai);
	}
}
	/*1)Atsitiktinis žodis pasirenkamas iš failo (reikšmė priskirta selectedWord).
2)Inicijuojame tuščią masyvą, kuriame bus visos pateiktos raidės. Šis masyvas vadinamas letters.
3)Taip pat saugome skaičių, kiek gyvybių liko. Šis kintamasis vadinamas lives.
4)Pagrindinis žaidimo ciklas veikia tol, kol gyvybės nepasiekia 0.
Ciklo viduje:
    Perskaitome kiekvieną pasirinkto žodžio raidę.
    Paprašome vartotojo spėti raidę.
    Patikriname ar įvesta raidė yra masyve. 
        Jei žaidėjas atspėjo:
            Spausdiname žodį, kur atspėtos raidės rodomos, neatspėtos rodomos kaip žemas brūkšnys.
            Po ciklo patikriname, ar liko neatspėtų simbolių. 
            Jei jų nėra (reikšmė yra 0), žaidėjas laimėjo ir mes galime išeiti iš ciklo.
        Jei neatspėjo, piešiame kartuves su vis kitu piešiniu.
    Jei vartotojui dar liko gyvenimų, rodome laimėjimo pranešimą, kitu atveju rodoma, kad pralaimėjo.*/



