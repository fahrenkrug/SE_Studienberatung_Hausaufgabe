public class Studienberatung{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hast du Abitur? [j/n]");
		String answer = sc.next();

		if (answer.equalsIgnoreCase("n"){
			System.out.println("Hast du Fachabitur? [j/n]");
			String answer2 = sc.next();
			if (answer2.equalsIgnoreCase("n"){
				System.out.println("Nicht studieren");
			}
			else if (answer2.equalsIgnoreCase("j"){
				System.out.println("Hast du eine Berufsausbildung? [j/n]");
				String answer4 = sc.next()
				if (answer4.equalsIgnoreCase("j"){
					System.out.println("Du kannst ja sp�ter noch studieren");
				} 
				else if (answer4.equalsIgnoreCase("n"){
					System.out.println("Besser noch studieren");
				}
			}
		else if (answer.equalsIgnoreCase("j"){
			System.out.println("Bist du wissbegierig? [j/n]");
			String answer3 = sc.next();
			if (answer3.equalsIgnorease("j"){
				System.out.println("Auf jeden Fall studieren");
			}
			else if (answer.equalsIgnoreCase("n"){
				System.out.println("Nicht studieren");
			}
		}
	}
}