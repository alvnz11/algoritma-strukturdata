public class Klub {
    String nama;
    int win, lose, diff;
    int point, match;

    Klub(String nama, int win, int lose, int diff) {
        this.nama = nama;
        this.win = win;
        this.lose = lose;
        this.diff = diff;
        this.point = (win * 2) + lose;
        this.match = win + lose;
    }
}
