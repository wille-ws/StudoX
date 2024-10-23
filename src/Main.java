import Controller.Controller;
import Model.Dao.StudentDao;
import View.View;

public class Main {
    public static void main(String[] args) {
        // Skapa Model
        StudentDao studentDao = StudentDao.getInstance();

        // Skapa View
        View view = new View();

        // Skapa Controller och skicka in instans av Model, lägg till View som lyssnare
        Controller controller = new Controller(studentDao, view); //varargs Observer




        // Main-klassen ansvarar för att skapa och binda samman Model, View och Controller.
        // View kommunicerar med Controller via händelselyssnare (ActionListeners).
        // Controller interagerar med Model för att utföra CRUD-operationer.
        // Model notifierar View om förändringar via Observer-mönstret.

        // Modell och View lösa kompositioner så man kan välja vad de ska inehålla och är alltså två objekt som binder samma nflera objekt
    }

}
