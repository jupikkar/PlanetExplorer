package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	
	private int x,y;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
	this.x = x;
	this.y = y;

	}
	
	public String executeCommand(String command){
		
		Integer pos_x = 0;
		Integer pos_y = 0;
		Integer facing = 0;
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		String position = "";
		
		for (char letter : command.toCharArray())
		{
			if (letter == 'f') 
				switch(getFacing(facing)){
				case "N": 
					pos_y = moveNorth(pos_y);
					break;
				case "E": 
					pos_x = moveEast();
					break;
				case "S": 
					pos_y = moveSouth();
					break;
				case "W": 
					pos_y = moveWest();
					break;
				}
			
			else if (letter == 'b') 
				switch(getFacing(facing)){
				case "N": 
					pos_y--;
					break;
				case "E": 
					pos_x--;
					break;
				case "S": 
					pos_y++;
					break;
				case "W": 
					pos_y++;
					break;
				}
			else if (letter == 'r')
				facing++;
			else if (letter == 'l')
				facing--;
		}
		
		position = "(" + pos_x + "," + pos_y + "," + getFacing(facing) + ")";
		
		return position;
	}

	private String getFacing(int direction){
		
		String facing = "";
		
		switch (direction){
			case 0:
				facing = "N";
				break;
			case 1:
				facing = "E";
				break;
			case 2:
				facing = "S";
				break;
			case 3:
				facing = "W";
				break;
		}	
		return facing;
	}
	
	private int moveNorth(int pos_y){
		if(pos_y < this.y-1)
			return pos_y++;
		else
			return 0;
	}
	private int moveEast(){
		return 0;
	}
	private int moveSouth(){
		return 0;
	}
	private int moveWest(){
		return 0;
	}
}
