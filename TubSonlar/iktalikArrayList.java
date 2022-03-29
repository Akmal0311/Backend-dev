package TubSonlar;

import java.util.ArrayList;

public class iktalikArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grocerylist = new ArrayList();

        ArrayList<String> bakerylist = new ArrayList();

        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");

        ArrayList<String> productlist = new ArrayList();

        productlist.add("tomatoes");
        productlist.add("zucchini");
        productlist.add("pepper");

        ArrayList<String> drinkslist = new ArrayList();

        drinkslist.add("soda");
        drinkslist.add("coffee");
        drinkslist.add("pepsi");

        grocerylist.add(bakerylist);
        grocerylist.add(productlist);
        grocerylist.add(drinkslist);


        System.out.println(grocerylist.get(2).get(2));

    }
}
