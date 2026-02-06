package pg;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import pg.C6642d;

class o extends C6642d {

    /* renamed from: b  reason: collision with root package name */
    protected final byte[] f72553b;

    /* renamed from: c  reason: collision with root package name */
    private int f72554c = 0;

    private class b implements C6642d.a {

        /* renamed from: a  reason: collision with root package name */
        private int f72555a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72556b;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public boolean hasNext() {
            if (this.f72555a < this.f72556b) {
                return true;
            }
            return false;
        }

        public byte nextByte() {
            try {
                byte[] bArr = o.this.f72553b;
                int i10 = this.f72555a;
                this.f72555a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f72555a = 0;
            this.f72556b = o.this.size();
        }
    }

    o(byte[] bArr) {
        this.f72553b = bArr;
    }

    static int R(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int A(int i10, int i11, int i12) {
        int Q10 = Q() + i11;
        return x.g(i10, this.f72553b, Q10, i12 + Q10);
    }

    /* access modifiers changed from: protected */
    public int C() {
        return this.f72554c;
    }

    public String E(String str) {
        return new String(this.f72553b, Q(), size(), str);
    }

    /* access modifiers changed from: package-private */
    public void N(OutputStream outputStream, int i10, int i11) {
        outputStream.write(this.f72553b, Q() + i10, i11);
    }

    /* access modifiers changed from: package-private */
    public boolean P(o oVar, int i10, int i11) {
        if (i11 > oVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i10 + i11 <= oVar.size()) {
            byte[] bArr = this.f72553b;
            byte[] bArr2 = oVar.f72553b;
            int Q10 = Q() + i11;
            int Q11 = Q();
            int Q12 = oVar.Q() + i10;
            while (Q11 < Q10) {
                if (bArr[Q11] != bArr2[Q12]) {
                    return false;
                }
                Q11++;
                Q12++;
            }
            return true;
        } else {
            int size2 = oVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int Q() {
        return 0;
    }

    /* renamed from: S */
    public C6642d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6642d) || size() != ((C6642d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return P((o) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i10 = this.f72554c;
        if (i10 == 0) {
            int size = size();
            i10 = z(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f72554c = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f72553b, i10, bArr, i11, i12);
    }

    /* access modifiers changed from: protected */
    public int r() {
        return 0;
    }

    public int size() {
        return this.f72553b.length;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        return true;
    }

    public boolean v() {
        int Q10 = Q();
        return x.f(this.f72553b, Q10, size() + Q10);
    }

    /* access modifiers changed from: protected */
    public int z(int i10, int i11, int i12) {
        return R(i10, this.f72553b, Q() + i11, i12);
    }
}
