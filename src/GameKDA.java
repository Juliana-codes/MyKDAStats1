
public class GameKDA {
	private int kills;
	private int assists;
	private int deaths;
	
	public GameKDA() {
	}
	
	public GameKDA(int kill, int assist, int death) {
		this.kills = kill;
		this.assists = assist;
		this.deaths = death; 
	}
	
	public void addKills(int addKills) {
		kills += addKills;
	}
	public void addAssists(int addAssists) {
		assists += addAssists;
	}
	public void addDeaths(int addDeaths) {
		deaths += addDeaths;
	}
	public int getKills() {
		return kills;
	}
	public int getAssists() {
		return assists;
	}
	public int getDeaths() {
		return deaths;
	}
	
	public double getKDRatio() {
		return kills/deaths;
	}
	
	public double getKARatio() {
		return kills/assists;
	}
}
