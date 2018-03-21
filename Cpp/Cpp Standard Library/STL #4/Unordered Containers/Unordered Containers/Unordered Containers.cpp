// Unordered Containers.cpp : Defines the entry point for the console application.
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
#include <string>

using namespace std;

/*
C++ 11 
Introduces Unordered Containers
*/
// Good side in this you can find exact hash table
// with good hashing function in no time!

int main()
{
	/*
		Unordered set
	*/
	unordered_set<string> myset = { "red","green","blue" };
	unordered_set<string>::const_iterator itr = myset.find("green");//O(1)
	if (itr != myset.end())	//Important check
	{
		cout << *itr << endl;
	}
	myset.insert("yellow");	//O(1)

	vector<string> vec = {"purple", "pink"};
	myset.insert(vec.begin(), vec.end());

	//Hash table specific APIs:
	cout << "load_factor = " << myset.load_factor() << endl;
	string x = "red";
	cout << x << " is in bucket #" << myset.bucket(x) << endl;
	cout << "Total bucket #" << myset.bucket_count() << endl;

	// unordered multiset:unordered set that allows duplicated elements
	// unordered map: unordered set of pairs
	// unordered multimap: unordered map that allows duplicated keys

	// Hash collision => performance degrade

	/*Properties of unordered containers:
	1.Fastest search/insert at any place: O(1)
		Associative Conainer takes O(log(n))
		vector, deque takes O(n)
		list takes O(1) to insert, O(n) to search
	2.Unorderd set/multimap: element value cannot be changed.
	Unorderd set/multimap: element key cannot be changed.
	
	
	*/
	cin.get();
    return 0;
}

