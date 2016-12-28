package sample1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Demo1 extends Application {
	/*
	 *javafx 에플리케이션은 application을 상속받고, start() 메소드를 재정의 한다.
	 *메인 클래스의 main()메소드에서는 반드시 launch()를 호출해야 한다.
	 *
	 * launch)()는 윈도우를 생성한 다음 start() 메소드를 호출한다.
	 * launch()는 생성한 윈도우를 strart()메소드를 호출할 때 매개변수 primarystage에 전달한다.
	 * primarystate.show()를 실행하면 화면에 윈도우가 실행된다.
	 */
	@Override
	public void start(Stage primaryStage) {
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
//어플리케이션을 상속받아야함