/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;

import java.util.ArrayList;


/**
 *
 * @author chenjie.yu
 */
public class LearningJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PetStore myPetStore = new PetStore();
        String[] names = {"Alex", "Barbara","Celine","Daniel","Esther","Frank","George","Herbert"};
        int[] ages = {5, 7, 2, 4, 4, 5, 3, 1};
        String[] animals = {"Cat", "Dog", "Parrot", "Dog", "Cat", "Parrot", "Cat", "Dog"};
        int[] prices = {100, 150, 200, 56, 88, 90, 350, 100};
        
        for (int index = 0; index < names.length; index++)
        {
           if (animals[index].equals("Cat")){
               myPetStore.addAnimal(new Cat(names[index],ages[index]), prices[index]);
               
           }
           else if (animals[index].equals("Dog")){
               myPetStore.addAnimal(new Dog(names[index],ages[index]), prices[index]);
           }
           else if (animals[index].equals("Parrot")){
               myPetStore.addAnimal(new Parrot(names[index],ages[index]), prices[index]);
           }
        }
        myPetStore.printAllAnimalsPrices();
       
    }
    
}

