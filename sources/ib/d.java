package Ib;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class d implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f51138a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51139b;

    d(h hVar, Object obj, Comparator comparator, boolean z10) {
        int i10;
        this.f51139b = z10;
        while (!hVar.isEmpty()) {
            if (obj == null) {
                i10 = 1;
            } else if (z10) {
                i10 = comparator.compare(obj, hVar.getKey());
            } else {
                i10 = comparator.compare(hVar.getKey(), obj);
            }
            if (i10 < 0) {
                if (z10) {
                    hVar = hVar.b();
                } else {
                    hVar = hVar.o();
                }
            } else if (i10 == 0) {
                this.f51138a.push((j) hVar);
                return;
            } else {
                this.f51138a.push((j) hVar);
                if (z10) {
                    hVar = hVar.o();
                } else {
                    hVar = hVar.b();
                }
            }
        }
    }

    /* renamed from: a */
    public Map.Entry next() {
        try {
            j jVar = (j) this.f51138a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(jVar.getKey(), jVar.getValue());
            if (this.f51139b) {
                for (h b10 = jVar.b(); !b10.isEmpty(); b10 = b10.o()) {
                    this.f51138a.push((j) b10);
                }
            } else {
                for (h o10 = jVar.o(); !o10.isEmpty(); o10 = o10.b()) {
                    this.f51138a.push((j) o10);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        if (this.f51138a.size() > 0) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
