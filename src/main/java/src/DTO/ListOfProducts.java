package src.DTO;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {
    List arrayOfProduct = new ArrayList<Herbal>();
    public void ListOfProducts(){

    }
    public List listofProduct(Object object)
    {
        arrayOfProduct.add(object);
        return arrayOfProduct;
    }
}
