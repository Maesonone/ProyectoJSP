package views;

import users.LoggedUser;

public class MenuView {
    LoggedUser user = null;

    public MenuView(LoggedUser user){
        this.user = user;
    }

    @Override
    public String toString() {
        return 
        "<div class=\"menu-lateral\">"+
        "    <ul class=\"nav-menu flex-column text-white\">"+
        "        <li class=\"menu-item\">"+
        "            <a class=\"menu-link text-white\" href=\"home.jsp\">Inicio</a>"+
        "        </li>"+
        "        <li class=\"menu-item\">"+
        "            <a class=\"menu-link text-white\" href=\"logout.jsp\">Log Out</a>"+
        "        </li>"+
        "    </ul>"+
        "</div>";
    }    
}
