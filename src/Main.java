import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;


public class Main extends Application {
    public static void main(String[] args) {launch(args);}

    public static HashMap<String,Utilisateur> map = new HashMap<String, Utilisateur>();
    public static ArrayList<String> liste = new ArrayList<String>();

    @Override
    public void start(Stage primaryStage) {
        //Set le primary stage
        primaryStage.setWidth(600);
        primaryStage.setHeight(700);
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
        sinscrire.setTranslateX(365);
        sinscrire.setTranslateY(230);

        Button connecter = new Button("Se connecter");
        connecter.setTranslateX(250);
        connecter.setTranslateY(230);

        Label erreur2 = new Label("");
        erreur2.setTranslateX(150);
        erreur2.setTranslateY(270);

        sinscrire.setOnAction((event ->{
                    mdpUtilLogin.clear();
                    nomUtilLogin.clear();
                    erreur2.setText("");
                    primaryStage.setScene(sceneInscription);
                }));


        connecter.setOnAction((event) -> {

            if (map.containsKey(nomUtilLogin.getText())){
                if (mdpUtilLogin.getText().equals(map.get(nomUtilLogin.getText()).getMdp())){
                    primaryStage.setScene(sceneApp);
                    mdpUtilLogin.clear();
                    nomUtilLogin.clear();
                    erreur2.setText("");
                }
                else {
                    erreur2.setText("Mot de passe incorect");
                }
            }
            else
                erreur2.setText("*Ce nom d'utilisateur n'existe pas");


        });

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
        femme.setTranslateX(350);
        femme.setTranslateY(300);

        RadioButton autre = new RadioButton("Autre");
        autre.setTranslateX(440);
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
        conditions.setTranslateY(400);

        Button inscrire = new Button("S'inscrire");
        inscrire.setTranslateX(250);
        inscrire.setTranslateY(440);

        Button effacer = new Button("Effacer");
        effacer.setTranslateX(340);
        effacer.setTranslateY(440);

        Button retour = new Button("Retour");
        retour.setTranslateX(420);
        retour.setTranslateY(440);

        Label erreur = new Label("");
        erreur.setTranslateX(150);
        erreur.setTranslateY(470);

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
            erreur.setText("");
        }));

        inscrire.setOnAction((event -> {
            boolean ok =true;
            erreur.setText("");

            if (prenomField.getText().isEmpty() ||
                    familleField.getText().isEmpty() ||
                    utilNomField.getText().isEmpty() ||
                    mdpInscri.getText().isEmpty() ||
                    mdpInscri2.getText().isEmpty() ||
                    (!homme.isSelected() && !femme.isSelected() && !autre.isSelected())){

                erreur.setText(erreur.getText()+"\n*Tous les champs sont obligatoires");
                ok=false;
            }

            if (!verif(prenomField.getText()) ||
                    verif(familleField.getText())){
                erreur.setText(erreur.getText()+"\n*Les caractères spéciaux sont interdits dans le prénom et nom de famille");
                ok=false;
            }

            if (!existant(utilNomField.getText())){
                erreur.setText(erreur.getText()+"\n*Ce nom d'utilisateur existe déjà");
                ok=false;
            }

            if (!motPasse2.getText().equals(motPasse1.getText())){
                erreur.setText(erreur.getText()+"\n*Veuillez reconfirmer le mot de passe");
                ok=false;
            }

            if (!conditions.isSelected()){
                erreur.setText(erreur.getText()+"\n*Veuillez accepter les conditions d'utilisation");
                ok=false;
            }

            if (ok){
                Utilisateur temp = new Utilisateur();
                liste.add(prenomField.getText());
                temp.setPrenom(prenomField.getText());
                temp.setNomDeFamille(familleField.getText());
                temp.setNomUtil(utilNomField.getText());
                temp.setMdp(mdpInscri.getText());
                temp.setAge(spinner.getValue().toString());
                if (homme.isSelected())
                    temp.setGenre("Homme");
                else if (femme.isSelected())
                    temp.setGenre("Femme");
                else
                    temp.setGenre("Autre");

                map.put(utilNomField.getText(), temp);

                retour.fire();
            }
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
        login.getChildren().add(erreur2);

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
        inscription.getChildren().add(erreur);

        app.getChildren().add(rond);
        app.getChildren().add(chargement);

        sceneLogin.setRoot(login);

        primaryStage.setScene(sceneLogin);
        primaryStage.show();
    }

    public static boolean verif(String chaine){
        for (int i=0; i<chaine.length(); i++){
            if (    chaine.charAt(i)=='!' ||
                    chaine.charAt(i)=='"' ||
                    chaine.charAt(i)=='/' ||
                    chaine.charAt(i)=='$' ||
                    chaine.charAt(i)=='%' ||
                    chaine.charAt(i)=='?' ||
                    chaine.charAt(i)=='&' ||
                    chaine.charAt(i)=='*' ||
                    chaine.charAt(i)=='(' ||
                    chaine.charAt(i)==')' ||
                    chaine.charAt(i)=='1' ||
                    chaine.charAt(i)=='2' ||
                    chaine.charAt(i)=='3' ||
                    chaine.charAt(i)=='4' ||
                    chaine.charAt(i)=='5' ||
                    chaine.charAt(i)=='6' ||
                    chaine.charAt(i)=='7' ||
                    chaine.charAt(i)=='8' ||
                    chaine.charAt(i)=='9' ||
                    chaine.charAt(i)=='0' ||
                    chaine.charAt(i)=='-' ||
                    chaine.charAt(i)=='=' ||
                    chaine.charAt(i)=='+' ||
                    chaine.charAt(i)=='_' ||
                    chaine.charAt(i)=='^' ||
                    chaine.charAt(i)=='<' ||
                    chaine.charAt(i)=='>' ||
                    chaine.charAt(i)==',' ||
                    chaine.charAt(i)=='.' ||
                    chaine.charAt(i)=='}' ||
                    chaine.charAt(i)=='{' ||
                    chaine.charAt(i)==';' ||
                    chaine.charAt(i)=='~' ||
                    chaine.charAt(i)=='±' ||
                    chaine.charAt(i)=='@' ||
                    chaine.charAt(i)=='£' ||
                    chaine.charAt(i)=='¢' ){
                return false;
            }
        }
        return true;
    }

    public static boolean existant(String chaine){
        for (int i=0; i<liste.size(); i++){
            if (chaine.equals(liste.get(i))){
                return false;
            }
        }
        return true;
    }
}
