package designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonWithSerialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7127076046648700751L;
	public static SingletonWithSerialization instance1 = new SingletonWithSerialization();
	public static void main(String[] args) {

        try
        {
            ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ajku0717\\Desktop\\file.text"));
            out.writeObject(instance1);
            out.close();
     
            // deserailize from file to object
            ObjectInput in 
                = new ObjectInputStream(new FileInputStream("C:\\Users\\ajku0717\\Desktop\\file.text"));
             
            SingletonWithSerialization instance2 = (SingletonWithSerialization) in.readObject();
            in.close();
     
            System.out.println("instance1 hashCode:- "
                                                 + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                                                 + instance2.hashCode());
        } 
         
        catch (Exception e) 
        {
            e.printStackTrace();
        }

	}
	protected Object readResolve() {  //If this method is not implemented then new instance will be created during deserialization
        return instance1;  
    }  

}
