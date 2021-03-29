/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */

package io.namoosori.oops.timestable.module00.step1;

public class TimesTable013 {
	//
	private static final String FORMAT = " %d x %d = %2d ";

	public void showTable() {
		//
		System.out.println("Times tables.");
		System.out.println("-------------");

		for (int leftNumber = 2; leftNumber<=9; leftNumber++) {
			for (int rightNumber = 1; rightNumber <=9; rightNumber++) {
				System.out.println(
						String.format(
								FORMAT,
								leftNumber,
								rightNumber,
								(leftNumber * rightNumber)
						)
				);
			}

			System.out.println("-----------");
		}
	}
}