package sample2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Demo1Controller {

	@FXML
	private TextField field1;
	
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	
	@FXML
	private void handleOk(){
		field1.setText("ok 버튼 클릭");

	}
	
	@FXML
	private void handleCancel(){
		field1.setText("취소버튼 클릭");
	}
}
