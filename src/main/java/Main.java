public class Main {

    public static void main(String[] args) {
        Randoms randoms = new Randoms()
                .addRandoms(100, 90);
        for (int r : randoms) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, я предлагаю на этом закончить!");
                break;
            }

        }
    }
}


