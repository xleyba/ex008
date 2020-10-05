package net.javier;

public class UnivalTreeCount {

    boolean isUnival;

    int count;

    public UnivalTreeCount(boolean isUnival, int count) {
        this.isUnival = isUnival;
        this.count = count;
    }

    public boolean isUnival() {
        return isUnival;
    }

    public void setUnival(boolean unival) {
        isUnival = unival;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
