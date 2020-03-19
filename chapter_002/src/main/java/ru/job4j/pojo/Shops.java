package ru.job4j.pojo;

public class Shops {
    public Product[] delete(Product[] products, int index) {
            for (int i = index; i < products.length - 1; i++) {
                products[i] = products[i + 1];

        }
        products[products.length -1] = null;
        return products;
    }
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product !=  null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Записываем в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }

        }
        System.out.println();
        Product products2[] = new Product[5];
        products2[1] = new Product("Milk", 10);
        products2[2] = new Product("Bread", 4);
        products2[3] = new Product("Egg", 19);

        Shops shops = new Shops();
        products = shops.delete(products2, 0);
        for (int index = 0; index < products2.length; index++) {
            if (products2[index] != null) {
              System.out.println(products2[index].getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
