package We;

import java.util.Queue;

final class f1 extends e1 implements Queue {
    private static final long serialVersionUID = 1;

    private f1(Queue queue) {
        super(queue);
    }

    static f1 d(Queue queue) {
        return new f1(queue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Queue a() {
        return (Queue) super.a();
    }

    public Object element() {
        C5664z a10 = this.f65847b.a();
        try {
            Object element = a().element();
            if (a10 != null) {
                a10.close();
            }
            return element;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        C5664z a10 = this.f65847b.a();
        try {
            boolean equals = a().equals(obj);
            if (a10 != null) {
                a10.close();
            }
            return equals;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public int hashCode() {
        C5664z a10 = this.f65847b.a();
        try {
            int hashCode = a().hashCode();
            if (a10 != null) {
                a10.close();
            }
            return hashCode;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean offer(Object obj) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean offer = a().offer(obj);
            if (a10 != null) {
                a10.close();
            }
            return offer;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Object peek() {
        C5664z a10 = this.f65847b.a();
        try {
            Object peek = a().peek();
            if (a10 != null) {
                a10.close();
            }
            return peek;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Object poll() {
        C5664z a10 = this.f65847b.a();
        try {
            Object poll = a().poll();
            if (a10 != null) {
                a10.close();
            }
            return poll;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Object remove() {
        C5664z a10 = this.f65847b.a();
        try {
            Object remove = a().remove();
            if (a10 != null) {
                a10.close();
            }
            return remove;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Object[] toArray() {
        C5664z a10 = this.f65847b.a();
        try {
            Object[] array = a().toArray();
            if (a10 != null) {
                a10.close();
            }
            return array;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Object[] toArray(Object[] objArr) {
        C5664z a10 = this.f65847b.a();
        try {
            Object[] array = a().toArray(objArr);
            if (a10 != null) {
                a10.close();
            }
            return array;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
