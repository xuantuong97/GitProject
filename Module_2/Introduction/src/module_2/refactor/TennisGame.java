package module_2.refactor;

public class TennisGame {
    public static final String DASH_CHAR = "-";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String ALL = "All";
    static String score = "";
    static int tempScore = 0;

    public static String getScore( int player1Score, int player2Score) {

        boolean isScoreEqual = player1Score == player2Score;
        boolean isScoreGreaterThan4 = player1Score >=4 || player2Score >=4;

        if (isScoreEqual)
        {
            equalScore(player1Score);
        }
        else if (isScoreGreaterThan4)
        {
            ScoreGreaterThan4(player1Score, player2Score);
        }
        else
        {
            otherScore(player1Score, player2Score);
        }
        return score;
    }

    static void equalScore( int playerScore){
        switch (playerScore)
        {
            case 0:
                score = LOVE + DASH_CHAR + ALL;
                break;
            case 1:
                score = FIFTEEN + DASH_CHAR + ALL;
                break;
            case 2:
                score = THIRTY + DASH_CHAR + ALL;
                break;
            case 3:
                score = FORTY + DASH_CHAR + ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
    }

    static void ScoreGreaterThan4(int player1Score, int player2Score){
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) {
            score = "Advantage player 1";
        }
        else if (minusResult == -1) {
            score = "Advantage player 2";
        }
        else if (minusResult >=2 ) {
            score = "Win for player 1";
        }
        else {
            score = "Win for player 2";
        }
    }

    static void otherScore (int player1Score, int player2Score){
        for (int i=1; i<3; i++)
        {
            if (i == 1) {
                tempScore = player1Score;
            }
            else {
                score += DASH_CHAR;
                tempScore = player2Score;
            }

            switch(tempScore)
            {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
                default:
                    break;
            }
        }
    }
}
