package tdd;

public class Game {
	
	private static final int NB_MAX_LANCES = 21;
	private int[] partie = new int[NB_MAX_LANCES];
	private int num_tour;
	
	public Game() {
		num_tour=0;
		for(int i=0; i<NB_MAX_LANCES;i++) {
			partie[i]=0;
		}
	}
	
	void roll( int nbQuilles) {
		partie[num_tour]=nbQuilles;
		num_tour+=1;
	}
	
	int score() {
		int score = 0;
		for(int i =0; i<20;i++) {
			score = score + partie[i];
		}
		return score;
	}
}
