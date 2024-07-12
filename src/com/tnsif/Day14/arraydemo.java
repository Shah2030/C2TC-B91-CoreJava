package com.tnsif.Day14;
import java.util.*;
public class arraydemo 
{
	//FunctionalINterface has only 1 method Compare()
	
	public static void main(String[] args) 
	{
		//USer defined
		ArrayList<stud> sl=new ArrayList<stud>();
		stud s1=new stud(11,"Abcd",85);
		sl.add(s1);
		s1=new stud(21,"XYZ",78);
		sl.add(s1);
		s1=new stud(21,"AYZ",98);
		sl.add(s1);
		s1=new stud(21,"BYZ",88);
		sl.add(s1);
		s1=new stud(21,"CYZ",68);
		sl.add(s1);
		//Collections.sort(sl<rno>);
		System.out.println(sl);
		Comparator<stud> c=(st1,st2)->(int)(st1.getPer()-st2.getPer());
		Collections.sort(sl, c);
		System.out.println("Accending order: "+sl);

	}

}
