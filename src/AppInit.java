import dto.StudentDTO;
import entity.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.io.IOException;

public class AppInit extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/MainPage.fxml"))));
        primaryStage.setResizable(false);
        primaryStage.show();
        /*Student student = new Student("CT302","Waruna","200103900759","weligama","0713402092","2001.2.8","20");
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(student);

        transaction.commit();

        session.close();*/
    }
}
