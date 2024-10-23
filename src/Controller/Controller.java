package Controller;

import Model.Dao.StudentDao;
import ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private StudentDao model;
    private List<Observer> observerList = new ArrayList<>();

    public Controller(StudentDao s, Observer ... o) { // Varargs, Observer typ för att säkerhetsställa att endast objekt som implementerar observer ska kunna bli observers
        this.model = s;
        this.observerList.addAll(Arrays.asList(o)); // Adda alla  samtidigt


    }
}
