package ss8_cleancode_refactoring.bai_tap;

public class TennisGame {
    public static final String POINTS_NAME_LOVE = "Love";
    public static final String POINTS_NAME_FIFTEEN = "Fifteen";
    public static final String POINTS_NAME_THIRTY = "Thirty";
    public static final String POINTS_NAME_FORTY = "Forty";
    public static final String POINTS_NAME_DEUCE = "Deuce";
    public static final String POINTS_NAME_ALL = "All";

    public static final int POINTS_VALUE_LOVE = 0;
    public static final int POINTS_VALUE_FIFTEEN = 1;
    public static final int POINTS_VALUE_THIRTY = 2;
    public static final int POINTS_VALUE_FORTY = 3;

    public static String tieScore(int scorePlayer) {
        String score;
        switch (scorePlayer) {
            case POINTS_VALUE_LOVE:
                score = POINTS_NAME_LOVE + POINTS_NAME_ALL;
                break;
            case POINTS_VALUE_FIFTEEN:
                score = POINTS_NAME_FIFTEEN + POINTS_NAME_ALL;
                break;
            case POINTS_VALUE_THIRTY:
                score = POINTS_NAME_THIRTY + POINTS_NAME_ALL;
                break;
            case POINTS_VALUE_FORTY:
                score = POINTS_NAME_FORTY + POINTS_NAME_ALL;
                break;
            default:
                score = POINTS_NAME_DEUCE;
                break;
        }
        return score;
    }

    public static String advantagePlayer(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusScore = scorePlayer1 - scorePlayer2;
        if (minusScore == 1) score = "Advantage player1";
        else if (minusScore == -1) score = "Advantage player2";
        else if (minusScore >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String underDeuce(int scorePlayer1, int scorePlayer2) {
        int tempScore;
        StringBuilder score = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score.append("-");
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case POINTS_VALUE_LOVE:
                    score.append(POINTS_NAME_LOVE);
                    break;
                case POINTS_VALUE_FIFTEEN:
                    score.append(POINTS_NAME_FIFTEEN);
                    break;
                case POINTS_VALUE_THIRTY:
                    score.append(POINTS_NAME_THIRTY);
                    break;
                case POINTS_VALUE_FORTY:
                    score.append(POINTS_NAME_FORTY);
                    break;
            }
        }
        return score.toString();
    }

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score;
        if (scorePlayer1 == scorePlayer2) {
            score = tieScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = advantagePlayer(scorePlayer1, scorePlayer2);
        } else {
            score = underDeuce(scorePlayer1, scorePlayer2);
        }
        return score;
    }
}
