package CeaserCipher;

import static org.junit.Assert.*;

import org.junit.Test;

public class CeaserCipherEncryptionTest {

	// Encryption method for testing both uppercase and lowercase letters
	@Test
	public void test1() {
		assertEquals("Ekdjbd!", CeaserCipherEncryption.encrypt("Bhagya!", 3));
	}

	// Decryption method for testing both uppercase and lowercase letters
	@Test
	public void test2() {
		assertEquals("Bhagya!", CeaserCipherEncryption.decrypt("Ekdjbd!", 3));

	}

	// Encryption method for testing numbers
	@Test
	public void test3() {
		assertEquals("1234!", CeaserCipherEncryption.encrypt("1234!", 3));
	}

	// Decryption method for testing numbers
	@Test
	public void test4() {
		assertEquals("1234!", CeaserCipherEncryption.decrypt("1234!", 3));

	}

	// Encryption method testing with all uppercase letters
	@Test
	public void test5() {
		assertEquals("EGCUCT EKRJGT", CeaserCipherEncryption.encrypt("CEASAR CIPHER", 2));
	}

	// Decryption method testing with all uppercase letters
	@Test
	public void test6() {
		assertEquals("CEASAR CIPHER", CeaserCipherEncryption.decrypt("EGCUCT EKRJGT", 2));

	}

	// Encryption method testing with all lowercase letters
	@Test
	public void test7() {
		assertEquals("egcuct ekrjgt", CeaserCipherEncryption.encrypt("ceasar cipher", 2));
	}

	// Decryption method testing with all lowercase letters
	@Test
	public void test8() {
		assertEquals("ceasar cipher", CeaserCipherEncryption.decrypt("egcuct ekrjgt", 2));

	}

	// Encryption method testing with special characters
	@Test
	public void test9() {
		assertEquals("*,%,#,%,@,!,(,),?", CeaserCipherEncryption.encrypt("*,%,#,%,@,!,(,),?", 2));
	}

	// Decryption method testing with special characters
	@Test
	public void test10() {
		assertEquals("*,%,#,%,@,!,(,),?", CeaserCipherEncryption.decrypt("*,%,#,%,@,!,(,),?", 2));

	}

}
