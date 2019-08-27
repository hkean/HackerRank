package com.hackerrank.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterator1 {
	static Iterator<Object> func(ArrayList<Object> mylist) {
		Iterator<Object> it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (!(element instanceof Integer))// Hints: use instanceof operator

				break;
		}
		return it;

	}

//	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator<Object> it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}

		sc.close();
	}
}
