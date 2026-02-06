package Y;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Y.y0  reason: case insensitive filesystem */
public final class C1524y0 extends n1 implements Parcelable {
    public static final Parcelable.Creator<C1524y0> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final b f10204d = new b((DefaultConstructorMarker) null);

    /* renamed from: Y.y0$a */
    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        /* renamed from: a */
        public C1524y0 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C1524y0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            o1 o1Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                o1Var = p1.j();
            } else if (readInt == 1) {
                o1Var = p1.q();
            } else if (readInt == 2) {
                o1Var = p1.n();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new C1524y0(readValue, o1Var);
        }

        /* renamed from: c */
        public C1524y0[] newArray(int i10) {
            return new C1524y0[i10];
        }
    }

    /* renamed from: Y.y0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1524y0(Object obj, o1 o1Var) {
        super(obj, o1Var);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        o1 d10 = d();
        if (C6496s.c(d10, p1.j())) {
            i11 = 0;
        } else if (C6496s.c(d10, p1.q())) {
            i11 = 1;
        } else if (C6496s.c(d10, p1.n())) {
            i11 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i11);
    }
}
