package patterns.q7;

import patterns.q7.model.BingoCard;
import patterns.q7.observer.impl.BingSystemObserver;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var bingoSystem = new BingSystemObserver(1, 10, 10);


        var bingoCardgroup = List.of(
                new BingoCard(new Random().nextInt(), List.of(1, 2, 3, 4)),
                new BingoCard(new Random().nextInt(), List.of(5, 6, 7, 8)),
                new BingoCard(new Random().nextInt(), List.of(9, 10, 1, 2)),
                new BingoCard(new Random().nextInt(), List.of(5, 6, 1, 2)),
                new BingoCard(new Random().nextInt(), List.of(2, 4, 6, 8)),
                new BingoCard(new Random().nextInt(), List.of(1, 3, 5, 7))

        );

        bingoCardgroup.forEach(it -> {
            bingoSystem.subscribe(it);
        });

        bingoSystem.runBingoSystemWhileWinnerNotFound();

        System.out.println(bingoSystem.findWinnerBingoCard());
    }
}
