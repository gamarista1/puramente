package h4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;
import o4.l;

/* renamed from: h4.c  reason: case insensitive filesystem */
public interface C3568c {

    /* renamed from: h4.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f43974a;

        /* renamed from: b  reason: collision with root package name */
        private double f43975b;

        /* renamed from: c  reason: collision with root package name */
        private int f43976c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f43977d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f43978e = true;

        public a(Context context) {
            this.f43974a = context;
            this.f43975b = l.e(context);
        }

        public final C3568c a() {
            C3574i iVar;
            C3573h hVar;
            int i10;
            if (this.f43978e) {
                iVar = new C3572g();
            } else {
                iVar = new C3567b();
            }
            if (this.f43977d) {
                double d10 = this.f43975b;
                if (d10 > 0.0d) {
                    i10 = l.c(this.f43974a, d10);
                } else {
                    i10 = this.f43976c;
                }
                if (i10 > 0) {
                    hVar = new C3571f(i10, iVar);
                } else {
                    hVar = new C3566a(iVar);
                }
            } else {
                hVar = new C3566a(iVar);
            }
            return new C3570e(hVar, iVar);
        }
    }

    /* renamed from: h4.c$c  reason: collision with other inner class name */
    public static final class C0675c {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f43982a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f43983b;

        public C0675c(Bitmap bitmap, Map map) {
            this.f43982a = bitmap;
            this.f43983b = map;
        }

        public final Bitmap a() {
            return this.f43982a;
        }

        public final Map b() {
            return this.f43983b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0675c) {
                C0675c cVar = (C0675c) obj;
                if (!C6496s.c(this.f43982a, cVar.f43982a) || !C6496s.c(this.f43983b, cVar.f43983b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f43982a.hashCode() * 31) + this.f43983b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f43982a + ", extras=" + this.f43983b + ')';
        }
    }

    void a(int i10);

    C0675c b(b bVar);

    void c(b bVar, C0675c cVar);

    /* renamed from: h4.c$b */
    public static final class b implements Parcelable {
        @Deprecated
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final C0674b f43979c = new C0674b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f43980a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f43981b;

        /* renamed from: h4.c$b$a */
        public static final class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                C6496s.e(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    String readString2 = parcel.readString();
                    C6496s.e(readString2);
                    String readString3 = parcel.readString();
                    C6496s.e(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new b(readString, linkedHashMap);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* renamed from: h4.c$b$b  reason: collision with other inner class name */
        private static final class C0674b {
            public /* synthetic */ C0674b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0674b() {
            }
        }

        public b(String str, Map map) {
            this.f43980a = str;
            this.f43981b = map;
        }

        public static /* synthetic */ b b(b bVar, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f43980a;
            }
            if ((i10 & 2) != 0) {
                map = bVar.f43981b;
            }
            return bVar.a(str, map);
        }

        public final b a(String str, Map map) {
            return new b(str, map);
        }

        public final Map c() {
            return this.f43981b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!C6496s.c(this.f43980a, bVar.f43980a) || !C6496s.c(this.f43981b, bVar.f43981b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f43980a.hashCode() * 31) + this.f43981b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f43980a + ", extras=" + this.f43981b + ')';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f43980a);
            parcel.writeInt(this.f43981b.size());
            for (Map.Entry entry : this.f43981b.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? O.i() : map);
        }
    }
}
