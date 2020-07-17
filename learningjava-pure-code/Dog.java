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
public class Dog extends Animal{
    private int legs = 4;
    private boolean hasTail = true;
    
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public String bark()
    {
        return "Woof! Woof!";
    }
    
    public void rename(String newName)
    {
        //TODO: Write method rename!
        this.name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void printNameIsBob()
    {
        if (!name.equals("Bob"))
        {
            System.out.println("Name is not Bob");
        }
    }
    
    public void printIsPuppy()
    {
        if (age < 3)
        {
            System.out.println("This dog is a puppy!");
        }
    }
    
}
