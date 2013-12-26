#include "StringConverter.h"

StringConverter::StringConverter()
{
	createRandomArray();
}

void StringConverter::dataStart(string inputString){
	originalString = inputString;
	convertedString = inputString;
	convert();
	changedString = convertedString;
}

string StringConverter::getchangedString(){
	return changedString;
}

void StringConverter::createRandomArray(){
	for (int i = 0; i < 26; i++){
		char randomCharTest;
		int tester = 0;
		while (tester == 0){
			randomCharTest = getRandomChar();
			tester = charUsedChecker(randomCharTest);
		}
		randomChar[i] = randomCharTest;
	}
}

string StringConverter::getoriginalString(){
	return originalString;
}

string StringConverter::getconvertedString(){
	return convertedString;
}
char StringConverter::getRandomChar(){
	char c;
	c = (rand() % 26) + 'a';
	return c;
}

int StringConverter::charUsedChecker(char randomChartest){
	for (int i = 0; i < 26; i++){
		if (randomChar[i] == randomChartest){
			return 0;
		}
	}
	return 1;
}

void StringConverter::changeChar(char replaceChar, char replaceWith){
	for (int i = 0; i < convertedString.length(); i++){
		if (convertedString[i] == replaceChar){
			changedString[i] = replaceWith;
		}
	}
}

void StringConverter::convert(){
	for (int i = 0; i < originalString.length(); i++){
		switch (originalString[i]){
		case 'a':
			convertedString[i] = randomChar[0];
			break;
		case 'b':
			convertedString[i] = randomChar[1];
			break;
		case 'c':
			convertedString[i] = randomChar[2];
			break;
		case 'd':
			convertedString[i] = randomChar[3];
			break;
		case 'e':
			convertedString[i] = randomChar[4];
			break;
		case 'f':
			convertedString[i] = randomChar[5];
			break;
		case 'g':
			convertedString[i] = randomChar[6];
			break;
		case 'h':
			convertedString[i] = randomChar[7];
			break;
		case 'i':
			convertedString[i] = randomChar[8];
			break;
		case 'j':
			convertedString[i] = randomChar[9];
			break;
		case 'k':
			convertedString[i] = randomChar[10];
			break;
		case 'l':
			convertedString[i] = randomChar[11];
			break;
		case 'm':
			convertedString[i] = randomChar[12];
			break;
		case 'n':
			convertedString[i] = randomChar[13];
			break;
		case 'o':
			convertedString[i] = randomChar[14];
			break;
		case 'p':
			convertedString[i] = randomChar[15];
			break;
		case 'q':
			convertedString[i] = randomChar[16];
			break;
		case 'r':
			convertedString[i] = randomChar[17];
			break;
		case 's':
			convertedString[i] = randomChar[18];
			break;
		case 't':
			convertedString[i] = randomChar[19];
			break;
		case 'u':
			convertedString[i] = randomChar[20];
			break;
		case 'v':
			convertedString[i] = randomChar[21];
			break;
		case 'w':
			convertedString[i] = randomChar[22];
			break;
		case 'x':
			convertedString[i] = randomChar[23];
			break;
		case 'y':
			convertedString[i] = randomChar[24];
			break;
		case 'z':
			convertedString[i] = randomChar[25];
			break;
		case ' ':
			convertedString[i] = ' ';
			break;
		default:
			' ';
		}
	}
}