public interface SomeService{
    int a=10;
    void test();
    String returnLength();
    default int count(){
        return 10;
    }
}