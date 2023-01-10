class EnKKUStudent extends KKUStudent {
    protected int gearNumber;

    EnKKUStudent() {
        super();
    }

    EnKKUStudent(String name) {
        super(name);
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int newGearNumber) {
        gearNumber = newGearNumber;
    }

    public String toString() {
        return name + " is a KKU Engineering student with gear number as " +
        gearNumber + ".";
    }
}
