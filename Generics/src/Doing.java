public class Doing<K extends Person, V> {
    private K job;
    private V work;

    public Doing(K job, V work) {
        this.job = job;
        this.work = work;
    }

    public K getJob() {
        return job;
    }

    public V getWork() {
        return work;
    }

    public void setJob(K job) {
        this.job = job;
    }

    public void setWork(V work) {
        this.work = work;
    }

}
