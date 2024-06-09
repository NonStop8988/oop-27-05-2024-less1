package DZ.impl;

import DZ.Product;
import DZ.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }
}
