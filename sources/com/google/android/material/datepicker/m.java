package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f55906a;

    /* renamed from: b  reason: collision with root package name */
    final int f55907b;

    /* renamed from: c  reason: collision with root package name */
    final int f55908c;

    /* renamed from: d  reason: collision with root package name */
    final int f55909d;

    /* renamed from: e  reason: collision with root package name */
    final int f55910e;

    /* renamed from: f  reason: collision with root package name */
    final long f55911f;

    /* renamed from: g  reason: collision with root package name */
    private String f55912g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return m.b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar e10 = u.e(calendar);
        this.f55906a = e10;
        this.f55907b = e10.get(2);
        this.f55908c = e10.get(1);
        this.f55909d = e10.getMaximum(7);
        this.f55910e = e10.getActualMaximum(5);
        this.f55911f = e10.getTimeInMillis();
    }

    static m b(int i10, int i11) {
        Calendar l10 = u.l();
        l10.set(1, i10);
        l10.set(2, i11);
        return new m(l10);
    }

    static m c(long j10) {
        Calendar l10 = u.l();
        l10.setTimeInMillis(j10);
        return new m(l10);
    }

    static m e() {
        return new m(u.j());
    }

    /* renamed from: a */
    public int compareTo(m mVar) {
        return this.f55906a.compareTo(mVar.f55906a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f55907b == mVar.f55907b && this.f55908c == mVar.f55908c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        int firstDayOfWeek = this.f55906a.get(7) - this.f55906a.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f55909d;
        }
        return firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f55907b), Integer.valueOf(this.f55908c)});
    }

    /* access modifiers changed from: package-private */
    public long i(int i10) {
        Calendar e10 = u.e(this.f55906a);
        e10.set(5, i10);
        return e10.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public int j(long j10) {
        Calendar e10 = u.e(this.f55906a);
        e10.setTimeInMillis(j10);
        return e10.get(5);
    }

    /* access modifiers changed from: package-private */
    public String l() {
        if (this.f55912g == null) {
            this.f55912g = f.g(this.f55906a.getTimeInMillis());
        }
        return this.f55912g;
    }

    /* access modifiers changed from: package-private */
    public long o() {
        return this.f55906a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public m p(int i10) {
        Calendar e10 = u.e(this.f55906a);
        e10.add(2, i10);
        return new m(e10);
    }

    /* access modifiers changed from: package-private */
    public int s(m mVar) {
        if (this.f55906a instanceof GregorianCalendar) {
            return ((mVar.f55908c - this.f55908c) * 12) + (mVar.f55907b - this.f55907b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f55908c);
        parcel.writeInt(this.f55907b);
    }
}
