import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Matchmaking {
    //initialize a counter for keeping track of how many matches have been calculated with their qualities
    private static int calculatedMatches = 0;

    public static void main(String[] args) throws IOException {
        //prepare input reader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //get value of m (team size)
        int m = Integer.parseInt(bf.readLine());
        //prepare list of player containing player details such as name and score
        List<Player> playerList = new ArrayList<>();
        String str = bf.readLine();
        while (str != null && !str.isEmpty()) {
            String strNum[] = str.split("\\s");
            playerList.add(new Player(strNum[0], Double.parseDouble(strNum[1])));
            str = bf.readLine();
        }
        //initialize n which is number of available players which may exceed 2*m
        int n = playerList.size();
        //convert list to array
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++)
            players[i] = playerList.get(i);

        //initialize an array to keep track of calculated factorials
        int factorials[] = new int[n + 1];
        //calculate and store factorials upto n
        calcAndStoreFactorial(n, factorials);
        //calculate number of possible teams which is n C m
        int possibleTeamsCount = factorials[n] / (factorials[m] * factorials[n - m]);
        //calculate number of possible matches which would be possibleTeamsCount C 2
        int matchCount = (possibleTeamsCount * (possibleTeamsCount - 1)) / 2;
        //initialize result array which will hold matches in ascending order of their quality value (lesser quality value means good quality)
        Match[] result = new Match[matchCount];
        //calculateCombinations and further calculate matches for them
        calculateCombinations(players, n, m, result);
        //print the matches
        printResult(result);
    }

    private static int calcAndStoreFactorial(int n, int[] factorials) {
        if (n == 0)
            return 1;
        int value = n * calcAndStoreFactorial(n - 1, factorials);
        factorials[n] = value;
        return value;
    }

    private static void printResult(Match[] result) {
        for (Match match : result) {
            System.out.println(match.matchDetail);
        }
    }

    static void calculateCombinations(Player players[], int n, int m, int index,
                                      int data[], int i, Match[] result, List<Team> teams) {
        if (index == m) {
            StringBuilder sb = new StringBuilder();
            Double avgScore = 0.0;
            for (int j = 0; j < m; j++) {
                Player player = players[data[j]];
                avgScore += player.score;
                sb.append(player.name + ",");
            }
            avgScore /= m;
            //add a combination to teams and calculate matches for it
            addTeamAndCalculateMatches(teams, new Team(sb.substring(0, sb.length() - 1), avgScore), result);
            return;
        }

        // When no more elements are there to put in data[]
        if (i >= n)
            return;

        // current is included, put next at next location
        data[index] = i;
        calculateCombinations(players, n, m, index + 1, data, i + 1, result, teams);
        // current is excluded, replace it with next (Note that i+1 is passed, but index is not changed)
        calculateCombinations(players, n, m, index, data, i + 1, result, teams);

    }

    private static void addTeamAndCalculateMatches(List<Team> teams, Team team, Match[] result) {
        for (Team x : teams) {
            //calculate the quality (lesser quality value means good quality)
            double quality = Math.abs(team.avgScore - x.avgScore);
            //prepare matchDetail in defined output style
            String matchDetail = team.combination + " (" + team.avgScore + ") vs " + x.combination + " (" + x.avgScore + ")";
            //add match to result array in ascending order of their quality (lesser quality value means good quality)
            addMatch(result, new Match(matchDetail, quality));
            //increase calculatedMatches counter
            calculatedMatches++;
        }
        teams.add(team);
    }

    static void calculateCombinations(Player players[], int n, int m, Match[] result) {
        //initialize temp array to hold a combination detail
        int data[] = new int[m];
        //initialize team list to hold prepared teams
        List<Team> teams = new ArrayList<>();
        calculateCombinations(players, n, m, 0, data, 0, result, teams);
    }

    static void addMatch(Match[] result, Match match) {
        //using insertion sort to store matches in ascending order of their quality value
        int i = calculatedMatches - 1;
        while (i >= 0 && match.quality < result[i].quality) {
            result[i + 1] = result[i];
            i--;
        }
        result[i + 1] = match;
    }


}

//class containing player details
class Player {
    String name;
    Double score;

    public Player(String name, Double score) {
        this.name = name;
        this.score = score;
    }
}

//class containing Team details
class Team {
    String combination;
    Double avgScore;

    public Team(String combination, Double avgScore) {
        this.combination = combination;
        this.avgScore = avgScore;
    }
}

//class containing Match details
class Match {
    String matchDetail;
    Double quality;

    public Match(String matchDetail, Double quality) {
        this.matchDetail = matchDetail;
        this.quality = quality;
    }
}
