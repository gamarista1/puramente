package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31793b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f31794c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31795d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f31796e;

    /* renamed from: f  reason: collision with root package name */
    private final i[] f31797f;

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
        this.f31793b = str;
        this.f31794c = z10;
        this.f31795d = z11;
        this.f31796e = strArr;
        this.f31797f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f31794c != dVar.f31794c || this.f31795d != dVar.f31795d || !M.c(this.f31793b, dVar.f31793b) || !Arrays.equals(this.f31796e, dVar.f31796e) || !Arrays.equals(this.f31797f, dVar.f31797f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11 = (((true + (this.f31794c ? 1 : 0)) * 31) + (this.f31795d ? 1 : 0)) * 31;
        String str = this.f31793b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31793b);
        parcel.writeByte(this.f31794c ? (byte) 1 : 0);
        parcel.writeByte(this.f31795d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f31796e);
        parcel.writeInt(this.f31797f.length);
        for (i writeParcelable : this.f31797f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f31793b = (String) M.j(parcel.readString());
        boolean z10 = true;
        this.f31794c = parcel.readByte() != 0;
        this.f31795d = parcel.readByte() == 0 ? false : z10;
        this.f31796e = (String[]) M.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f31797f = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f31797f[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
