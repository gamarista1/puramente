package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;
import java.util.Arrays;

public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4396c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4397d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4398e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4399f;

    /* renamed from: g  reason: collision with root package name */
    private final i[] f4400g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f4395b = str;
        this.f4396c = i10;
        this.f4397d = i11;
        this.f4398e = j10;
        this.f4399f = j11;
        this.f4400g = iVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4396c == cVar.f4396c && this.f4397d == cVar.f4397d && this.f4398e == cVar.f4398e && this.f4399f == cVar.f4399f && L.c(this.f4395b, cVar.f4395b) && Arrays.equals(this.f4400g, cVar.f4400g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f4396c) * 31) + this.f4397d) * 31) + ((int) this.f4398e)) * 31) + ((int) this.f4399f)) * 31;
        String str = this.f4395b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4395b);
        parcel.writeInt(this.f4396c);
        parcel.writeInt(this.f4397d);
        parcel.writeLong(this.f4398e);
        parcel.writeLong(this.f4399f);
        parcel.writeInt(this.f4400g.length);
        for (i writeParcelable : this.f4400g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f4395b = (String) L.h(parcel.readString());
        this.f4396c = parcel.readInt();
        this.f4397d = parcel.readInt();
        this.f4398e = parcel.readLong();
        this.f4399f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f4400g = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f4400g[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
