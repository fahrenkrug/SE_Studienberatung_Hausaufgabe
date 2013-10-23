public class Studienberatung{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hast du Abitur? [j/n]");
		String answer = sc.next();
		
		if (answer.equalsIgnoreCase("j"){
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