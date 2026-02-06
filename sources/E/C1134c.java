package E;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: E.c  reason: case insensitive filesystem */
final class C1134c implements Parcelable {
    public static final Parcelable.Creator<C1134c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f1609b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f1610a;

    /* renamed from: E.c$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1134c createFromParcel(Parcel parcel) {
            return new C1134c(parcel.readInt());
        }

        /* renamed from: b */
        public C1134c[] newArray(int i10) {
            return new C1134c[i10];
        }
    }

    /* renamed from: E.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1134c(int i10) {
        this.f1610a = i10;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1134c) && this.f1610a == ((C1134c) obj).f1610a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f1610a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f1610a + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1610a);
    }
}
