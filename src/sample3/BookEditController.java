package sample3;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BookEditController {
	
	//add북안에 만드는 것은 좋지 않다.
	private BookDAO bookDao = new BookDAO();
	
	
	@FXML
	private TextField titleField;
	@FXML
	private TextField authorField;
	@FXML
	private TextField publisherField;
	@FXML
	private TextField priceField;
	
	@FXML
	private void addBook()throws Exception{
		
		String title = titleField.getText();
		String author = authorField.getText();
		String publisher = publisherField.getText();
		int price = Integer.parseInt(priceField.getText());
		
		BookVO book = new BookVO();
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPrice(price);
		
		bookDao.insertBook(book);
		// 정보 목적
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("책 등록");
		alert.setContentText("책 등록이 완료되었습니다.");
		//뒤에가 있으면 확인창을 기다리겠다는 기능
		alert.showAndWait();
	}
	
	@FXML
	private void clearField(){
		titleField.setText("");
		authorField.setText("");
		publisherField.setText("");
		priceField.setText("");
	}
	
}
