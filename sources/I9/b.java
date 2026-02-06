package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f31786b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f31786b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f31810a.equals(bVar.f31810a) || !Arrays.equals(this.f31786b, bVar.f31786b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f31810a.hashCode()) * 31) + Arrays.hashCode(this.f31786b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31810a);
        parcel.writeByteArray(this.f31786b);
    }

    b(Parcel parcel) {
        super((String) M.j(parcel.readString()));
        this.f31786b = (byte[]) M.j(parcel.createByteArray());
    }
}
