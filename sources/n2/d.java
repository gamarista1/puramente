package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;
import java.util.Arrays;

public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4401b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4402c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4403d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f4404e;

    /* renamed from: f  reason: collision with root package name */
    private final i[] f4405f;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f4401b = str;
        this.f4402c = z10;
        this.f4403d = z11;
        this.f4404e = strArr;
        this.f4405f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4402c != dVar.f4402c || this.f4403d != dVar.f4403d || !L.c(this.f4401b, dVar.f4401b) || !Arrays.equals(this.f4404e, dVar.f4404e) || !Arrays.equals(this.f4405f, dVar.f4405f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11 = (((true + (this.f4402c ? 1 : 0)) * 31) + (this.f4403d ? 1 : 0)) * 31;
        String str = this.f4401b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4401b);
        parcel.writeByte(this.f4402c ? (byte) 1 : 0);
        parcel.writeByte(this.f4403d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f4404e);
        parcel.writeInt(this.f4405f.length);
        for (i writeParcelable : this.f4405f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f4401b = (String) L.h(parcel.readString());
        boolean z10 = true;
        this.f4402c = parcel.readByte() != 0;
        this.f4403d = parcel.readByte() == 0 ? false : z10;
        this.f4404e = (String[]) L.h(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f4405f = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f4405f[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
