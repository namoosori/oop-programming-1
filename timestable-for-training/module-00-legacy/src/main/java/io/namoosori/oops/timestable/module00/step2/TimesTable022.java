/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namoosori.oops.timestable.module00.step2;

import java.util.Scanner;

public class TimesTable022 {
	//
	private static final int MAX_TIMES = 9;
	private static final int START_LEFT_NUMBER = 2;

	private static final Scanner scanner;
	private static int columnCount;
	private static final Format format;

	static {
		columnCount = 4;
		format = Format.InMath;
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		//
		showMenu();
	}

	public static void showMenu() {
		//
		int inputNumber;

		while (true) {
			displayMainMenu();
			inputNumber = selectMenu();

			switch (inputNumber) {
				//
				case 1:
					selectColumnCount();
					break;

				case 0:
					exitProgram();
					return;

				default:
					System.out.println("Please select again!");
			}
		}
	}

	private static void displayMainMenu() {
		//
		System.out.println("");
		System.out.println("..............................");
		System.out.println(" TimesTable menu ");
		System.out.println("..............................");
		System.out.println(" 1. Column selection");
		System.out.println(" 0. Exit");
		System.out.println("..............................");
	}

	private static int selectMenu() {
		//
		System.out.print(" > Select number: ");
		int menuNumber = scanner.nextInt();

		if (menuNumber >= 0 && menuNumber <= 1) {
			scanner.nextLine();
			return menuNumber;
		} else {
			System.out.println(" > Invalid number --> " + menuNumber);
			return -1;
		}
	}

	private static void exitProgram() {
		//
		scanner.close();
		System.out.println("Program exit. Bye...");
		System.exit(0);
	}

	private static void selectColumnCount() {
		//
		while(true) {
			int selectedColumnCount = displayColumnCountSelectionAndGetKey();

			if (selectedColumnCount == 0) {
				break;
			}

			if(selectedColumnCount < 0 || selectedColumnCount >= 9) {
				System.out.println(" >> Invalid column count, select again !!");
				continue;
			}

			columnCount = selectedColumnCount;
			showOption();
			showTable();
		}
	}

	private static int displayColumnCountSelectionAndGetKey() {
		//
		System.out.print(" >> Input column count(Exit:0)): ");
		int columnCount = scanner.nextInt();

		return columnCount;
	}

	public static void showOption() {
		//
		System.out.printf("\n columnCount: %d, format type: %s%n", columnCount, format.name());
		System.out.println("...........................................");
	}

	public static void showTable() {
		//
		int leftNumber = START_LEFT_NUMBER;
		do {
			for (int rightNumber = 1; rightNumber <= MAX_TIMES; rightNumber++) {
				for (int offset = 0; offset < columnCount; offset++) {
					int leftOffset = leftNumber + offset;
					if (leftOffset > MAX_TIMES) {
						break;
					}
					System.out.print(buildTimesItem(leftOffset, rightNumber));
					System.out.print("  ");
				}
				System.out.println("  ");
			}
			System.out.println(" ");

			leftNumber += columnCount;
		} while (leftNumber <= MAX_TIMES);
	}

	private static String buildTimesItem(int leftNumber, int rightNumber) {
		//
		return String.format(format.format,
				leftNumber,
				rightNumber,
				(leftNumber * rightNumber)
		);
	}

	enum Format {
		//
		InEnglish(" %d times %d = %2d "),
		InMath(" %d x %d = %2d ");

		private final String format;

		private Format(String format) {
			//
			this.format = format;
		}
	}
}