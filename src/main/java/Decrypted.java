import java.util.Scanner;

public class Decrypted {

    public static void main(String[] args) {
        System.out.println("1. Encryption\n2.Decryption\nChoose(1,2):");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        String decryptMsg = null;
        if (choice == 2) {
            System.out.println("Decryption");
            in.nextLine();

            System.out.println("Message can only be lower case or uppercase alphabet");
            System.out.print("Enter encrypted Message : ");
            String encryptedMsg = in.nextLine();

            System.out.println("Enter key (0-25):");
            int decryptkey = in.nextInt();

            decryptMsg = "";

            for (int i = 0; i < encryptedMsg.length(); i++) {
//                    casting char to int
                if ((int) encryptedMsg.charAt(i) == 32) {
                    decryptMsg += (char) 32;

                } else if (((int) encryptedMsg.charAt(i) - decryptkey) < 97 && ((int) encryptedMsg.charAt(i) - decryptkey) > 90) {
                    int temp = ((int) encryptedMsg.charAt(i) - decryptkey) + 26;
                    decryptMsg += (char) temp;

                } else if ((encryptedMsg.charAt(i) - decryptkey) < 65) {
                    int temp = ((int) encryptedMsg.charAt(i) - decryptkey) + 26;
                    decryptMsg += (char) temp;

                } else {
                    decryptMsg += (char) ((int) encryptedMsg.charAt(i) - decryptkey);

                }
            }


        }
        System.out.println(decryptMsg);

    }
}