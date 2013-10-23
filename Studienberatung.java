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
		}
	}
}