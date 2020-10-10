import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_0_when_all_frames_are_0_points(){
        BowlingGame bowlingScore = new BowlingGame();
        int result = bowlingScore.calculate("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0");
        assertEquals(0,result);
    }

    @Test
    void should_return_300_when_all_frames_are_strike(){
        BowlingGame bowlingScore = new BowlingGame();
        int result = bowlingScore.calculate("X, ,X, ,X, ,X, ,X, ,X, ,X, ,X, ,X, ,X,10,10");
        assertEquals(300,result);
    }

    @Test
    void should_return_right_bowling_scoring_when_last_frame_is_strike(){
        BowlingGame bowlingScore = new BowlingGame();
        int result = bowlingScore.calculate("9,/,X, ,8,1,X, ,X, ,7,/,5,4,X, ,X, ,X,8,0");
        assertEquals(195,result);
    }

    @Test
    void should_return_right_bowling_scoring_when_last_frame_is_spare(){
        BowlingGame bowlingScore = new BowlingGame();
        int result = bowlingScore.calculate("7,0,8,/,9,/,X, ,8,0,X, ,X, ,X, ,8,/,9,/,8");
        assertEquals(187,result);
    }

    @Test
    void should_return_right_bowling_scoring_when_last_frame_is_not_spare_or_strike(){
        BowlingGame bowlingScore = new BowlingGame();
        int result = bowlingScore.calculate("3,/,7,0,5,2,5,3,1,5,7,0,8,0,9,0,6,0,6,1,0");
        assertEquals(82,result);
    }
}
