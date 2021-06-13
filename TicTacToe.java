package tictactoe1;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char[][] gameBoard =  {{'1','|','2','|','3'}, 
                            {'-','+','-','+','-'}, 
                            {'4','|','5','|','6'},
                            {'-','+','-','+','-'},
                            {'7','|','8','|','9'}};
     printGameBoard(gameBoard);
    
    while(true) {  
	   Scanner in = new Scanner(System.in);
	   
	   System.out.println("ENTER YOUR PLACEMENT FROM (1-9):");
	   
	   System.out.println("Player 1 its your turn:");
	   
	   int playerPos = in.nextInt();
     System.out.println(playerPos);
     
     getGameBoardValue(gameBoard,playerPos,"player");
     
     printGameBoard(gameBoard);
    
     System.out.println("Player2 its your turn:");
      int playerPos2 = in.nextInt();
    getGameBoardValue(gameBoard,playerPos2,"player2");
     
    printGameBoard(gameBoard);
	}
	
	}
	
	
	
	public static void printGameBoard(char[][] gameBoard) {
             for(char[] row : gameBoard) {
              System.out.println(row);
             }
             System.out.println();
        }
	public static void getGameBoardValue(char[][] gameBoard,int playerPos,String user) {
		
		
		char symbol = 'X' ;
		if (user.equals("player")){
			symbol = 'X';		
		}
		else if(user.equals("player2")) {
			symbol = '0';
		}
		switch(playerPos){
	      
	     case 1 : 
	    	 gameBoard [0][0] = symbol;
	    	 break;
	     
	     case 2 : 
	    	 gameBoard [0][2]=symbol;
	    	 break;
	    	
	     case 3 : 
	    	 gameBoard [0][4]=symbol;
	    	 break;
	    	 
	     case 4 : 
	    	 gameBoard [2][0]=symbol;
	    	 break;
	    	 
	     case 5 : 
	    	 gameBoard [2][2]=symbol;
	    	 break;
	    	 
	     case 6 : 
	    	 gameBoard [2][4]=symbol;
	    	 break;
	    	 
	     case 7 : 
	    	 gameBoard [4][0]=symbol;
	    	 break;
	    	 
	     case 8 : 
	    	 gameBoard [4][2]=symbol;
	    	 break;
	    	 
	     case 9: 
	    	 gameBoard [4][4]=symbol;
	    	 break;
	        
	     default:
	    	 break;
	    	 
	     }
	}
	public static void checkWinner() {
    
		
			
		
	
			
		}
	}
	



