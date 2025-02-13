class remote{
//    have to create an variable instance to store object of class singleton
    public static remote instance;
//    we have to make constructor of the class and make it private in singleton
    private remote(){
        System.out.println("so no new remote is created");
    }
//    create the method to pass the remote to each family member
    public static remote gammler(){
        if(instance==null){
            instance = new remote();

        }
        return instance;
    }


//    here we have two methods so call them using old method and singleton method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

//    so if i created another method so
    public void channel(){
        System.out.println("change the channel");
    }
}


public class TVremoteexamplesingleton {
    public static void main(String[] args) {
//         so as remote is private in that we cannot create new remote
        remote t1 = remote.gammler();
        t1.showMessage();
//        after running the programm it is calling to the constructor and the method.

//        how i call channel if it was old method i do t1.channel
//        but here
        remote t2 = remote.gammler();
        t2.channel();
        System.out.println(t1==t2);
//        as here no new object is created just we call remote.

    }



}
