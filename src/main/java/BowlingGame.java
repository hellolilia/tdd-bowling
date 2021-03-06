import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BowlingGame {

    int Strike = 100;
    int Spare = 200;

    public int calculate(String scoring) {

        List<Integer> scores = Stream.of(scoring.split(","))
                .map(s -> s.replaceAll("X", "10"))
                .map(s -> s.replaceAll("/", Integer.toString(Spare)))
                .map(s -> s.replaceAll(" ", Integer.toString(Strike)))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int allPoints = 0;

        scores = scores.stream().filter(n-> n!= Strike).collect(Collectors.toList());

        for (int i = 0; i < scores.size() - 1; i++) {
            if (scores.get(i) == Spare) {
                scores.set(i, 10 - scores.get(i - 1));
                allPoints += scores.get(i + 1);
            }
        }

        for (int i = 0; i < scores.size() - 1; i++) {
            if (scores.get(i) == 10) {
                allPoints += scores.get(i) + scores.get(i + 1) + scores.get(i + 2);
                if(i == scores.size() - 3){
                    break;
                }
            } else {
                allPoints += scores.get(i);
            }
        }

        return allPoints;
    }
}