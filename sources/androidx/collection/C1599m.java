package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.collection.m  reason: case insensitive filesystem */
public abstract class C1599m {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12185a;

    /* renamed from: b  reason: collision with root package name */
    public int f12186b;

    public /* synthetic */ C1599m(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String e(C1599m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        CharSequence charSequence5;
        if (obj == null) {
            if ((i11 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i11 & 2) != 0) {
                charSequence5 = charSequence6;
            } else {
                charSequence5 = charSequence2;
            }
            if ((i11 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                charSequence4 = "...";
            }
            return mVar.d(charSequence, charSequence5, charSequence6, i12, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final int a(int i10) {
        if (i10 >= 0 && i10 < this.f12186b) {
            return this.f12185a[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f12186b - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int b() {
        return this.f12186b;
    }

    public final boolean c() {
        if (this.f12186b == 0) {
            return true;
        }
        return false;
    }

    public final String d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4) {
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int[] iArr = this.f12185a;
        int i11 = this.f12186b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            sb2.append(i13);
            i12++;
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (androidx.collection.C1599m) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.C1599m
            r1 = 0
            if (r0 == 0) goto L_0x002e
            androidx.collection.m r7 = (androidx.collection.C1599m) r7
            int r0 = r7.f12186b
            int r2 = r6.f12186b
            if (r0 == r2) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            int[] r0 = r6.f12185a
            int[] r7 = r7.f12185a
            Ef.i r2 = Ef.m.u(r1, r2)
            int r3 = r2.k()
            int r2 = r2.n()
            if (r3 > r2) goto L_0x002c
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            if (r4 == r5) goto L_0x0027
            return r1
        L_0x0027:
            if (r3 == r2) goto L_0x002c
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002c:
            r7 = 1
            return r7
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1599m.equals(java.lang.Object):boolean");
    }

    public final int f() {
        if (!c()) {
            return this.f12185a[this.f12186b - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public int hashCode() {
        int[] iArr = this.f12185a;
        int i10 = this.f12186b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += Integer.hashCode(iArr[i12]) * 31;
        }
        return i11;
    }

    public String toString() {
        return e(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    private C1599m(int i10) {
        int[] iArr;
        if (i10 == 0) {
            iArr = r.a();
        } else {
            iArr = new int[i10];
        }
        this.f12185a = iArr;
    }
}
