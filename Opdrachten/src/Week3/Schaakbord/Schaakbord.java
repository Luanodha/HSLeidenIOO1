package Week3.Schaakbord;

public class Schaakbord {

    // maken attributes
    static Schaakstuk[][] bord = new Schaakstuk[8][8];
    static String[][] legenda = new String[8][8];

    public Schaakbord() {
        maakNieuwBordOp();
        maakLegenda();
    }

    public void maakNieuwBordOp(){
        bord[0][0] = new Schaakstuk("Toren","zwart");
        bord[0][1] = new Schaakstuk("Paard","zwart");
        bord[0][2] = new Schaakstuk("Loper","zwart");
        bord[0][3] = new Schaakstuk("Koningin","zwart");
        bord[0][4] = new Schaakstuk("Koning","zwart");
        bord[0][5] = new Schaakstuk("Loper","zwart");
        bord[0][6] = new Schaakstuk("Paard","zwart");
        bord[0][7] = new Schaakstuk("Toren","zwart");

        bord[1][0] = new Schaakstuk("Pion","zwart");
        bord[1][1] = new Schaakstuk("Pion","zwart");
        bord[1][2] = new Schaakstuk("Pion","zwart");
        bord[1][3] = new Schaakstuk("Pion","zwart");
        bord[1][4] = new Schaakstuk("Pion","zwart");
        bord[1][5] = new Schaakstuk("Pion","zwart");
        bord[1][6] = new Schaakstuk("Pion","zwart");
        bord[1][7] = new Schaakstuk("Pion","zwart");

        bord[7][0] = new Schaakstuk("Toren","wit");
        bord[7][1] = new Schaakstuk("Paard","wit");
        bord[7][2] = new Schaakstuk("Loper","wit");
        bord[7][3] = new Schaakstuk("Koningin","wit");
        bord[7][4] = new Schaakstuk("Koning","wit");
        bord[7][5] = new Schaakstuk("Loper","wit");
        bord[7][6] = new Schaakstuk("Paard","wit");
        bord[7][7] = new Schaakstuk("Toren","wit");

        bord[6][0] = new Schaakstuk("Pion","wit");
        bord[6][1] = new Schaakstuk("Pion","wit");
        bord[6][2] = new Schaakstuk("Pion","wit");
        bord[6][3] = new Schaakstuk("Pion","wit");
        bord[6][4] = new Schaakstuk("Pion","wit");
        bord[6][5] = new Schaakstuk("Pion","wit");
        bord[6][6] = new Schaakstuk("Pion","wit");
        bord[6][7] = new Schaakstuk("Pion","wit");

    }

    public void maakLegenda() {

        legenda[0][0] = "A8";
        legenda[0][1] = "B8";
        legenda[0][2] = "C8";
        legenda[0][3] = "D8";
        legenda[0][4] = "E8";
        legenda[0][5] = "F8";
        legenda[0][6] = "G8";
        legenda[0][7] = "H8";
        legenda[1][0] = "A7";
        legenda[1][1] = "B7";
        legenda[1][2] = "C7";
        legenda[1][3] = "D7";
        legenda[1][4] = "E7";
        legenda[1][5] = "F7";
        legenda[1][6] = "G7";
        legenda[1][7] = "H7";
        legenda[2][0] = "A6";
        legenda[2][1] = "B6";
        legenda[2][2] = "C6";
        legenda[2][3] = "D6";
        legenda[2][4] = "E6";
        legenda[2][5] = "F6";
        legenda[2][6] = "G6";
        legenda[2][7] = "H6";
        legenda[3][0] = "A5";
        legenda[3][1] = "B5";
        legenda[3][2] = "C5";
        legenda[3][3] = "D5";
        legenda[3][4] = "E5";
        legenda[3][5] = "F5";
        legenda[3][6] = "G5";
        legenda[3][7] = "H5";
        legenda[4][0] = "A4";
        legenda[4][1] = "B4";
        legenda[4][2] = "C4";
        legenda[4][3] = "D4";
        legenda[4][4] = "E4";
        legenda[4][5] = "F4";
        legenda[4][6] = "G4";
        legenda[4][7] = "H4";
        legenda[5][0] = "A3";
        legenda[5][1] = "B3";
        legenda[5][2] = "C3";
        legenda[5][3] = "D3";
        legenda[5][4] = "E3";
        legenda[5][5] = "F3";
        legenda[5][6] = "G3";
        legenda[5][7] = "H3";
        legenda[6][0] = "A2";
        legenda[6][1] = "B2";
        legenda[6][2] = "C2";
        legenda[6][3] = "D2";
        legenda[6][4] = "E2";
        legenda[6][5] = "F2";
        legenda[6][6] = "G2";
        legenda[6][7] = "H2";
        legenda[7][0] = "A1";
        legenda[7][1] = "B1";
        legenda[7][2] = "C1";
        legenda[7][3] = "D1";
        legenda[7][4] = "E1";
        legenda[7][5] = "F1";
        legenda[7][6] = "G1";
        legenda[7][7] = "H1";
    }

    public int[] getArrayPosities(String code){
        int[] codeBord = new int[2];
        for (int i = 0; i < legenda.length ; i++) {
            for (int j = 0; j < legenda.length; j++) {
                if (legenda[i][j].equals(code));
                codeBord[0] = i;
                codeBord[1] = j;
                break;
            }
        }
        return codeBord;
    }

}
