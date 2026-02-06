package pg;

import java.util.NoSuchElementException;
import pg.C6642d;

/* renamed from: pg.c  reason: case insensitive filesystem */
class C6641c extends o {

    /* renamed from: d  reason: collision with root package name */
    private final int f72487d;

    /* renamed from: e  reason: collision with root package name */
    private final int f72488e;

    /* renamed from: pg.c$b */
    private class b implements C6642d.a {

        /* renamed from: a  reason: collision with root package name */
        private int f72489a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72490b;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public boolean hasNext() {
            if (this.f72489a < this.f72490b) {
                return true;
            }
            return false;
        }

        public byte nextByte() {
            int i10 = this.f72489a;
            if (i10 < this.f72490b) {
                byte[] bArr = C6641c.this.f72553b;
                this.f72489a = i10 + 1;
                return bArr[i10];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int Q10 = C6641c.this.Q();
            this.f72489a = Q10;
            this.f72490b = Q10 + C6641c.this.size();
        }
    }

    C6641c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        } else if (((long) i10) + ((long) i11) <= ((long) bArr.length)) {
            this.f72487d = i10;
            this.f72488e = i11;
        } else {
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append("Offset+Length too large: ");
            sb4.append(i10);
            sb4.append("+");
            sb4.append(i11);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int Q() {
        return this.f72487d;
    }

    /* renamed from: S */
    public C6642d.a iterator() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f72553b, Q() + i10, bArr, i11, i12);
    }

    public int size() {
        return this.f72488e;
    }
}
