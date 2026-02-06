package qa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1587a;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import za.c;

public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: g  reason: collision with root package name */
    private static final C1587a f61352g;

    /* renamed from: a  reason: collision with root package name */
    final int f61353a;

    /* renamed from: b  reason: collision with root package name */
    private List f61354b;

    /* renamed from: c  reason: collision with root package name */
    private List f61355c;

    /* renamed from: d  reason: collision with root package name */
    private List f61356d;

    /* renamed from: e  reason: collision with root package name */
    private List f61357e;

    /* renamed from: f  reason: collision with root package name */
    private List f61358f;

    static {
        C1587a aVar = new C1587a();
        f61352g = aVar;
        aVar.put("registered", a.C0822a.t0("registered", 2));
        aVar.put("in_progress", a.C0822a.t0("in_progress", 3));
        aVar.put(com.amazon.device.simplesignin.a.a.a.f38020s, a.C0822a.t0(com.amazon.device.simplesignin.a.a.a.f38020s, 4));
        aVar.put(MetricTracker.Action.FAILED, a.C0822a.t0(MetricTracker.Action.FAILED, 5));
        aVar.put("escrowed", a.C0822a.t0("escrowed", 6));
    }

    e(int i10, List list, List list2, List list3, List list4, List list5) {
        this.f61353a = i10;
        this.f61354b = list;
        this.f61355c = list2;
        this.f61356d = list3;
        this.f61357e = list4;
        this.f61358f = list5;
    }

    public final Map getFieldMappings() {
        return f61352g;
    }

    /* access modifiers changed from: protected */
    public final Object getFieldValue(a.C0822a aVar) {
        switch (aVar.u0()) {
            case 1:
                return Integer.valueOf(this.f61353a);
            case 2:
                return this.f61354b;
            case 3:
                return this.f61355c;
            case 4:
                return this.f61356d;
            case 5:
                return this.f61357e;
            case 6:
                return this.f61358f;
            default:
                int u02 = aVar.u0();
                throw new IllegalStateException("Unknown SafeParcelable id=" + u02);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean isFieldSet(a.C0822a aVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void setStringsInternal(a.C0822a aVar, String str, ArrayList arrayList) {
        int u02 = aVar.u0();
        if (u02 == 2) {
            this.f61354b = arrayList;
        } else if (u02 == 3) {
            this.f61355c = arrayList;
        } else if (u02 == 4) {
            this.f61356d = arrayList;
        } else if (u02 == 5) {
            this.f61357e = arrayList;
        } else if (u02 == 6) {
            this.f61358f = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(u02)}));
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f61353a);
        c.F(parcel, 2, this.f61354b, false);
        c.F(parcel, 3, this.f61355c, false);
        c.F(parcel, 4, this.f61356d, false);
        c.F(parcel, 5, this.f61357e, false);
        c.F(parcel, 6, this.f61358f, false);
        c.b(parcel, a10);
    }
}
