

public class MyList<T>{


   private T[] array;
   private int size;
   private int capacity;





public MyList(){
    this.capacity= 10;
    this.size =0;
    this.array = (T[]) new Object[this.capacity];





}


public MyList(int capacity){

    this.capacity=capacity;
    this.size =0;
    this.array = (T[]) new Object[this.capacity];









}

public void add(T data){

if(size == capacity ){

    System.out.println("Array is full ,cannot add more elements");

}

else{




}





}
















    public static void main(String[] args) {





























    }













}