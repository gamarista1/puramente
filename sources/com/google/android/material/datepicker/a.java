package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0833a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final m f55782a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m f55783b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f55784c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public m f55785d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55786e;

    /* renamed from: f  reason: collision with root package name */
    private final int f55787f;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    class C0833a implements Parcelable.Creator {
        C0833a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            Class<m> cls = m.class;
            return new a((m) parcel.readParcelable(cls.getClassLoader()), (m) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(cls.getClassLoader()), (C0833a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public interface c extends Parcelable {
        boolean D(long j10);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, C0833a aVar) {
        this(mVar, mVar2, cVar, mVar3);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public m e(m mVar) {
        if (mVar.compareTo(this.f55782a) < 0) {
            return this.f55782a;
        }
        if (mVar.compareTo(this.f55783b) > 0) {
            return this.f55783b;
        }
        return mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f55782a.equals(aVar.f55782a) || !this.f55783b.equals(aVar.f55783b) || !x1.c.a(this.f55785d, aVar.f55785d) || !this.f55784c.equals(aVar.f55784c)) {
            return false;
        }
        return true;
    }

    public c f() {
        return this.f55784c;
    }

    /* access modifiers changed from: package-private */
    public m g() {
        return this.f55783b;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f55787f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55782a, this.f55783b, this.f55785d, this.f55784c});
    }

    /* access modifiers changed from: package-private */
    public m i() {
        return this.f55785d;
    }

    /* access modifiers changed from: package-private */
    public m j() {
        return this.f55782a;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f55786e;
    }

    /* access modifiers changed from: package-private */
    public boolean l(long j10) {
        if (this.f55782a.i(1) <= j10) {
            m mVar = this.f55783b;
            if (j10 <= mVar.i(mVar.f55910e)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(m mVar) {
        this.f55785d = mVar;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f55782a, 0);
        parcel.writeParcelable(this.f55783b, 0);
        parcel.writeParcelable(this.f55785d, 0);
        parcel.writeParcelable(this.f55784c, 0);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3) {
        this.f55782a = mVar;
        this.f55783b = mVar2;
        this.f55785d = mVar3;
        this.f55784c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (mVar3 == null || mVar3.compareTo(mVar2) <= 0) {
            this.f55787f = mVar.s(mVar2) + 1;
            this.f55786e = (mVar2.f55908c - mVar.f55908c) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f55788e = u.a(m.b(1900, 0).f55911f);

        /* renamed from: f  reason: collision with root package name */
        static final long f55789f = u.a(m.b(2100, 11).f55911f);

        /* renamed from: a  reason: collision with root package name */
        private long f55790a = f55788e;

        /* renamed from: b  reason: collision with root package name */
        private long f55791b = f55789f;

        /* renamed from: c  reason: collision with root package name */
        private Long f55792c;

        /* renamed from: d  reason: collision with root package name */
        private c f55793d = g.a(Long.MIN_VALUE);

        public b() {
        }

        public a a() {
            m c10;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f55793d);
            m c11 = m.c(this.f55790a);
            m c12 = m.c(this.f55791b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f55792c;
            if (l10 == null) {
                c10 = null;
            } else {
                c10 = m.c(l10.longValue());
            }
            return new a(c11, c12, cVar, c10, (C0833a) null);
        }

        public b b(long j10) {
            this.f55792c = Long.valueOf(j10);
            return this;
        }

        b(a aVar) {
            this.f55790a = aVar.f55782a.f55911f;
            this.f55791b = aVar.f55783b.f55911f;
            this.f55792c = Long.valueOf(aVar.f55785d.f55911f);
            this.f55793d = aVar.f55784c;
        }
    }
}
