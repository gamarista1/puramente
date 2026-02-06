package com.reactnativegooglesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.intercom.android.sdk.models.Participant;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import ua.C5220c;

@Q7.a(name = "RNGoogleSignin")
public class RNGoogleSigninModule extends ReactContextBaseJavaModule {
    public static final String ERROR_USER_RECOVERABLE_AUTH = "ERROR_USER_RECOVERABLE_AUTH";
    public static final String MODULE_NAME = "RNGoogleSignin";
    public static final String PLAY_SERVICES_NOT_AVAILABLE = "PLAY_SERVICES_NOT_AVAILABLE";
    public static final int RC_SIGN_IN = 9001;
    public static final int REQUEST_CODE_ADD_SCOPES = 53295;
    public static final int REQUEST_CODE_RECOVER_AUTH = 53294;
    private static final String SHOULD_RECOVER = "SHOULD_RECOVER";
    /* access modifiers changed from: private */
    public com.google.android.gms.auth.api.signin.b _apiClient;
    /* access modifiers changed from: private */
    public a pendingAuthRecovery;
    /* access modifiers changed from: private */
    public b promiseWrapper = new b();

    class a implements Runnable {

        /* renamed from: com.reactnativegooglesignin.RNGoogleSigninModule$a$a  reason: collision with other inner class name */
        class C0876a implements OnCompleteListener {
            C0876a() {
            }

            public void onComplete(Task task) {
                RNGoogleSigninModule.this.handleSignInTaskResult(task);
            }
        }

        a() {
        }

        public void run() {
            Task f10 = RNGoogleSigninModule.this._apiClient.f();
            if (f10.isSuccessful()) {
                RNGoogleSigninModule.this.handleSignInTaskResult(f10);
            } else {
                f10.addOnCompleteListener(new C0876a());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f59423a;

        b(Activity activity) {
            this.f59423a = activity;
        }

        public void run() {
            this.f59423a.startActivityForResult(RNGoogleSigninModule.this._apiClient.d(), RNGoogleSigninModule.RC_SIGN_IN);
        }
    }

    class c implements OnCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f59425a;

        c(Promise promise) {
            this.f59425a = promise;
        }

        public void onComplete(Task task) {
            RNGoogleSigninModule.this.handleSignOutOrRevokeAccessTask(task, this.f59425a);
        }
    }

    class d implements OnCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f59427a;

        d(Promise promise) {
            this.f59427a = promise;
        }

        public void onComplete(Task task) {
            RNGoogleSigninModule.this.handleSignOutOrRevokeAccessTask(task, this.f59427a);
        }
    }

    private static class e extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f59429a;

        e(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f59429a = new WeakReference(rNGoogleSigninModule);
        }

        private void a(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap) {
            Activity access$100 = rNGoogleSigninModule.getCurrentActivity();
            if (access$100 == null) {
                rNGoogleSigninModule.pendingAuthRecovery = null;
                b b10 = rNGoogleSigninModule.promiseWrapper;
                b10.b(RNGoogleSigninModule.MODULE_NAME, "Cannot attempt recovery auth because app is not in foreground. " + exc.getLocalizedMessage());
                return;
            }
            rNGoogleSigninModule.pendingAuthRecovery = new a(writableMap);
            access$100.startActivityForResult(((UserRecoverableAuthException) exc).a(), RNGoogleSigninModule.REQUEST_CODE_RECOVER_AUTH);
        }

        private void c(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap, WritableMap writableMap2) {
            if (!(exc instanceof UserRecoverableAuthException)) {
                rNGoogleSigninModule.promiseWrapper.c(RNGoogleSigninModule.MODULE_NAME, exc);
            } else if (writableMap2 == null || !writableMap2.hasKey(RNGoogleSigninModule.SHOULD_RECOVER) || !writableMap2.getBoolean(RNGoogleSigninModule.SHOULD_RECOVER)) {
                rNGoogleSigninModule.promiseWrapper.c(RNGoogleSigninModule.ERROR_USER_RECOVERABLE_AUTH, exc);
            } else {
                a(rNGoogleSigninModule, exc, writableMap);
            }
        }

        private void d(RNGoogleSigninModule rNGoogleSigninModule, WritableMap writableMap) {
            writableMap.putString("accessToken", oa.e.b(rNGoogleSigninModule.getReactApplicationContext(), new Account(writableMap.getMap(Participant.USER_TYPE).getString("email"), "com.google"), e.e(writableMap.getArray("scopes"))));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Void doInBackground(WritableMap... writableMapArr) {
            WritableMap writableMap;
            WritableMap writableMap2 = writableMapArr[0];
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f59429a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            try {
                d(rNGoogleSigninModule, writableMap2);
                rNGoogleSigninModule.getPromiseWrapper().f(writableMap2);
            } catch (Exception e10) {
                if (writableMapArr.length >= 2) {
                    writableMap = writableMapArr[1];
                } else {
                    writableMap = null;
                }
                c(rNGoogleSigninModule, e10, writableMap2, writableMap);
            }
            return null;
        }
    }

    private class f extends BaseActivityEventListener {
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            if (i10 == 9001) {
                RNGoogleSigninModule.this.handleSignInTaskResult(com.google.android.gms.auth.api.signin.a.c(intent));
            } else if (i10 == 53294) {
                if (i11 == -1) {
                    RNGoogleSigninModule.this.rerunFailedAuthTokenTask();
                } else {
                    RNGoogleSigninModule.this.promiseWrapper.b(RNGoogleSigninModule.MODULE_NAME, "Failed authentication recovery attempt, probably user-rejected.");
                }
            } else if (i10 != 53295) {
            } else {
                if (i11 == -1) {
                    RNGoogleSigninModule.this.promiseWrapper.f(Boolean.TRUE);
                } else {
                    RNGoogleSigninModule.this.promiseWrapper.b(RNGoogleSigninModule.MODULE_NAME, "Failed to add scopes.");
                }
            }
        }

        private f() {
        }
    }

    private static class g extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f59431a;

        g(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f59431a = new WeakReference(rNGoogleSigninModule);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f59431a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            try {
                oa.e.a(rNGoogleSigninModule.getReactApplicationContext(), strArr[0]);
                rNGoogleSigninModule.getPromiseWrapper().f((Object) null);
            } catch (Exception e10) {
                rNGoogleSigninModule.promiseWrapper.c(RNGoogleSigninModule.MODULE_NAME, e10);
            }
            return null;
        }
    }

    public RNGoogleSigninModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(new f());
    }

    /* access modifiers changed from: private */
    public void handleSignInTaskResult(Task<GoogleSignInAccount> task) {
        try {
            GoogleSignInAccount result = task.getResult(com.google.android.gms.common.api.b.class);
            if (result == null) {
                this.promiseWrapper.b(MODULE_NAME, "GoogleSignInAccount instance was null");
                return;
            }
            this.promiseWrapper.f(e.d(result));
        } catch (com.google.android.gms.common.api.b e10) {
            int statusCode = e10.getStatusCode();
            this.promiseWrapper.b(String.valueOf(statusCode), C5220c.a(statusCode));
        }
    }

    /* access modifiers changed from: private */
    public void handleSignOutOrRevokeAccessTask(Task<Void> task, Promise promise) {
        if (task.isSuccessful()) {
            promise.resolve((Object) null);
            return;
        }
        int b10 = e.b(task);
        promise.reject(String.valueOf(b10), C5220c.a(b10));
    }

    private static void rejectWithNullActivity(Promise promise) {
        promise.reject(MODULE_NAME, "activity is null");
    }

    private void rejectWithNullClientError(Promise promise) {
        promise.reject(MODULE_NAME, "apiClient is null - call configure first");
    }

    /* access modifiers changed from: private */
    public void rerunFailedAuthTokenTask() {
        WritableMap a10 = this.pendingAuthRecovery.a();
        if (a10 != null) {
            new e(this).execute(new WritableMap[]{a10, null});
            return;
        }
        this.promiseWrapper.b(MODULE_NAME, "rerunFailedAuthTokenTask: recovery failed");
    }

    private void startTokenRetrievalTaskWithRecovery(GoogleSignInAccount googleSignInAccount) {
        WritableMap d10 = e.d(googleSignInAccount);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean(SHOULD_RECOVER, true);
        new e(this).execute(new WritableMap[]{d10, createMap});
    }

    @ReactMethod
    public void addScopes(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
            return;
        }
        GoogleSignInAccount b10 = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (b10 == null) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        this.promiseWrapper.g(promise, "addScopes");
        ReadableArray array = readableMap.getArray("scopes");
        Scope[] scopeArr = new Scope[array.size()];
        for (int i10 = 0; i10 < array.size(); i10++) {
            scopeArr[i10] = new Scope(array.getString(i10));
        }
        com.google.android.gms.auth.api.signin.a.d(currentActivity, REQUEST_CODE_ADD_SCOPES, b10, scopeArr);
    }

    @ReactMethod
    public void clearCachedAccessToken(String str, Promise promise) {
        this.promiseWrapper.g(promise, "clearCachedAccessToken");
        new g(this).execute(new String[]{str});
    }

    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        ReadableArray readableArray;
        String str;
        boolean z10;
        boolean z11;
        String str2;
        String str3;
        if (readableMap.hasKey("scopes")) {
            readableArray = readableMap.getArray("scopes");
        } else {
            readableArray = Arguments.createArray();
        }
        if (readableMap.hasKey("webClientId")) {
            str = readableMap.getString("webClientId");
        } else {
            str = null;
        }
        if (!readableMap.hasKey("offlineAccess") || !readableMap.getBoolean("offlineAccess")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!readableMap.hasKey("forceCodeForRefreshToken") || !readableMap.getBoolean("forceCodeForRefreshToken")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (readableMap.hasKey("accountName")) {
            str2 = readableMap.getString("accountName");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey("hostedDomain")) {
            str3 = readableMap.getString("hostedDomain");
        } else {
            str3 = null;
        }
        this._apiClient = com.google.android.gms.auth.api.signin.a.a(getReactApplicationContext(), e.c(e.a(readableArray), str, z10, z11, str2, str3));
        promise.resolve((Object) null);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("BUTTON_SIZE_ICON", 2);
        hashMap.put("BUTTON_SIZE_STANDARD", 0);
        hashMap.put("BUTTON_SIZE_WIDE", 1);
        hashMap.put("BUTTON_COLOR_AUTO", 2);
        hashMap.put("BUTTON_COLOR_LIGHT", 1);
        hashMap.put("BUTTON_COLOR_DARK", 0);
        hashMap.put("SIGN_IN_CANCELLED", String.valueOf(12501));
        hashMap.put("SIGN_IN_REQUIRED", String.valueOf(4));
        hashMap.put("IN_PROGRESS", "ASYNC_OP_IN_PROGRESS");
        hashMap.put(PLAY_SERVICES_NOT_AVAILABLE, PLAY_SERVICES_NOT_AVAILABLE);
        return hashMap;
    }

    @ReactMethod
    public void getCurrentUser(Promise promise) {
        WritableMap writableMap;
        GoogleSignInAccount b10 = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (b10 == null) {
            writableMap = null;
        } else {
            writableMap = e.d(b10);
        }
        promise.resolve(writableMap);
    }

    public String getName() {
        return MODULE_NAME;
    }

    public b getPromiseWrapper() {
        return this.promiseWrapper;
    }

    @ReactMethod
    public void getTokens(Promise promise) {
        GoogleSignInAccount b10 = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (b10 == null) {
            promise.reject(MODULE_NAME, "getTokens requires a user to be signed in");
            return;
        }
        this.promiseWrapper.g(promise, "getTokens");
        startTokenRetrievalTaskWithRecovery(b10);
    }

    @ReactMethod
    public void isSignedIn(Promise promise) {
        boolean z10;
        if (com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        promise.resolve(Boolean.valueOf(z10));
    }

    @ReactMethod
    public void playServicesAvailable(boolean z10, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w(MODULE_NAME, "could not determine playServicesAvailable, activity is null");
            rejectWithNullActivity(promise);
            return;
        }
        com.google.android.gms.common.a o10 = com.google.android.gms.common.a.o();
        int g10 = o10.g(currentActivity);
        if (g10 != 0) {
            if (z10 && o10.j(g10)) {
                o10.l(currentActivity, g10, 2404).show();
            }
            promise.reject(PLAY_SERVICES_NOT_AVAILABLE, "Play services not available");
            return;
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void revokeAccess(Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.e().addOnCompleteListener(new d(promise));
        }
    }

    @ReactMethod
    public void signIn(ReadableMap readableMap, Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
            return;
        }
        this.promiseWrapper.g(promise, "signIn");
        UiThreadUtil.runOnUiThread(new b(currentActivity));
    }

    @ReactMethod
    public void signInSilently(Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
            return;
        }
        this.promiseWrapper.g(promise, "signInSilently");
        UiThreadUtil.runOnUiThread(new a());
    }

    @ReactMethod
    public void signOut(Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.signOut().addOnCompleteListener(new c(promise));
        }
    }
}
