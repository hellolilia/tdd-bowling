import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BowlingGame {


    public int calculate(String scoring) {

        scoring = scoring.replaceAll("X", "10");
        List<Integer> scores = Stream.of(scoring.split(","))
                .filter(n -> !n.equals(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int allPoints = 0;
        for (int i = 0; i < scores.size()-2; i++){
            allPoints += scores.get(i) + scores.get(i+1) + scores.get(i+2);
        }

        return allPoints;
    }
}