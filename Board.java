public class Board {
    private int size;
    private char ch[][];

    private int boatType1Size = 3;
    private int rowMaxIndex;
    private int colMaxIndex;


    public Board(int s) {
        size = s;
        ch = new char[s][s];
        initialize(size);
        rowMaxIndex = size - 1;
        colMaxIndex = size - 1;
    }

    public int getSize() {
        return size;
    }

    public int getRowMaxIndex() {
        return rowMaxIndex;
    }

    public int getColMaxIndex() {
        return colMaxIndex;
    }

    // Properties

    public char getChar(int i, int j) {
        return ch[i][j];
    }

    public void setChar(int i, int j, char c) {
        ch[i][j] = c;
    }

    public void clear(int i, int j) {
        ch[i][j] = ' ';
    }

    // Methods
    public void initialize(int length) {
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                ch[row][col] = ' ';
            }
        }
    }

    public void show() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("[ " + ch[row][col] + " ]  ");
            }
            System.out.println();
        }
    }

    //orient = v-vertical, h-horizontal
    boolean placeBoat(int i, int j, char orient) {
        orient = Character.toUpperCase(orient);
        if (orient == 'V') {
            if ((i + boatType1Size) > rowMaxIndex) {
                System.out.println("Warning! Outside the permitted interval. Can not place boat.");
                return false;
            } else {
                //check if boat already  exists at given place
                int currentRowIndex = i - 1, currentColIndex = j - 1;
                for (int index = 1; index <= boatType1Size; index++) {

                    if (getChar(currentRowIndex, currentColIndex) == 'O') {
                        System.out.println("Warning! already boat is placed at this position. Can not place new boat here");
                        return false;
                    }
                    currentRowIndex = currentRowIndex + 1;
                }

                //Now place boat vertically, increase row Index
                currentRowIndex = i - 1;
                currentColIndex = j - 1;
                for (int index = 1; index <= boatType1Size; index++) {
                    setChar(currentRowIndex, currentColIndex, 'O');
                    currentRowIndex = currentRowIndex + 1;
                }
            }
        } else if (orient == 'H') {
            if ((j + boatType1Size) > colMaxIndex) {
                System.out.println("Warning! Outside the permitted interval. Can not place boat.");
                return false;
            } else {
                //check if boat already  exists at given place
                int currentRowIndex = i - 1, currentColIndex = j - 1;
                for (int boatIndex = 1; boatIndex <= boatType1Size; boatIndex++) {
                    if (getChar(currentRowIndex, currentColIndex) == 'O') {
                        System.out.println("Warning! already boat is placed at this position. Can not place new boat here");
                        return false;
                    }
                    currentColIndex = currentColIndex + 1;

                }

                //Now place boat horizontally, increase row Index
                currentRowIndex = i - 1;
                currentColIndex = j - 1;
                for (int boatIndex = 1; boatIndex <= boatType1Size; boatIndex++) {
                    setChar(currentRowIndex, currentColIndex, 'O');
                    currentColIndex = currentColIndex + 1;
                }
            }
        } else {
            System.out.println("Warning! Invalid boat orientatation. Boat can not be placed");
            return false;
        }
        return true;

    }

    public void showFog() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // System.out.print("Char at " + row + "," + col + getChar(row, col));
                if (getChar(row, col) == 'O') {
                    System.out.print("[ " + " " + " ]  ");
                } else {
                    System.out.print("[ " + ch[row][col] + " ]  ");
                }
            }
            System.out.println();
        }
    }

}
