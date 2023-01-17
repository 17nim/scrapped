import java.util.ArrayList;

abstract class EnKKUStudent22 {
    abstract void register();
}

class COEStudent22 extends EnKKUStudent22 {
    void register() {
        System.out.println("A COE student registers EN811301 and EN811302");
    }
}

class DMEStudent22 extends EnKKUStudent22 {
    void register() {
        System.out.println("A DME student registers EN843204 and EN843205");
    }
}

public class TestEnKKUStudent {
    public static void main(String[] args) {
        ArrayList<EnKKUStudent22> students = new ArrayList<EnKKUStudent22>();
        students.add(new COEStudent22());
        students.add(new DMEStudent22());

        for (int i = 0; i < students.size(); i++) {
            students.get(i).register();
        }
    }
}
