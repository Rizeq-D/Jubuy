public class Store {
    String storeName;
    String address;
    int pobox;
    int tell;
    Store(String storeName, String address, int pobox, int tell){
        this. storeName=storeName;
        this.address=address;
        this.pobox=pobox;
        this.tell=tell;
    }
    void printStoreInfo(){
        System.out.println("Store Name:"+this.storeName+"   " +  "Location:"+this.address +"   " +"P.O.B.O.X:"+this.pobox+"   " +"Contact:"+this.tell);

    }
}
