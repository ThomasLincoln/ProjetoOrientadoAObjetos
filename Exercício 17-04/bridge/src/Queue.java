public abstract class Queue {
    protected Implementador implementador1;

    protected Queue(Implementador implementador1) {
        this.implementador1 = implementador1;
    }

    abstract public void adcionar(int o);
    abstract public void remover();
    abstract public void isEmpty();
    abstract public void size();
    abstract public void imprimir();
}
