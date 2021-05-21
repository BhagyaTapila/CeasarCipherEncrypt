package CeaserCipher;

import java.util.Scanner;

public class CeaserCipherEncryption {

	public static String encrypt(String message, int key) {
		char ch;
		String encryptedMessage = "";
		for (int i = 0; i < message.length(); ++i) {
			ch = message.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch + key);

				if (ch > 'z') {
					ch = (char) (ch - 'z' + 'a' - 1);
				}

				encryptedMessage += ch;
			} else if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + key);

				if (ch > 'Z') {
					ch = (char) (ch - 'Z' + 'A' - 1);
				}

				encryptedMessage += ch;
			} else {
				encryptedMessage += ch;
			}
		}

		System.out.println("The Encrypted Message = " + encryptedMessage);
		return encryptedMessage;
	}

	static String decrypt(String encryptedMessage, int key) {
		char ch;
		String decryptedMessage = "";
		for (int i = 0; i < encryptedMessage.length(); ++i) {
			ch = encryptedMessage.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - key);

				if (ch < 'a') {
					ch = (char) (ch + 'z' - 'a' + 1);
				}

				decryptedMessage += ch;
			} else if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch - key);

				if (ch < 'A') {
					ch = (char) (ch + 'Z' - 'A' + 1);
				}

				decryptedMessage += ch;
			} else {
				decryptedMessage += ch;
			}
		}

		System.out.println("The Decrypted Message = " + decryptedMessage);
		return decryptedMessage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message: ");
		String message = sc.nextLine();

		System.out.println("Enter key: ");
		int key = sc.nextInt();

		decrypt(encrypt(message, key), key);

	}
}