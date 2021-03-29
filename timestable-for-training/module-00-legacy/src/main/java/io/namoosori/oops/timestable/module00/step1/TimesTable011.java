/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */

package io.namoosori.oops.timestable.module00.step1;

public class TimesTable011 {
	//
	public static void main(String[] args) {
		//
		System.out.println("Times tables.");
		System.out.println("-------------");

		for (int i = 2; i<=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.printf(" %d x %d = %2d %n", i, j, (i*j));
			}
			System.out.println("-----------");
		}
	}
}