public class Switch {

    private int slant;
    private Coordinate coordinates;

    public Switch(int x, int y) {
        coordinates = new Coordinate(x, y);
    }

    private class Coordinate {
        private int x;
        private int y;
        public Coordinate(int x, int y) {}

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public int getSlant() {
        return slant;
    }

    public void setSlant(int slant) {
        this.slant = slant;
    }

    public void update() {

    }

    public void fillTime() {

    }
}
