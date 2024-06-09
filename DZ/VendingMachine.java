package DZ;

import java.util.ArrayList;
import java.util.List;

import DZ.impl.HotDrink;

public class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    };

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public Product getProduct(String name, double price, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getPrice() == price && hotDrink.getTemperature() == temperature) {
                    products.remove(product);
                    return product;
                }
            }
        }
        System.out.println("No such product");
        return null;
    };
}