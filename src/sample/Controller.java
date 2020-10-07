package sample;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import sun.awt.SunHints;
import sun.plugin2.message.Message;

import javax.swing.event.DocumentEvent;

public class Controller {

   @FXML
   public TextArea messageScreen;

   @FXML
   public TextField messageWriteSpace;

   @FXML Button btSend;


   public Controller(){

   }

   public void pressSend(ActionEvent actionEvent) {
      messageScreen.appendText(messageWriteSpace.getText()+"\n");
      messageWriteSpace.clear();
      messageWriteSpace.requestFocus();

   }



   public void enterPressed(KeyEvent keyEvent) {
      if(keyEvent.getCode() == KeyCode.ENTER) {
         btSend.getOnAction().handle(new ActionEvent()) ;
      }}
}
