package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class j0 extends AbstractList implements C4887z, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C4887z f58497a;

    class a implements ListIterator {

        /* renamed from: a  reason: collision with root package name */
        ListIterator f58498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58499b;

        a(int i10) {
            this.f58499b = i10;
            this.f58498a = j0.this.f58497a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return (String) this.f58498a.next();
        }

        /* renamed from: c */
        public String previous() {
            return (String) this.f58498a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f58498a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f58498a.hasPrevious();
        }

        public int nextIndex() {
            return this.f58498a.nextIndex();
        }

        public int previousIndex() {
            return this.f58498a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        Iterator f58501a;

        b() {
            this.f58501a = j0.this.f58497a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return (String) this.f58501a.next();
        }

        public boolean hasNext() {
            return this.f58501a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public j0(C4887z zVar) {
        this.f58497a = zVar;
    }

    /* renamed from: b */
    public String get(int i10) {
        return (String) this.f58497a.get(i10);
    }

    public List e() {
        return this.f58497a.e();
    }

    public Iterator iterator() {
        return new b();
    }

    public C4887z j() {
        return this;
    }

    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    public Object s(int i10) {
        return this.f58497a.s(i10);
    }

    public int size() {
        return this.f58497a.size();
    }

    public void u(C4868f fVar) {
        throw new UnsupportedOperationException();
    }
}
