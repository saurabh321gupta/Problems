import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws IOException {
        char[][] board = {{'s', 'o', 's', 'o'},
                          {'s', 'o', 'o', 's'},
                          {'s', 's', 's', 's'}};
        System.out.println(wordCount(board, "sos"));
    }

        private static int wordCount ( char[][] board, String word){

            int r = board.length;
            int c = board[0].length;
            int count = 0;
            for (int i = 0; i < r; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < c; j++) {
                    sb.append(board[i][j]);
                }
                count += (sb.toString().split(word, -1).length - 1);
            }

            for (int i = 0; i < c; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < r; j++) {
                    sb.append(board[j][i]);
                }
                count += (sb.toString().split(word, -1).length - 1);
            }

            for (int i = 0; i < c; i++) {
                int x = i;
                StringBuilder sb = new StringBuilder();
                int j = i;
                while (j < r && x < c) {
                    sb.append(board[j++][x++]);
                }
                count += (sb.toString().split(word, -1).length - 1);
            }

            for (int i = 0; i < r; i++) {
                int x = i;
                StringBuilder sb = new StringBuilder();
                int j = i;
                while (j < c && x < r) {
                    sb.append(board[x++][j++]);
                }
                count += (sb.toString().split(word, -1).length - 1);
            }
            return count;
        }
    }
