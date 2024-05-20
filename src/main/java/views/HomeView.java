package views;

import users.LoggedUser;

public class HomeView {
    LoggedUser user = null;

    public HomeView(LoggedUser user){
        this.user = user;
    }


    @Override
    public String toString() {
        return 
            "<div class=\"min-vh-100 d-flex flex-column\">"+
                (new HeaderView(user))+
            "   <div class=\"flex-grow-wrapper\">"+
            "       <div class=\"row\">"+
                       (new MenuView(user))+
                       (new MainView(user))+
            "       </div>"+
            "   </div>"+
                (new FooterView(user))+
            "</div>";
    }
    
}