package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;
import za.C5298a;
import za.c;

/* renamed from: La.E  reason: case insensitive filesystem */
public class C4324E extends C5298a {
    public static final Parcelable.Creator<C4324E> CREATOR = new C4342e0();

    /* renamed from: c  reason: collision with root package name */
    public static final C4324E f51547c = new C4324E(a.SUPPORTED.toString(), (String) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C4324E f51548d = new C4324E(a.NOT_SUPPORTED.toString(), (String) null);

    /* renamed from: a  reason: collision with root package name */
    private final a f51549a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51550b;

    /* renamed from: La.E$a */
    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator<a> CREATOR = null;

        /* renamed from: a  reason: collision with root package name */
        private final String f51555a;

        static {
            CREATOR = new C4340d0();
        }

        private a(String str) {
            this.f51555a = str;
        }

        public static a a(String str) {
            for (a aVar : values()) {
                if (str.equals(aVar.f51555a)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return this.f51555a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f51555a);
        }
    }

    /* renamed from: La.E$b */
    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", new Object[]{str}));
        }
    }

    C4324E(String str, String str2) {
        C4536s.l(str);
        try {
            this.f51549a = a.a(str);
            this.f51550b = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4324E)) {
            return false;
        }
        C4324E e10 = (C4324E) obj;
        if (!zzao.zza(this.f51549a, e10.f51549a) || !zzao.zza(this.f51550b, e10.f51550b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51549a, this.f51550b});
    }

    public String o0() {
        return this.f51550b;
    }

    public String p0() {
        return this.f51549a.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, p0(), false);
        c.D(parcel, 3, o0(), false);
        c.b(parcel, a10);
    }
}
