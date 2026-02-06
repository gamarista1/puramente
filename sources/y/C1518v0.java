package Y;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Y.v0  reason: case insensitive filesystem */
public final class C1518v0 extends k1 implements Parcelable {
    public static final Parcelable.Creator<C1518v0> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f10183c = new b((DefaultConstructorMarker) null);

    /* renamed from: Y.v0$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1518v0 createFromParcel(Parcel parcel) {
            return new C1518v0(parcel.readFloat());
        }

        /* renamed from: b */
        public C1518v0[] newArray(int i10) {
            return new C1518v0[i10];
        }
    }

    /* renamed from: Y.v0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1518v0(float f10) {
        super(f10);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(c());
    }
}
