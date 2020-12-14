package subway.view;

import java.util.Scanner;

public class StationView {

	private static final String MAIN_MESSAGE = "## �� ���� ȭ��";
	private static final String REGISTER_MENU_MASSAGE = "1. �� ���";
	private static final String DELETE_MENU_MESSAGE = "2. �� ����";
	private static final String LOOK_UP_MENU_MESSAGE = "3. �� ��ȸ";
	private static final String SYSTEM_OUT_MESSAGE = "B. ���ư���";
	private static final String REGISTER_MESSAGE ="\n## ����� �� �̸��� �Է��ϼ���.";
	private static final String REGISTER_COMPLETE_MESSAGE ="\n[INFO] ����ö ���� ��ϵǾ����ϴ�.";
	private static final String DELETE_MESSAGE ="\n## ������ �� �̸��� �Է��ϼ���.";
	private static final String DELETE_COMPLETE_MESSAGE ="\n[INFO] ����ö ���� �����Ǿ����ϴ�.";
	
	public static void printMainScreen() {
		System.out.println(MAIN_MESSAGE);
		System.out.println(REGISTER_MENU_MASSAGE);
		System.out.println(DELETE_MENU_MESSAGE);
		System.out.println(LOOK_UP_MENU_MESSAGE);
		System.out.println(SYSTEM_OUT_MESSAGE);
		MainView.selectFunction();
	}

	public static void printRegisterScreen(Scanner scanner) {
		System.out.println(REGISTER_MESSAGE);
		String registerStation =  scanner.nextLine();
		System.out.println(REGISTER_COMPLETE_MESSAGE);
	}
	
	public static void printDeleteScreen(Scanner scanner) {
		System.out.println(DELETE_MESSAGE);
		String deleteStation =  scanner.nextLine();
		System.out.println(DELETE_COMPLETE_MESSAGE);
	}

}
