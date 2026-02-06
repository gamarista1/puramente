package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f31814b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31815c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31816d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f31817e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f31818f;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f31814b = i10;
        this.f31815c = i11;
        this.f31816d = i12;
        this.f31817e = iArr;
        this.f31818f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f31814b == kVar.f31814b && this.f31815c == kVar.f31815c && this.f31816d == kVar.f31816d && Arrays.equals(this.f31817e, kVar.f31817e) && Arrays.equals(this.f31818f, kVar.f31818f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f31814b) * 31) + this.f31815c) * 31) + this.f31816d) * 31) + Arrays.hashCode(this.f31817e)) * 31) + Arrays.hashCode(this.f31818f);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f31814b);
        parcel.writeInt(this.f31815c);
        parcel.writeInt(this.f31816d);
        parcel.writeIntArray(this.f31817e);
        parcel.writeIntArray(this.f31818f);
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f31814b = parcel.readInt();
        this.f31815c = parcel.readInt();
        this.f31816d = parcel.readInt();
        this.f31817e = (int[]) M.j(parcel.createIntArray());
        this.f31818f = (int[]) M.j(parcel.createIntArray());
    }
}
