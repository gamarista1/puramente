package com.google.android.gms.internal.measurement;

import Ha.C4294a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

public interface zzdb extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzdg zzdg);

    void getAppInstanceId(zzdg zzdg);

    void getCachedAppInstanceId(zzdg zzdg);

    void getConditionalUserProperties(String str, String str2, zzdg zzdg);

    void getCurrentScreenClass(zzdg zzdg);

    void getCurrentScreenName(zzdg zzdg);

    void getGmpAppId(zzdg zzdg);

    void getMaxUserProperties(String str, zzdg zzdg);

    void getSessionId(zzdg zzdg);

    void getTestFlag(zzdg zzdg, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzdg zzdg);

    void initForTests(Map map);

    void initialize(C4294a aVar, zzdo zzdo, long j10);

    void isDataCollectionEnabled(zzdg zzdg);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdg zzdg, long j10);

    void logHealthData(int i10, String str, C4294a aVar, C4294a aVar2, C4294a aVar3);

    void onActivityCreated(C4294a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(C4294a aVar, long j10);

    void onActivityPaused(C4294a aVar, long j10);

    void onActivityResumed(C4294a aVar, long j10);

    void onActivitySaveInstanceState(C4294a aVar, zzdg zzdg, long j10);

    void onActivityStarted(C4294a aVar, long j10);

    void onActivityStopped(C4294a aVar, long j10);

    void performAction(Bundle bundle, zzdg zzdg, long j10);

    void registerOnMeasurementEventListener(zzdh zzdh);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(C4294a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzdh zzdh);

    void setInstanceIdProvider(zzdm zzdm);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, C4294a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzdh zzdh);
}
