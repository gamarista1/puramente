package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.f  reason: case insensitive filesystem */
public abstract class C4868f implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C4868f f58458b = new i(C4881t.f58664d);

    /* renamed from: c  reason: collision with root package name */
    private static final C0868f f58459c;

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator f58460d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f58461a = 0;

    /* renamed from: com.google.protobuf.f$a */
    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f58462a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f58463b;

        a() {
            this.f58463b = C4868f.this.size();
        }

        public boolean hasNext() {
            if (this.f58462a < this.f58463b) {
                return true;
            }
            return false;
        }

        public byte nextByte() {
            int i10 = this.f58462a;
            if (i10 < this.f58463b) {
                this.f58462a = i10 + 1;
                return C4868f.this.m(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.f$b */
    class b implements Comparator {
        b() {
        }

        /* renamed from: a */
        public int compare(C4868f fVar, C4868f fVar2) {
            g r10 = fVar.r();
            g r11 = fVar2.r();
            while (r10.hasNext() && r11.hasNext()) {
                int compareTo = Integer.valueOf(C4868f.A(r10.nextByte())).compareTo(Integer.valueOf(C4868f.A(r11.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(fVar.size()).compareTo(Integer.valueOf(fVar2.size()));
        }
    }

    /* renamed from: com.google.protobuf.f$c */
    static abstract class c implements g {
        c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.f$d */
    private static final class d implements C0868f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.f$e */
    private static final class e extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: f  reason: collision with root package name */
        private final int f58465f;

        /* renamed from: g  reason: collision with root package name */
        private final int f58466g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            C4868f.g(i10, i10 + i11, bArr.length);
            this.f58465f = i10;
            this.f58466g = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        public int Q() {
            return this.f58465f;
        }

        public byte b(int i10) {
            C4868f.d(i10, size());
            return this.f58467e[this.f58465f + i10];
        }

        /* access modifiers changed from: protected */
        public void k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f58467e, Q() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte m(int i10) {
            return this.f58467e[this.f58465f + i10];
        }

        public int size() {
            return this.f58466g;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C4868f.I(z());
        }
    }

    /* renamed from: com.google.protobuf.f$f  reason: collision with other inner class name */
    private interface C0868f {
    }

    /* renamed from: com.google.protobuf.f$g */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* renamed from: com.google.protobuf.f$h */
    static abstract class h extends C4868f {
        h() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C4868f.super.r();
        }
    }

    /* renamed from: com.google.protobuf.f$i */
    private static class i extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f58467e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f58467e = bArr;
        }

        /* access modifiers changed from: protected */
        public final String D(Charset charset) {
            return new String(this.f58467e, Q(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void N(C4867e eVar) {
            eVar.a(this.f58467e, Q(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean P(C4868f fVar, int i10, int i11) {
            if (i11 <= fVar.size()) {
                int i12 = i10 + i11;
                if (i12 > fVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + fVar.size());
                } else if (!(fVar instanceof i)) {
                    return fVar.x(i10, i12).equals(x(0, i11));
                } else {
                    i iVar = (i) fVar;
                    byte[] bArr = this.f58467e;
                    byte[] bArr2 = iVar.f58467e;
                    int Q10 = Q() + i11;
                    int Q11 = Q();
                    int Q12 = iVar.Q() + i10;
                    while (Q11 < Q10) {
                        if (bArr[Q11] != bArr2[Q12]) {
                            return false;
                        }
                        Q11++;
                        Q12++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int Q() {
            return 0;
        }

        public byte b(int i10) {
            return this.f58467e[i10];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4868f) || size() != ((C4868f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int v10 = v();
            int v11 = iVar.v();
            if (v10 == 0 || v11 == 0 || v10 == v11) {
                return P(iVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f58467e, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte m(int i10) {
            return this.f58467e[i10];
        }

        public final boolean n() {
            int Q10 = Q();
            return l0.m(this.f58467e, Q10, size() + Q10);
        }

        public int size() {
            return this.f58467e.length;
        }

        /* access modifiers changed from: protected */
        public final int t(int i10, int i11, int i12) {
            return C4881t.h(i10, this.f58467e, Q() + i11, i12);
        }

        public final C4868f x(int i10, int i11) {
            int g10 = C4868f.g(i10, i11, size());
            if (g10 == 0) {
                return C4868f.f58458b;
            }
            return new e(this.f58467e, Q() + i10, g10);
        }
    }

    /* renamed from: com.google.protobuf.f$j */
    private static final class j implements C0868f {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        C0868f fVar;
        if (C4866d.c()) {
            fVar = new j((a) null);
        } else {
            fVar = new d((a) null);
        }
        f58459c = fVar;
    }

    C4868f() {
    }

    /* access modifiers changed from: private */
    public static int A(byte b10) {
        return b10 & 255;
    }

    private String H() {
        if (size() <= 50) {
            return e0.a(this);
        }
        return e0.a(x(0, 47)) + "...";
    }

    static C4868f I(byte[] bArr) {
        return new i(bArr);
    }

    static void d(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    static int g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static C4868f h(String str) {
        return new i(str.getBytes(C4881t.f58662b));
    }

    public final String C(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return D(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String D(Charset charset);

    public final String E() {
        return C(C4881t.f58662b);
    }

    /* access modifiers changed from: package-private */
    public abstract void N(C4867e eVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f58461a;
        if (i10 == 0) {
            int size = size();
            i10 = t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f58461a = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public abstract void k(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte m(int i10);

    public abstract boolean n();

    public g r() {
        return new a();
    }

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), H()});
    }

    /* access modifiers changed from: protected */
    public final int v() {
        return this.f58461a;
    }

    public abstract C4868f x(int i10, int i11);

    public final byte[] z() {
        int size = size();
        if (size == 0) {
            return C4881t.f58664d;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }
}
