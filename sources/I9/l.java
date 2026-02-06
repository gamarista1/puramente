package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31819b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f31820c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f31819b = str;
        this.f31820c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!M.c(this.f31819b, lVar.f31819b) || !Arrays.equals(this.f31820c, lVar.f31820c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        String str = this.f31819b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((527 + i10) * 31) + Arrays.hashCode(this.f31820c);
    }

    public String toString() {
        return this.f31810a + ": owner=" + this.f31819b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31819b);
        parcel.writeByteArray(this.f31820c);
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f31819b = (String) M.j(parcel.readString());
        this.f31820c = (byte[]) M.j(parcel.createByteArray());
    }
}
