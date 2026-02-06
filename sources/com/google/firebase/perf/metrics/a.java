package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0860a();

    /* renamed from: a  reason: collision with root package name */
    private final String f57719a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f57720b;

    /* renamed from: com.google.firebase.perf.metrics.a$a  reason: collision with other inner class name */
    class C0860a implements Parcelable.Creator {
        C0860a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0860a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0860a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f57720b.get();
    }

    public void b(long j10) {
        this.f57720b.addAndGet(j10);
    }

    /* access modifiers changed from: package-private */
    public void c(long j10) {
        this.f57720b.set(j10);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public String getName() {
        return this.f57719a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f57719a);
        parcel.writeLong(this.f57720b.get());
    }

    public a(String str) {
        this.f57719a = str;
        this.f57720b = new AtomicLong(0);
    }

    private a(Parcel parcel) {
        this.f57719a = parcel.readString();
        this.f57720b = new AtomicLong(parcel.readLong());
    }
}
