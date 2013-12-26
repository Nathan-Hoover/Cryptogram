#include "StringConverter.h"
#include <iostream>
#include <iomanip>

using namespace std;
void game(StringConverter Question, int choice);
int menu();

int main(){
	int choice = 1;
	StringConverter objectArray[11];
	objectArray[0].dataStart("i hope you like this program i made for you ricki, i think it turned out pretty well");
	objectArray[1].dataStart("the date we went on together was amazing, atleast for me, i enjoyed being with you so much");
	objectArray[2].dataStart("so i bet you wonder what i put in these strings, you will just have to figure it out yourself");
	objectArray[3].dataStart("everytime i see you i think dang this girl is beautifu. i wish you could see yourself the way i see you ");
	objectArray[4].dataStart("sometimes people think they are good singers but you are more then a good singer. your voice shines with talent every note you hit.");
	objectArray[5].dataStart("the exorcist now has a weird place in my heart and mind thanks to you. it is quite funny if you think about it");
	objectArray[6].dataStart("thanks for being there for me during all my rough times. i gladly return the favor for all that you have done for me");
	objectArray[7].dataStart("you have reshaped what i look for in a relationship. the time i have had with you has been nothing less then amazing.");
	objectArray[8].dataStart("if you want to be my girlfriend i want to be your boyfriend. i wont push it but we have an wonderful thing going and who knows... it could get better");
	objectArray[9].dataStart("your encouragement towards what i do has helped build my confidence in the pursuit of being a better person. i can think you enough for you believing in me.");
	objectArray[10].dataStart("Hey there, Nathan! Are you any good at solving cryptograms? We shall see. P.S. You're neat.");
	while (choice != 0){
		choice = menu();
		game(objectArray[choice - 1], choice);
	}
}

void game(StringConverter Question, int choice){
	char replaceChar, replaceWith;
	system("Color fc");
	while (Question.getoriginalString() != Question.getchangedString()){
		system("cls");
		cout << "-------------------------------Ricki's Cryptogram-------------------------------";
		cout << "-----------------------------------Level " << setw(2) << choice << "-------------------------------------" << endl;
		cout << "\t\t\t    The Original Cryptogram" << endl;
		cout << Question.getconvertedString() << endl << endl;
		cout << "\t\t\t      Your Changed String" << endl;
		cout << Question.getchangedString() << endl << endl;
		cout << "Replace: ";
		cin >> replaceChar;
		cout << "With: ";
		cin >> replaceWith;
		Question.changeChar(replaceChar, replaceWith);
	}
	cout << "-------------------------------Ricki's Cryptogram-------------------------------";
	cout << "------------------------------------You Won------------------------------------" << endl;
	cout << "The Converted String: " << endl;
	cout << "\t" << Question.getconvertedString() << endl;
	cout << "Your Changed String: " << endl;
	cout << "\t" << Question.getchangedString() << endl;
	system("PAUSE");
}

int menu(){
	system("cls");
	system("Color fc");
	int choice;
	cout << "-------------------------------Ricki's Cryptogram-------------------------------";
	cout << "-------------------------------------Menu---------------------------------------" << endl;
	cout << "Type 0 to quit" << endl;
	cout << "What level would you like to do (1-10): ";
	cin >> choice;
	return choice;
}
