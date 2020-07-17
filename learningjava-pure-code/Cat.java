/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;

/**
 *
 * @author chenjie.yu
 */
public class Cat extends Animal{
    private boolean hasTail = true;
    
    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public String meow()
    {
        return "Meow Meow! My age is "+age;
    }
    public String getName()
    {
        return name;
    }
    
    public void printIsTwoYearsOld()
    {
        System.out.println("Is the cat's age two years old?");
        System.out.println(age == 2);
    }
}
