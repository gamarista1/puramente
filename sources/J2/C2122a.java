package j2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.f;
import f2.z;
import i2.L;
import java.util.Arrays;

/* renamed from: j2.a  reason: case insensitive filesystem */
public final class C2122a implements z.b {
    public static final Parcelable.Creator<C2122a> CREATOR = new C0362a();

    /* renamed from: a  reason: collision with root package name */
    public final String f22696a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f22697b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22698c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22699d;

    /* renamed from: j2.a$a  reason: collision with other inner class name */
    class C0362a implements Parcelable.Creator {
        C0362a() {
        }

        /* renamed from: a */
        public C2122a createFromParcel(Parcel parcel) {
            return new C2122a(parcel, (C0362a) null);
        }

        /* renamed from: b */
        public C2122a[] newArray(int i10) {
            return new C2122a[i10];
        }
    }

    /* synthetic */ C2122a(Parcel parcel, C0362a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2122a.class != obj.getClass()) {
            return false;
        }
        C2122a aVar = (C2122a) obj;
        if (!this.f22696a.equals(aVar.f22696a) || !Arrays.equals(this.f22697b, aVar.f22697b) || this.f22698c != aVar.f22698c || this.f22699d != aVar.f22699d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f22696a.hashCode()) * 31) + Arrays.hashCode(this.f22697b)) * 31) + this.f22698c) * 31) + this.f22699d;
    }

    public String toString() {
        String str;
        int i10 = this.f22699d;
        if (i10 == 1) {
            str = L.G(this.f22697b);
        } else if (i10 == 23) {
            str = String.valueOf(Float.intBitsToFloat(f.g(this.f22697b)));
        } else if (i10 != 67) {
            str = L.e1(this.f22697b);
        } else {
            str = String.valueOf(f.g(this.f22697b));
        }
        return "mdta: key=" + this.f22696a + ", value=" + str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22696a);
        parcel.writeByteArray(this.f22697b);
        parcel.writeInt(this.f22698c);
        parcel.writeInt(this.f22699d);
    }

    public C2122a(String str, byte[] bArr, int i10, int i11) {
        this.f22696a = str;
        this.f22697b = bArr;
        this.f22698c = i10;
        this.f22699d = i11;
    }

    private C2122a(Parcel parcel) {
        this.f22696a = (String) L.h(parcel.readString());
        this.f22697b = (byte[]) L.h(parcel.createByteArray());
        this.f22698c = parcel.readInt();
        this.f22699d = parcel.readInt();
    }
}
