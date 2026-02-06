package Y;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Y.w0  reason: case insensitive filesystem */
public final class C1520w0 extends l1 implements Parcelable {
    public static final Parcelable.Creator<C1520w0> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f10187c = new b((DefaultConstructorMarker) null);

    /* renamed from: Y.w0$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1520w0 createFromParcel(Parcel parcel) {
            return new C1520w0(parcel.readInt());
        }

        /* renamed from: b */
        public C1520w0[] newArray(int i10) {
            return new C1520w0[i10];
        }
    }

    /* renamed from: Y.w0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1520w0(int i10) {
        super(i10);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(b());
    }
}
