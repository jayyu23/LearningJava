/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;

import java.util.ArrayList;
import java.util.HashMap;



/**
 *
 * @author chenjie.yu
 */
public class PetStore {
    private String name = "My PetStore";
    private HashMap<Animal, Integer> allAnimalsForSale = new HashMap<>();
    
    
    
    public PetStore()
    {
    }
    
    public void addAnimal(Animal newAnimal, int price)
    {
        allAnimalsForSale.put(newAnimal, price);
    }
    
    public void printAllAnimalsPrices()
    {
        for (Animal a: allAnimalsForSale.keySet()){
            String animalType = "";
            if (a instanceof Cat){
                animalType = "cat";
            }
            else if (a instanceof Dog){
                animalType = "dog";
            }
            else if (a instanceof Parrot){
                animalType = "parrot";
            }
            System.out.println(a.getName()+", a "+animalType+", costs $"+allAnimalsForSale.get(a));
        }
    }

    
}
