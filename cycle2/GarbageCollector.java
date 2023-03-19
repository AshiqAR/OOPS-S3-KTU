public class GarbageCollector {
    public void finalize(){
        System.out.println("Garbage Collected");
    }
    public static void main(String args[]){
        GarbageCollector obj1 = new GarbageCollector();
        GarbageCollector obj2 = new GarbageCollector();
        obj1=null;  
        obj2=null;  
        System.gc();
    }
}
