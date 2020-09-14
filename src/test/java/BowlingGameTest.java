import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_0_when_all_frames_are_0_points(){
        BowlingGame bowlingpoints = new BowlingGame();
        int result = bowlingpoints.calculate(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(0,result);


    }
}
