// Associative Containers.cpp : Defines the entry point for the console application.
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

/* ASSSOCIATIVE CONTAINERS
ASSSOCIATIVE are usually stored in binary tree.
This tree is in sorted order.

Alwasy sorted, default criteria is <

No push_back(), push_front(), these makes no sense


*/
using namespace std;

int main()
{
	/*
		Set
		-no duplicates
	*/

	set<int> myset;
	myset.insert(3);	//myset: {3}
	myset.insert(1);	//myset: {1,3}
	myset.insert(7);	//myset: {1,3,7}, O(log(n))

	set<int>::iterator it;
	it = myset.find(7);	//O(log(n)), it points to 7
						//Sequence containers don't even have find() member funcion
	pair<set<int>::iterator, bool> ret;
	ret = myset.insert(3);	//no new element inserted
	if (ret.second == false)
		it = ret.first;		//"it" now points to element 3

	myset.insert(it, 9);	//myset: {1, 3, 7, 9}	O(log(n)) => O(1)
							// it points to 3
	myset.erase(it);		//myset:	{1, 7, 9}

	myset.erase(7);			//myset: {1,9}
	// Note: none of the sequence containers provide this kinda of erase



	/*
		Multiset
	*/
	
	//multiset is a set that allows duplicated items
	multiset<int> myset;

	//set/multiset: value of the elements cannot be modified
	*it = 10;	// *it is read-only

	/* Properties of Multiset
		1. Fast search: O(log(n))
		2. Traversing is slow (vompared to vector & deque)
		3. No random access, no [] operator
	*/ 
	//traversing = liikkuminen


	/*
		MAP

		-No duplicated key
	*/

	{
		map<char, int> mymap;
		mymap.insert(pair<char, int>('a', 100));
		mymap.insert(make_pair('z', 200));

		map<char, int>::iterator it = mymap.begin();
		mymap.insert(it, pair<char, int>('b', 300));	//"it" is a hint

		it = mymap.find('z');	// O(log(n))

		//showing contents
		for (it = mymap.begin(); it != mymap.end(); it++)
		{
			cout << (*it).first << " => " << (*it).second << endl;
		}
	}


	// multimap is a map that allows duplicated keys
	multimap<char, int> mymap;

	//map/multimap:
	//	--keys cannot be modified
	//	type of *it: pair<const char, int>
	(*it).first = 'd' // error

	cin.get();
    return 0;
}

