package com.semanticsquare.oop.p2;

import com.semanticsquare.oop.p1.A1;

public class B2 {
	public static void main(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember);
		//System.out.println("A1.defaultMember: " + A1.defaultMember);
		
		//System.out.println("A1.protectedMember: " + A1.protectedMember);//ei exendoi A1
		//System.out.println("C2.protectedMember: " + C2.protectedMember);//vaikka c2 on fieldi, tämä ei kuitenkaan ole B2 ei ole oikeassa paketissa.
		
		System.out.println("A1.publicMember: " + A1.publicMember);
		System.out.println("C2.publicMember: " + C2.publicMember);
	}
}
