public class IfStatements {
    static void main() {

        boolean somethingTrue = true;
        boolean somethingFalse = false;
        if (somethingTrue) {
            System.out.println("First true if statement prints");
        }
        if (somethingFalse) {
            System.out.println("False if statement doesn't print");
        }
        if (somethingTrue) {
            System.out.println("Second true if statement also prints");
        }

        if (somethingFalse) {
            System.out.println("First condition");
        } else if (somethingFalse) {
            System.out.println("Second condition");
        } else if (somethingTrue) {
            System.out.println("Third condition");
        } else if (somethingTrue) {
            System.out.println("Fourth condition");
        } else {
            System.out.println("Else block");
        }


        int temperatur = 8;
        if (temperatur < 10) {
            System.out.println("Wear a coat or sweater");
        } else {
            System.out.println("It's probably ok to wear a t-shirt");
        }

        //Hva skriver koden ut?
        int saldo = 80;
        if (saldo >= 100) {
            System.out.println("Du kan kjøpe varen");
        } else {
            System.out.println("Du har ikke nok penger");
        }
    }
}
