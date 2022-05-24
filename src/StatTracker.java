import java.util.HashMap;
import java.util.Map;

public class StatTracker {
	public static Map<String, GameKDA> myGames = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newGame("Halo");
		addStats("Halo", 2, 3, 9);
		newGame("COD ");
		addStats("COD ", 5, 1, 3);
		addStats("Halo", 20, 3, 6);
		newGame("Apex");
		addStats("Apex", 30, 1, 20);
		addStats("COD ", 12, 3, 16);
		
		System.out.println("Game  Kills   Deaths   Assists     K/D");
		for(String s: myGames.keySet()) {
		System.out.print(s + "    ");
		System.out.print(myGames.get(s).getKills() + "      ");
		System.out.print(myGames.get(s).getDeaths() + "        ");
		System.out.print(myGames.get(s).getAssists() + "        ");
		System.out.println(myGames.get(s).getKDRatio());
		}
	}
	public static void newGame(String name) {
		GameKDA game = new GameKDA();
		myGames.put(name, game);
	}

	public static GameKDA addStats(String name, int k, int d, int a) {
		myGames.get(name).addKills(k);
		myGames.get(name).addDeaths(d);
		myGames.get(name).addAssists(a);
		return myGames.get(name);
	}
}
