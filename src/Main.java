import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) {
        //Set le primary stage
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.setTitle("The otaku club");
        primaryStage.setResizable(false);

        //Scenes et groupes
        Group login = new Group();
        Group inscription = new Group();
        Group app = new Group();

        Scene sceneLogin = new Scene(login);
        Scene sceneInscription = new Scene(inscription);
        Scene sceneApp = new Scene(app);




        //Scene1
        TextField nomUtilLogin = new TextField();
        nomUtilLogin.setPromptText("Nom d'utilisateur");
        nomUtilLogin.setTranslateX(250);
        nomUtilLogin.setTranslateY(130);

        PasswordField mdpUtilLogin = new PasswordField();
        mdpUtilLogin.setPromptText("Mot de passe");
        mdpUtilLogin.setTranslateX(250);
        mdpUtilLogin.setTranslateY(180);

        Label nomUtil = new Label("Nom d'utilisateur");
        nomUtil.setTranslateX(250);
        nomUtil.setTranslateY(110);

        Label mdpUtil = new Label("Mot de passe");
        mdpUtil.setTranslateY(160);
        mdpUtil.setTranslateX(250);

        Button sinscrire = new Button("S'inscrire");
        sinscrire.setTranslateX(345);
        sinscrire.setTranslateY(230);

        Button connecter = new Button("Se connecter");
        connecter.setTranslateX(250);
        connecter.setTranslateY(230);

        sinscrire.setOnAction((event ->
                primaryStage.setScene(sceneInscription)));

        connecter.setOnAction((event -> {
            primaryStage.setScene(sceneApp);
        }));

        //Scene Inscription
        Label prenom = new Label("Prénom");
        prenom.setTranslateX(250);
        prenom.setTranslateY(30);

        TextField prenomField = new TextField();
        prenomField.setPromptText("Prénom");
        prenomField.setTranslateX(250);
        prenomField.setTranslateY(50);

        Label famille = new Label("Nom de famille");
        famille.setTranslateX(250);
        famille.setTranslateY(80);

        TextField familleField = new TextField();
        familleField.setPromptText("Nom de famille");
        familleField.setTranslateX(250);
        familleField.setTranslateY(100);

        Label utilNom = new Label("Nom d'utilisateur");
        utilNom.setTranslateX(250);
        utilNom.setTranslateY(130);

        TextField utilNomField = new TextField();
        utilNomField.setPromptText("Nom d'utilisateur");
        utilNomField.setTranslateX(250);
        utilNomField.setTranslateY(150);

        Label mdpInscri = new Label("Mot de passe");
        mdpInscri.setTranslateX(250);
        mdpInscri.setTranslateY(180);

        PasswordField motPasse1 = new PasswordField();
        motPasse1.setPromptText("Mot de passe");
        motPasse1.setTranslateX(250);
        motPasse1.setTranslateY(200);

        Label mdpInscri2 = new Label("Confirmer le mot de passe");
        mdpInscri2.setTranslateX(250);
        mdpInscri2.setTranslateY(230);

        PasswordField motPasse2 = new PasswordField();
        motPasse2.setPromptText("Mot de passe");
        motPasse2.setTranslateX(250);
        motPasse2.setTranslateY(250);

        Label genre = new Label("Genre");
        genre.setTranslateX(250);
        genre.setTranslateY(280);

        RadioButton homme = new RadioButton("Homme");
        homme.setTranslateX(250);
        homme.setTranslateY(300);

        RadioButton femme = new RadioButton("Femme");
        femme.setTranslateX(330);
        femme.setTranslateY(300);

        RadioButton autre = new RadioButton("Autre");
        autre.setTranslateX(400);
        autre.setTranslateY(300);

        ToggleGroup hfa = new ToggleGroup();
        homme.setToggleGroup(hfa);
        femme.setToggleGroup(hfa);
        autre.setToggleGroup(hfa);

        Label age = new Label("Âge");
        age.setTranslateX(250);
        age.setTranslateY(330);

        Spinner spinner = new Spinner(18, 150, 18);
        spinner.setTranslateX(250);
        spinner.setTranslateY(350);

        CheckBox conditions = new CheckBox("J'accepte les conditions d'utilisation");
        conditions.setTranslateX(250);
        conditions.setTranslateY(380);

        Button inscrire = new Button("S'inscrire");
        inscrire.setTranslateX(250);
        inscrire.setTranslateY(420);

        Button effacer = new Button("Effacer");
        effacer.setTranslateX(320);
        effacer.setTranslateY(420);

        Button retour = new Button("Retour");
        retour.setTranslateX(380);
        retour.setTranslateY(420);

        retour.setOnAction((event ->{
                    primaryStage.setScene(sceneLogin);
                    effacer.fire();
                }
            ));

        effacer.setOnAction((event -> {
            prenomField.clear();
            familleField.clear();
            motPasse1.clear();
            motPasse2.clear();
            utilNomField.clear();
            homme.setSelected(false);
            femme.setSelected(false);
            autre.setSelected(false);
            conditions.setSelected(false);
            spinner.getValueFactory().setValue(18);
        }));

        //App
        ProgressIndicator rond = new ProgressIndicator();
        rond.setTranslateX(250);
        rond.setTranslateY(250);

        Label chargement = new Label("Chargement du contenu");
        chargement.setTranslateX(220);
        chargement.setTranslateY(330);


        //Remplir
        login.getChildren().add(nomUtilLogin);
        login.getChildren().add(mdpUtilLogin);
        login.getChildren().add(mdpUtil);
        login.getChildren().add(nomUtil);
        login.getChildren().add(sinscrire);
        login.getChildren().add(connecter);

        inscription.getChildren().add(prenom);
        inscription.getChildren().add(prenomField);
        inscription.getChildren().add(famille);
        inscription.getChildren().add(familleField);
        inscription.getChildren().add(utilNom);
        inscription.getChildren().add(utilNomField);
        inscription.getChildren().add(mdpInscri);
        inscription.getChildren().add(motPasse1);
        inscription.getChildren().add(motPasse2);
        inscription.getChildren().add(mdpInscri2);
        inscription.getChildren().add(genre);
        inscription.getChildren().add(homme);
        inscription.getChildren().add(femme);
        inscription.getChildren().add(autre);
        inscription.getChildren().add(age);
        inscription.getChildren().add(spinner);
        inscription.getChildren().add(conditions);
        inscription.getChildren().add(inscrire);
        inscription.getChildren().add(retour);
        inscription.getChildren().add(effacer);

        app.getChildren().add(rond);
        app.getChildren().add(chargement);

        sceneLogin.setRoot(login);

        primaryStage.setScene(sceneLogin);
        primaryStage.show();
    }
}
