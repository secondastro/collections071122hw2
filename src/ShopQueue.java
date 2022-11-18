import java.util.*;

public class ShopQueue {

    private final Queue<String> cashBoxOne = new LinkedList<>();
    private final Queue<String> cashBoxTwo = new LinkedList<>();
    private Queue<String> cashBoxThree;


    public Queue<String> getCashBoxOne() {
        return cashBoxOne;
    }

    public Queue<String> getCashBoxTwo() {
        return cashBoxTwo;
    }

    public void add(String name) {
        try {
            if (cashBoxOne.size() == 5 && cashBoxTwo.size() == 5) {
                throw new IllegalStateException();
            } else {
                if (cashBoxTwo.size() >= cashBoxOne.size()) {
                    cashBoxOne.offer(name);
                } else {
                    cashBoxTwo.offer(name);
                }
            }
        } catch (IllegalStateException e) {
            if (cashBoxThree == null) {
                cashBoxThree = new ArrayDeque<>(5);
                cashBoxThree.offer(name);
            } else {
                if (cashBoxThree.size() <= 5) {
                    cashBoxThree.offer(name);
                } else {
                    try {
                        throw new IllegalStateException("ГААААЛЯЯЯЯЯЯ");
                    } catch (IllegalStateException ex) {
                        ex.getMessage();
                    }
                }
            }
        }
    }

    public void remove() {
        double d = Math.random();
        if (d <= 0.33) {
            cashBoxTwo.poll();
        } else if (d <= 0.66) {
            cashBoxOne.poll();
        } else {
            cashBoxThree.poll();
        }
    }

    @Override
    public String toString() {
        if (cashBoxThree == null || cashBoxThree.isEmpty()) {
            return "ShopQueue{" +
                    "cashBoxOne=" + cashBoxOne +
                    ", cashBoxTwo=" + cashBoxTwo;
        } else {
            return "ShopQueue{" +
                    "cashBoxOne=" + cashBoxOne +
                    ", cashBoxTwo=" + cashBoxTwo +
                    ", cashBoxThree=" + cashBoxThree;
        }
    }
}
