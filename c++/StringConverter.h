#pragma once

#include <string>
#include <iostream>
#include <stdio.h>      
#include <stdlib.h>  
#include <time.h> 

using namespace std;

class StringConverter
{
public:
	StringConverter();
	string getchangedString();
	string getoriginalString();
	string getconvertedString();
	void dataStart(string inputString);
	char getRandomChar();
	void changeChar(char replaceChar, char replaceWith);
private:
	string convertedString;
	string originalString;
	string changedString;
	char randomChar[26];
	void convert();
	void createRandomArray();
	int charUsedChecker(char randomChar);
	char Switch(int i);
};

/**/