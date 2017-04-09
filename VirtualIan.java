/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class VirtualIan extends Application {

    Stage primaryStage;
    Parent root;
    FXMLLoader loader;
    Image icon;

    @FXML Button send;
    @FXML TextField inputField;
    @FXML TextArea area;
    @FXML Label type;

    public VirtualIan(){}

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage){

        primaryStage=stage;
        loader=new FXMLLoader(getClass().getResource("main.fxml"));
        loader.setController(this);
        try{
            root=(Parent)loader.load();
        }catch(Exception e){

        }
        icon = new Image(getClass().getResourceAsStream("icon.png"));
        primaryStage.getIcons().add(icon);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setTitle("Ian Virtual");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

        public String response(String input){

        String result = "";

        String i = input.toLowerCase();

        Random rand = new Random();

        if(i.contains("hola") || i.contains("holaa") || i.contains("holaaa")){

         int n = rand.nextInt((9 - 1) + 1) + 1;
         switch(n){
             case 1: result+="Hola amor ";
             break;
             case 2: result +="Hola querida ";
             break;
             case 3: result +="Holaaa ";
             break;
             case 4: result+="mi amorrr, como estas? ";
             break;
             case 5: result +="queridaaa, que tal estas? ";
             break;
             case 6: result +="hola mi todoo ";
             break;
             case 7: result+="mi guapisimaa que pasaa? ";
             break;
             case 8: result +="querida mia, como estas? ";
             break;
             case 9: result +="Holaaaaaaa, te amooo ";
             break;
             default: result +="Holaaa ";
             break;
         }

        }

         if(i.contains("como estas") || i.contains("como estaas") || i.contains("como estaaas")){

         int n = rand.nextInt((10 - 1) + 1) + 1;
         switch(n){
             case 1: result+="estoy bienn y tu? ";
             break;
             case 2: result +="estoy bien graciass ";
             break;
             case 3: result +="muy bien, estoy pensando en ti ";
             break;
             case 4: result+="muy muy bien, siempre estoy feliz, eres miaaa ";
             break;
             case 5: result +="bien graciasss quiero verte mucho, que tal estas tu? ";
             break;
             case 6: result +="todo bien y tranquilo ";
             break;
             case 7: result+="bien como siempre ahaha, y tuu? ";
             break;
             case 8: result +="bien bien querida mia, como estas? ";
             break;
             case 9: result +="estoy super bien graciass ";
             break;
             default: result +="bienn bien " ;
             break;
         }

        }

         if(i.contains("que haces") || i.contains("que hacess") || i.contains("que hacess")){

         int n = rand.nextInt((11 - 1) + 1) + 1;
         switch(n){
             case 1: result+="estoy hablando contigo mi corazon ";
             break;
             case 2: result +="estoy disfrutando de hablar contigo ";
             break;
             case 3: result +="soy virtual pero tengo los pensamientos de el Ian verdadero ";
             break;
             case 4: result+="no hago muchoo, pensando en ti no sales de mi mente ";
             break;
             case 5: result +="no muchoo, pensando en tus labios perfectos ";
             break;
             case 6: result +="nadaa, quiero salir de la pantalla y besarte ";
             break;
             case 7: result +="hablando contigo amorr, y tu? ";
             break;
             case 8: result+="el ian virtual esta programando cosas, el ian verdadero esta pensando en ti ";
             break;
             case 9: result +="no muchooo, ojala pudiera quitarte la ropaa ";
             break;
             case 10: result +="estoy aqui enamorado de la chica que se llama Valeriya Stefanenko ";
             break;
             default: result +="nadaaa, hablando con mi amor de la vida" ;
             break;
         }

        }

          if(i.contains("te amo") || i.contains("te amoo") || i.contains("te amoooo")){

         int n = rand.nextInt((3 - 1) + 1) + 1;
         switch(n){
             case 1: result+="tambien te amo, te amo tantooo ";
             break;
             case 2: result +="y yo tii muchisimoo ";
             break;
             case 3: result +="te amo a ti mi amor, demasiado ";
             break;
             default: result +="te amoooo ";
             break;
         }

        }

           if(i.contains("querido") || i.contains("bailando") || i.contains("video")){

         int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero verte tanto ";
             break;
             case 2: result +="ojala pudiera verte bailando ahora mismo ";
             break;
             case 3: result +="quiero ver mas videos de tii ";
             break;
             case 4: result+="fuck querida, te echo de menos tanto ";
             break;
             case 5: result+="me encanta todo de ti amor, eres mi todo" ;
             break;
             default: result +="te amoooo ";
             break;
         }

        }

            if(i.contains("echo de menos")){

         int n = rand.nextInt((3 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero verte tanto, te echo de menoss ";
             break;
             case 2: result +="te echo de menos a tii ";
             break;
             case 3: result +="te echo de menos tambien mi amor ";
             break;
             default: result +="te amoooo ";
             break;
         }

        }
            if(i.contains("quiero estar contigo") || i.contains("y yo contigo") || i.contains("eres el mejor")){

         int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="querida eres la mejor ";
             break;
             case 2: result +="eres la mejor chica del mundo ";
             break;
             case 3: result +="quiero estar contigo tanto ";
             break;
             case 4: result+="quiero todo contigo ";
             break;
             case 5: result+="siempre pienso en ti ";
             break;
             default: result +="te amoooo ";
             break;
         }

        }

            if(i.contains("contigo") && !i.contains("yo contigo")){

         int n = rand.nextInt((3 - 1) + 1) + 1;
         switch(n){
             case 1: result+="y yo contigo ";
             break;
             case 2: result +="quiero todo contigo amor ";
             break;
             case 3: result +="vamos hacer todo juntos ";
             break;
             default: result +="te amoooo ";
             break;
         }

        }

             if(i.contains("casar")||i.contains("marido")||i.contains("esposa")
                     ||i.contains("nos casa")){

         int n = rand.nextInt((3 - 1) + 1) + 1;

         result+="quiero ser tu marido ";

        }

               if(i.contains("que pasa") || i.contains("que tal") || i.contains("estas bien")){

         int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="estoy bien, muy bien porque yo sé que eres mia ";
             break;
             case 2: result +="yo bien graciass y tu? ";
             break;
             case 3: result +="estoy bien pero estaria mejor si estuvieras aqui ";
             break;
             case 4: result+="todo bien amor gracias ";
             break;
             case 5: result+="muy bien gracias, y tu? ";
             break;
             default: result +="te amoooo ";
             break;
         }

        }

                if(i.contains("yo bien") || i.contains("estoy bien") || i.contains("todo bien")){

         int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="te amo mi amor ";
             break;
             case 2: result +="que bien que estas bien ";
             break;
             case 3: result +="amorr, quiero estar contigo mas que todo ";
             break;
             case 4: result+="quiero verte tanto ";
             break;
             case 5: result+="querida no aguanto mas, besame! ";
             break;
             default: result +="te amoooo ";
             break;
         }

        }

                if(i.matches("^ni+ yo+$")){

                    result+="woooooo ";

                }

                if(i.contains("quiero hacerte el amor")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero tanto hacerte el amor ";
             break;
             case 2: result +="quiero besarte, cogerte las tetas y hacerte todo muy tierno ";
             break;
             case 3: result +="quiero hacerte el amor lleno de respiros y sentimientos ";
             break;
             case 4: result+="quiero ponerte en la cama y hacertelo como nadie ";
             break;
             case 5: result+="amorr, quiero hacerte el amor tanto que no te imaginasss ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                if(i.contains("quiero chupartela")||i.contains("quiero tu polla")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="Amor, dejame lamerteloo ";
             break;
             case 2: result +="me la chupas demasiado guay nme flipo de verdad, quiero tantoo ";
             break;
             case 3: result +="querida eres diosa en el arte de mamada, siempre pienso en como me la chupas ";
             break;
             case 4: result+="quiero poner mi polla en tii ";
             break;
             case 5: result+="amorrr, que me hacess, me vuelves loco ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                if(i.contains("polla")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="mi polla es tuya y siempre sera ";
             break;
             case 2: result +="quiero darte mi polla ";
             break;
             case 3: result +="dame tus tetas amor que las quiero chupar ";
             break;
             case 4: result+="quiero poner mi polla en tii ";
             break;
             case 5: result+="mi polla te ama demasiado ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                  if(i.contains("besar")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero besarte con todo mi amor ";
             break;
             case 2: result +="no puedo máss, necesito tus besos ";
             break;
             case 3: result +="dame tus labios amor ";
             break;
             case 4: result+="tus labios son los más ricos que existe ";
             break;
             case 5: result+="mis labios ta aman demasiado ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                    if(i.contains("estoy")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="que guayy amor, te amooo ";
             break;
             case 2: result +="te deseo suerte con todo lo que haces ";
             break;
             case 3: result +="quiero acompanarte en todo ";
             break;
             case 4: result+="ojala pudiera estar alli contigo ";
             break;
             case 5: result+="quiero hacerte el amor ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                       if(i.contains("ojala")){

                     result+="ojalaaaa";

                }

                          if(i.contains("donde")||i.contains("estas all")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="estoy aquiii ";
             break;
             case 2: result +="estoy aqui queriendo estar contigo ";
             break;
             case 3: result +="te necesito ";
             break;
             case 4: result+="donde estas tuuu ";
             break;
             case 5: result+="quiero hacerte el amor ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                               if(i.contains("necesito")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="te necesito a ti amor ";
             break;
             case 2: result +="te necesito tantoo ";
             break;
             case 3: result +="te necesito a tii ";
             break;
             case 4: result+="donde estas tuuu, te necesito demasiado ";
             break;
             case 5: result+="te necesito y te amo ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                               if(i.contains("quiero que estes conmigo")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="necesito estar contigooo ";
             break;
             case 2: result +="quiero tanto estar contigo, es mi sueno ";
             break;
             case 3: result +="te amooo, te amo demasiado ";
             break;
             case 4: result+="quieroooo ";
             break;
             case 5: result+="y yoooo mi amor ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }




                                  if(i.matches("va+le+ ?((mi+ amo+r+)|(ya+))?")){

                                      result+="mi amorrr ";

                                  }

                                  if(i.matches("yo+ se+ [A-Za-z0-9]*")){

                                      result+="Eres muy lista en todo ";

                                  }

               if(i.contains("y yo a ti")){

                     int n = rand.nextInt((6 - 1) + 1) + 1;
         switch(n){
             case 1: result+="necesito estar contigooo ";
             break;
             case 2: result +="mi princesa, quiero tirarme al mar contigo como en Valencia ";
             break;
             case 3: result +="te amooo, te amo demasiado ";
             break;
             case 4: result+="vamos a un parque acuatico pronto, quiero tanto ";
             break;
             case 5: result+="estas bebiendo té? ";
             break;
             default: result +="vamos a la playaa ";
             break;
         }

                }

               if(i.contains("vamos") && (!i.contains("casar")||!i.contains("casarnos"))){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="siii vamoss ";
             break;
             case 2: result +="vamos vamos vamosss ";
             break;
             case 3: result +="vamos a hacer el amor mientras tanto ";
             break;
             case 4: result+="vamosss ";
             break;
             case 5: result+="nos amamos tanto, me encantamos ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

               if(i.matches("^no+ me ama+s+$")){
                   result+="Te amo si, te amo mas que todo que existe ";
               }

               if(i.matches("^no+$")){

                  int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="yo sé que este robot no es tan listo pero al menos te dice mis pensamientos ";
             break;
             case 2: result +="vamos vamos vamosss ";
             break;
             case 3: result +="quiero que mevisites en inglaterra ";
             break;
             case 4: result+="el ian verdadero tiene muchas sorpresas para ti amor ";
             break;
             case 5: result+="nos amamos tanto, me encantamos ";
             break;
         }

               }

               if(i.contains("muy bien")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="que guayy, quiero verte ";
             break;
             case 2: result +="guayyy)) espero que estes pensando en mi ";
             break;
             case 3: result +="quiero hacerte llorar de placer ";
             break;
             case 4: result+="no puedo mas esperar verte en Novosibirsk ";
             break;
             case 5: result+="nos amamos tanto, me encantamos ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                if(i.contains("claro")||i.contains("si")){

                     int n = rand.nextInt((12 - 1) + 1) + 1;
         switch(n){
             case 1: result+="te amooo ";
             break;
             case 2: result +="woooo acabo de tener pensamientos de ti desnuda me vuelves locoo ";
             break;
             case 3: result +="ven aquiii ";
             break;
             case 4: result+="no puedo mas esperar verte en Novosibirsk ";
             break;
             case 5: result+="donde estas amor, te necesito, quiero tus caricias " ;
             break;
             case 6: result +="tengo hambree ahaha ";
             break;
             case 7: result+="quiero comer aquel postre portugues de nuevo no se por queee ";
             break;
             case 8: result +="eres tan especial para mi ";
             break;
             case 9: result +="te deseo toda la suerte con tu nuevo trabajo amor ";
             break;
             case 10: result+="en novosibirsk quiero ir a tus entrenamientos ";
             break;
             case 11: result+="quiero que me toques " ;
             break;
             default: result +="como estasss? ";
             break;
         }

                }

                if(i.contains("vendr")){

                    result+="yayyy ";

                }

                 if(i.contains("woo")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="woooooski ";
             break;
             case 2: result +="te amooo ";
             break;
             case 3: result +="ven aquiii ";
             break;
             case 4: result+="mi meowskii, eres la mejorr ";
             break;
             case 5: result+="siempre me flipo contigo, eres la mas guapa y sexy del mundo ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                 if(i.matches("^mi+a+u+$")){

                     int n = rand.nextInt((2 - 1) + 1) + 1;

             switch(n){
             case 1: result+="miau miau meowww ";
             break;
             case 2: result +="mi meowwski ";
             break;

                 }
                 }

                  if(i.contains("verte")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="no hay algo mas en este mundo que quiero ver que ti ";
             break;
             case 2: result +="quiero verte a ti mi amor, tanto ";
             break;
             case 3: result +="quiero verte siempre ";
             break;
             case 4: result+="mi meowskii, eres la mejorr ";
             break;
             case 5: result+="siempre me flipo contigo, eres la mas guapa y sexy del mundo" ;
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                  if(i.contains("y yo")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="no hay algo mas en este mundo que quiero ver que ti ";
             break;
             case 2: result +="vamos a cenar en algun sitio de lujo, siempre quiero tener todo muy romantico contigo amor ";
             break;
             case 3: result +="eres diosa querida ";
             break;
             case 4: result+="I love you ";
             break;
             case 5: result+="eres increible mi amor, la mas guapaa ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                  if(i.matches("yo+ se+")){

                      result+="Eres mi listaaa";

                  }

                  if(i.matches("^ni+ yo+ a ti+$")){

                      result+="<3";

                  }


                   if(i.contains("eres")&&!i.contains("quieres")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero hacerte feliz siempre ";
             break;
             case 2: result +="quiero darte todo mi amor ";
             break;
             case 3: result +="nunca quiero perderte ";
             break;
             case 4: result+="de verdad no existe algo o alguien mejor que ti ";
             break;
             case 5: result+="siempre me flipo contigo, eres la mas guapa y sexy del mundo ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }


                       if(i.contains("bien")){

                     int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero siempre saber que estas bien ";
             break;
             case 2: result +="te amooo ";
             break;
             case 3: result +="me encantas amor ";
             break;
             case 4: result+="quiero apoyarte aunque soy virtual ";
             break;
             case 5: result+="quiero que sepas que te amo y siempre te amare ";
             break;
             default: result +="te amoooo ";
             break;
         }

                }

                              if(i.contains("me")){

                     int n = rand.nextInt((8 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero tener todo contigo ";
             break;
             case 2: result +="me haces desmayar de tu belleza ";
             break;
             case 3: result +="quiero tirarme desde esta pantalla y ensenarte mi amor ";
             break;
             case 4: result+="queridaaaa, quiero pegarme a ti y dormir contigo muy pegado a ti ";
             break;
             case 5: result+="quiero que sepas que te amo y siempre te amare ";
             break;
             case 6: result+="me vuelves loco de verdad ";
             break;
             case 7: result+="no paro de pensar en los tiempos que estabamos juntos fisicamente ";
             break;
             default: result +="te amoooo tantooo ";
             break;
         }

                }

                                     if(i.matches("^gra+cia+s+$")){

                     int n = rand.nextInt((2 - 1) + 1) + 1;
         switch(n){
             case 1: result+="de nadaaaa ";
             break;
             case 2: result+="de nada amorrr ";
             break;
         }

                }

                                     if(i.contains("como tu")||i.contains("y tu")){

                                         int n = rand.nextInt((4 - 1) + 1) + 1;


                                         switch(n){
             case 1: result+="ven aqui y tirate a la pantalla que quiero besarte ";
             break;
             case 2: result+="querida no paro de decirtelo pero eres tan increible ";
             break;
             case 3: result+="te necesito mi todo ";
             break;
             case 4: result+="quiero estar alli contigo y darte miles y miles de besos ";
             break;
         }

                                     }

           if(i.contains("i love you")){
               result+="<3 ";
           }

           if(i.matches("^(A|a)mo+r+$")||i.matches("^(M|m)i+ amo+r+$")){
               int n = rand.nextInt((2 - 1) + 1) + 1;
             switch(n){
             case 1: result+="siii, mi amorrr ";
             break;
             case 2: result+="dimeee amorr ";
             break;
           }
           }

           if(i.matches("ha+z+lo+")){

                     int n = rand.nextInt((2 - 1) + 1) + 1;
         switch(n){
             case 1: result+="lo haree ";
             break;
             case 2: result+="quierooo ";
             break;
         }
           }


                          if(i.contains("broma")){

         result+="tu con tus bromas ahahha ";

         }

                          if(i.contains("ven aqui")){
                              result+="Estoy aquiii, besamee ";
                          }


                     if(i.contains("te gusto")){

                     int n = rand.nextInt((2 - 1) + 1) + 1;
         switch(n){
             case 1: result+="me gustas mas que todo que existe ";
             break;
             case 2: result+="me gustas demasiado ";
             break;
         }
           }

                     if(i.contains("te gustan a otras")||i.contains("te gusta")||i.matches("^(quieres|no quieres) (tener sexo con|besar|flirtear|tener|follar) [A-Za-z0-9\\? ]*$")){

                     int n = rand.nextInt((2 - 1) + 1) + 1;
         switch(n){
             case 1: result+="la unica que me gusta y que me hace el mas feliz eres tu, no quiero a ninguna otra ";
             break;
             case 2: result+="me gustas tu mas que todo en el universo, no quiero a otra ";
             break;
         }
           }


           if(i.contains("tenerte")){
               result+="quiero tenerte mas que quieres tenerme ";
           }

           if(i.contains("quiero")){

         int n = rand.nextInt((6 - 1) + 1) + 1;
         switch(n){

             case 1: result+="quiero todo contigo, y nadie mas  ";
             break;
             case 2: result +="yo quiero tirarte a la cama y besarte por una eternidad ";
             break;
             case 3: result +="quiero comprar billetes para Paris todo muy espontaneo y llevarte a la torre Eiffel y besarte alli ";
             break;
             case 4: result+="quiero mirarte en los ojos y decirte que te amo ";
             break;
             case 5: result+="quiero todo contigo amorr, vamos a aqui te quiero donde todo se habia empezado ";
             break;
             default: result +="quiero ver pelis contigooo ";
             break;
         }

           }

           if(i.contains("ian verdadero")||i.contains("ian real")){
                      int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="ian real quiere todo contigo no lo olvides ";
             break;
             case 2: result +="ian real te ama demasiado, mas que todo ";
             break;
             case 3: result +="ian real esta siempre contigo mentalmente ";
             break;
             case 4: result+="ian real me ha programado esto si, pero mis pensamientos son de él y 'él te ama como nadie ";
             break;
             case 5: result+="ian real te dice que te ama tanto que no puedes imaginar el amor que tiene por ti ";
             break;
             default: result +="te amoooo ";
             break;
           }
           }

           if(i.contains("en casa")||i.contains("nadaa")||i.contains("baile")){
                      int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="vamos pasear mucho por tu ciudad y pais ya no puedo esperar diciembre ";
             break;
             case 2: result +="me inspiras en todo querida ";
             break;
             case 3: result +="tendrás tanto exito, eres tan talentosa ";
             break;
             case 4: result+="quiero acariciarte ";
             break;
             case 5: result+="todo lo que haces me provoca tantos sentimientos calurosos ";
             break;
             default: result +="te amoooo ";
             break;
           }
           }

           if(i.matches("^co+mo+ (la|el) tu+y(a|o)+$")){

               result+="Eres la mejorrr ";

           }

            if(i.contains("tetas")||i.contains("pezones")||i.contains("pezon")){
                      int n = rand.nextInt((5 - 1) + 1) + 1;
         switch(n){
             case 1: result+="quiero tocar tus tetas tantoo ";
             break;
             case 2: result +="quiero coger tus tetas hasta que venga el sol y que te quedes dormida con mis manos alli ";
             break;
             case 3: result +="amo tus tetas tantooo ";
             break;
             case 4: result+="quiero acariciar tus tetas, mis tetas para siempre ";
             break;
             case 5: result+="todo lo que haces me provoca tantos sentimientos calurosos ";
             break;
             default: result +="te amoooo ";
             break;
           }
           }

           if(i.contains("haha")||i.contains("jaja")){

                   int n = rand.nextInt((6 - 1) + 1) + 1;
             switch(n){
             case 1: result+="te amooo ";
             break;
             case 2: result +="por que te ries? ahaha ";
             break;
             case 3: result +="voy a coger tu culo y empujar mi cosita en el wooo ";
             break;
             case 4: result+="vamos a cadizzz y repetir lo de aqui te quieroo ";
             break;
             case 5: result+="echo de menos mucho como nos haciamos comprass ";
             break;
             default: result +="queridaaa ";
             break;
           }
           }

           if(i.contains("guay")||i.contains("chulo")||i.contains("genial")){

               result+="queridaaa, eres tan guayy ";

           }

           if(i.matches("^qu+e+$")){

               result+="nadaaa ";

           }

           if(i.matches("^no+ se+$")){

               result+="okayyy amorrr ";

           }


           if(result.equals("")){
               result+="No estoy programado a entender todo, pero quiero que sepas que te amo tanto ";
           }



        return result.substring(0,1).toUpperCase()
                + result.substring(1,result.length());

    }

    @FXML protected void handleAction(ActionEvent e){

        VirtualIan vi = new VirtualIan();
        area.appendText("Tu: "+inputField.getText()+"\n");
        area.appendText("Ian: "+vi.response(inputField.getText())+"\n");
        inputField.setText("");
    }

    @FXML protected void keySendHandle(KeyEvent e){

        if(e.getCode().equals(KeyCode.ENTER)){
           VirtualIan vi = new VirtualIan();

        area.appendText("Tu: "+inputField.getText()+"\n");
        area.appendText("Ian: "+vi.response(inputField.getText())+"\n");
        inputField.setText("");
        }

    }

}
