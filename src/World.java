public class World {
	// Builds the game world.
	// Returns the room the player starts in.
	public static Rooms buildWorld() {
	Rooms livingRoom = new Rooms("You are in the living room.");
	Rooms kitchen = new Rooms("You are in the kitchen.");
	Rooms Basement= new Rooms("BASEMENT");
	Rooms Bedroom= new Rooms("You are bedroom");
	Rooms Balcony= new Rooms("You are on the balcony");
	Rooms Bathroom= new Rooms("You are in the bathroom");
	
	item bluekey = new item(" a blue key","you found a key! I wonder what it unlocks...");
	item litterbox = new item ("litterbox","It stinks!");
	item stringtoy = new item ("stringtoy","Maybe this can be used to distract one of the cats");
	item mousetoy= new item ("mouse toy","this toy is falling apart, one of the cats must love it");
	item greenkey= new item ("a green key","You found a key! I wonder what this unlocks... ");
	item cattreats= new item("Cat treats", "these cat treats look nasty");
	item Cible = new item ("Cible", " I wonder what a cible is ");
	Code Code = new Code("code","you found a code!");
	safe safe= new safe("safe","A large reusty metal safe? kind of wierd");
	
	
	livingRoom.addExit(kitchen, 'e');
	livingRoom.addExit(Basement,'d');
	livingRoom.addExit(Bedroom,'w');
	livingRoom.addExit(Balcony,'n');
	livingRoom.addExit(Bathroom,'n');
	
	kitchen.addExit(livingRoom, 'w');
	kitchen.additem("Cat treats", cattreats);
	
	Basement.addExit(livingRoom, 'u');
	Basement.setlock(true);
	
	
	Bedroom.addExit(livingRoom,'e');
	Bedroom.additem("mouse toy", mousetoy);
	Bedroom.additem("Cible",Cible);
	Bedroom.additem("safe",safe);
	
	Balcony.addExit(livingRoom,'s');
	Balcony.additem("string toy", stringtoy);
	
	
	Bathroom.addExit(livingRoom,'s');
	Bathroom.additem("litterbox", litterbox);
	Bathroom.additem("code", Code);
	
	return livingRoom;
	}
}
