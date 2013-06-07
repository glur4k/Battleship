package model;

import model.Field.state;

public class Bot extends Player{
	
	private int[] lasthit;
	
	public Bot(int fieldsize) {
		lasthit = new int[2];
		initPlayboard(fieldsize);
	}
	
	@Override
	public void initPlayboard(int size) {
		playboard = new Playboard(size);
	}
	
	protected int initRandomNumber() {
		int x = (int) (Math.random() * getPlayboard().getSize());
		return x;
	}
	

	public int[] shoot(Playboard board) {
		int[] shot = {0, 0};
		do{
			shot[0] = initRandomNumber();
			shot[1] = initRandomNumber();
		}
		while (board.getField()[shot[0]][shot[1]].getStat() == state.hit || 
				board.getField()[shot[0]][shot[1]].getStat() == state.emptyhit);
		
		board.getField()[shot[0]][shot[1]].shoot();
		return shot;  
	}
	 
	public void setShip(Ships s){
		int[] posi = {0, 0};		
		
		do {
			do{
				posi[0] = initRandomNumber();
			}while(posi[0]+s.getSize() > playboard.getSize());

			do{
				posi[1] = initRandomNumber();
			}while(posi[1]+s.getSize() > playboard.getSize());
			
			
		} while(playboard.getField()[posi[0]][posi[1]].getStat() == state.ship);
		s.setPosition(posi[0], posi[1]);
		playboard.setShip(s);
	}
	
	public boolean vertical(){
		int x = initRandomNumber();
		if(x <= playboard.getSize()/2){
			return true;
		}
		else{
			return false;
		}
	}
}