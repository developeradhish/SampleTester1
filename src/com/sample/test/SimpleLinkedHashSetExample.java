package com.sample.test;

import java.util.LinkedHashSet;

public class SimpleLinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhashSet = new LinkedHashSet<Integer>();

		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));

		System.out.println("LinkedHashSet contains:\t" + lhashSet);
	}
}