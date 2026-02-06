package androidx.collection;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f12112a;

    /* renamed from: b  reason: collision with root package name */
    public int f12113b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P f12114a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(P p10) {
            super(1);
            this.f12114a = p10;
        }

        /* renamed from: a */
        public final CharSequence invoke(Object obj) {
            if (obj == this.f12114a) {
                return "(this)";
            }
            return String.valueOf(obj);
        }
    }

    public /* synthetic */ P(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String f(P p10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
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
            CharSequence charSequence7 = charSequence4;
            if ((i11 & 32) != 0) {
                lVar = null;
            }
            return p10.e(charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean a(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int b(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f12112a;
            int i11 = this.f12113b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f12112a;
        int i12 = this.f12113b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean c() {
        if (this.f12113b == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f12113b != 0) {
            return true;
        }
        return false;
    }

    public final String e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.f12112a;
        int i11 = this.f12113b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            if (lVar == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) lVar.invoke(obj));
            }
            i12++;
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (androidx.collection.P) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.P
            r1 = 0
            if (r0 == 0) goto L_0x0032
            androidx.collection.P r7 = (androidx.collection.P) r7
            int r0 = r7.f12113b
            int r2 = r6.f12113b
            if (r0 == r2) goto L_0x000e
            goto L_0x0032
        L_0x000e:
            java.lang.Object[] r0 = r6.f12112a
            java.lang.Object[] r7 = r7.f12112a
            Ef.i r2 = Ef.m.u(r1, r2)
            int r3 = r2.k()
            int r2 = r2.n()
            if (r3 > r2) goto L_0x0030
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r3 == r2) goto L_0x0030
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0030:
            r7 = 1
            return r7
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.P.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10;
        Object[] objArr = this.f12112a;
        int i11 = this.f12113b;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i12 += i10 * 31;
        }
        return i12;
    }

    public String toString() {
        return f(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new a(this), 25, (Object) null);
    }

    private P(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = Q.f12115a;
        } else {
            objArr = new Object[i10];
        }
        this.f12112a = objArr;
    }
}
