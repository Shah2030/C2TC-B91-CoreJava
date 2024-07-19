package com.tnsif.Day15;

import java.util.HashSet;

/*
 * Set is unordered collection
 * only have the unique elements
 * no specific order
 * 
 * Features:
 * It is not index based
 * no array implementation
 * it uses map based Data structure i.e, Hash Table, Hash Map, Hashing Technique,
 * Key value pair to be stored in the form of collection
 * Any order can be returned
 * List iterator cannot be used
 * in set Only 1 null element
 * in tree set no null elements
 * 
 * Light on Hash by mam:
 * Hash Table: it is kind of map{Hkey,Hvalue} through key only the value can be accessed
 * Hash function can generate Hash Key
 * 
 * add()
 * addAll()
 * isEmpty()
 * size()
 * clear() 
 * 
 * HashSet{set, serializable, clone able, AbstractSet, AbstractCollection} -(un Ordered, Hash Table, used in searching and reteriving)
 * 
 * feature:
 * uses HashCode value of an object to determine how the object should be stored in the collection
 * helps to locate objects in collection
 * unsorted and unorder map
 * it is not Synchronized
 * Collection.synchronizedSet()
 * 
 * LinkedHashSet:
 * It is Concrete class the implements set interface and extends HashSet with doubly linked list interface
 * added inn 1.4 version
 * preserve the insertion order
 * not thread safe
 * slower than HashSet
 * allow duplicate elements insertion
 * 
 * TreeSet:
 * Sorts element in ascending order
 * it acts like HashSet
 * no duplicate elements
 * fast accessing & retrieve time
 * not thread safe
 * TreeMap is used to store the elements
 * 
 * 
 * */
public class setdemo 
{
	static void addEle(HashSet<Integer> nhs)
	{
		nhs.add(61);
		nhs.add(41);
		nhs.add(91);
		nhs.add(51);
		nhs.add(80);
		nhs.add(11);
		nhs.add(20);
		//System.out.println(nhs.add(80)); returns false
	}

	public static void main(String[] args) 
	{
		HashSet<Integer> nhs1=new HashSet<Integer>();
		addEle(nhs1);
		HashSet<Integer> nhs2=new HashSet<Integer>();
		nhs2.add(20);
		nhs2.add(80);
		nhs2.add(11);
		nhs2.add(50);
		nhs2.add(60);
		nhs2.add(10);
		nhs2.add(51);
		System.out.println("Set 1: "+nhs1);
		System.out.println("Set 2: "+nhs2);
		HashSet<Integer> nhs3=new HashSet<Integer>();
		addEle(nhs3);
		
		//Perform union of 2 sets
		
		nhs3.addAll(nhs2);
		System.out.println("Result: "+nhs3);
		
		nhs3.clear();
		addEle(nhs3);
		//Perform intersect operation
		
		nhs3.retainAll(nhs2);
		System.out.println("Result :"+nhs3);
	}

}
