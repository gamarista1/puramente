package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
public abstract class C1734g implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C1734g f16324b = new i(C1751y.f16574c);

    /* renamed from: c  reason: collision with root package name */
    private static final f f16325c;

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator f16326d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f16327a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f16328a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f16329b;

        a() {
            this.f16329b = C1734g.this.size();
        }

        public boolean hasNext() {
            if (this.f16328a < this.f16329b) {
                return true;
            }
            return false;
        }

        public byte nextByte() {
            int i10 = this.f16328a;
            if (i10 < this.f16329b) {
                this.f16328a = i10 + 1;
                return C1734g.this.r(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    static class b implements Comparator {
        b() {
        }

        /* renamed from: a */
        public int compare(C1734g gVar, C1734g gVar2) {
            C0290g v10 = gVar.v();
            C0290g v11 = gVar2.v();
            while (v10.hasNext() && v11.hasNext()) {
                int compare = Integer.compare(C1734g.D(v10.nextByte()), C1734g.D(v11.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(gVar.size(), gVar2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements C0290g {
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

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: f  reason: collision with root package name */
        private final int f16331f;

        /* renamed from: g  reason: collision with root package name */
        private final int f16332g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            C1734g.g(i10, i10 + i11, bArr.length);
            this.f16331f = i10;
            this.f16332g = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        public int S() {
            return this.f16331f;
        }

        public byte b(int i10) {
            C1734g.d(i10, size());
            return this.f16333e[this.f16331f + i10];
        }

        /* access modifiers changed from: protected */
        public void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f16333e, S() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte r(int i10) {
            return this.f16333e[this.f16331f + i10];
        }

        public int size() {
            return this.f16332g;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C1734g.N(C());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g  reason: collision with other inner class name */
    public interface C0290g extends Iterator {
        byte nextByte();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends C1734g {
        h() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C1734g.super.v();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f16333e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f16333e = bArr;
        }

        public final C1734g A(int i10, int i11) {
            int g10 = C1734g.g(i10, i11, size());
            if (g10 == 0) {
                return C1734g.f16324b;
            }
            return new e(this.f16333e, S() + i10, g10);
        }

        /* access modifiers changed from: protected */
        public final String H(Charset charset) {
            return new String(this.f16333e, S(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void Q(C1733f fVar) {
            fVar.a(this.f16333e, S(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean R(C1734g gVar, int i10, int i11) {
            if (i11 <= gVar.size()) {
                int i12 = i10 + i11;
                if (i12 > gVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
                } else if (!(gVar instanceof i)) {
                    return gVar.A(i10, i12).equals(A(0, i11));
                } else {
                    i iVar = (i) gVar;
                    byte[] bArr = this.f16333e;
                    byte[] bArr2 = iVar.f16333e;
                    int S10 = S() + i11;
                    int S11 = S();
                    int S12 = iVar.S() + i10;
                    while (S11 < S10) {
                        if (bArr[S11] != bArr2[S12]) {
                            return false;
                        }
                        S11++;
                        S12++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int S() {
            return 0;
        }

        public byte b(int i10) {
            return this.f16333e[i10];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1734g) || size() != ((C1734g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int z10 = z();
            int z11 = iVar.z();
            if (z10 == 0 || z11 == 0 || z10 == z11) {
                return R(iVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f16333e, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte r(int i10) {
            return this.f16333e[i10];
        }

        public int size() {
            return this.f16333e.length;
        }

        public final boolean t() {
            int S10 = S();
            return q0.n(this.f16333e, S10, size() + S10);
        }

        /* access modifiers changed from: protected */
        public final int x(int i10, int i11, int i12) {
            return C1751y.i(i10, this.f16333e, S() + i11, i12);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements f {
        private j() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        f fVar;
        if (C1731d.c()) {
            fVar = new j((a) null);
        } else {
            fVar = new d((a) null);
        }
        f16325c = fVar;
    }

    C1734g() {
    }

    /* access modifiers changed from: private */
    public static int D(byte b10) {
        return b10 & 255;
    }

    static C1734g N(byte[] bArr) {
        return new i(bArr);
    }

    static C1734g P(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
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

    public static C1734g h(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static C1734g k(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        return new i(f16325c.a(bArr, i10, i11));
    }

    public static C1734g m(String str) {
        return new i(str.getBytes(C1751y.f16572a));
    }

    public abstract C1734g A(int i10, int i11);

    public final byte[] C() {
        int size = size();
        if (size == 0) {
            return C1751y.f16574c;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String E(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return H(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String H(Charset charset);

    public final String I() {
        return E(C1751y.f16572a);
    }

    /* access modifiers changed from: package-private */
    public abstract void Q(C1733f fVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f16327a;
        if (i10 == 0) {
            int size = size();
            i10 = x(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f16327a = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public abstract void n(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte r(int i10);

    public abstract int size();

    public abstract boolean t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public C0290g v() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public abstract int x(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int z() {
        return this.f16327a;
    }
}
