package views;

public class LoginView {
    public LoginView(){

    }

    @Override
    public String toString() {
        return String.format("<div class=\"information\">"+
        "<form action=\"login.jsp\" method=\"POST\" class=\"information-form\">"+
            "<h2>Log In</h2>"+
            "<label for=\"name\">User:</label>"+
            "<input type=\"text\" id=\"name\" name=\"username\" required>"+
            "<label for=\"Pasword\">Pasword:</label>"+
            "<input type=\"password\" id=\"password\" name=\"password\" required>"+
            "<input type=\"submit\" value=\"Log In\" id=\"button\">"+
        "</form>"+
        "<p>You don't have an account yet? <a href=\"register.jsp\">Sign Up</a>.</p>"+
    "</div>");
    }
}
