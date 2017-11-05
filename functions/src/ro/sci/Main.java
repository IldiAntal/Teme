package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchRequest;
import ro.sci.domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }

        CauciucController cauciucController = new CauciucController();

        SearchRequest searchRequest = new SearchRequest("Tiger");

        Cauciuc item = cauciucController.handleSearchRequest(searchRequest);

        if(item != null){
            System.out.println("Item gasit");
        }else{
            System.out.println("Nu se gaseste");
        }

    }



}
