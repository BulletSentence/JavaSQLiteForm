package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class HomeController {

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_cpf;

    @FXML
    private DatePicker datep;

    @FXML
    private TextField tf_email;

    @FXML
    private ComboBox<String> cbox_ocup;

    @FXML
    private TextField tf_tel;

    @FXML
    private TextField tf_sal;

    @FXML
    private Button confirm_btn;


    public void comboBoxOc() {
        cbox_ocup.getItems().addAll("Estudante", "Desempregado");
    }

    public void Confirmar(){
       String NOME = tf_nome.getCharacters().toString();
       System.out.println("Nome: " +NOME);

       String CPF = tf_cpf.getCharacters().toString();
       System.out.println("CPF: " +CPF);

       String NASC = datep.getValue().toString();
       System.out.println("Nascimento: " +NASC);

       String EMAIL = tf_email.getCharacters().toString();
       System.out.println("e-Mail: " +EMAIL);


    }

}
