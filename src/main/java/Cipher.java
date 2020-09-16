import java.util.Scanner;

public class Cipher {


    public static void main(String[] args) {

        System.out.println("1. Encryption\n2.Decryption\nChoose(1,2):");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        String decryptMsg = null;
        if (choice == 1) {
            System.out.println("Encryption");
            in.nextLine();

            System.out.println("Message can only be lower case or uppercase alphabet");
            System.out.print("Enter  Message : ");
            String msg = in.nextLine();

            System.out.print("Enter key (0-25):");
            int key = in.nextInt();

            String encryptMsg = "";

            for (int i = 0; i < msg.length(); i++) {
//                    casting char to int
                if ((int) msg.charAt(i) == 32) {
                    encryptMsg += (char) 32;

                } else if ((int) msg.charAt(i) + key > 122) {
                    int temp = ((int) msg.charAt(i) + key) - 122;
                    encryptMsg += (char) (96 + temp);

                } else if ((int) msg.charAt(i) + key > 90 && (int) msg.charAt(i) < 96) {
                    int temp = ((int) msg.charAt(i) + key) - 90;
                    encryptMsg += (char) (64 + temp);

                } else {
                    encryptMsg += (char) ((int) msg.charAt(i) + key);

                }
            }

            System.out.println(encryptMsg);

        }

    }
}
//        "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";