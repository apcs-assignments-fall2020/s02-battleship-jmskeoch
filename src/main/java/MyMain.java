public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if(board[row][col] == true) {System.out.println("There was a hit!"); return true;} else {return false;}
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if(direction.equals("right")) {
            for(int i = 0; i < boatLength; i++) {
                board[row][i + col] = true;
            }
        }
        if(direction.equals("down")) {
            for(int i = 0;  i < boatLength; i++) {
                board[i + row][col] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[0].length-1; j++) {
                if (!(words[i][j].length() < words[i][j+1].length())) {
                    return false;
                }
                if (!(words[i][j].charAt(0) < words[i][j+1].charAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //misc
    }
}
