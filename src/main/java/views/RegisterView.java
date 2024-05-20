package views;

public class RegisterView {
    public RegisterView(){

    }

    @Override
    public String toString() {
        return String.format("<div class=\"information\">"+
        "<form action=\"doregistration.jsp\" method=\"post\" class=\"information-form\">"+
            "<h2>Sing In</h2>"+
            "<label for=\"name\">Name:</label>"+
            "<input type=\"text\" id=\"name\" name=\"name\" required>"+
            "<label for=\"Surname\">Surname:</label>"+
            "<input type=\"text\" id=\"surname\" name=\"surname\" required>"+
            "<label for=\"e-mail\">E-Mail:</label>"+
            "<input type=\"email\" name=\"email\" id=\"email\" required>"+
            "<label for=\"password\">Password:</label>"+
            "<input type=\"password\" name=\"password\" id=\"password\">"+
            "<label for=\"username\">Username:</label>"+
            "<input type=\"text\" name=\"username\" id=\"username\">"+
            "<input type=\"submit\" value=\"Sing Up\" id=\"button\">"+
        "</form>"+
        "<p>You have already an account? <a href=\"index.jsp\">Log In</a>.</p>"+
    "</div>");
    }
}
