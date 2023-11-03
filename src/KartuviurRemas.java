
public class KartuviurRemas {

	 public static void paint(int bandymas)
     {
         switch (bandymas)
         {
             case 0:
                 System.out.println("+---+");
                 System.out.println("    |");
                 System.out.println("    |");
                 System.out.println("    |");
                 System.out.println("   ===");
                 bandymas++;
                 break;
             case 1:
                 System.out.println("+---+");
                 System.out.println("O   |");
                 System.out.println("    |");
                 System.out.println("    |");
                 System.out.println("   ===");
                 break;
             case 2:
                 System.out.println("+---+");
                 System.out.println("O   |");
                 System.out.println("|   |");
                 System.out.println("    |");
                 System.out.println("   ===");
                 break;
             case 3:
                 System.out.println(" +---+");
                 System.out.println(" O   |");
                 System.out.println("/|   |");
                 System.out.println("     |");
                 System.out.println("    ===");
                 break;
             case 4:
                 System.out.println(" +---+");
                 System.out.println(" O   |");
                 System.out.println("/|\\  |");
                 System.out.println("     |");
                 System.out.println("    ===");
                 break;
             case 5:
                 System.out.println(" +---+");
                 System.out.println(" O   |");
                 System.out.println("/|\\  |");
                 System.out.println(" |   |");
                 System.out.println("    ===");
                 break;
             case 6:
                 System.out.println(" +---+");
                 System.out.println(" O   |");
                 System.out.println("/|\\  |");
                 System.out.println(" |   |");
                 System.out.println("/   ===");
                 break;
             case 7:
                 System.out.println(" +---+");
                 System.out.println(" O   |");
                 System.out.println("/|\\  |");
                 System.out.println(" |   |");
                 System.out.println("/ \\  ===");
                 break;
         }
     }
}
