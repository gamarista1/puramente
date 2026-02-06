package j2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.c;
import f2.z;
import i2.C2076a;

/* renamed from: j2.b  reason: case insensitive filesystem */
public final class C2123b implements z.b {
    public static final Parcelable.Creator<C2123b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f22700a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22701b;

    /* renamed from: j2.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C2123b createFromParcel(Parcel parcel) {
            return new C2123b(parcel, (a) null);
        }

        /* renamed from: b */
        public C2123b[] newArray(int i10) {
            return new C2123b[i10];
        }
    }

    /* synthetic */ C2123b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2123b.class != obj.getClass()) {
            return false;
        }
        C2123b bVar = (C2123b) obj;
        if (this.f22700a == bVar.f22700a && this.f22701b == bVar.f22701b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + c.a(this.f22700a)) * 31) + c.a(this.f22701b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f22700a + ", longitude=" + this.f22701b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f22700a);
        parcel.writeFloat(this.f22701b);
    }

    public C2123b(float f10, float f11) {
        C2076a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f22700a = f10;
        this.f22701b = f11;
    }

    private C2123b(Parcel parcel) {
        this.f22700a = parcel.readFloat();
        this.f22701b = parcel.readFloat();
    }
}
