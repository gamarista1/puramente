package S9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f34125a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34126b;

    /* renamed from: c  reason: collision with root package name */
    public final List f34127c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(String str, String str2, List list) {
        this.f34125a = str;
        this.f34126b = str2;
        this.f34127c = Collections.unmodifiableList(new ArrayList(list));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!TextUtils.equals(this.f34125a, qVar.f34125a) || !TextUtils.equals(this.f34126b, qVar.f34126b) || !this.f34127c.equals(qVar.f34127c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        String str = this.f34125a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f34126b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i12 + i11) * 31) + this.f34127c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f34125a != null) {
            str = " [" + this.f34125a + ", " + this.f34126b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f34125a);
        parcel.writeString(this.f34126b);
        int size = this.f34127c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) this.f34127c.get(i11), 0);
        }
    }

    q(Parcel parcel) {
        this.f34125a = parcel.readString();
        this.f34126b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f34127c = Collections.unmodifiableList(arrayList);
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f34128a;

        /* renamed from: b  reason: collision with root package name */
        public final int f34129b;

        /* renamed from: c  reason: collision with root package name */
        public final String f34130c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34131d;

        /* renamed from: e  reason: collision with root package name */
        public final String f34132e;

        /* renamed from: f  reason: collision with root package name */
        public final String f34133f;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f34128a = i10;
            this.f34129b = i11;
            this.f34130c = str;
            this.f34131d = str2;
            this.f34132e = str3;
            this.f34133f = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f34128a != bVar.f34128a || this.f34129b != bVar.f34129b || !TextUtils.equals(this.f34130c, bVar.f34130c) || !TextUtils.equals(this.f34131d, bVar.f34131d) || !TextUtils.equals(this.f34132e, bVar.f34132e) || !TextUtils.equals(this.f34133f, bVar.f34133f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13 = ((this.f34128a * 31) + this.f34129b) * 31;
            String str = this.f34130c;
            int i14 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (i13 + i10) * 31;
            String str2 = this.f34131d;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 31;
            String str3 = this.f34132e;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 31;
            String str4 = this.f34133f;
            if (str4 != null) {
                i14 = str4.hashCode();
            }
            return i17 + i14;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f34128a);
            parcel.writeInt(this.f34129b);
            parcel.writeString(this.f34130c);
            parcel.writeString(this.f34131d);
            parcel.writeString(this.f34132e);
            parcel.writeString(this.f34133f);
        }

        b(Parcel parcel) {
            this.f34128a = parcel.readInt();
            this.f34129b = parcel.readInt();
            this.f34130c = parcel.readString();
            this.f34131d = parcel.readString();
            this.f34132e = parcel.readString();
            this.f34133f = parcel.readString();
        }
    }
}
