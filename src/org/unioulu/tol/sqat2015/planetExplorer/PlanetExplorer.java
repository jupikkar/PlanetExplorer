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
		
		int pos_x = 0;
		int pos_y = 0;
		int facing = 0;
		
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
				switch(facing){
				case 0:
					if (pos_y < this.y-1)
						pos_y++;
					else
						pos_y = 0;
					break;
				case 1: 
					if (pos_x < this.y-1)
						pos_x++;
					else
						pos_x = 0;
					break;
				case 2: 
					if (pos_y > 0)
						pos_y--;
					else
						pos_y = this.y-1;
					break;
				case 3: 
					if (pos_x > 0)
						pos_x--;
					else
						pos_x = this.x-1;
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
				if (facing < 3)
					facing++;
				else
					facing = 0;
			
			else if (letter == 'l')
				if (facing > 0)
					facing--;
				else
					facing = 3;
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
	
	public String getCurrentPosition(){
		return "";
	}
}
