package views;

import users.LoggedUser;

public class FooterView {
    LoggedUser user = null;

    public FooterView(LoggedUser user){
        this.user = user;
    }


    @Override
    public String toString() {
        return 
        "<footer class=\"footer\">"+
        "    <div id=\"footer\">"+
        "        © 2024 Todos Los Derechos Reservados."+
        "    </div>"+
        "</footer>";
    }
    
}
