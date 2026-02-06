package com.google.android.gms.internal.measurement;

import Ha.C4294a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public final class zzdd extends zzbu implements zzdb {
    zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j10);
        zzb(23, a_);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) bundle);
        zzb(9, a_);
    }

    public final void clearMeasurementEnabled(long j10) {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(43, a_);
    }

    public final void endAdUnitExposure(String str, long j10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j10);
        zzb(24, a_);
    }

    public final void generateEventId(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(22, a_);
    }

    public final void getAppInstanceId(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(20, a_);
    }

    public final void getCachedAppInstanceId(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(19, a_);
    }

    public final void getConditionalUserProperties(String str, String str2, zzdg zzdg) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(10, a_);
    }

    public final void getCurrentScreenClass(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(17, a_);
    }

    public final void getCurrentScreenName(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(16, a_);
    }

    public final void getGmpAppId(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(21, a_);
    }

    public final void getMaxUserProperties(String str, zzdg zzdg) {
        Parcel a_ = a_();
        a_.writeString(str);
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(6, a_);
    }

    public final void getSessionId(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(46, a_);
    }

    public final void getTestFlag(zzdg zzdg, int i10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        a_.writeInt(i10);
        zzb(38, a_);
    }

    public final void getUserProperties(String str, String str2, boolean z10, zzdg zzdg) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(5, a_);
    }

    public final void initForTests(Map map) {
        Parcel a_ = a_();
        a_.writeMap(map);
        zzb(37, a_);
    }

    public final void initialize(C4294a aVar, zzdo zzdo, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (Parcelable) zzdo);
        a_.writeLong(j10);
        zzb(1, a_);
    }

    public final void isDataCollectionEnabled(zzdg zzdg) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdg);
        zzb(40, a_);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, z11);
        a_.writeLong(j10);
        zzb(2, a_);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdg zzdg, long j10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, (IInterface) zzdg);
        a_.writeLong(j10);
        zzb(3, a_);
    }

    public final void logHealthData(int i10, String str, C4294a aVar, C4294a aVar2, C4294a aVar3) {
        Parcel a_ = a_();
        a_.writeInt(i10);
        a_.writeString(str);
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (IInterface) aVar2);
        zzbw.zza(a_, (IInterface) aVar3);
        zzb(33, a_);
    }

    public final void onActivityCreated(C4294a aVar, Bundle bundle, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(27, a_);
    }

    public final void onActivityDestroyed(C4294a aVar, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(28, a_);
    }

    public final void onActivityPaused(C4294a aVar, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(29, a_);
    }

    public final void onActivityResumed(C4294a aVar, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(30, a_);
    }

    public final void onActivitySaveInstanceState(C4294a aVar, zzdg zzdg, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (IInterface) zzdg);
        a_.writeLong(j10);
        zzb(31, a_);
    }

    public final void onActivityStarted(C4294a aVar, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(25, a_);
    }

    public final void onActivityStopped(C4294a aVar, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(26, a_);
    }

    public final void performAction(Bundle bundle, zzdg zzdg, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, (IInterface) zzdg);
        a_.writeLong(j10);
        zzb(32, a_);
    }

    public final void registerOnMeasurementEventListener(zzdh zzdh) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdh);
        zzb(35, a_);
    }

    public final void resetAnalyticsData(long j10) {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(12, a_);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(8, a_);
    }

    public final void setConsent(Bundle bundle, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(44, a_);
    }

    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(45, a_);
    }

    public final void setCurrentScreen(C4294a aVar, String str, String str2, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeLong(j10);
        zzb(15, a_);
    }

    public final void setDataCollectionEnabled(boolean z10) {
        Parcel a_ = a_();
        zzbw.zza(a_, z10);
        zzb(39, a_);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzb(42, a_);
    }

    public final void setEventInterceptor(zzdh zzdh) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdh);
        zzb(34, a_);
    }

    public final void setInstanceIdProvider(zzdm zzdm) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdm);
        zzb(18, a_);
    }

    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel a_ = a_();
        zzbw.zza(a_, z10);
        a_.writeLong(j10);
        zzb(11, a_);
    }

    public final void setMinimumSessionDuration(long j10) {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(13, a_);
    }

    public final void setSessionTimeoutDuration(long j10) {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(14, a_);
    }

    public final void setSgtmDebugInfo(Intent intent) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) intent);
        zzb(48, a_);
    }

    public final void setUserId(String str, long j10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j10);
        zzb(7, a_);
    }

    public final void setUserProperty(String str, String str2, C4294a aVar, boolean z10, long j10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, z10);
        a_.writeLong(j10);
        zzb(4, a_);
    }

    public final void unregisterOnMeasurementEventListener(zzdh zzdh) {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdh);
        zzb(36, a_);
    }
}
