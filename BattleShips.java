import java.util.Scanner;

public class BattleShips {

    public static void main(String[] args) {

        System.out.println("Place Boats for player1 on Board1");
        Board board1 = initialize();
        System.out.println("Boats are placed on Board1 !!!!!!!!!!!!!!!!");
        System.out.println("Now Place Boats for player2 on Board2");
        Board board2 = initialize();
        System.out.println("Boats are placed on Board 2 !!!!!!!!!!!!!!!!");
        System.out.println("Staring the game....");

        boolean winnerDecided = false;

        while (!winnerDecided) {
            System.out.println("It's turn of  player1");
            turn(board1);
            //check if board1  is winner
            if (checkWinner(board1)) {
                //winner is decided so exit;
                winnerDecided = true;
                System.out.println("Player 1 is Winner !!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }

            System.out.println("It's turn of  player 2");
            turn(board2);
            //check if board2 is winner
            if (checkWinner(board2)) {
                //winner is decided so exit;
                winnerDecided = true;
                System.out.println("Player 2 is Winner !!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }

        }



    }

    private static boolean turn(Board target) {
        Canon cn = new Canon();

        target.showFog();
        System.out.println("Enter two coordinates where you want to shoot!");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        boolean isHit = cn.fire(row, col, target);
        if (isHit) {
            System.out.println("Kaboom!");
        } else {
            System.out.println("Sploosh!");
            if (cn.checkNear(row, col, target)) {
                System.out.println("... But it was a close one!");
            }
        }
        target.showFog();
        if (isHit && !checkWinner(target)) {
            System.out.println("Your turn Again");
            isHit = turn(target);
        }
        return isHit;
    }

    private static Board initialize() {
        Board board = new Board(7);
        int numOfBoatPlaced = 0, totalBoats = 2;
        while (numOfBoatPlaced < totalBoats) {
            System.out.println("Enter two coordinates to place boat!");
            Scanner scan = new Scanner(System.in);
            int row = scan.nextInt();
            int col = scan.nextInt();
            System.out.println("Do you want to place Vertically(v) or Horizontally(h)?");
            scan = new Scanner(System.in);
            String orient = scan.nextLine();
            orient = orient.trim();
            boolean boatPlaced = board.placeBoat(row, col, orient.charAt(0));
            if (boatPlaced) {
                numOfBoatPlaced = numOfBoatPlaced + 1;
            }
        }
        return board;
    }

    private static boolean checkWinner(Board board) {

        int boardSize = board.getSize();
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                // 'O' represent boat position so if that exist then no sink
                if (board.getChar(row, col) == 'O') {
                    return false;
                }
            }
        }
        return true;
    }

}
