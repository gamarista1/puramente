package io.invertase.firebase.database;

import Gb.j;
import Ue.C5546a;
import Ue.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class ReactNativeFirebaseDatabaseQueryModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseQuery";
    private HashMap<String, C6412k> queryMap = new HashMap<>();

    class a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f71342a;

        a(Promise promise) {
            this.f71342a = promise;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void f(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        public void a(Gb.b bVar) {
            C6402a.j(this.f71342a, new N(bVar.f(), bVar.g(), bVar.h()));
        }

        public void b(com.google.firebase.database.a aVar) {
            Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new C6416o(aVar)).addOnCompleteListener(new C6417p(this.f71342a));
        }
    }

    class b implements Gb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6412k f71345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f71346c;

        b(String str, C6412k kVar, Promise promise) {
            this.f71344a = str;
            this.f71345b = kVar;
            this.f71346c = promise;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void o(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void q(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void s(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void u(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        public void a(Gb.b bVar) {
            this.f71345b.m(this);
            C6402a.j(this.f71346c, new N(bVar.f(), bVar.g(), bVar.h()));
        }

        public void b(com.google.firebase.database.a aVar, String str) {
            if ("child_changed".equals(this.f71344a)) {
                this.f71345b.m(this);
                Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new C6423w(aVar, str)).addOnCompleteListener(new C6424x(this.f71346c));
            }
        }

        public void c(com.google.firebase.database.a aVar, String str) {
            if ("child_added".equals(this.f71344a)) {
                this.f71345b.m(this);
                Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new C6418q(aVar, str)).addOnCompleteListener(new r(this.f71346c));
            }
        }

        public void d(com.google.firebase.database.a aVar, String str) {
            if ("child_moved".equals(this.f71344a)) {
                this.f71345b.m(this);
                Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new C6421u(aVar, str)).addOnCompleteListener(new C6422v(this.f71346c));
            }
        }

        public void e(com.google.firebase.database.a aVar) {
            if ("child_removed".equals(this.f71344a)) {
                this.f71345b.m(this);
                Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new C6419s(aVar)).addOnCompleteListener(new C6420t(this.f71346c));
            }
        }
    }

    class c implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f71349b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6412k f71350c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f71351d;

        c(String str, ReadableMap readableMap, C6412k kVar, String str2) {
            this.f71348a = str;
            this.f71349b = readableMap;
            this.f71350c = kVar;
            this.f71351d = str2;
        }

        public void a(Gb.b bVar) {
            this.f71350c.n(this.f71351d);
            ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEventError(this.f71348a, this.f71349b, bVar);
        }

        public void b(com.google.firebase.database.a aVar) {
            ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(this.f71348a, "value", this.f71349b, aVar, (String) null);
        }
    }

    class d implements Gb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f71355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6412k f71356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f71357e;

        d(String str, String str2, ReadableMap readableMap, C6412k kVar, String str3) {
            this.f71353a = str;
            this.f71354b = str2;
            this.f71355c = readableMap;
            this.f71356d = kVar;
            this.f71357e = str3;
        }

        public void a(Gb.b bVar) {
            this.f71356d.n(this.f71357e);
            ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEventError(this.f71354b, this.f71355c, bVar);
        }

        public void b(com.google.firebase.database.a aVar, String str) {
            if ("child_changed".equals(this.f71353a)) {
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(this.f71354b, "child_changed", this.f71355c, aVar, str);
            }
        }

        public void c(com.google.firebase.database.a aVar, String str) {
            if ("child_added".equals(this.f71353a)) {
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(this.f71354b, "child_added", this.f71355c, aVar, str);
            }
        }

        public void d(com.google.firebase.database.a aVar, String str) {
            if ("child_moved".equals(this.f71353a)) {
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(this.f71354b, "child_moved", this.f71355c, aVar, str);
            }
        }

        public void e(com.google.firebase.database.a aVar) {
            if ("child_removed".equals(this.f71353a)) {
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(this.f71354b, "child_removed", this.f71355c, aVar, (String) null);
            }
        }
    }

    ReactNativeFirebaseDatabaseQueryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
    }

    private void addChildEventListener(String str, String str2, C6412k kVar, ReadableMap readableMap) {
        String string = readableMap.getString("eventRegistrationKey");
        if (!kVar.j(string).booleanValue()) {
            kVar.a(string, new d(str2, str, readableMap, kVar, string));
        }
    }

    private void addChildOnceEventListener(String str, C6412k kVar, Promise promise) {
        kVar.c(new b(str, kVar, promise));
    }

    private void addOnceValueEventListener(C6412k kVar, Promise promise) {
        kVar.d(new a(promise));
    }

    private void addValueEventListener(String str, C6412k kVar, ReadableMap readableMap) {
        String string = readableMap.getString("eventRegistrationKey");
        if (!kVar.j(string).booleanValue()) {
            kVar.b(string, new c(str, readableMap, kVar, string));
        }
    }

    private C6412k getDatabaseQueryInstance(com.google.firebase.database.b bVar, ReadableArray readableArray) {
        return new C6412k(bVar, readableArray);
    }

    /* access modifiers changed from: private */
    public void handleDatabaseEvent(String str, String str2, ReadableMap readableMap, com.google.firebase.database.a aVar, String str3) {
        Tasks.call(getTransactionalExecutor(readableMap.getString("eventRegistrationKey")), new C6413l(str2, aVar, str3)).addOnCompleteListener((Executor) getExecutor(), new C6414m(str, str2, readableMap));
    }

    /* access modifiers changed from: private */
    public void handleDatabaseEventError(String str, ReadableMap readableMap, Gb.b bVar) {
        WritableMap createMap = Arguments.createMap();
        N n10 = new N(bVar.f(), bVar.g(), bVar.h());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("code", n10.a());
        createMap2.putString(MetricTracker.Object.MESSAGE, n10.getMessage());
        createMap.putString(SubscriberAttributeKt.JSON_NAME_KEY, str);
        createMap.putMap(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, createMap2);
        createMap.putMap("registration", C5546a.e(readableMap));
        g.i().o(new C6403b("database_sync_event", createMap));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$get$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(C6402a.k((com.google.firebase.database.a) task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ WritableMap lambda$handleDatabaseEvent$0(String str, com.google.firebase.database.a aVar, String str2) {
        if (str.equals("value")) {
            return C6402a.k(aVar);
        }
        return C6402a.l(aVar, str2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleDatabaseEvent$1(String str, String str2, ReadableMap readableMap, Task task) {
        if (task.isSuccessful()) {
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("data", (WritableMap) task.getResult());
            createMap.putString(SubscriberAttributeKt.JSON_NAME_KEY, str);
            createMap.putString("eventType", str2);
            createMap.putMap("registration", C5546a.e(readableMap));
            g.i().o(new C6403b("database_sync_event", createMap));
        }
    }

    @ReactMethod
    public void get(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        getDatabaseQueryInstance(P.b(str, str2).f(str3), readableArray).f71379a.l().addOnCompleteListener((Executor) getTransactionalExecutor(), new C6415n(promise));
    }

    @ReactMethod
    public void keepSynced(String str, String str2, String str3, String str4, ReadableArray readableArray, Boolean bool, Promise promise) {
        getDatabaseQueryInstance(str3, P.b(str, str2).f(str4), readableArray).f71379a.p(bool.booleanValue());
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void off(String str, String str2) {
        C6412k kVar = this.queryMap.get(str);
        if (kVar != null) {
            kVar.n(str2);
            removeEventListeningExecutor(str2);
            if (!kVar.k().booleanValue()) {
                this.queryMap.remove(str);
            }
        }
    }

    @ReactMethod
    public void on(String str, String str2, ReadableMap readableMap) {
        String string = readableMap.getString(SubscriberAttributeKt.JSON_NAME_KEY);
        ReadableArray array = readableMap.getArray("modifiers");
        String string2 = readableMap.getString("path");
        Objects.requireNonNull(string2);
        String string3 = readableMap.getString("eventType");
        Objects.requireNonNull(string3);
        ReadableMap map = readableMap.getMap("registration");
        Objects.requireNonNull(map);
        ReadableMap readableMap2 = map;
        com.google.firebase.database.b f10 = P.b(str, str2).f(string2);
        if (string3.equals("value")) {
            addValueEventListener(string, getDatabaseQueryInstance(string, f10, array), readableMap2);
        } else {
            addChildEventListener(string, string3, getDatabaseQueryInstance(string, f10, array), readableMap2);
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Iterator<Map.Entry<String, C6412k>> it = this.queryMap.entrySet().iterator();
        while (it.hasNext()) {
            ((C6412k) it.next().getValue()).l();
            it.remove();
        }
    }

    @ReactMethod
    public void once(String str, String str2, String str3, ReadableArray readableArray, String str4, Promise promise) {
        com.google.firebase.database.b f10 = P.b(str, str2).f(str3);
        if (str4.equals("value")) {
            addOnceValueEventListener(getDatabaseQueryInstance(f10, readableArray), promise);
        } else {
            addChildOnceEventListener(str4, getDatabaseQueryInstance(f10, readableArray), promise);
        }
    }

    private C6412k getDatabaseQueryInstance(String str, com.google.firebase.database.b bVar, ReadableArray readableArray) {
        C6412k kVar = this.queryMap.get(str);
        if (kVar != null) {
            return kVar;
        }
        C6412k kVar2 = new C6412k(bVar, readableArray);
        this.queryMap.put(str, kVar2);
        return kVar2;
    }
}
