package com.google.android.gms.measurement.internal;

import Pa.C4378a;
import Pa.e;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

public final class O1 extends zzbu implements e {
    O1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void A0(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzb(26, a_);
    }

    public final String F0(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final void J0(C4604f fVar, E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) fVar);
        zzbw.zza(a_, (Parcelable) e52);
        zzb(12, a_);
    }

    public final void O0(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzb(4, a_);
    }

    public final void P0(C4604f fVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) fVar);
        zzb(13, a_);
    }

    public final byte[] T(D d10, String str) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) d10);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    public final C4378a W(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        Parcel zza = zza(21, a_);
        C4378a aVar = (C4378a) zzbw.zza(zza, C4378a.CREATOR);
        zza.recycle();
        return aVar;
    }

    public final void c0(D d10, E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) d10);
        zzbw.zza(a_, (Parcelable) e52);
        zzb(1, a_);
    }

    public final List c1(String str, String str2, boolean z10, E5 e52) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, (Parcelable) e52);
        Parcel zza = zza(14, a_);
        ArrayList<A5> createTypedArrayList = zza.createTypedArrayList(A5.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final List d(String str, String str2, E5 e52) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) e52);
        Parcel zza = zza(16, a_);
        ArrayList<C4604f> createTypedArrayList = zza.createTypedArrayList(C4604f.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void e(D d10, String str, String str2) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) d10);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    public final List f0(E5 e52, Bundle bundle) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzbw.zza(a_, (Parcelable) bundle);
        Parcel zza = zza(24, a_);
        ArrayList<C4624h5> createTypedArrayList = zza.createTypedArrayList(C4624h5.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void f1(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzb(6, a_);
    }

    public final List h(String str, String str2, String str3, boolean z10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzbw.zza(a_, z10);
        Parcel zza = zza(15, a_);
        ArrayList<A5> createTypedArrayList = zza.createTypedArrayList(A5.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void o1(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzb(25, a_);
    }

    public final void q0(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzb(18, a_);
    }

    public final void t0(A5 a52, E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) a52);
        zzbw.zza(a_, (Parcelable) e52);
        zzb(2, a_);
    }

    public final void w(long j10, String str, String str2, String str3) {
        Parcel a_ = a_();
        a_.writeLong(j10);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    public final List x(String str, String str2, String str3) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList<C4604f> createTypedArrayList = zza.createTypedArrayList(C4604f.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void y0(E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) e52);
        zzb(20, a_);
    }

    public final void z0(Bundle bundle, E5 e52) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, (Parcelable) e52);
        zzb(19, a_);
    }
}
