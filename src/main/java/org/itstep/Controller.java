package org.itstep;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setPrimeBar(GlobalConstants.MIN, GlobalConstants.MAX);
        model.setSecretValue();
//        System.out.println(model.getSecretValue());

        while (!model.checkValue(inputIntValueWithScanner(scanner))) {        }

        view.printCongratulation(model);
        view.printWay(model);
    }

    private int inputIntValueWithScanner(Scanner scanner) {
        int res = 0;
        view.printMessage(view.getInputMessage(model.getMinBar(), model.getMaxBar()));

        while (true) {
            while (!scanner.hasNextInt()) {
                view.printWrongIntInput(model);
                scanner.next();
            }
            if ((res = scanner.nextInt()) <= model.getMinBar() || res >= model.getMaxBar()) {
                view.printWrongRangeInput(model);
                continue;
            }
            break;
        }
        return  res;
    }
}
