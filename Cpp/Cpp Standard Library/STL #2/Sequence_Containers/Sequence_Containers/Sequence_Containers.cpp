// Sequence_Containers.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <vector>
#include <deque>
#include <list>
#include <set>
#include <map>
#include <unordered_set>
#include <concurrent_unordered_map.h>
#include <iterator>
#include <algorithm>
#include <numeric>
#include <functional>
#include <iostream>
#include <Windows.h>
#include <time.h>

#define MAARA 5000


using namespace std;

int main()
{
	/*
		VECTOR
	*/

	vector<int> vec;	//vec.sieze() == 0
	vec.push_back(4);
	vec.push_back(1);
	vec.push_back(8); // vec : {4,1,8}; vec.size() == 3


	time_t aika;
	aika = time(NULL);

	srand((unsigned int)time(&aika));

	for (int i = 0; i < MAARA; i++)
	{

		vec.push_back((rand() % 100));

	}
	

	// Vector specific operations:
	cout << vec[2];	//8 (no range check)
	cout << vec.at(2);// (trow range_error exception of out range)
	
	//cout << vec.at(1000000); Trows error
	cout << endl << "------------------" << endl;


	//Calclating the time
	DWORD start, end;
	start = GetTickCount();
	
	//We can do this, but it is not recomended way.
	for (int i = 0; i < vec.size(); i++)
	{
		cout << vec[i] << " " << endl;
	}


	/* TABLE OF ITERATION SPEED WITH RANDOM ACCESS
	First try:	1437 millisekuntia
	Second try:	1563 millisekuntia
	Third try :	1469 millisekuntia
	*/

	end = GetTickCount();
	cout << "Käyetty aika " << (double)(end - start) << " millisekuntia käyttäen random access" << endl;

	cin.get();
	
	cout << endl << "------------------" << endl;

	//Calclating the time
	DWORD start2, end2;
	start2 = GetTickCount();
	//This is more recomended way, faster
	for (vector<int>::iterator itr = vec.begin(); itr != vec.end(); ++itr)
	{
		cout << *itr << " " << endl; 
	}

	/* TABLE OF ITERATION SPEED WITH USING ITERATOR
	First try:	1235 millisekuntia
	Second try:	1172 millisekuntia
	Third try :	1344 millisekuntia
	*/

	end2 = GetTickCount();
	cout << "Käyetty aika " << (double)(end2 - start2) << " millisekuntia käyttäen iterattoreita" << endl;
	cout << endl << "------------------" << endl;

	/* My compiler not supporting
	for (it: vec)	// c++11
	{
		cout << it << " ";
	}
	*/

	// contiguous = vierekkäin, rajakkain
	//Vector is a dynamically allocated contiguous array in memory

	int * p = &vec[0];
	p[2] = 6;

	cout << p[0];


	/*
	PROPERTIES OF VECTOR
	1. fast insert/remove at the end: O(1)
	2. slow insert/remove at the begining or in the middle: O(n)
	3. slow searach: O(n)
	*/

	//Vector can only end of end
	//Deque can grow from beginning and from end

	/*
	Deque
	*/

	deque<int> deq = { 4, 6, 7 };
	deq.push_front(2);	//deq: {2, 4, 6, 7}
	deq.push_back(3);	//deq: {2, 4, 6, 7, 3}

	//Deque has similar interface with vector
	cout << deq[1]; // 4

	/*PROPERTIES OF DEQUE
	1. fast insert/remove at the end and at the beginning;
	2. slow insert/remove in the middle: O(n)
	3. slow searach: O(n)
	*/

	/*
	list
	-- double linked list
	*/

	list<int> mylist = {5,2,9};
	mylist.push_back(6);	//mylist: {5,2,9,6}
	mylist.push_front(4);	//mylist: {4,5,2,9,6}

	list<int>::iterator itr = find(mylist.begin(), mylist.end(), 2); //itr -> 2
	mylist.insert(itr, 8);	//mylist: {4,5,8,2,9,6}
							//O(1), faster than vector/deque
							//itr -> 9
							//mylist: {4, 8, 5, 2, 6}	O(1)

	/*Properties:
	1.fast insert/remove at any place:O(1)
	2.slow search: O(n)
	3.no random accesss, no [] operator.
	*/

	list<int>::iterator itr_a;
	list<int>::iterator itr_b;
	list<int> mylist1;
	list<int> mylist2;
	//Maiby the best reason why use list is SPLICE!!!
	mylist1.splice(itr, mylist2, itr_a, itr_b);	//O(1)


	cin.get();
    return 0;
}
