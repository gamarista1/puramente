package J9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0526a();

    /* renamed from: a  reason: collision with root package name */
    public final String f32212a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f32213b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32214c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32215d;

    /* renamed from: J9.a$a  reason: collision with other inner class name */
    class C0526a implements Parcelable.Creator {
        C0526a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0526a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0526a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f32212a.equals(aVar.f32212a) || !Arrays.equals(this.f32213b, aVar.f32213b) || this.f32214c != aVar.f32214c || this.f32215d != aVar.f32215d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f32212a.hashCode()) * 31) + Arrays.hashCode(this.f32213b)) * 31) + this.f32214c) * 31) + this.f32215d;
    }

    public String toString() {
        return "mdta: key=" + this.f32212a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f32212a);
        parcel.writeByteArray(this.f32213b);
        parcel.writeInt(this.f32214c);
        parcel.writeInt(this.f32215d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f32212a = str;
        this.f32213b = bArr;
        this.f32214c = i10;
        this.f32215d = i11;
    }

    private a(Parcel parcel) {
        this.f32212a = (String) M.j(parcel.readString());
        this.f32213b = (byte[]) M.j(parcel.createByteArray());
        this.f32214c = parcel.readInt();
        this.f32215d = parcel.readInt();
    }
}
