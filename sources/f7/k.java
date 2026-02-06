package f7;

import android.util.SparseArray;
import java.util.LinkedList;

public class k {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray f43444a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    a f43445b;

    /* renamed from: c  reason: collision with root package name */
    a f43446c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        a f43447a;

        /* renamed from: b  reason: collision with root package name */
        int f43448b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList f43449c;

        /* renamed from: d  reason: collision with root package name */
        a f43450d;

        public String toString() {
            return "LinkedEntry(key: " + this.f43448b + ")";
        }

        private a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f43447a = aVar;
            this.f43448b = i10;
            this.f43449c = linkedList;
            this.f43450d = aVar2;
        }
    }

    private void b(a aVar) {
        if (aVar != null && aVar.f43449c.isEmpty()) {
            d(aVar);
            this.f43444a.remove(aVar.f43448b);
        }
    }

    private void c(a aVar) {
        if (this.f43445b != aVar) {
            d(aVar);
            a aVar2 = this.f43445b;
            if (aVar2 == null) {
                this.f43445b = aVar;
                this.f43446c = aVar;
                return;
            }
            aVar.f43450d = aVar2;
            aVar2.f43447a = aVar;
            this.f43445b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f43447a;
            a aVar3 = aVar.f43450d;
            if (aVar2 != null) {
                aVar2.f43450d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f43447a = aVar2;
            }
            aVar.f43447a = null;
            aVar.f43450d = null;
            if (aVar == this.f43445b) {
                this.f43445b = aVar3;
            }
            if (aVar == this.f43446c) {
                this.f43446c = aVar2;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f43444a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object pollFirst = aVar.f43449c.pollFirst();
        c(aVar);
        return pollFirst;
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f43444a.get(i10);
            if (aVar == null) {
                aVar = new a((a) null, i10, new LinkedList(), (a) null);
                this.f43444a.put(i10, aVar);
            }
            aVar.f43449c.addLast(obj);
            c(aVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized Object f() {
        a aVar = this.f43446c;
        if (aVar == null) {
            return null;
        }
        Object pollLast = aVar.f43449c.pollLast();
        b(aVar);
        return pollLast;
    }
}
