
public class Check {
	public static boolean checkWinner(int x,int y,int[][] board){
		
		for(int i=0;i<x;i++ ){
			if(board[i][0]==board[i][1] && board[i][1]==board[i][2] ){
				System.out.println("row:"+i+1+" matched"+board[i][0]+board[i][1]+board[i][2] );
			return true;
			}
		}
		for(int i=0;i<y;i++ ){
			if(board[0][i]==board[1][i] && board[2][i]==board[0][i] ){
				System.out.println("col:" +i+1+" matched"+board[0][i]+board[1][i]+board[2][i] );
				return true;
			}
		}
		if(board[0][0]==board[1][1] && board[2][2]==board[0][0]){
			System.out.println("main dig matched"+board[0][0]+board[1][1]+ board[2][2] );
			return true;
		}
		if(board[0][2]==board[1][1] && board[0][2]==board[2][0] ){
			System.out.println("dig matched"+board[0][2]+board[2][0]+board[1][1] );
			return true;
		}
		return false;
	}
	
}
