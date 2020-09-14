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

}
