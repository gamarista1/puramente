package com.revenuecat.purchases.subscriberattributes;

import android.app.Application;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001AB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122 \u0010\u0015\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u000f2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u0011J'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\u000f2\n\u0010 \u001a\u00060\u000bj\u0002`\u001f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u000f2\n\u0010$\u001a\u00060\u000bj\u0002`\u001f2\n\u0010%\u001a\u00060\u000bj\u0002`\u001f¢\u0006\u0004\b&\u0010'J9\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\"\u0010\u0015\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`(\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b1\u00102J/\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "backend", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "deviceIdentifiersFetcher", "<init>", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "attributesAsObjects", "appUserID", "Llf/M;", "storeAttributesIfNeeded", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lyf/l;)V", "attributesToSet", "setAttributes", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "key", "value", "setAttribute", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "currentAppUserID", "Lkotlin/Function0;", "synchronizeSubscriberAttributesForAllUsers", "(Ljava/lang/String;Lyf/a;)V", "originalAppUserId", "newAppUserID", "copyUnsyncedSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "getUnsyncedSubscriberAttributes", "(Ljava/lang/String;Lyf/l;)V", "attributesToMarkAsSynced", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "markAsSynced", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "collectDeviceIdentifiers", "(Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "attributionKey", "setAttributionID", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "getBackend", "()Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "obtainingDeviceIdentifiersObservable", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "ObtainDeviceIdentifiersObservable", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesManager {
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    /* access modifiers changed from: private */
    public final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0011j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00128BX\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "Ljava/util/Observable;", "<init>", "()V", "Lkotlin/Function0;", "Llf/M;", "completion", "waitUntilIdle", "(Lyf/a;)V", "", "value", "numberOfProcesses", "I", "getNumberOfProcesses", "()I", "setNumberOfProcesses", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<C6787a> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new a(this));
        }

        /* access modifiers changed from: private */
        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            C6496s.h(obtainDeviceIdentifiersObservable, "this$0");
            C6496s.f(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    try {
                        for (C6787a invoke : obtainDeviceIdentifiersObservable.listeners) {
                            invoke.invoke();
                        }
                        obtainDeviceIdentifiersObservable.listeners.clear();
                        C6514M m10 = C6514M.f71813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i10) {
            if (this.numberOfProcesses != i10) {
                this.numberOfProcesses = i10;
                setChanged();
                notifyObservers();
            }
        }

        public final synchronized void waitUntilIdle(C6787a aVar) {
            try {
                C6496s.h(aVar, "completion");
                if (this.numberOfProcesses == 0) {
                    aVar.invoke();
                } else {
                    this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(aVar));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesPoster subscriberAttributesPoster, DeviceIdentifiersFetcher deviceIdentifiersFetcher2) {
        C6496s.h(subscriberAttributesCache, "deviceCache");
        C6496s.h(subscriberAttributesPoster, "backend");
        C6496s.h(deviceIdentifiersFetcher2, "deviceIdentifiersFetcher");
        this.deviceCache = subscriberAttributesCache;
        this.backend = subscriberAttributesPoster;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher2;
    }

    private final void getDeviceIdentifiers(Application application, C6798l lVar) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(application, new SubscriberAttributesManager$getDeviceIdentifiers$1(lVar, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> map, String str) {
        String str2;
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            SubscriberAttribute subscriberAttribute = (SubscriberAttribute) next.getValue();
            if (allStoredSubscriberAttributes.containsKey(str3)) {
                SubscriberAttribute subscriberAttribute2 = allStoredSubscriberAttributes.get(str3);
                if (subscriberAttribute2 != null) {
                    str2 = subscriberAttribute2.getValue();
                } else {
                    str2 = null;
                }
                if (C6496s.c(str2, subscriberAttribute.getValue())) {
                }
            }
            linkedHashMap.put(next.getKey(), next.getValue());
        }
        if (!linkedHashMap.isEmpty()) {
            this.deviceCache.setAttributes(str, linkedHashMap);
        }
    }

    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, aVar);
    }

    public final void collectDeviceIdentifiers(String str, Application application) {
        C6496s.h(str, "appUserID");
        C6496s.h(application, "applicationContext");
        getDeviceIdentifiers(application, new SubscriberAttributesManager$collectDeviceIdentifiers$1(this, str));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String str, String str2) {
        C6496s.h(str, "originalAppUserId");
        C6496s.h(str2, "newAppUserID");
        Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(str);
        if (!unsyncedSubscriberAttributes.isEmpty()) {
            String format = String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{str, str2}, 2));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.infoLog(format);
            this.deviceCache.setAttributes(str2, unsyncedSubscriberAttributes);
            this.deviceCache.clearAllSubscriberAttributesFromUser(str);
        }
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String str, C6798l lVar) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1(lVar, this, str));
    }

    public final synchronized void markAsSynced(String str, Map<String, SubscriberAttribute> map, List<SubscriberAttributeError> list) {
        try {
            C6496s.h(str, "appUserID");
            C6496s.h(map, "attributesToMarkAsSynced");
            C6496s.h(list, "attributeErrors");
            if (!list.isEmpty()) {
                LogIntent logIntent = LogIntent.RC_ERROR;
                String format = String.format(AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(logIntent, format);
            }
            if (!map.isEmpty()) {
                LogIntent logIntent2 = LogIntent.INFO;
                StringBuilder sb2 = new StringBuilder();
                String format2 = String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{str}, 1));
                C6496s.g(format2, "format(this, *args)");
                sb2.append(format2);
                sb2.append(C6565s.x0(map.values(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null));
                LogWrapperKt.log(logIntent2, sb2.toString());
                Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
                Map B10 = O.B(allStoredSubscriberAttributes);
                for (Map.Entry next : map.entrySet()) {
                    String str2 = (String) next.getKey();
                    SubscriberAttribute subscriberAttribute = (SubscriberAttribute) next.getValue();
                    SubscriberAttribute subscriberAttribute2 = allStoredSubscriberAttributes.get(str2);
                    if (subscriberAttribute2 != null) {
                        SubscriberAttribute subscriberAttribute3 = null;
                        if (subscriberAttribute2.isSynced()) {
                            subscriberAttribute2 = null;
                        }
                        if (subscriberAttribute2 != null) {
                            if (C6496s.c(subscriberAttribute2.getValue(), subscriberAttribute.getValue())) {
                                subscriberAttribute3 = subscriberAttribute2;
                            }
                            if (subscriberAttribute3 != null) {
                                B10.put(str2, SubscriberAttribute.copy$default(subscriberAttribute, (SubscriberAttributeKey) null, (String) null, (DateProvider) null, (Date) null, true, 15, (Object) null));
                            }
                        }
                    }
                }
                this.deviceCache.setAttributes(str, B10);
            }
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized void setAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, String str2) {
        C6496s.h(subscriberAttributeKey, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(str2, "appUserID");
        setAttributes(O.f(C6502A.a(subscriberAttributeKey.getBackendKey(), str)), str2);
    }

    public final synchronized void setAttributes(Map<String, String> map, String str) {
        try {
            C6496s.h(map, "attributesToSet");
            C6496s.h(str, "appUserID");
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                arrayList.add(C6502A.a(str2, new SubscriberAttribute(str2, (String) next.getValue(), (DateProvider) null, (Date) null, false, 28, (DefaultConstructorMarker) null)));
            }
            storeAttributesIfNeeded(O.w(arrayList), str);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionIds, String str, String str2, Application application) {
        C6496s.h(attributionIds, "attributionKey");
        C6496s.h(str2, "appUserID");
        C6496s.h(application, "applicationContext");
        getDeviceIdentifiers(application, new SubscriberAttributesManager$setAttributionID$1(attributionIds, str, this, str2));
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String str, C6787a aVar) {
        C6496s.h(str, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1(this, aVar, str));
    }
}
