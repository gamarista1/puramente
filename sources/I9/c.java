package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31787b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31788c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31789d;

    /* renamed from: e  reason: collision with root package name */
    public final long f31790e;

    /* renamed from: f  reason: collision with root package name */
    public final long f31791f;

    /* renamed from: g  reason: collision with root package name */
    private final i[] f31792g;

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
        this.f31787b = str;
        this.f31788c = i10;
        this.f31789d = i11;
        this.f31790e = j10;
        this.f31791f = j11;
        this.f31792g = iVarArr;
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
        if (this.f31788c == cVar.f31788c && this.f31789d == cVar.f31789d && this.f31790e == cVar.f31790e && this.f31791f == cVar.f31791f && M.c(this.f31787b, cVar.f31787b) && Arrays.equals(this.f31792g, cVar.f31792g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f31788c) * 31) + this.f31789d) * 31) + ((int) this.f31790e)) * 31) + ((int) this.f31791f)) * 31;
        String str = this.f31787b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31787b);
        parcel.writeInt(this.f31788c);
        parcel.writeInt(this.f31789d);
        parcel.writeLong(this.f31790e);
        parcel.writeLong(this.f31791f);
        parcel.writeInt(this.f31792g.length);
        for (i writeParcelable : this.f31792g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f31787b = (String) M.j(parcel.readString());
        this.f31788c = parcel.readInt();
        this.f31789d = parcel.readInt();
        this.f31790e = parcel.readLong();
        this.f31791f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f31792g = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f31792g[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
