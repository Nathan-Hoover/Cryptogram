import java.lang.*;
import java.util.Random;

public class StringConverter{
	
	public StringBuilder convertedString = new StringBuilder();
	public StringBuilder originalString = new StringBuilder();
	public StringBuilder changedString = new StringBuilder();
	private char[] randomChar = new char[26];
	
	public StringConverter(){
		createRandomArray();
	}

	void dataStart(String inputString){
		originalString.append(inputString);
		convertedString.append(inputString);
		convert();
		changedString = convertedString;
	}

	String getchangedString(){
		return changedString.toString();
	}

	void createRandomArray(){
		for (int i = 0; i < 26; i++){
			char randomCharTest = ' ';
			int tester = 0;
			while (tester == 0){
				randomCharTest = getRandomChar();
				tester = charUsedChecker(randomCharTest);
			}
			randomChar[i] = randomCharTest;
		}
	}

	String getoriginalString(){
		return originalString.toString();
	}

	String getconvertedString(){
		return convertedString.toString();
	}
	
	char getRandomChar(){
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return c;
	}

	int charUsedChecker(char randomChartest){
		for (int i = 0; i < 26; i++){
			if (randomChar[i] == randomChartest){
				return 0;
			}
		}
		return 1;
	}

	void changeChar(char replaceChar, char replaceWith){
		for (int i = 0; i < convertedString.length(); i++){
			if (convertedString.charAt(i) == replaceChar){
				changedString.setCharAt(i, replaceWith);
			}
		}
	}

	void convert(){
		for (int i = 0; i < originalString.length(); i++){
			switch (originalString.charAt(i)){
			case 'a':
				convertedString.setCharAt(i, randomChar[0]);
				break;
			case 'b':
				convertedString.setCharAt(i, randomChar[1]);
				break;
			case 'c':
				convertedString.setCharAt(i, randomChar[2]);
				break;
			case 'd':
				convertedString.setCharAt(i, randomChar[3]);
				break;
			case 'e':
				convertedString.setCharAt(i, randomChar[4]);
				break;
			case 'f':
				convertedString.setCharAt(i, randomChar[5]);
				break;
			case 'g':
				convertedString.setCharAt(i, randomChar[6]);
				break;
			case 'h':
				convertedString.setCharAt(i, randomChar[7]);
				break;
			case 'i':
				convertedString.setCharAt(i, randomChar[8]);
				break;
			case 'j':
				convertedString.setCharAt(i, randomChar[9]);
				break;
			case 'k':
				convertedString.setCharAt(i, randomChar[10]);
				break;
			case 'l':
				convertedString.setCharAt(i, randomChar[11]);
				break;
			case 'm':
				convertedString.setCharAt(i, randomChar[12]);
				break;
			case 'n':
				convertedString.setCharAt(i, randomChar[13]);
				break;
			case 'o':
				convertedString.setCharAt(i, randomChar[14]);
				break;
			case 'p':
				convertedString.setCharAt(i, randomChar[15]);
				break;
			case 'q':
				convertedString.setCharAt(i, randomChar[16]);
				break;
			case 'r':
				convertedString.setCharAt(i, randomChar[17]);
				break;
			case 's':
				convertedString.setCharAt(i, randomChar[18]);
				break;
			case 't':
				convertedString.setCharAt(i, randomChar[19]);
				break;
			case 'u':
				convertedString.setCharAt(i, randomChar[20]);
				break;
			case 'v':
				convertedString.setCharAt(i, randomChar[21]);
				break;
			case 'w':
				convertedString.setCharAt(i, randomChar[22]);
				break;
			case 'x':
				convertedString.setCharAt(i, randomChar[23]);
				break;
			case 'y':
				convertedString.setCharAt(i, randomChar[24]);
				break;
			case 'z':
				convertedString.setCharAt(i, randomChar[25]);
				break;
			case ' ':
				convertedString.setCharAt(i, ' ');
				break;
			default:
				break;
			}
		}
	}
}