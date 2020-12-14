package subway.view;

public class MainView {
	private static final String MAIN_MESSAGE = "## ���� ȭ��";
	private static final String STATION_MESSAGE = "1. �� ����";
	private static final String LINE_MESSAGE = "2. �뼱 ����";
	private static final String SECTION_MESSAGE = "3. ���� ����";
	private static final String SUBWAY_PRINT_MESSAGE = "4. ����ö �뼱�� ���";
	private static final String SYSTEM_OUT_MESSAGE = "Q. ����";
	private static final String SELECT_FUNCTION_MESSAGE = "\n## ���ϴ� ����� �����ϼ���.";
	
	public static void printMainScreen() {
		System.out.println(MAIN_MESSAGE);
		System.out.println(STATION_MESSAGE);
		System.out.println(LINE_MESSAGE);
		System.out.println(SECTION_MESSAGE);
		System.out.println(SUBWAY_PRINT_MESSAGE);
		System.out.println(SYSTEM_OUT_MESSAGE);
		selectFunction();
	}
	
	public static void selectFunction() {
		System.out.println(SELECT_FUNCTION_MESSAGE);
	}

}
