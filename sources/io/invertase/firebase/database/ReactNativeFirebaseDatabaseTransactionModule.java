package io.invertase.firebase.database;

import Gb.b;
import Ue.g;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.database.f;
import com.google.firebase.database.i;
import io.invertase.firebase.common.ReactNativeFirebaseModule;

public class ReactNativeFirebaseDatabaseTransactionModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseTransaction";
    /* access modifiers changed from: private */
    public static SparseArray<J> transactionHandlers = new SparseArray<>();

    class a implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f71359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71360b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f71361c;

        a(int i10, String str, String str2) {
            this.f71359a = i10;
            this.f71360b = str;
            this.f71361c = str2;
        }

        public i.c a(f fVar) {
            J j10 = new J(this.f71359a, this.f71360b, this.f71361c);
            ReactNativeFirebaseDatabaseTransactionModule.transactionHandlers.put(this.f71359a, j10);
            AsyncTask.execute(new L(j10.c(fVar), this.f71360b, this.f71359a));
            try {
                j10.a();
                if (j10.f71313e) {
                    return i.a();
                }
                if (j10.f71314f) {
                    return i.a();
                }
                fVar.i(j10.f71311c);
                return i.b(fVar);
            } catch (InterruptedException unused) {
                j10.f71312d = true;
                return i.a();
            }
        }

        public void b(b bVar, boolean z10, com.google.firebase.database.a aVar) {
            g.i().o(new M("database_transaction_event", ((J) ReactNativeFirebaseDatabaseTransactionModule.transactionHandlers.get(this.f71359a)).b(bVar, z10, aVar), this.f71360b, this.f71359a));
            ReactNativeFirebaseDatabaseTransactionModule.transactionHandlers.delete(this.f71359a);
        }
    }

    ReactNativeFirebaseDatabaseTransactionModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$transactionStart$0(String str, String str2, String str3, int i10, Boolean bool) {
        P.b(str, str2).f(str3).O(new a(i10, str, str2), bool.booleanValue());
    }

    @ReactMethod
    public void transactionStart(String str, String str2, String str3, int i10, Boolean bool) {
        AsyncTask.execute(new K(this, str, str2, str3, i10, bool));
    }

    @ReactMethod
    public void transactionTryCommit(String str, String str2, int i10, ReadableMap readableMap) {
        J j10 = transactionHandlers.get(i10);
        if (j10 != null) {
            j10.d(readableMap);
        }
    }
}
