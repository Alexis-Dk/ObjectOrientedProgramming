package by.bntu.fitr.povt.alexeyd.lab15.factory;

import by.bntu.fitr.povt.alexeyd.lab15.logic.InputUtil;
import by.bntu.fitr.povt.alexeyd.lab15.logic.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Product;

import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_INPUT_BINARY_PATH;

public class BinaryDataGenerator implements DataGenerator {

    private String fileName = SRC_RESOURCES_INPUT_BINARY_PATH;

    public List<Product> read() {
        String data = InputUtil.readBinary(fileName);
        String[][] rowArr = ShopAssistance.prepareData(data);
        List<Product> products = ShopAssistance.parseProduct(rowArr);
        return products;
    }

}
