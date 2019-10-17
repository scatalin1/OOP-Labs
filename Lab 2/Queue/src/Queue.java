import java.util.ArrayList;
import java.util.List;

public class Queue {

    //    Create a class Queue and instantiate 2 objects of this type.
//    Each queue should have as state the number of elements from it
//    and can be created via constructors with and without parameter.
//    If it is created with parameter,
//    then it should have that parameter value maximum size,
//    otherwise it should not have that limitation.
//
//    You should be able to add to queue via a queue.push(Type value); method.
//    Also You should be able to extract the items from
//    queue via queue.pop(); method.
//
//    The rule for push and pop to queue you should consider from Data Structures
//    course or find somewhere in web, the rule of FIFO.
//
//    In the program after you create the queues (with param and without),
//    add by 3 values to queue and then extract last value from each of them
//    and print in console.


    public List elements;
    public int size;
    public boolean isWithParameter;


    public Queue(int size){
        this.elements = new ArrayList();
        this.size = size;
        isWithParameter = true;
    }

    public Queue(){
        this.elements = new ArrayList();
        isWithParameter = false;
    }

    public void push(int value){
        elements.add(value);
    }

    public void pop(){
        elements.remove(0);
    }

    //    In class Queue add a method for that checks if the object is empty
//    and one that checks if the object is full
//    (in case queue has no parameters, it should say it is never full,
//    otherwise it should check the number of elements compared to the queue size).
//    Also use these methods in a program and print the results in console.

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public boolean isFull(){
        if (size == elements.size())
            return true;
        if (!isWithParameter) {
            System.out.println("The queue is unlimited, it is never full.");
        }
        return false;
    }


}
