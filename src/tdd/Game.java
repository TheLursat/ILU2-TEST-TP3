package tdd;

public class Game {
	
	private static final int NB_MAX_LANCES = 21;
	private int[] tab = new int[NB_MAX_LANCES];
	private int num_tour;
	
	public Game() {
		num_tour=0;
		for(int i=0; i<NB_MAX_LANCES;i++) {
			tab[i]=0;
		}
	}
	
	void roll( int nbQuilles) {
		
	}
	
	int score() {
		return 0;
	}
}
