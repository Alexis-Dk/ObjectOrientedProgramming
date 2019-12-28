package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.utils.Constant;
import by.bntu.fitr.povt.alexeyd.lab16.utils.InputUtil;

import java.util.List;

public class SerializableBinaryDataGenerator implements DataGenerator {

    public List<Product> read() {
        List<Product> products = InputUtil.readUsingObjectInputStream(Constant.SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH);
        return products;
    }
}
