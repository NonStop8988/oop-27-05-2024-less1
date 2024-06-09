package DZ;

import DZ.impl.BottleOfWater;
import DZ.impl.EPackage;
import DZ.impl.HotDrinkVM;
import DZ.impl.WaterVendingMachine;
import DZ.impl.HotDrink;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product hotDrink1 = new HotDrink("Кофе", 50, LocalDate.of(2024, 6, 2), 60);
        Product hotDrink2 = new HotDrink("Чай", 30, LocalDate.of(2024, 4, 3), 50);
        Product hotDrink3 = new HotDrink("Кофе", 50, LocalDate.of(2024, 6, 2), 60);

        VendingMachine vm = new WaterVendingMachine();
        VendingMachine vmh = new HotDrinkVM();

        vm.addProducts(List.of(bottle1, bottle2));
        vmh.addProducts(List.of(hotDrink1, hotDrink2, hotDrink3));

        System.out.println(vm.getProducts());
        System.out.println(vmh.getProducts());

        vm.getProduct("Родники");
        vmh.getProduct("Кофе", 50, 60);

        System.out.println(vm.getProducts());
        System.out.println(vmh.getProducts());
    }
}