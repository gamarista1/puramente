package yc;

import Ac.a;
import Ac.l;
import Bc.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yc.a  reason: case insensitive filesystem */
public class C5293a implements Parcelable {
    public static final Parcelable.Creator<C5293a> CREATOR = new C0917a();

    /* renamed from: a  reason: collision with root package name */
    private final String f62315a;

    /* renamed from: b  reason: collision with root package name */
    private final l f62316b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62317c;

    /* renamed from: yc.a$a  reason: collision with other inner class name */
    class C0917a implements Parcelable.Creator {
        C0917a() {
        }

        /* renamed from: a */
        public C5293a createFromParcel(Parcel parcel) {
            return new C5293a(parcel, (C0917a) null);
        }

        /* renamed from: b */
        public C5293a[] newArray(int i10) {
            return new C5293a[i10];
        }
    }

    /* synthetic */ C5293a(Parcel parcel, C0917a aVar) {
        this(parcel);
    }

    public static k[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = ((C5293a) list.get(0)).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = ((C5293a) list.get(i10)).a();
            if (z10 || !((C5293a) list.get(i10)).g()) {
                kVarArr[i10] = a11;
            } else {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    public static C5293a c(String str) {
        C5293a aVar = new C5293a(str.replace("-", ""), new a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a g10 = com.google.firebase.perf.config.a.g();
        if (!g10.K() || Math.random() >= g10.D()) {
            return false;
        }
        return true;
    }

    public k a() {
        k.c A10 = k.a0().A(this.f62315a);
        if (this.f62317c) {
            A10.z(Bc.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (k) A10.q();
    }

    public l d() {
        return this.f62316b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f62317c;
    }

    public boolean f() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f62316b.c()) > com.google.firebase.perf.config.a.g().A()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.f62317c;
    }

    public String h() {
        return this.f62315a;
    }

    public void i(boolean z10) {
        this.f62317c = z10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f62315a);
        parcel.writeByte(this.f62317c ? (byte) 1 : 0);
        parcel.writeParcelable(this.f62316b, 0);
    }

    public C5293a(String str, a aVar) {
        this.f62317c = false;
        this.f62315a = str;
        this.f62316b = aVar.a();
    }

    private C5293a(Parcel parcel) {
        boolean z10 = false;
        this.f62317c = false;
        this.f62315a = parcel.readString();
        this.f62317c = parcel.readByte() != 0 ? true : z10;
        this.f62316b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
