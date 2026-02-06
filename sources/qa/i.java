package qa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import za.c;

public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap f61366h;

    /* renamed from: a  reason: collision with root package name */
    final Set f61367a;

    /* renamed from: b  reason: collision with root package name */
    final int f61368b;

    /* renamed from: c  reason: collision with root package name */
    private String f61369c;

    /* renamed from: d  reason: collision with root package name */
    private int f61370d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f61371e;

    /* renamed from: f  reason: collision with root package name */
    private PendingIntent f61372f;

    /* renamed from: g  reason: collision with root package name */
    private C5146a f61373g;

    static {
        HashMap hashMap = new HashMap();
        f61366h = hashMap;
        hashMap.put("accountType", a.C0822a.s0("accountType", 2));
        hashMap.put("status", a.C0822a.r0("status", 3));
        hashMap.put("transferBytes", a.C0822a.o0("transferBytes", 4));
    }

    i(Set set, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, C5146a aVar) {
        this.f61367a = set;
        this.f61368b = i10;
        this.f61369c = str;
        this.f61370d = i11;
        this.f61371e = bArr;
        this.f61372f = pendingIntent;
        this.f61373g = aVar;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f61366h;
    }

    /* access modifiers changed from: protected */
    public final Object getFieldValue(a.C0822a aVar) {
        int u02 = aVar.u0();
        if (u02 == 1) {
            return Integer.valueOf(this.f61368b);
        }
        if (u02 == 2) {
            return this.f61369c;
        }
        if (u02 == 3) {
            return Integer.valueOf(this.f61370d);
        }
        if (u02 == 4) {
            return this.f61371e;
        }
        int u03 = aVar.u0();
        throw new IllegalStateException("Unknown SafeParcelable id=" + u03);
    }

    /* access modifiers changed from: protected */
    public final boolean isFieldSet(a.C0822a aVar) {
        return this.f61367a.contains(Integer.valueOf(aVar.u0()));
    }

    /* access modifiers changed from: protected */
    public final void setDecodedBytesInternal(a.C0822a aVar, String str, byte[] bArr) {
        int u02 = aVar.u0();
        if (u02 == 4) {
            this.f61371e = bArr;
            this.f61367a.add(Integer.valueOf(u02));
            return;
        }
        throw new IllegalArgumentException("Field with id=" + u02 + " is not known to be a byte array.");
    }

    /* access modifiers changed from: protected */
    public final void setIntegerInternal(a.C0822a aVar, String str, int i10) {
        int u02 = aVar.u0();
        if (u02 == 3) {
            this.f61370d = i10;
            this.f61367a.add(Integer.valueOf(u02));
            return;
        }
        throw new IllegalArgumentException("Field with id=" + u02 + " is not known to be an int.");
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(a.C0822a aVar, String str, String str2) {
        int u02 = aVar.u0();
        if (u02 == 2) {
            this.f61369c = str2;
            this.f61367a.add(Integer.valueOf(u02));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(u02)}));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        Set set = this.f61367a;
        if (set.contains(1)) {
            c.t(parcel, 1, this.f61368b);
        }
        if (set.contains(2)) {
            c.D(parcel, 2, this.f61369c, true);
        }
        if (set.contains(3)) {
            c.t(parcel, 3, this.f61370d);
        }
        if (set.contains(4)) {
            c.k(parcel, 4, this.f61371e, true);
        }
        if (set.contains(5)) {
            c.B(parcel, 5, this.f61372f, i10, true);
        }
        if (set.contains(6)) {
            c.B(parcel, 6, this.f61373g, i10, true);
        }
        c.b(parcel, a10);
    }
}
