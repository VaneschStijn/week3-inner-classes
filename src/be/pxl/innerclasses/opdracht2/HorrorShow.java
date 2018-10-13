package be.pxl.innerclasses.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {
		class Vampire implements Monster{
			public void menace(){
				System.out.println("I'll drink your blood!!");
			}
		}

		class Werewolf implements DangerousMonster{
			public void menace(){
				System.out.println("I'll destroy you!!");
			}

			public void destroy(Monster monster){
				monster.menace();
				//For fun add menace()-method of current monster
				//menace();
				System.out.println("Big fight...");
				System.out.println(getClass().getSimpleName() + " killed one " + monster.getClass().getSimpleName());
			}
		}

		//Behind the created inner classes => Otherwise classtypes not known
		Werewolf werewolf = new Werewolf();
		werewolf.destroy(new Vampire());

		//Here example of a anonymous inner class as argument
		werewolf.destroy(new Monster() {
			@Override
			public void menace() {
				System.out.println("You smell like wet dog!!");
			}
		});
	}
}
