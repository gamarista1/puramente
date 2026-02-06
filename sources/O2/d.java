package O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.c;
import f2.z;

public final class d implements z.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f4731a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4732b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4731a == dVar.f4731a && this.f4732b == dVar.f4732b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + c.a(this.f4731a)) * 31) + this.f4732b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f4731a + ", svcTemporalLayerCount=" + this.f4732b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f4731a);
        parcel.writeInt(this.f4732b);
    }

    public d(float f10, int i10) {
        this.f4731a = f10;
        this.f4732b = i10;
    }

    private d(Parcel parcel) {
        this.f4731a = parcel.readFloat();
        this.f4732b = parcel.readInt();
    }
}
