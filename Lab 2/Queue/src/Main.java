public class Main {
    public static void main(String[] args) {

        int size = 3;
        Queue unlimitedQueue = new Queue();
        Queue limitedQueue = new Queue(size);

        unlimitedQueue.push(2);
        unlimitedQueue.push(4);
        unlimitedQueue.push(8);

        limitedQueue.push(1);
        limitedQueue.push(3);
        limitedQueue.push(5);
        System.out.println("Default unlimited Queue is "+unlimitedQueue.elements);
        System.out.println("Default limited Queue is "+limitedQueue.elements);

        unlimitedQueue.pop();
        limitedQueue.pop();
        System.out.println("Updated unlimited Queue is "+unlimitedQueue.elements);
        System.out.println("Updated limited queue is "+limitedQueue.elements);

        //Check if queues are empty
        System.out.println("The unlimited queue is empty: "+unlimitedQueue.isEmpty());
        System.out.println("The limited queue is empty: "+limitedQueue.isEmpty());

        //Check if full
        System.out.println("The unlimited queue is full: "+unlimitedQueue.isFull());
        System.out.println("The limited queue is full: "+limitedQueue.isFull());


    }
}
