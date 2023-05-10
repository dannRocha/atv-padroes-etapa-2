package patterns.q7.observer.impl;

import patterns.q7.model.BingoCard;
import patterns.q7.observer.Observable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class BingSystemObserver implements Observable<BingoCard> {
    private final int id;
    private final int numberOfSlots;
    private final int maxNumber;
    private Set<BingoCard> registers = new HashSet<>();
    private int currentNumber = 0;

    private List<Integer> range;

    private Boolean thereAreWinners = false;


    public BingSystemObserver(int id, int numberOfSlots, int maxNumber) {
        this.id = id;
        this.numberOfSlots = numberOfSlots;
        this.maxNumber = maxNumber;

        range = new ArrayList<>();

        for(int i = 1; i <= maxNumber; i++) {
            range.add(i);
        }
    }

    public void runBingoSystemWhileWinnerNotFound() {
        while(!range.isEmpty() && !thereAreWinners) {
            registerNumber(getNextSortedNumber());
        }
    }

    Random random = new Random();
    public Integer getNextSortedNumber() {
        return range.remove((int) ((random.nextFloat() * range.size()) % range.size()));
    }

    @Override
    public void subscribe(BingoCard listener) {
        registers.add(listener);
    }

    @Override
    public void unsubscribe(BingoCard listener) {
        registers.removeIf(it -> it.getId() == listener.getId());
    }

    public void registerNumber(int number) {
        this.currentNumber = number;
        System.out.println(number);
        notifyEvery();
    }

    @Override
    public void notifyEvery() {
        registers.forEach(it -> {
            try {
                it.update(currentNumber);
            }catch (Exception e) {
                thereAreWinners = true;
            }
        });
    }

    public String findWinnerBingoCard() {
        return registers
                .stream()
                .filter(BingoCard::isWinner)
                .collect(Collectors.toList())
                .toString();
    }
}
