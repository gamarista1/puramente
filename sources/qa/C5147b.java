package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import za.c;

/* renamed from: qa.b  reason: case insensitive filesystem */
public final class C5147b extends zzbz {
    public static final Parcelable.Creator<C5147b> CREATOR = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap f61346f;

    /* renamed from: a  reason: collision with root package name */
    final Set f61347a;

    /* renamed from: b  reason: collision with root package name */
    final int f61348b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList f61349c;

    /* renamed from: d  reason: collision with root package name */
    private int f61350d;

    /* renamed from: e  reason: collision with root package name */
    private e f61351e;

    static {
        HashMap hashMap = new HashMap();
        f61346f = hashMap;
        hashMap.put("authenticatorData", a.C0822a.q0("authenticatorData", 2, g.class));
        hashMap.put(ReactProgressBarViewManager.PROP_PROGRESS, a.C0822a.p0(ReactProgressBarViewManager.PROP_PROGRESS, 4, e.class));
    }

    C5147b(Set set, int i10, ArrayList arrayList, int i11, e eVar) {
        this.f61347a = set;
        this.f61348b = i10;
        this.f61349c = arrayList;
        this.f61350d = i11;
        this.f61351e = eVar;
    }

    public final void addConcreteTypeArrayInternal(a.C0822a aVar, String str, ArrayList arrayList) {
        int u02 = aVar.u0();
        if (u02 == 2) {
            this.f61349c = arrayList;
            this.f61347a.add(Integer.valueOf(u02));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(u02), arrayList.getClass().getCanonicalName()}));
    }

    public final void addConcreteTypeInternal(a.C0822a aVar, String str, a aVar2) {
        int u02 = aVar.u0();
        if (u02 == 4) {
            this.f61351e = (e) aVar2;
            this.f61347a.add(Integer.valueOf(u02));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(u02), aVar2.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f61346f;
    }

    /* access modifiers changed from: protected */
    public final Object getFieldValue(a.C0822a aVar) {
        int u02 = aVar.u0();
        if (u02 == 1) {
            return Integer.valueOf(this.f61348b);
        }
        if (u02 == 2) {
            return this.f61349c;
        }
        if (u02 == 4) {
            return this.f61351e;
        }
        int u03 = aVar.u0();
        throw new IllegalStateException("Unknown SafeParcelable id=" + u03);
    }

    /* access modifiers changed from: protected */
    public final boolean isFieldSet(a.C0822a aVar) {
        return this.f61347a.contains(Integer.valueOf(aVar.u0()));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        Set set = this.f61347a;
        if (set.contains(1)) {
            c.t(parcel, 1, this.f61348b);
        }
        if (set.contains(2)) {
            c.H(parcel, 2, this.f61349c, true);
        }
        if (set.contains(3)) {
            c.t(parcel, 3, this.f61350d);
        }
        if (set.contains(4)) {
            c.B(parcel, 4, this.f61351e, i10, true);
        }
        c.b(parcel, a10);
    }
}
