// Overciew.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <vector>


using namespace std;

int main()
{
	vector<int> vec;
	vec.push_back(4);
	vec.push_back(1);
	vec.push_back(8); // vec : {4,1,8}

	vector<int>::iterator itr1 = vec.begin(); //half-open: [begin,end)
	vector<int>::iterator itr2 = vec.end();

	for (vector<int>::iterator itr = itr1; itr != itr2; ++itr)
	{
		cout << *itr << " "; //Prints out: 4 1 8
	}
	
	cout << *vec.end() << endl; // Ouch

	

	cin.get();
    return 0;
}

