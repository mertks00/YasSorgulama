public class Soru {

    public void sorgu() {

        int yas = 465;

        if (yas >= 18) {

            String msg = "Geçtiniz";

            System.out.println(msg);

        } else {

            String msg = "Geçemediniz";

            if (yas < 18) {

                System.out.println(msg);

            }

        }
    }
}
