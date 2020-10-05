package net.javier;

public class UnivaTreeCount {

        boolean isUnival;

        int count;

        public UnivaTreeCount(boolean isUnival, int count) {
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
