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
}
