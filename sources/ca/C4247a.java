package Ca;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import za.C5298a;
import za.c;

/* renamed from: Ca.a  reason: case insensitive filesystem */
public final class C4247a extends C5298a implements a.b {
    public static final Parcelable.Creator<C4247a> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    final int f50382a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f50383b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f50384c = new SparseArray();

    C4247a(int i10, ArrayList arrayList) {
        this.f50382a = i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            o0(dVar.f50388b, dVar.f50389c);
        }
    }

    public final /* bridge */ /* synthetic */ Object S(Object obj) {
        String str = (String) this.f50384c.get(((Integer) obj).intValue());
        if (str != null || !this.f50383b.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    public final /* bridge */ /* synthetic */ Object W(Object obj) {
        Integer num = (Integer) this.f50383b.get((String) obj);
        if (num == null) {
            return (Integer) this.f50383b.get("gms_unknown");
        }
        return num;
    }

    public C4247a o0(String str, int i10) {
        this.f50383b.put(str, Integer.valueOf(i10));
        this.f50384c.put(i10, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f50382a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f50383b.keySet()) {
            arrayList.add(new d(str, ((Integer) this.f50383b.get(str)).intValue()));
        }
        c.H(parcel, 2, arrayList, false);
        c.b(parcel, a10);
    }
}
