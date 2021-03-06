package by.bntu.fitr.povt.alexeyd.lab17.factory;

import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab17.utils.InputUtil;
import by.bntu.fitr.povt.alexeyd.lab17.utils.ShopAssistance;

import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab17.utils.Constant.SRC_RESOURCES_INPUT_BINARY_PATH;

public class BinaryDataGenerator implements DataGenerator {

    private static final String fileName = SRC_RESOURCES_INPUT_BINARY_PATH;

    public List<Product> read() {
        String data = InputUtil.readBinary(fileName);
        String[][] rowArr = ShopAssistance.prepareData(data);
        List<Product> products = ShopAssistance.parseProduct(rowArr);
        return products;
    }

}
