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
    }
}
