/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverchatboxui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;

/**
 *
 * @author ZhengKhai
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button home;
    @FXML
    private Button chat;
    @FXML
    private Button help;
    @FXML
    private Button bugReport;
    @FXML
    private ImageView adminServerImg;
    @FXML
    private ImageView liveuserImg;
    @FXML
    private Button send;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void homeButton(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Home");
        alert.setHeaderText("Hi , Mr Nathan !");
        alert.setContentText("Have a good day ! \nTry Out Button below which is interactive !\nDont miss it out \t.\t .\t .");
        
        alert.showAndWait();
        
    }

    @FXML
    private void chatButton(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("Type here . . .");
        dialog.setTitle("Chat");
        dialog.setHeaderText("Chat box");
        dialog.setContentText("Try it here !");

        // get string vale
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
          System.out.println("User input: " + result.get());
            }
        result.ifPresent(name -> System.out.println("Your name: " + name));
    }

    @FXML
    private void helpButton(ActionEvent event) {
        
        List<String> choices = new ArrayList<>();
        choices.add("Cant receive message");
        choices.add("Connection problem");
        choices.add("Interface issues");
        choices.add("Performance issues");


        ChoiceDialog<String> dialog = new ChoiceDialog<>("Click to Select", choices);
        dialog.setTitle("Help");
        dialog.setHeaderText("How can we help you?");
        dialog.setContentText("What problem have you encountered?");
        

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
         System.out.println("Your choice: " + result.get());
        }
        result.ifPresent(letter -> System.out.println("Your choice: " + letter));
            Alert option = new Alert(AlertType.INFORMATION);
                  option.setTitle(" Help Box");
                  option.setHeaderText("Noted ! Sorry for inconvenience cause.");
                  option.setContentText("We will contact you as soon as possbile !");
                  option.showAndWait();
        }

    @FXML
    private void bugReportButton(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Bug Report");
        alert.setHeaderText("Seems like you have discovered some bugs\t...");
        alert.setContentText("Choose your option.");

        ButtonType buttonTypeOne = new ButtonType("Inform us ");
        ButtonType buttonTypeTwo = new ButtonType("Message us");
        ButtonType buttonTypeThree = new ButtonType("Call us");
            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

       alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne){
         // ... user chose "Inform us"
            System.out.println("Noted. Thanks, We will contact you as soon as possbile !");
            Alert option1 = new Alert(AlertType.WARNING);
            option1.setTitle(" Bug Report (Inform us)");
            option1.setHeaderText("Noted ! Thanks for helping us improving our software!");
            option1.setContentText("We will contact you as soon as possbile !");
            option1.showAndWait();
            
        } else if (result.get() == buttonTypeTwo) {
        // ... user chose "Message us"
            TextInputDialog dialog = new TextInputDialog("Type here");
            dialog.setTitle("Bug Report (Message us)");
            dialog.setHeaderText("Tell us what happen .\t.\t.");
            dialog.setContentText("Provide Description:");

        Optional<String> option2 = dialog.showAndWait();
            if (option2.isPresent()){
            System.out.println("Description of bugs: " + option2.get());
            Alert option2_1 = new Alert(AlertType.INFORMATION);
           option2_1.setTitle("Information Dialog");
           option2_1.setHeaderText(null);
           option2_1.setContentText("Noted. Thanks for your feedback.\nHave a great day !");
           option2_1.showAndWait();
        }

        option2.ifPresent(name -> System.out.println("Your name: " + name));
        } else if (result.get() == buttonTypeThree) {
          // ... user chose "Call us"
            Alert option3 = new Alert(AlertType.INFORMATION);
            option3.setTitle("Bug Report (Call us)");
            option3.setHeaderText(null);
            option3.setContentText("Contact us:\n010-XXXXXXX(Ooi Zheng Khai)\n\t\t\tor\n018-XXXXXXX(Looi Wei Hoong)");

            option3.showAndWait();
        } else {
        }
     }

    @FXML
    private void sendButton(ActionEvent event) {
    }
}
