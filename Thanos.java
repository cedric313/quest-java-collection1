import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
	Hero hero1 = new Hero("Black Widow",34);
	Hero hero2 = new Hero("Captain America",100);
	Hero hero3 = new Hero("Vision",3);
	Hero hero4 = new Hero("Iron Man",48);
	Hero hero5 = new Hero("Scarlet Witch",29);
	Hero hero6 = new Hero("Thor",1500);
	Hero hero7 = new Hero("Spider-Man",18);
	Hero hero8 = new Hero("Hulk",49);
	Hero hero9 = new Hero("Doctor Strange",42);
	


        // TODO 2 : Add those heroes to the list
	ArrayList<Hero> lunch = new ArrayList<>();
	lunch.add(hero1);
	lunch.add(hero2);
	lunch.add(hero3);
	lunch.add(hero4);
	lunch.add(hero5);
	lunch.add(hero6);
	lunch.add(hero7);
	lunch.add(hero8);
	lunch.add(hero9);
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501
	Hero thorModify = new Hero("Thor",1501);
	lunch.set(5, thorModify);

        // TODO 4 : Shuffle the heroes list
	List<Hero> list = 		Arrays.asList(hero1,hero2,hero3,hero4,hero5,hero6,hero7,hero8,hero9);

               
        // shuffle or randomize
        Collections.shuffle(list);
           
         

        // TODO 5 : Keep only the half of the list
	lunch.remove(0);
	lunch.remove(1);
	lunch.remove(2);
	lunch.remove(3);
	

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
	for (int i = 0; i < lunch.size(); i++) {
    	Hero hero = lunch.get(i);
	System.out.println(hero.getName());

}
    }
}
