package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;

import java.util.List;

public class View {

    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {

        Entity book = new Book(900, "War and piece");
        book.setWeight(700);
        controller.add(book);

        Entity apple = new Apple("red");
        apple.setWeight(50);
        controller.add(apple);

        Entity cake = new Cake("mint,vanilla");
        cake.setWeight(1000);
        controller.add(cake);

        Entity book2 = new Book(150, "The man and the sea");
        book2.setWeight(-2);
        controller.add(book2);

        Entity cake2 = new Cake("chocolate");
        cake.setWeight(5000);
        controller.add(cake);

        List<Entity> entities = controller.filterWeight();

        for (Entity entity: entities) {
            System.out.println(entity);
        }
    }
}
