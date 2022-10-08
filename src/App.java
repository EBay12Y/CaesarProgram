import java.util.Scanner;

public class App {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan plain text : ");
    String plaintext = input.nextLine();
    System.out.print("Masukkan nilai berupa angka untuk menggeser plaintext : ");
    int geser = input.nextInt();

    String ciphertext = "";
    char alphabet;

    for (int i = 0; i < plaintext.length(); i++) {
      alphabet = plaintext.charAt(i);
      if (alphabet >= 'a' && alphabet <= 'z') {
        alphabet = (char) (alphabet + geser);
        if (alphabet > 'z') {
          alphabet = (char) (alphabet + 'a' - 'z' - 1);
        }
        ciphertext = ciphertext + alphabet;
      } else if (alphabet >= 'A' && alphabet <= 'Z') {
        alphabet = (char) (alphabet + geser);
        if (alphabet > 'Z') {
          alphabet = (char) (alphabet + 'A' - 'Z' - 1);
        }
        ciphertext = ciphertext + alphabet;
      } else {
        ciphertext = ciphertext + alphabet;
      }
    }
    System.out.println();
    System.out.println("================== Hasil =================");
    System.out.println();
    System.out.println("Plain text : " + plaintext);
    System.out.println("Ciphertext : " + ciphertext);
    System.out.println();
  }
}