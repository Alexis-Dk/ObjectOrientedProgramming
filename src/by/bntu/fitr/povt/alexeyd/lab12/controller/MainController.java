package by.bntu.fitr.povt.alexeyd.lab12.controller;

import by.bntu.fitr.povt.alexeyd.lab12.model.entity.*;
import by.bntu.fitr.povt.alexeyd.lab12.model.logic.NumberLogic;
import by.bntu.fitr.povt.alexeyd.lab12.model.logic.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab12.model.logic.VectorAssistance;
import by.bntu.fitr.povt.alexeyd.lab12.util.SubGroup;
import by.bntu.fitr.povt.alexeyd.lab12.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab12.view.Printer;

public class MainController {

    private static final int SIZE = 100;
    private Printer printer = new Printer();
    private UserInput userInput = new UserInput();

    public void executeMainTask() {
        Bucket bucket = new Bucket("POIT30701117");

        bucket.addProduct(new Bread(true, 500, 1.2, true, "Borodinskiy",
            "Chilli", "Brown", "Square", 1276234), SubGroup.BREAD.getGroupCode());
        bucket.addProduct(new Orange(false, 110, 0.7, 11, 0.1,
            true, "Rosso", "Elipse", 73483438), SubGroup.FRUIT.getGroupCode());
        bucket.addProduct(new Milk(false, 450, 2.1, 500, 3.2, 7.7,
            false, true, 32635623), SubGroup.MILK.getGroupCode());
        bucket.addProduct(new Milk(false, 450, 2.3, 500, 5.2, 9.7,
            false, true, 32635624), SubGroup.MILK.getGroupCode());
        System.out.println("Found index: " + bucket.getIndexById(bucket.getContainer(), 73483438, SubGroup.FRUIT.getGroupCode()));
        bucket.deleteProductByIndex(1, SubGroup.MILK.getGroupCode());
        double avgBucketPrice = ShopAssistance.calculateAvgPrice(bucket);
        double avgBucketWeight = ShopAssistance.calculateAvgWeight(bucket);
        boolean prize = ShopAssistance.getPrize(bucket);

        printer.print("\nAvg bucket price = " + avgBucketPrice);
        printer.print("\nAvg bucket weight = " + avgBucketWeight);
        printer.print(prize ? "\nYou won a prize!\n" : "\n");
        printer.print(bucket);
    }

    public void executeAdditionExamTask() {
        VectorContainer vectorContainer = new VectorContainer("SuperVector");
        vectorContainer.addElement(3);
        vectorContainer.addElement(2);
        vectorContainer.addElement(7);
        vectorContainer.addElement(8);
        vectorContainer.addElement(1);
        vectorContainer.addElement(1);

        int[] arr = vectorContainer.getContainer();
        int[] modifiedArr = VectorAssistance.getModifiedArray(vectorContainer);
        printer.print(arr);
        printer.print("");
        printer.print(modifiedArr);

    }

    public void executeAdditionTask() {
        printer.print("The program guesses user number from 1 to 100, using two algorithms - binary and using" +
            " random number generator.\n");

        //Statics method which returns int number from input:
        int[] arr = NumberLogic.initArr(SIZE);
        int number = userInput.inputNumber("\nInput number from 1 to 99: ");


        //Getting indexes bu using two different search-methods - by binary and by randomly
        int indexByUsingBynary = NumberLogic.binarySearch(arr, 0, SIZE, number);
        int indexByUsingRandom = NumberLogic.randomSearch(arr, SIZE, number);

        //Print results
        printer.print("indexByUsingBynary = " + indexByUsingBynary);
        printer.print("indexByUsingRandom = " + indexByUsingRandom);

    }
}
