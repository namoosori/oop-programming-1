/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */

package io.namoosori.oops.timestable.module00.step1;

public class DemoAssistant {
	//
	public static void main(String[] args) {
		//
		DemoAssistant demoAssistant = new DemoAssistant();
		demoAssistant.runDemo();
	}

	public void runDemo() {
		//
		TimesTable013 timesTable013 = new TimesTable013();
		timesTable013.showTable();
	}
}