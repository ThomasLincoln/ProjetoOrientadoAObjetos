public class Fifo extends Queue{
// TODO Auto-generated method stub
    protected Fifo(Implementador implementador1) {
        super(implementador1);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void adcionar(int o) {
        implementador1.enqueue( o);
        
    }

    @Override
    public void isEmpty() {
        boolean isEmpty = implementador1.isEmpty();        
        System.out.println(isEmpty);
    }

    @Override
    public void remover() {
        implementador1.dequeue();        
    }

    @Override
    public void size() {
        int size = implementador1.size();        
        System.out.println(size);
    }
    
}
