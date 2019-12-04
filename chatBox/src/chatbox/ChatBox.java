/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author OoiZhengKhai
 * @author LooiWeiHoong
 */
public class ChatBox extends Application {

  Label homeButton,chatButton, helpButton, bugReportButton,sendButton, typing1Button, typing2Button, typing3Button ;
  TextField messageButton;
  static JFrame frame;
  Panel jPanel1, jPanel2, jPanel4, jPanel5, jPanel6, jPanel7, jPanel3;
  Stage window;
  
    public static void main(String[] args) {
        launch(args);
    }
    
  @Override
    public void start (Stage primaryStage){
        window = primaryStage;
        window.setTitle("Server Chat Box");
        
      Label homeButton = new Label("Home Button");
/*      homeButton.addMouseListener(new MouseAdapter(){
          public void mouseClicked(MouseEvent e){
              JFrame jf = new JFrame("new one");
              jf.setVisible(true);
              jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
              
          }
      }); */
      Button button = new Button("Home Button");
      button.setOnAction(e ->AlertBox.display("titke","des"));
       

        
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}



