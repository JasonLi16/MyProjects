package application;
/**
 * 
 * @author Jason Li
 *
 */
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		
		//Make sure the string is within the upperbound, if it is, return true.
		//Make sure the string is within the lowerbound, if it is, return true.
		for (int j = 0; j < plainText.length(); j++) {
			if (plainText.charAt(j) > UPPER_BOUND || plainText.charAt(j)  < LOWER_BOUND ) 
				
				return false;
			
		}
		
		//If the string is within these bounds, just return true. 
				return true;
	}
				
			
	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		String encryptedCode = "";
		char output;
		for(int j = 0; j<plainText.length(); j++) {
			output = (char)(plainText.charAt(j) +key);
			
			while(output > UPPER_BOUND) {
				output -= RANGE;
				}
			encryptedCode += output;
			
		}
		return encryptedCode;
}
					


	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		
		
		String encryptedCode = "";
		char cipher; 
		int output;
		for(int j = 0; j<plainText.length(); j++) {
			
				output = bellasoStr.charAt(j%bellasoStr.length());
				cipher = (char)(plainText.charAt(j)+output);
				while (cipher > UPPER_BOUND) {
					cipher -= RANGE;
				}
				encryptedCode += cipher;
		}
		return encryptedCode;
	}
	
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String decryptedCode = "";
		
		int output;
		for(int j = 0; j<encryptedText.length(); j++) {
			output = encryptedText.charAt(j) -key;
			
			while(output < LOWER_BOUND) {
				output += RANGE;
				}
			decryptedCode += (char)output;
			
		}
		return decryptedCode;
}

	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decryptedCode = "";
		int cipher; 
		int output;
		for(int j = 0; j<encryptedText.length(); j++) {
			
				output = bellasoStr.charAt(j%bellasoStr.length());
				cipher = encryptedText.charAt(j) -output;
				while (cipher < LOWER_BOUND) {
					cipher += RANGE;
				}
				decryptedCode += (char)cipher;
		}
		return decryptedCode;
	}
}