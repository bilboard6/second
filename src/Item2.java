public final class Item2 implements Comparable<Item2> {
    private final String name;
    private final double price;

    public Item2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || ! (otherObject instanceof Item)) {
            return false;
        }

        Item2 item2 = (Item2) otherObject;

        if (Double.compare(item2.price, price) != 0) {
            return false;
        }
        return name.equals(item2.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode();
    }

    @Override
    public int compareTo(Item2 other) {
        if (other == null) {
            return 1;
        }
        int comparision = this.getName().compareTo(other.getName());
        if (comparision != 0) {
            return comparision;
        }
        return Double.compare(this.getPrice(), other.getPrice());
    }
}