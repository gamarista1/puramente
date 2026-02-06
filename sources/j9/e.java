package J9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.c;

public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f32226a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32227b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f32226a == eVar.f32226a && this.f32227b == eVar.f32227b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + c.a(this.f32226a)) * 31) + this.f32227b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f32226a + ", svcTemporalLayerCount=" + this.f32227b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f32226a);
        parcel.writeInt(this.f32227b);
    }

    public e(float f10, int i10) {
        this.f32226a = f10;
        this.f32227b = i10;
    }

    private e(Parcel parcel) {
        this.f32226a = parcel.readFloat();
        this.f32227b = parcel.readInt();
    }
}
