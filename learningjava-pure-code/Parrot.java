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
public class Parrot extends Animal{
    
    public Parrot(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void newName(String newName)
    {
        this.name = newName;
    }
    
    public void speak(String speakString)
    {
        System.out.println(this.name+" says "+speakString);
    }
    public void speakFirst(String speakString)
    {
        System.out.println(this.name+" says "+speakString.substring(0,1));
    }
    
    public void speakRest(String speakString)
    {
        System.out.println(this.name+" says "+speakString.substring(1));
    }
    
    public void sqwark(String speakString)
    {
        if ((speakString.substring(0,1).equals("a")) || (speakString.substring(0,1).equals("b"))){
            speakFirst(speakString);
        }
        else if (speakString.substring(0,1).equals("c")){
            speakRest(speakString);
        }
        else{
            speak(speakString);
        }
    }
    
    public void iterateSpeak(String speakString)
    {
        for (int index = 0; index < speakString.length(); index++)
        {
            if (speakString.substring(index, index+1).equals("b"))
            {
                break;
            }
            else if (speakString.substring(index, index+1).equals("f")){
                continue;
            }
            System.out.println(speakString.substring(index, index+1));
        }
        System.out.println("finished");
    }
  
}
