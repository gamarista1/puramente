package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: La.o  reason: case insensitive filesystem */
public class C4356o implements Parcelable {
    public static final Parcelable.Creator<C4356o> CREATOR = new z0();

    /* renamed from: a  reason: collision with root package name */
    private final C4333a f51618a;

    /* renamed from: La.o$a */
    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    C4356o(C4333a aVar) {
        this.f51618a = (C4333a) C4536s.l(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: La.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: La.p[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: La.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: La.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: La.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: La.B} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static La.C4356o a(int r7) {
        /*
            La.o r0 = new La.o
            La.B r1 = La.C4321B.LEGACY_RS1
            int r1 = r1.a()
            if (r7 != r1) goto L_0x000d
            La.B r7 = La.C4321B.RS1
            goto L_0x0033
        L_0x000d:
            La.B[] r1 = La.C4321B.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x0023
            r5 = r1[r4]
            int r6 = r5.a()
            if (r6 != r7) goto L_0x0020
            r7 = r5
            goto L_0x0033
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0023:
            La.p[] r1 = La.C4357p.values()
            int r2 = r1.length
        L_0x0028:
            if (r3 >= r2) goto L_0x003a
            r4 = r1[r3]
            int r5 = r4.a()
            if (r5 != r7) goto L_0x0037
            r7 = r4
        L_0x0033:
            r0.<init>(r7)
            return r0
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x003a:
            La.o$a r0 = new La.o$a
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: La.C4356o.a(int):La.o");
    }

    public int b() {
        return this.f51618a.a();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4356o) && this.f51618a.a() == ((C4356o) obj).f51618a.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(this.f51618a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f51618a.a());
    }
}
