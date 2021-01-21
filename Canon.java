public class Canon {

    public boolean fire(int i, int j, Board board) {
        boolean isHit = false;
        int indexI = i - 1;
        int indexJ = j - 1;
        char bt = board.getChar(indexI, indexJ);

        if (bt == 'O' || bt == 'X') {
            isHit = true;

            board.setChar(indexI, indexJ, 'X');
        } else {
            //System.out.println("Sploosh!");
            board.setChar(indexI, indexJ, '.');
        }
        return isHit;
    }

    public boolean checkNear(int i, int j, Board board) {
        boolean isNear = false;
        int indexI = i - 1;
        int indexJ = j - 1;
        int leftI = indexI, leftJ = indexJ - 1;
        int rightI = indexI, rightJ = indexJ + 1;
        int aboveI = indexI - 1, aboveJ = indexJ;
        int belowI = indexI + 1, belowJ = indexJ;
        if ((leftJ >= 0 && board.getChar(leftI, leftJ) == 'O') || (rightJ <= board.getColMaxIndex() && board.getChar(rightI, rightJ) == 'O')
                || (aboveI >= 0 & board.getChar(aboveI, aboveJ) == 'O')
                || (belowI <= board.getRowMaxIndex() && board.getChar(belowI, belowJ) == 'O')) {
            isNear = true;

        }

        return isNear;

    }

}
