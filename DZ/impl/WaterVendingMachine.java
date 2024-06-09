package DZ.impl;

import DZ.Product;
import DZ.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
