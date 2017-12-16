package de.thm.swtp.studiplaner.model;

import javafx.event.EventHandler;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class editTable extends TableCell<Termin, String> {
	  
	  // Textfield deklarieren das als Bearbeitungsfeld gilt
	  private TextField textField;
	    
      public editTable() {}
    
      // Editieren starten
      @Override
      public void startEdit() {
          super.startEdit();
        
          if (textField == null) {
              createTextField();
          }
        
          setGraphic(textField);
          setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
          textField.selectAll();
      }
    
      // Editieren abbrechen
      @Override
      public void cancelEdit() {
          super.cancelEdit();
        
          setText(getItem());
          setContentDisplay(ContentDisplay.TEXT_ONLY);
      }

      // Eintrag aktualisieren
      @Override
      public void updateItem(String item, boolean empty) {
          super.updateItem(item, empty);
        
          if (empty) {
              setText(null);
              setGraphic(null);
          } else {
              if (isEditing()) {
                  if (textField != null) {
                      textField.setText(getItem());
                  }
                  setGraphic(textField);
                  setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
              } else {
                  setText(getItem());
                  setContentDisplay(ContentDisplay.TEXT_ONLY);
              }
          }
      }

      // Textfield erstellen und EventHandler instanzieren
      private void createTextField() {
          textField = new TextField();
          textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()*2);
          textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            
              @Override
              public void handle(KeyEvent t) {
                  if (t.getCode() == KeyCode.ENTER) {
                      commitEdit(textField.getText());
                  } else if (t.getCode() == KeyCode.ESCAPE) {
                      cancelEdit();
                  }
              }
          });
      }
    
    
  }


