package H9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.C3645a;
import java.util.Arrays;
import k9.D0;

public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f31724a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31725b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31726c;

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

    public c(byte[] bArr, String str, String str2) {
        this.f31724a = bArr;
        this.f31725b = str;
        this.f31726c = str2;
    }

    public void E(D0.b bVar) {
        String str = this.f31725b;
        if (str != null) {
            bVar.i0(str);
        }
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
        return Arrays.equals(this.f31724a, ((c) obj).f31724a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31724a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f31725b, this.f31726c, Integer.valueOf(this.f31724a.length)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f31724a);
        parcel.writeString(this.f31725b);
        parcel.writeString(this.f31726c);
    }

    c(Parcel parcel) {
        this.f31724a = (byte[]) C3645a.e(parcel.createByteArray());
        this.f31725b = parcel.readString();
        this.f31726c = parcel.readString();
    }
}
