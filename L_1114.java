class Foo {
    Map<String, Integer> map; 

    public Foo() {
        map = new HashMap<>();
        map.put("first", 0);
        map.put("second",0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        map.put("first",1);
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(map.get("first")!=1)
        {
            
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        map.put("second",1);
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(map.get("second")!=1)
        {
            
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}