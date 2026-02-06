package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c f56409a;

    /* renamed from: b  reason: collision with root package name */
    private final c f56410b;

    /* renamed from: c  reason: collision with root package name */
    final int f56411c;

    /* renamed from: d  reason: collision with root package name */
    int f56412d;

    /* renamed from: e  reason: collision with root package name */
    int f56413e;

    /* renamed from: f  reason: collision with root package name */
    int f56414f;

    /* renamed from: g  reason: collision with root package name */
    int f56415g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    private static int f(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    public int c() {
        if (this.f56411c == 1) {
            return this.f56412d % 24;
        }
        int i10 = this.f56412d;
        if (i10 % 12 == 0) {
            return 12;
        }
        if (this.f56415g == 1) {
            return i10 - 12;
        }
        return i10;
    }

    public c d() {
        return this.f56410b;
    }

    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f56409a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f56412d == eVar.f56412d && this.f56413e == eVar.f56413e && this.f56411c == eVar.f56411c && this.f56414f == eVar.f56414f) {
            return true;
        }
        return false;
    }

    public void g(int i10) {
        if (this.f56411c == 1) {
            this.f56412d = i10;
            return;
        }
        int i11 = 12;
        int i12 = i10 % 12;
        if (this.f56415g != 1) {
            i11 = 0;
        }
        this.f56412d = i12 + i11;
    }

    public void h(int i10) {
        this.f56415g = f(i10);
        this.f56412d = i10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f56411c), Integer.valueOf(this.f56412d), Integer.valueOf(this.f56413e), Integer.valueOf(this.f56414f)});
    }

    public void i(int i10) {
        this.f56413e = i10 % 60;
    }

    public void j(int i10) {
        if (i10 != this.f56415g) {
            this.f56415g = i10;
            int i11 = this.f56412d;
            if (i11 < 12 && i10 == 1) {
                this.f56412d = i11 + 12;
            } else if (i11 >= 12 && i10 == 0) {
                this.f56412d = i11 - 12;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f56412d);
        parcel.writeInt(this.f56413e);
        parcel.writeInt(this.f56414f);
        parcel.writeInt(this.f56411c);
    }

    public e(int i10) {
        this(0, 0, 10, i10);
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f56412d = i10;
        this.f56413e = i11;
        this.f56414f = i12;
        this.f56411c = i13;
        this.f56415g = f(i10);
        this.f56409a = new c(59);
        this.f56410b = new c(i13 == 1 ? 24 : 12);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
