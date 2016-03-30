package asmaa;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class mainn extends Application{
	
	@Override
	public void start(Stage st){
		VBox pane=new VBox();
		//GridPane gridPane=new  GridPane();
		
	pane.setPadding(new Insets(10, 10, 10, 10));
	pane.setSpacing(5);

		
		TextField t=new TextField();
		t.setPrefSize(230, 70);
		t.setEditable(false);
		//t.prefWidth(200);
	pane.getChildren().add(t);
	
	
		HBox h=new HBox(5);
		Button b1=	new Button("7");
		b1.setPrefSize(45,30);
	///	b1.setOnAction(new numberAction() );
		b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	String s=b1.getText();
            	t.setText(s);
            }
		}
		);
            
		h.getChildren().add( b1);
		Button b2=	new Button("8");
		b2.setPrefSize(45,30);
		b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	String s2=b2.getText();
            	
            	t.setText(s2);
            }
		}
		);
		h.getChildren().add(b2);
		Button b3=	new Button("9");
		b3.setPrefSize(45,30);
		b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	String s=b3.getText();
            	t.setText(s);
            }
		}
		);
		h.getChildren().add(b3);
		Button b4=	new Button("%");
		b4.setPrefSize(45,30);
		h.getChildren().add(b4);
		Button b5=	new Button("~");
		b5.setPrefSize(45,30);
		h.getChildren().add(b5);
		Button b6=	new Button("c");
		b6.setPrefSize(45,30);
		h.getChildren().add(b6);
		pane.getChildren().add(h);
		//////////////////////////////////
		HBox r=new HBox(5);
		Button b7=	new Button("4");
		b7.setPrefSize(45,30);
		r.getChildren().add(b7);
		Button b8=	new Button("5");
		b8.setPrefSize(45,30);
		r.getChildren().add(b8);
		Button b9=	new Button("6");
		b9.setPrefSize(45,30);
		r.getChildren().add(b9);
		Button b10=	new Button("*");
		b10.setPrefSize(45,30);
		r.getChildren().add(b10);
		Button b11=	new Button("(");
		b11.setPrefSize(45,30);
		r.getChildren().add(b11);
		Button b12=	new Button(")");
		b12.setPrefSize(45,30);
		r.getChildren().add(b12);
		
		pane.getChildren().add(r);
	////////////////////////////////////
		HBox r1=new HBox(5);
		Button b13=	new Button("1");
		b13.setPrefSize(40,20);
		
		r1.getChildren().add(b13);
		Button b14=	new Button("2");
		b14.setPrefSize(45,30);
		r1.getChildren().add(b14);
		Button b15=	new Button("3");
		b15.setPrefSize(45,30);
		r1.getChildren().add(b15);
		Button b16=	new Button("-");
		b16.setPrefSize(45,30);
		r1.getChildren().add(b16);
		Button b17=	new Button("x2");
		b17.setPrefSize(45,30);
		r.getChildren().add(b17);
		r1.getChildren().add(b17);
		Button b18=	new Button("rt");
		b18.setPrefSize(45,30);
		r.getChildren().add(b18);
		r1.getChildren().add(b18);
		
		pane.getChildren().add(r1);
		////////////////////////////////////////////////////
		HBox r2=new HBox(5);
		Button b19=	new Button("0");
		b19.setPrefSize(45,30);
		r2.getChildren().add(b19);
		Button b20=	new Button(".");
		b20.setPrefSize(45,30);
		r2.getChildren().add(b20);
		Button b21=	new Button("/");
		b21.setPrefSize(45,30);
		r2.getChildren().add(b21);
		Button b22=	new Button("+");
		b22.setPrefSize(45,30);
		r2.getChildren().add(b22);
		Button b23=	new Button("=");
		b23.setPrefSize(80,30);
		r2.getChildren().add(b23);
		pane.getChildren().add(r2);
		Scene S=new Scene(pane,250,250);
		st.setTitle("asmaa");
		st.setScene(S);
		st.show();

		
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
