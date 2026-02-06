package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.J;
import com.google.firebase.auth.L;
import com.google.firebase.auth.U;
import com.google.firebase.auth.Y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import za.c;

/* renamed from: Db.m  reason: case insensitive filesystem */
public final class C4265m extends L {
    public static final Parcelable.Creator<C4265m> CREATOR = new C4268p();

    /* renamed from: a  reason: collision with root package name */
    private String f50529a;

    /* renamed from: b  reason: collision with root package name */
    private String f50530b;

    /* renamed from: c  reason: collision with root package name */
    private List f50531c;

    /* renamed from: d  reason: collision with root package name */
    private List f50532d;

    /* renamed from: e  reason: collision with root package name */
    private C4258f f50533e;

    private C4265m() {
    }

    public static C4265m o0(String str, C4258f fVar) {
        C4536s.f(str);
        C4265m mVar = new C4265m();
        mVar.f50529a = str;
        mVar.f50533e = fVar;
        return mVar;
    }

    public static C4265m p0(List list, String str) {
        C4536s.l(list);
        C4536s.f(str);
        C4265m mVar = new C4265m();
        mVar.f50531c = new ArrayList();
        mVar.f50532d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J j10 = (J) it.next();
            if (j10 instanceof U) {
                mVar.f50531c.add((U) j10);
            } else if (j10 instanceof Y) {
                mVar.f50532d.add((Y) j10);
            } else {
                String p02 = j10.p0();
                throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + p02);
            }
        }
        mVar.f50530b = str;
        return mVar;
    }

    public final String q0() {
        return this.f50529a;
    }

    public final boolean r0() {
        if (this.f50529a != null) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f50529a, false);
        c.D(parcel, 2, this.f50530b, false);
        c.H(parcel, 3, this.f50531c, false);
        c.H(parcel, 4, this.f50532d, false);
        c.B(parcel, 5, this.f50533e, i10, false);
        c.b(parcel, a10);
    }

    public final String zzc() {
        return this.f50530b;
    }

    C4265m(String str, String str2, List list, List list2, C4258f fVar) {
        this.f50529a = str;
        this.f50530b = str2;
        this.f50531c = list;
        this.f50532d = list2;
        this.f50533e = fVar;
    }
}
