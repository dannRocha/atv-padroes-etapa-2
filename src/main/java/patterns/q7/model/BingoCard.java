package patterns.q7.model;

import patterns.q7.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class BingoCard implements Observer<Integer> {

    private final int id;
    private final List<Integer> numbers;
    private final List<Integer> origin;

    public BingoCard(int id, List<Integer> numbers) {
        this.id = id;
        this.numbers = new ArrayList<>(numbers);
        this.origin = new ArrayList<>(numbers);
    }

    @Override
    public void update(Integer content) {
        verifyBingoCard(content);
    }

    private void verifyBingoCard(Integer number) {
        numbers.remove(number);

        if(isWinner()) {
            throw new RuntimeException();
        }
    }

    public int getId() {
        return id;
    }

    public List<Integer> getOrigin() {
        return origin;
    }

    public boolean isWinner() {
        return numbers.isEmpty();
    }

    @Override
    public String toString() {
        return "BingoCard{" +
                "id=" + id +
                ", origin=" + origin +
                '}';
    }
}
