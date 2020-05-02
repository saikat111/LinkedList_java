public class Main {
    public  static  void main(String args[]){
        Data one = new Data("saikat","Bogra", 13);
        Data two = new Data("Jemy","Dinajpur", 10);
        Data three = new Data("rakib","D", 10);
       LinkedList list = new LinkedList();
       list.addToFront(one);
        list.addToFront(two);
        list.printList();
        System.out.println("----->");
//        Number a = new Number(20);
//        Number b = new Number(30);
//        list.addToFront(a);
//        list.addToFront(b);
    System.out.println(list.getSize());
        System.out.println("----->");
    System.out.println(list.isEmpty());
        System.out.println("----->");
        list.removeFromFront();
        list.printList();
        list.removeFromFront();
        System.out.println("----->");
        list.printList();


    }
}
