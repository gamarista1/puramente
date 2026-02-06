package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import za.c;

public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap f61359g;

    /* renamed from: a  reason: collision with root package name */
    final Set f61360a;

    /* renamed from: b  reason: collision with root package name */
    final int f61361b;

    /* renamed from: c  reason: collision with root package name */
    private i f61362c;

    /* renamed from: d  reason: collision with root package name */
    private String f61363d;

    /* renamed from: e  reason: collision with root package name */
    private String f61364e;

    /* renamed from: f  reason: collision with root package name */
    private String f61365f;

    static {
        HashMap hashMap = new HashMap();
        f61359g = hashMap;
        hashMap.put("authenticatorInfo", a.C0822a.p0("authenticatorInfo", 2, i.class));
        hashMap.put("signature", a.C0822a.s0("signature", 3));
        hashMap.put("package", a.C0822a.s0("package", 4));
    }

    g(Set set, int i10, i iVar, String str, String str2, String str3) {
        this.f61360a = set;
        this.f61361b = i10;
        this.f61362c = iVar;
        this.f61363d = str;
        this.f61364e = str2;
        this.f61365f = str3;
    }

    public final void addConcreteTypeInternal(a.C0822a aVar, String str, a aVar2) {
        int u02 = aVar.u0();
        if (u02 == 2) {
            this.f61362c = (i) aVar2;
            this.f61360a.add(Integer.valueOf(u02));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(u02), aVar2.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f61359g;
    }

    /* access modifiers changed from: protected */
    public final Object getFieldValue(a.C0822a aVar) {
        int u02 = aVar.u0();
        if (u02 == 1) {
            return Integer.valueOf(this.f61361b);
        }
        if (u02 == 2) {
            return this.f61362c;
        }
        if (u02 == 3) {
            return this.f61363d;
        }
        if (u02 == 4) {
            return this.f61364e;
        }
        int u03 = aVar.u0();
        throw new IllegalStateException("Unknown SafeParcelable id=" + u03);
    }

    /* access modifiers changed from: protected */
    public final boolean isFieldSet(a.C0822a aVar) {
        return this.f61360a.contains(Integer.valueOf(aVar.u0()));
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(a.C0822a aVar, String str, String str2) {
        int u02 = aVar.u0();
        if (u02 == 3) {
            this.f61363d = str2;
        } else if (u02 == 4) {
            this.f61364e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(u02)}));
        }
        this.f61360a.add(Integer.valueOf(u02));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        Set set = this.f61360a;
        if (set.contains(1)) {
            c.t(parcel, 1, this.f61361b);
        }
        if (set.contains(2)) {
            c.B(parcel, 2, this.f61362c, i10, true);
        }
        if (set.contains(3)) {
            c.D(parcel, 3, this.f61363d, true);
        }
        if (set.contains(4)) {
            c.D(parcel, 4, this.f61364e, true);
        }
        if (set.contains(5)) {
            c.D(parcel, 5, this.f61365f, true);
        }
        c.b(parcel, a10);
    }
}
