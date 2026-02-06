package Y;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Y.x0  reason: case insensitive filesystem */
public final class C1522x0 extends m1 implements Parcelable {
    public static final Parcelable.Creator<C1522x0> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f10200c = new b((DefaultConstructorMarker) null);

    /* renamed from: Y.x0$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1522x0 createFromParcel(Parcel parcel) {
            return new C1522x0(parcel.readLong());
        }

        /* renamed from: b */
        public C1522x0[] newArray(int i10) {
            return new C1522x0[i10];
        }
    }

    /* renamed from: Y.x0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1522x0(long j10) {
        super(j10);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(a());
    }
}
