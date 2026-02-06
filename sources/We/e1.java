package We;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import p003if.a;

abstract class e1 implements Collection, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;

    /* renamed from: a  reason: collision with root package name */
    private final Collection f65846a;

    /* renamed from: b  reason: collision with root package name */
    final a f65847b;

    e1(Collection collection) {
        if (collection != null) {
            this.f65846a = collection;
            this.f65847b = new a();
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    /* access modifiers changed from: protected */
    public Collection a() {
        return this.f65846a;
    }

    public boolean add(Object obj) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean add = a().add(obj);
            if (a10 != null) {
                a10.close();
            }
            return add;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean addAll(Collection collection) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean addAll = a().addAll(collection);
            if (a10 != null) {
                a10.close();
            }
            return addAll;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void clear() {
        C5664z a10 = this.f65847b.a();
        try {
            a().clear();
            if (a10 != null) {
                a10.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean contains(Object obj) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean contains = a().contains(obj);
            if (a10 != null) {
                a10.close();
            }
            return contains;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean containsAll(Collection collection) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean containsAll = a().containsAll(collection);
            if (a10 != null) {
                a10.close();
            }
            return containsAll;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean isEmpty() {
        C5664z a10 = this.f65847b.a();
        try {
            boolean isEmpty = a().isEmpty();
            if (a10 != null) {
                a10.close();
            }
            return isEmpty;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Iterator iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean remove = a().remove(obj);
            if (a10 != null) {
                a10.close();
            }
            return remove;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean removeAll(Collection collection) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean removeAll = a().removeAll(collection);
            if (a10 != null) {
                a10.close();
            }
            return removeAll;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public boolean retainAll(Collection collection) {
        C5664z a10 = this.f65847b.a();
        try {
            boolean retainAll = a().retainAll(collection);
            if (a10 != null) {
                a10.close();
            }
            return retainAll;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public int size() {
        C5664z a10 = this.f65847b.a();
        try {
            int size = a().size();
            if (a10 != null) {
                a10.close();
            }
            return size;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public String toString() {
        C5664z a10 = this.f65847b.a();
        try {
            String obj = a().toString();
            if (a10 != null) {
                a10.close();
            }
            return obj;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
