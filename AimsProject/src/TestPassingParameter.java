package hust.soict.cybersec.test.disc;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Bọc các đối tượng trong Wrapper
        Wrapper<DigitalVideoDisc> wrapper1 = new Wrapper<>(jungleDVD);
        Wrapper<DigitalVideoDisc> wrapper2 = new Wrapper<>(cinderellaDVD);

        // Correct swap() function
        swap(wrapper1, wrapper2);
        System.out.println("jungleDVD title: " + wrapper1.value.getTitle());
        System.out.println("cinderellaDVD title: " + wrapper2.value.getTitle());

        // Wrong swap() function
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

    }
    // Wrong swap() function
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    // Correct swap() function
    public static <T> void swap(Wrapper<T> w1, Wrapper<T> w2) {
        T temp = w1.value;
        w1.value = w2.value;
        w2.value = temp;
    }

    // Lớp Wrapper dùng để bọc đối tượng
    class Wrapper<T> {
        public T value;

        public Wrapper(T value) {
            this.value = value;
        }
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    
}