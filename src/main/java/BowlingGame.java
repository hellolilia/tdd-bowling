import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BowlingGame {


    public int calculate(String scoring) {

        List<Integer> scores = Stream.of(scoring.split(","))
                .map(s -> s.replaceAll("X", "10"))
                .map(s -> s.replaceAll("/", "99"))
                .map(s -> s.replaceAll(" ", "0"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int allPoints = 0;

        for (int i = 1; i < scores.size()-1; i++){
            if (scores.get(i) == 99){
                scores.set(i,10-scores.get(i-1));
                allPoints += scores.get(i+1);
            }
            if (scores.get(i) == 0){
                scores.set(i,88);
            }
        }

        scores = scores.stream().filter(n-> n!= 88).collect(Collectors.toList());

        for (int i = 0; i < scores.size()-2; i++) {
            if (scores.get(i) == 10) {
                allPoints += scores.get(i) + scores.get(i + 1) + scores.get(i + 2);
            } else {
                allPoints += scores.get(i);
            }
        }

        return allPoints;
    }
}