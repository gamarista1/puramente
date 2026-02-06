package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

@Q7.a(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final l executor;
    /* access modifiers changed from: private */
    public k mReactDatabaseSupplier;
    private boolean mShuttingDown;

    class a extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f59240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f59241b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f59240a = callback;
            this.f59241b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f59240a.invoke(b.a((String) null), null);
                return;
            }
            String[] strArr = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            int i10 = 0;
            while (i10 < this.f59241b.size()) {
                int min = Math.min(this.f59241b.size() - i10, AsyncStorageModule.MAX_SQL_KEYS);
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.o().query("catalystLocalStorage", strArr, a.a(min), a.b(this.f59241b, i10, min), (String) null, (String) null, (String) null);
                hashSet.clear();
                try {
                    if (query.getCount() != this.f59241b.size()) {
                        for (int i11 = i10; i11 < i10 + min; i11++) {
                            hashSet.add(this.f59241b.getString(i11));
                        }
                    }
                    if (query.moveToFirst()) {
                        do {
                            WritableArray createArray2 = Arguments.createArray();
                            createArray2.pushString(query.getString(0));
                            createArray2.pushString(query.getString(1));
                            createArray.pushArray(createArray2);
                            hashSet.remove(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushString((String) it.next());
                        createArray3.pushNull();
                        createArray.pushArray(createArray3);
                    }
                    hashSet.clear();
                    i10 += AsyncStorageModule.MAX_SQL_KEYS;
                } catch (Exception e10) {
                    U5.a.J("ReactNative", e10.getMessage(), e10);
                    this.f59240a.invoke(b.b((String) null, e10.getMessage()), null);
                    query.close();
                    return;
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            this.f59240a.invoke(null, createArray);
        }
    }

    class b extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f59243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f59244b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f59243a = callback;
            this.f59244b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f59243a.invoke(b.a((String) null));
                return;
            }
            SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.o().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.o().beginTransaction();
                int i10 = 0;
                while (i10 < this.f59244b.size()) {
                    if (this.f59244b.getArray(i10).size() != 2) {
                        WritableMap d10 = b.d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e10) {
                            U5.a.J("ReactNative", e10.getMessage(), e10);
                            if (d10 == null) {
                                b.b((String) null, e10.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f59244b.getArray(i10).getString(0) == null) {
                        WritableMap c10 = b.c((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e11) {
                            U5.a.J("ReactNative", e11.getMessage(), e11);
                            if (c10 == null) {
                                b.b((String) null, e11.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f59244b.getArray(i10).getString(1) == null) {
                        WritableMap d11 = b.d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e12) {
                            U5.a.J("ReactNative", e12.getMessage(), e12);
                            if (d11 == null) {
                                b.b((String) null, e12.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, this.f59244b.getArray(i10).getString(0));
                        compileStatement.bindString(2, this.f59244b.getArray(i10).getString(1));
                        compileStatement.execute();
                        i10++;
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.o().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e13) {
                    U5.a.J("ReactNative", e13.getMessage(), e13);
                    writableMap = b.b((String) null, e13.getMessage());
                }
            } catch (Exception e14) {
                U5.a.J("ReactNative", e14.getMessage(), e14);
                WritableMap b10 = b.b((String) null, e14.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e15) {
                    U5.a.J("ReactNative", e15.getMessage(), e15);
                    if (b10 == null) {
                        writableMap = b.b((String) null, e15.getMessage());
                    }
                }
                writableMap = b10;
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e16) {
                    U5.a.J("ReactNative", e16.getMessage(), e16);
                    b.b((String) null, e16.getMessage());
                }
                throw th2;
            }
            if (writableMap != null) {
                this.f59243a.invoke(writableMap);
            } else {
                this.f59243a.invoke(new Object[0]);
            }
        }
    }

    class c extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f59246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f59247b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f59246a = callback;
            this.f59247b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f59246a.invoke(b.a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.o().beginTransaction();
                for (int i10 = 0; i10 < this.f59247b.size(); i10 += AsyncStorageModule.MAX_SQL_KEYS) {
                    int min = Math.min(this.f59247b.size() - i10, AsyncStorageModule.MAX_SQL_KEYS);
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().delete("catalystLocalStorage", a.a(min), a.b(this.f59247b, i10, min));
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.o().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e10) {
                    U5.a.J("ReactNative", e10.getMessage(), e10);
                    writableMap = b.b((String) null, e10.getMessage());
                }
            } catch (Exception e11) {
                U5.a.J("ReactNative", e11.getMessage(), e11);
                WritableMap b10 = b.b((String) null, e11.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e12) {
                    U5.a.J("ReactNative", e12.getMessage(), e12);
                    if (b10 == null) {
                        writableMap = b.b((String) null, e12.getMessage());
                    }
                }
                writableMap = b10;
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e13) {
                    U5.a.J("ReactNative", e13.getMessage(), e13);
                    b.b((String) null, e13.getMessage());
                }
                throw th2;
            }
            if (writableMap != null) {
                this.f59246a.invoke(writableMap);
            } else {
                this.f59246a.invoke(new Object[0]);
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f59249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f59250b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f59249a = callback;
            this.f59250b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f59249a.invoke(b.a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.o().beginTransaction();
                int i10 = 0;
                while (i10 < this.f59250b.size()) {
                    if (this.f59250b.getArray(i10).size() != 2) {
                        WritableMap d10 = b.d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e10) {
                            U5.a.J("ReactNative", e10.getMessage(), e10);
                            if (d10 == null) {
                                b.b((String) null, e10.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f59250b.getArray(i10).getString(0) == null) {
                        WritableMap c10 = b.c((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e11) {
                            U5.a.J("ReactNative", e11.getMessage(), e11);
                            if (c10 == null) {
                                b.b((String) null, e11.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f59250b.getArray(i10).getString(1) == null) {
                        WritableMap d11 = b.d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e12) {
                            U5.a.J("ReactNative", e12.getMessage(), e12);
                            if (d11 == null) {
                                b.b((String) null, e12.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (!a.e(AsyncStorageModule.this.mReactDatabaseSupplier.o(), this.f59250b.getArray(i10).getString(0), this.f59250b.getArray(i10).getString(1))) {
                        WritableMap a10 = b.a((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                            return;
                        } catch (Exception e13) {
                            U5.a.J("ReactNative", e13.getMessage(), e13);
                            if (a10 == null) {
                                b.b((String) null, e13.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        i10++;
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.o().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e14) {
                    U5.a.J("ReactNative", e14.getMessage(), e14);
                    writableMap = b.b((String) null, e14.getMessage());
                }
            } catch (Exception e15) {
                U5.a.J("ReactNative", e15.getMessage(), e15);
                WritableMap b10 = b.b((String) null, e15.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e16) {
                    U5.a.J("ReactNative", e16.getMessage(), e16);
                    if (b10 == null) {
                        writableMap = b.b((String) null, e16.getMessage());
                    }
                }
                writableMap = b10;
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.o().endTransaction();
                } catch (Exception e17) {
                    U5.a.J("ReactNative", e17.getMessage(), e17);
                    b.b((String) null, e17.getMessage());
                }
                throw th2;
            }
            if (writableMap != null) {
                this.f59249a.invoke(writableMap);
            } else {
                this.f59249a.invoke(new Object[0]);
            }
        }
    }

    class e extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f59252a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f59252a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.n()) {
                this.f59252a.invoke(b.a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f59252a.invoke(new Object[0]);
            } catch (Exception e10) {
                U5.a.J("ReactNative", e10.getMessage(), e10);
                this.f59252a.invoke(b.b((String) null, e10.getMessage()));
            }
        }
    }

    class f extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f59254a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f59254a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f59254a.invoke(b.a((String) null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.o().query("catalystLocalStorage", new String[]{SubscriberAttributeKt.JSON_NAME_KEY}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            try {
                if (query.moveToFirst()) {
                    do {
                        createArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
                this.f59254a.invoke(null, createArray);
            } catch (Exception e10) {
                U5.a.J("ReactNative", e10.getMessage(), e10);
                this.f59254a.invoke(b.b((String) null, e10.getMessage()), null);
                query.close();
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* access modifiers changed from: private */
    public boolean ensureDatabase() {
        if (this.mShuttingDown || !this.mReactDatabaseSupplier.n()) {
            return false;
        }
        return true;
    }

    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public String getName() {
        return "RNCAsyncStorage";
    }

    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.b();
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(b.c((String) null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        h.g(reactApplicationContext);
        this.executor = new l(executor2);
        this.mReactDatabaseSupplier = k.q(reactApplicationContext);
    }
}
