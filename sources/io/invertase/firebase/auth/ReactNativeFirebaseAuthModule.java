package io.invertase.firebase.auth;

import Ue.C5547b;
import Ue.g;
import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.A;
import com.google.firebase.auth.B;
import com.google.firebase.auth.C;
import com.google.firebase.auth.C4776a0;
import com.google.firebase.auth.C4778b0;
import com.google.firebase.auth.C4780c0;
import com.google.firebase.auth.C4781d;
import com.google.firebase.auth.C4783e;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.C4791i;
import com.google.firebase.auth.C4795k;
import com.google.firebase.auth.C4799m;
import com.google.firebase.auth.C4817x;
import com.google.firebase.auth.E;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.G;
import com.google.firebase.auth.J;
import com.google.firebase.auth.K;
import com.google.firebase.auth.L;
import com.google.firebase.auth.N;
import com.google.firebase.auth.O;
import com.google.firebase.auth.P;
import com.google.firebase.auth.Q;
import com.google.firebase.auth.S;
import com.google.firebase.auth.T;
import com.google.firebase.auth.U;
import com.google.firebase.auth.W;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ub.C5230g;
import ub.m;

class ReactNativeFirebaseAuthModule extends ReactNativeFirebaseModule {
    public static final SimpleDateFormat ISO_8601_FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    private static final String TAG = "Auth";
    private static HashMap<String, String> emulatorConfigs = new HashMap<>();
    private static HashMap<String, FirebaseAuth.a> mAuthListeners = new HashMap<>();
    private static HashMap<String, FirebaseAuth.b> mIdTokenListeners = new HashMap<>();
    private HashMap<String, C4789h> credentials = new HashMap<>();
    private final HashMap<String, K> mCachedResolvers = new HashMap<>();
    /* access modifiers changed from: private */
    public O mCredential;
    /* access modifiers changed from: private */
    public Q.a mForceResendingToken;
    private String mLastPhoneNumber;
    private final HashMap<String, L> mMultiFactorSessions = new HashMap<>();
    /* access modifiers changed from: private */
    public String mVerificationId;

    class a extends Q.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f71174a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FirebaseAuth f71175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f71176c;

        a(FirebaseAuth firebaseAuth, Promise promise) {
            this.f71175b = firebaseAuth;
            this.f71176c = promise;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(O o10, Promise promise, Task task) {
            if (task.isSuccessful()) {
                Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:success");
                if (!this.f71174a) {
                    WritableMap createMap = Arguments.createMap();
                    Parcel obtain = Parcel.obtain();
                    o10.writeToParcel(obtain, 0);
                    obtain.setDataPosition(16);
                    String readString = obtain.readString();
                    ReactNativeFirebaseAuthModule.this.mVerificationId = readString;
                    obtain.recycle();
                    createMap.putString("verificationId", readString);
                    promise.resolve(createMap);
                    return;
                }
                return;
            }
            Exception exception = task.getException();
            Log.e(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:failure", exception);
            if (!this.f71174a) {
                ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(promise, exception);
            }
        }

        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
        }

        public void onCodeSent(String str, Q.a aVar) {
            ReactNativeFirebaseAuthModule.this.mVerificationId = str;
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = aVar;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            this.f71176c.resolve(createMap);
            this.f71174a = true;
        }

        public void onVerificationCompleted(O o10) {
            this.f71175b.A(o10).addOnCompleteListener((Executor) ReactNativeFirebaseAuthModule.this.getExecutor(), new Y(this, o10, this.f71176c));
        }

        public void onVerificationFailed(m mVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:verification:failed");
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(this.f71176c, mVar);
        }
    }

    class b extends Q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f71178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71179b;

        b(Promise promise, String str) {
            this.f71178a = promise;
            this.f71179b = str;
        }

        public void onCodeSent(String str, Q.a aVar) {
            this.f71178a.resolve(str);
        }

        public void onVerificationCompleted(O o10) {
            ReactNativeFirebaseAuthModule.this.resolveMultiFactorCredential(o10, this.f71179b, this.f71178a);
        }

        public void onVerificationFailed(m mVar) {
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(this.f71178a, mVar);
        }
    }

    class c extends Q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f71181a;

        c(Promise promise) {
            this.f71181a = promise;
        }

        public void onCodeSent(String str, Q.a aVar) {
            this.f71181a.resolve(str);
        }

        public void onVerificationCompleted(O o10) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(this.f71181a, "not-implemented", "This is currently not supported.");
        }

        public void onVerificationFailed(m mVar) {
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(this.f71181a, mVar);
        }
    }

    class d extends Q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71184b;

        d(String str, String str2) {
            this.f71183a = str;
            this.f71184b = str2;
        }

        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeAutoRetrievalTimeOut");
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f71183a, this.f71184b, "onCodeAutoRetrievalTimeout", createMap);
        }

        public void onCodeSent(String str, Q.a aVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeSent");
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = aVar;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f71183a, this.f71184b, "onCodeSent", createMap);
        }

        public void onVerificationCompleted(O o10) {
            ReactNativeFirebaseAuthModule.this.mCredential = o10;
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationCompleted");
            WritableMap createMap = Arguments.createMap();
            Parcel obtain = Parcel.obtain();
            o10.writeToParcel(obtain, 0);
            obtain.setDataPosition(16);
            String readString = obtain.readString();
            obtain.setDataPosition(obtain.dataPosition() + 8);
            createMap.putString("code", obtain.readString());
            createMap.putString("verificationId", readString);
            obtain.recycle();
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f71183a, this.f71184b, "onVerificationComplete", createMap);
        }

        public void onVerificationFailed(m mVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationFailed");
            WritableMap createMap = Arguments.createMap();
            createMap.putMap(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, ReactNativeFirebaseAuthModule.this.getJSError(mVar));
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f71183a, this.f71184b, "onVerificationFailed", createMap);
        }
    }

    ReactNativeFirebaseAuthModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private C4783e buildActionCodeSettings(ReadableMap readableMap) {
        boolean z10;
        String str;
        C4783e.a u02 = C4783e.u0();
        String string = readableMap.getString("url");
        Objects.requireNonNull(string);
        C4783e.a f10 = u02.f(string);
        if (readableMap.hasKey("handleCodeInApp")) {
            f10 = f10.d(readableMap.getBoolean("handleCodeInApp"));
        }
        if (readableMap.hasKey("dynamicLinkDomain")) {
            f10 = f10.c(readableMap.getString("dynamicLinkDomain"));
        }
        if (readableMap.hasKey("android")) {
            ReadableMap map = readableMap.getMap("android");
            Objects.requireNonNull(map);
            if (!map.hasKey("installApp") || !map.getBoolean("installApp")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (map.hasKey("minimumVersion")) {
                str = map.getString("minimumVersion");
            } else {
                str = null;
            }
            String string2 = map.getString("packageName");
            Objects.requireNonNull(string2);
            f10 = f10.b(string2, z10, str);
        }
        if (readableMap.hasKey("iOS")) {
            String string3 = readableMap.getMap("iOS").getString("bundleId");
            Objects.requireNonNull(string3);
            f10 = f10.e(string3);
        }
        return f10.a();
    }

    private WritableArray convertProviderData(List<? extends C4778b0> list, A a10) {
        WritableArray createArray = Arguments.createArray();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            C4778b0 b0Var = (C4778b0) it.next();
            if (!"firebase".equals(b0Var.r())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("providerId", b0Var.r());
                createMap.putString("uid", b0Var.a());
                createMap.putString("displayName", b0Var.g());
                Uri h10 = b0Var.h();
                if (h10 == null || "".equals(h10.toString())) {
                    createMap.putNull("photoURL");
                } else {
                    createMap.putString("photoURL", h10.toString());
                }
                String d10 = b0Var.d();
                if (AttributeType.PHONE.equals(b0Var.r()) && (b0Var.d() == null || "".equals(b0Var.d()))) {
                    createMap.putString("phoneNumber", a10.d());
                } else if (d10 == null || "".equals(d10)) {
                    createMap.putNull("phoneNumber");
                } else {
                    createMap.putString("phoneNumber", d10);
                }
                if ("password".equals(b0Var.r()) && (b0Var.j0() == null || "".equals(b0Var.j0()))) {
                    createMap.putString("email", b0Var.a());
                } else if (b0Var.j0() == null || "".equals(b0Var.j0())) {
                    createMap.putNull("email");
                } else {
                    createMap.putString("email", b0Var.j0());
                }
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    @ReactMethod
    private void createUserWithEmailAndPassword(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "createUserWithEmailAndPassword");
        FirebaseAuth.getInstance(C5230g.p(str)).h(str2, str3).addOnSuccessListener(new C6401z(this, promise)).addOnFailureListener(new A(this, promise));
    }

    private WritableMap firebaseUserToMap(A a10) {
        WritableMap createMap = Arguments.createMap();
        String a11 = a10.a();
        String j02 = a10.j0();
        Uri h10 = a10.h();
        String g10 = a10.g();
        String r10 = a10.r();
        boolean k10 = a10.k();
        String d10 = a10.d();
        String t02 = a10.t0();
        createMap.putString("uid", a11);
        createMap.putString("providerId", r10);
        createMap.putBoolean("emailVerified", k10);
        createMap.putBoolean("isAnonymous", a10.u0());
        if (j02 == null || "".equals(j02)) {
            createMap.putNull("email");
        } else {
            createMap.putString("email", j02);
        }
        if (g10 == null || "".equals(g10)) {
            createMap.putNull("displayName");
        } else {
            createMap.putString("displayName", g10);
        }
        if (h10 == null || "".equals(h10.toString())) {
            createMap.putNull("photoURL");
        } else {
            createMap.putString("photoURL", h10.toString());
        }
        if (d10 == null || "".equals(d10)) {
            createMap.putNull("phoneNumber");
        } else {
            createMap.putString("phoneNumber", d10);
        }
        if (t02 == null || "".equals(t02)) {
            createMap.putNull("tenantId");
        } else {
            createMap.putString("tenantId", t02);
        }
        createMap.putArray("providerData", convertProviderData(a10.s0(), a10));
        WritableMap createMap2 = Arguments.createMap();
        B q02 = a10.q0();
        if (q02 != null) {
            createMap2.putDouble("creationTime", (double) q02.x());
            createMap2.putDouble("lastSignInTime", (double) q02.z());
        }
        createMap.putMap("metadata", createMap2);
        WritableArray createArray = Arguments.createArray();
        for (J multiFactorInfoToMap : a10.r0().b()) {
            createArray.pushMap(multiFactorInfoToMap(multiFactorInfoToMap));
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("enrolledFactors", createArray);
        createMap.putMap("multiFactor", createMap3);
        return createMap;
    }

    private C4789h getCredentialForProvider(String str, String str2, String str3) {
        if (str.startsWith("oidc.")) {
            return N.f(str).b(str2).a();
        }
        if (this.credentials.containsKey(str2) && this.credentials.get(str2) != null) {
            return this.credentials.get(str2);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095271699:
                if (str.equals("apple.com")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 2;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c10 = 3;
                    break;
                }
                break;
            case 105516695:
                if (str.equals("oauth")) {
                    c10 = 4;
                    break;
                }
                break;
            case 106642798:
                if (str.equals(AttributeType.PHONE)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return N.f(str).c(str2, str3).a();
            case 1:
                return C4776a0.a(str2, str3);
            case 2:
                return G.a(str2, str3);
            case 3:
                return C4799m.a(str2);
            case 4:
                return N.d(str, str2, str3);
            case 5:
                return getPhoneAuthCredential(str2, str3);
            case 6:
                return C4795k.a(str2, str3);
            case 7:
                return E.a(str2);
            case 8:
                return C4795k.b(str2, str3);
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019b, code lost:
        if (r4.equals("ERROR_UNVERIFIED_EMAIL") == false) goto L_0x0193;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0193 A[FALL_THROUGH] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.WritableMap getJSError(java.lang.Exception r13) {
        /*
            r12 = this;
            r0 = 2
            r1 = 0
            r2 = -1
            r3 = 1
            java.lang.String r4 = "INVALID_EMAIL"
            com.facebook.react.bridge.WritableMap r5 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r6 = "UNKNOWN"
            java.lang.String r7 = r13.getMessage()
            java.lang.String r8 = "The email address is badly formatted."
            r9 = r13
            com.google.firebase.auth.q r9 = (com.google.firebase.auth.C4807q) r9     // Catch:{ Exception -> 0x0024 }
            java.lang.String r10 = r9.a()     // Catch:{ Exception -> 0x0024 }
            java.lang.String r11 = "nativeErrorCode"
            r5.putString(r11, r10)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r7 = r9.getMessage()     // Catch:{ Exception -> 0x0025 }
            goto L_0x014d
        L_0x0024:
            r10 = r6
        L_0x0025:
            java.lang.String r9 = "([A-Z]*_[A-Z]*)"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            java.util.regex.Matcher r9 = r9.matcher(r7)
            boolean r11 = r9.find()
            if (r11 == 0) goto L_0x014d
            java.lang.String r9 = r9.group(r3)
            java.lang.String r10 = r9.trim()
            r10.hashCode()
            java.lang.String r9 = "The user's credential is no longer valid. The user must sign in again."
            int r11 = r10.hashCode()
            switch(r11) {
                case -2127468245: goto L_0x0113;
                case -1971163201: goto L_0x0107;
                case -1112393964: goto L_0x00fd;
                case -1035666916: goto L_0x00f1;
                case -333672188: goto L_0x00e5;
                case -324930558: goto L_0x00d9;
                case -311841705: goto L_0x00cd;
                case -75433118: goto L_0x00c1;
                case -49749054: goto L_0x00b4;
                case -40686718: goto L_0x00a7;
                case 583750925: goto L_0x009a;
                case 748182870: goto L_0x008d;
                case 864281573: goto L_0x0080;
                case 1072360691: goto L_0x0073;
                case 1388786705: goto L_0x0066;
                case 1433767024: goto L_0x0059;
                case 1563975629: goto L_0x004c;
                default: goto L_0x0049;
            }
        L_0x0049:
            r11 = r2
            goto L_0x011e
        L_0x004c:
            java.lang.String r11 = "INVALID_USER_TOKEN"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x0055
            goto L_0x0049
        L_0x0055:
            r11 = 16
            goto L_0x011e
        L_0x0059:
            java.lang.String r11 = "USER_DISABLED"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x0062
            goto L_0x0049
        L_0x0062:
            r11 = 15
            goto L_0x011e
        L_0x0066:
            java.lang.String r11 = "INVALID_IDENTIFIER"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x006f
            goto L_0x0049
        L_0x006f:
            r11 = 14
            goto L_0x011e
        L_0x0073:
            java.lang.String r11 = "INVALID_CUSTOM_TOKEN"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x007c
            goto L_0x0049
        L_0x007c:
            r11 = 13
            goto L_0x011e
        L_0x0080:
            java.lang.String r11 = "ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x0089
            goto L_0x0049
        L_0x0089:
            r11 = 12
            goto L_0x011e
        L_0x008d:
            java.lang.String r11 = "REQUIRES_RECENT_LOGIN"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x0096
            goto L_0x0049
        L_0x0096:
            r11 = 11
            goto L_0x011e
        L_0x009a:
            java.lang.String r11 = "WRONG_PASSWORD"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00a3
            goto L_0x0049
        L_0x00a3:
            r11 = 10
            goto L_0x011e
        L_0x00a7:
            java.lang.String r11 = "WEAK_PASSWORD"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00b0
            goto L_0x0049
        L_0x00b0:
            r11 = 9
            goto L_0x011e
        L_0x00b4:
            java.lang.String r11 = "USER_MISMATCH"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00bd
            goto L_0x0049
        L_0x00bd:
            r11 = 8
            goto L_0x011e
        L_0x00c1:
            java.lang.String r11 = "USER_NOT_FOUND"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00cb
            goto L_0x0049
        L_0x00cb:
            r11 = 7
            goto L_0x011e
        L_0x00cd:
            java.lang.String r11 = "EMAIL_ALREADY_IN_USE"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00d7
            goto L_0x0049
        L_0x00d7:
            r11 = 6
            goto L_0x011e
        L_0x00d9:
            java.lang.String r11 = "CUSTOM_TOKEN_MISMATCH"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00e3
            goto L_0x0049
        L_0x00e3:
            r11 = 5
            goto L_0x011e
        L_0x00e5:
            java.lang.String r11 = "OPERATION_NOT_ALLOWED"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00ef
            goto L_0x0049
        L_0x00ef:
            r11 = 4
            goto L_0x011e
        L_0x00f1:
            java.lang.String r11 = "CREDENTIAL_ALREADY_IN_USE"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00fb
            goto L_0x0049
        L_0x00fb:
            r11 = 3
            goto L_0x011e
        L_0x00fd:
            boolean r11 = r10.equals(r4)
            if (r11 != 0) goto L_0x0105
            goto L_0x0049
        L_0x0105:
            r11 = r0
            goto L_0x011e
        L_0x0107:
            java.lang.String r11 = "INVALID_CREDENTIAL"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x0111
            goto L_0x0049
        L_0x0111:
            r11 = r3
            goto L_0x011e
        L_0x0113:
            java.lang.String r11 = "USER_TOKEN_EXPIRED"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x011d
            goto L_0x0049
        L_0x011d:
            r11 = r1
        L_0x011e:
            switch(r11) {
                case 0: goto L_0x0122;
                case 1: goto L_0x014b;
                case 2: goto L_0x0128;
                case 3: goto L_0x0148;
                case 4: goto L_0x0145;
                case 5: goto L_0x0142;
                case 6: goto L_0x013f;
                case 7: goto L_0x013c;
                case 8: goto L_0x0139;
                case 9: goto L_0x0136;
                case 10: goto L_0x0133;
                case 11: goto L_0x0130;
                case 12: goto L_0x012d;
                case 13: goto L_0x012a;
                case 14: goto L_0x0127;
                case 15: goto L_0x0124;
                case 16: goto L_0x0122;
                default: goto L_0x0121;
            }
        L_0x0121:
            goto L_0x014d
        L_0x0122:
            r7 = r9
            goto L_0x014d
        L_0x0124:
            java.lang.String r7 = "The user account has been disabled by an administrator."
            goto L_0x014d
        L_0x0127:
            r10 = r4
        L_0x0128:
            r7 = r8
            goto L_0x014d
        L_0x012a:
            java.lang.String r7 = "The custom token format is incorrect. Please check the documentation."
            goto L_0x014d
        L_0x012d:
            java.lang.String r7 = "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."
            goto L_0x014d
        L_0x0130:
            java.lang.String r7 = "This operation is sensitive and requires recent authentication. Log in again before retrying this request."
            goto L_0x014d
        L_0x0133:
            java.lang.String r7 = "The password is invalid or the user does not have a password."
            goto L_0x014d
        L_0x0136:
            java.lang.String r7 = "The given password is invalid."
            goto L_0x014d
        L_0x0139:
            java.lang.String r7 = "The supplied credentials do not correspond to the previously signed in user."
            goto L_0x014d
        L_0x013c:
            java.lang.String r7 = "There is no user record corresponding to this identifier. The user may have been deleted."
            goto L_0x014d
        L_0x013f:
            java.lang.String r7 = "The email address is already in use by another account."
            goto L_0x014d
        L_0x0142:
            java.lang.String r7 = "The custom token corresponds to a different audience."
            goto L_0x014d
        L_0x0145:
            java.lang.String r7 = "This operation is not allowed. You must enable this service in the console."
            goto L_0x014d
        L_0x0148:
            java.lang.String r7 = "This credential is already associated with a different user account."
            goto L_0x014d
        L_0x014b:
            java.lang.String r7 = "The supplied auth credential is malformed or has expired."
        L_0x014d:
            boolean r9 = r13 instanceof com.google.firebase.auth.C4814u
            if (r9 == 0) goto L_0x0170
            r9 = r13
            com.google.firebase.auth.u r9 = (com.google.firebase.auth.C4814u) r9
            com.google.firebase.auth.K r9 = r9.b()
            com.google.firebase.auth.L r10 = r9.q0()
            int r10 = r10.hashCode()
            java.lang.String r10 = java.lang.Integer.toString(r10)
            java.util.HashMap<java.lang.String, com.google.firebase.auth.K> r11 = r12.mCachedResolvers
            r11.put(r10, r9)
            java.lang.String r9 = "sessionId"
            r5.putString(r9, r10)
            java.lang.String r10 = "MULTI_FACTOR_AUTH_REQUIRED"
        L_0x0170:
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x018a
            boolean r6 = r13 instanceof com.google.firebase.auth.r
            if (r6 == 0) goto L_0x017b
            goto L_0x018c
        L_0x017b:
            boolean r4 = r13 instanceof ub.o
            if (r4 == 0) goto L_0x0183
            java.lang.String r4 = "NETWORK_REQUEST_FAILED"
        L_0x0181:
            r8 = r7
            goto L_0x018c
        L_0x0183:
            boolean r4 = r13 instanceof ub.q
            if (r4 == 0) goto L_0x018a
            java.lang.String r4 = "TOO_MANY_REQUESTS"
            goto L_0x0181
        L_0x018a:
            r8 = r7
            r4 = r10
        L_0x018c:
            int r6 = r4.hashCode()
            switch(r6) {
                case -1904937287: goto L_0x01a9;
                case -282314177: goto L_0x019e;
                case -51368043: goto L_0x0195;
                default: goto L_0x0193;
            }
        L_0x0193:
            r0 = r2
            goto L_0x01b3
        L_0x0195:
            java.lang.String r1 = "ERROR_UNVERIFIED_EMAIL"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x01b3
            goto L_0x0193
        L_0x019e:
            java.lang.String r0 = "ERROR_UNSUPPORTED_FIRST_FACTOR"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01a7
            goto L_0x0193
        L_0x01a7:
            r0 = r3
            goto L_0x01b3
        L_0x01a9:
            java.lang.String r0 = "ERROR_INVALID_PHONE_NUMBER"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01b2
            goto L_0x0193
        L_0x01b2:
            r0 = r1
        L_0x01b3:
            switch(r0) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01b7;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            goto L_0x01bf
        L_0x01b7:
            java.lang.String r8 = "This operation requires a verified email."
            goto L_0x01bf
        L_0x01ba:
            java.lang.String r8 = "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."
            goto L_0x01bf
        L_0x01bd:
            java.lang.String r8 = "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."
        L_0x01bf:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r1 = "error_"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = 95
            r2 = 45
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "code"
            r5.putString(r1, r0)
            java.lang.String r0 = "message"
            r5.putString(r0, r8)
            java.lang.String r0 = "nativeErrorMessage"
            java.lang.String r13 = r13.getMessage()
            r5.putString(r0, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule.getJSError(java.lang.Exception):com.facebook.react.bridge.WritableMap");
    }

    private O getPhoneAuthCredential(String str, String str2) {
        O o10;
        if (str == null && (o10 = this.mCredential) != null) {
            this.mCredential = null;
            return o10;
        } else if (str != null) {
            return Q.a(str, str2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addAuthStateListener$0(String str, FirebaseAuth firebaseAuth) {
        A k10 = firebaseAuth.k();
        WritableMap createMap = Arguments.createMap();
        g i10 = g.i();
        if (k10 != null) {
            createMap.putString("appName", str);
            createMap.putMap(Participant.USER_TYPE, firebaseUserToMap(k10));
        } else {
            createMap.putString("appName", str);
        }
        Log.d(TAG, "addAuthStateListener:eventBody " + createMap.toString());
        i10.o(new C5547b("auth_state_changed", createMap, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addIdTokenListener$1(String str, FirebaseAuth firebaseAuth) {
        A k10 = firebaseAuth.k();
        g i10 = g.i();
        WritableMap createMap = Arguments.createMap();
        if (k10 != null) {
            createMap.putBoolean("authenticated", true);
            createMap.putString("appName", str);
            createMap.putMap(Participant.USER_TYPE, firebaseUserToMap(k10));
        } else {
            createMap.putString("appName", str);
            createMap.putBoolean("authenticated", false);
        }
        i10.o(new C5547b("auth_id_token_changed", createMap, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$applyActionCode$32(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "applyActionCode:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "applyActionCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$checkActionCode$33(Promise promise, Task task) {
        String str;
        if (task.isSuccessful()) {
            Log.d(TAG, "checkActionCode:onComplete:success");
            C4781d dVar = (C4781d) task.getResult();
            Objects.requireNonNull(dVar);
            C4781d dVar2 = dVar;
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("email", dVar2.a(0));
            createMap2.putString("fromEmail", dVar2.a(1));
            createMap.putMap("data", createMap2);
            int b10 = dVar2.b();
            if (b10 == 0) {
                str = "PASSWORD_RESET";
            } else if (b10 == 1) {
                str = "VERIFY_EMAIL";
            } else if (b10 == 2) {
                str = "RECOVER_EMAIL";
            } else if (b10 == 3) {
                str = "ERROR";
            } else if (b10 != 4) {
                str = "UNKNOWN";
            } else {
                str = "EMAIL_SIGNIN";
            }
            createMap.putString("operation", str);
            promise.resolve(createMap);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "checkActionCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmPasswordReset$31(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "confirmPasswordReset:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "confirmPasswordReset:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmationResultConfirm$30(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:success");
            C4791i iVar = (C4791i) task.getResult();
            Objects.requireNonNull(iVar);
            promiseWithAuthResult(iVar, promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserWithEmailAndPassword$4(Promise promise, C4791i iVar) {
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(iVar, promise);
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:promiseResolved");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserWithEmailAndPassword$5(Promise promise, Exception exc) {
        Log.e(TAG, "createUserWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$14(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "delete:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "delete:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSignInMethodsForEmail$47(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "fetchProvidersForEmail:onComplete:success");
            W w10 = (W) task.getResult();
            Objects.requireNonNull(w10);
            List<String> a10 = w10.a();
            WritableArray createArray = Arguments.createArray();
            if (a10 != null) {
                for (String pushString : a10) {
                    createArray.pushString(pushString);
                }
            }
            promise.resolve(createArray);
            return;
        }
        Exception exception = task.getException();
        Log.d(TAG, "fetchProvidersForEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$finalizeMultiFactorEnrollment$28(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "finalizeMultiFactorEnrollment:onComplete:success");
            promise.resolve((Object) null);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "finalizeMultiFactorEnrollment:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getIdToken$45(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "getIdToken:onComplete:success");
            C c10 = (C) task.getResult();
            Objects.requireNonNull(c10);
            promise.resolve(c10.f());
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "getIdToken:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getIdTokenResult$46(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "getIdTokenResult:onComplete:success");
            C c10 = (C) task.getResult();
            WritableMap createMap = Arguments.createMap();
            Objects.requireNonNull(c10);
            Ue.m.h("authTime", Ue.m.j(c10.a()), createMap);
            Ue.m.h("expirationTime", Ue.m.j(c10.c()), createMap);
            Ue.m.h("issuedAtTime", Ue.m.j(c10.d()), createMap);
            Ue.m.h("claims", c10.b(), createMap);
            Ue.m.h("signInProvider", c10.e(), createMap);
            Ue.m.h("token", c10.f(), createMap);
            promise.resolve(createMap);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "getIdTokenResult:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getSession$27(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            return;
        }
        L l10 = (L) task.getResult();
        String num = Integer.toString(l10.hashCode());
        this.mMultiFactorSessions.put(num, l10);
        promise.resolve(num);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithCredential$34(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "link:onComplete:success");
            promiseWithAuthResult((C4791i) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof C4817x) {
            C4817x xVar = (C4817x) exception;
            C4789h b10 = xVar.b();
            Log.d(TAG, "link:onComplete:collisionFailure", xVar);
            if (b10 != null) {
                Log.d(TAG, "link:onComplete:collisionFailure had credential", xVar);
                promiseRejectLinkAuthException(promise, xVar, b10);
                return;
            }
        }
        Log.e(TAG, "link:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$35(Promise promise, C4791i iVar) {
        Log.d(TAG, "linkWithProvider:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$36(Promise promise, Exception exc) {
        Log.d(TAG, "linkWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$37(Promise promise, C4791i iVar) {
        Log.d(TAG, "linkWithProvider:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$38(Promise promise, Exception exc) {
        Log.d(TAG, "linkWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithCredential$40(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "reauthenticate:onComplete:success");
            promiseWithAuthResult((C4791i) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "reauthenticate:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$41(Promise promise, C4791i iVar) {
        Log.d(TAG, "reauthenticateWithProvider:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$42(Promise promise, Exception exc) {
        Log.d(TAG, "reauthenticateWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$43(Promise promise, C4791i iVar) {
        Log.d(TAG, "reauthenticateWithProvider:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$44(Promise promise, Exception exc) {
        Log.d(TAG, "reauthenticateWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$15(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "reload:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "reload:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveMultiFactorCredential$29(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithAuthResult((C4791i) task.getResult(), promise);
        } else {
            promiseRejectAuthException(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEmailVerification$16(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendEmailVerification:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendEmailVerification:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPasswordResetEmail$12(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendPasswordResetEmail:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendPasswordResetEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSignInLinkToEmail$13(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendSignInLinkToEmail:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendSignInLinkToEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInAnonymously$2(Promise promise, C4791i iVar) {
        Log.d(TAG, "signInAnonymously:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInAnonymously$3(Promise promise, Exception exc) {
        Log.e(TAG, "signInAnonymously:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCredential$22(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "signInWithCredential:onComplete:success");
            promiseWithAuthResult((C4791i) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "signInWithCredential:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCustomToken$10(Promise promise, C4791i iVar) {
        Log.d(TAG, "signInWithCustomToken:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCustomToken$11(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithCustomToken:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailAndPassword$6(Promise promise, C4791i iVar) {
        Log.d(TAG, "signInWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailAndPassword$7(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailLink$8(Promise promise, C4791i iVar) {
        Log.d(TAG, "signInWithEmailLink:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailLink$9(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailLink:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$23(Promise promise, C4791i iVar) {
        Log.d(TAG, "signInWithProvider:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$24(Promise promise, Exception exc) {
        Log.d(TAG, "signInWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$25(Promise promise, C4791i iVar) {
        Log.d(TAG, "signInWithProvider:success");
        promiseWithAuthResult(iVar, promise);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$26(Promise promise, Exception exc) {
        Log.d(TAG, "signInWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$unlink$39(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "unlink:onComplete:success");
            C4791i iVar = (C4791i) task.getResult();
            Objects.requireNonNull(iVar);
            promiseWithUser(iVar.H(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "unlink:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEmail$18(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updateEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePassword$19(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updatePassword:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updatePassword:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePhoneNumber$20(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updatePhoneNumber:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updatePhoneNumber:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProfile$21(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updateProfile:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updateProfile:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyBeforeUpdateEmail$17(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "verifyBeforeUpdateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.k(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "verifyBeforeUpdateEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyPasswordResetCode$48(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "verifyPasswordResetCode:onComplete:success");
            promise.resolve(task.getResult());
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "verifyPasswordResetCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    @ReactMethod
    private void linkWithCredential(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        C4789h credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        A k10 = instance.k();
        Log.d(TAG, ActionType.LINK);
        if (k10 != null) {
            k10.v0(credentialForProvider).addOnCompleteListener((Executor) getExecutor(), new C6382f(this, promise));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void linkWithProvider(String str, ReadableMap readableMap, Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        if (readableMap.getString("providerId") == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        A k10 = instance.k();
        Log.d(TAG, "linkWithProvider");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        N.a e10 = N.e(readableMap.getString("providerId"), instance);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
            e10.c(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                e10.a(nextKey, map.getString(nextKey));
            }
        }
        Task o10 = instance.o();
        if (o10 != null) {
            o10.addOnSuccessListener(new C6398w(this, promise)).addOnFailureListener(new H(this, promise));
        } else {
            k10.A0(getCurrentActivity(), e10.b()).addOnSuccessListener(new S(this, promise)).addOnFailureListener(new T(this, promise));
        }
    }

    private WritableMap multiFactorInfoToMap(J j10) {
        WritableMap createMap = Arguments.createMap();
        Date date = new Date(j10.o0() * 1000);
        createMap.putString("displayName", j10.g());
        createMap.putString("enrollmentTime", ISO_8601_FORMATTER.format(date));
        createMap.putString("factorId", j10.p0());
        createMap.putString("uid", j10.a());
        if (j10.p0().equals(AttributeType.PHONE)) {
            createMap.putString("phoneNumber", ((U) j10).d());
        }
        return createMap;
    }

    private void promiseNoUser(Promise promise, Boolean bool) {
        if (bool.booleanValue()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "no-current-user", "No user currently signed in.");
        } else {
            promise.resolve((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public void promiseRejectAuthException(Promise promise, Exception exc) {
        String str;
        WritableMap jSError = getJSError(exc);
        if (jSError.hasKey("sessionId")) {
            str = jSError.getString("sessionId");
        } else {
            str = null;
        }
        K k10 = this.mCachedResolvers.get(str);
        WritableMap createMap = Arguments.createMap();
        if (k10 != null) {
            createMap = resolverToMap(str, k10);
        }
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, jSError.getString("code"), jSError.getString(MetricTracker.Object.MESSAGE), (ReadableMap) createMap);
    }

    private void promiseRejectLinkAuthException(Promise promise, Exception exc, C4789h hVar) {
        WritableMap jSError = getJSError(exc);
        String valueOf = String.valueOf(hVar.hashCode());
        WritableMap createMap = Arguments.createMap();
        createMap.putString("providerId", hVar.o0());
        createMap.putString("token", valueOf);
        createMap.putString("secret", (String) null);
        this.credentials.put(valueOf, hVar);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("code", jSError.getString("code"));
        createMap2.putString(MetricTracker.Object.MESSAGE, jSError.getString(MetricTracker.Object.MESSAGE));
        createMap2.putMap("authCredential", createMap);
        promise.reject(jSError.getString("code"), jSError.getString(MetricTracker.Object.MESSAGE), createMap2);
    }

    private void promiseWithAuthResult(C4791i iVar, Promise promise) {
        if (iVar == null || iVar.H() == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap firebaseUserToMap = firebaseUserToMap(iVar.H());
        if (iVar.a0() != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isNewUser", iVar.a0().I());
            if (iVar.a0().getProfile() != null) {
                Ue.m.h("profile", iVar.a0().getProfile(), createMap2);
            }
            if (iVar.a0().r() != null) {
                createMap2.putString("providerId", iVar.a0().r());
            }
            if (iVar.a0().getUsername() != null) {
                createMap2.putString("username", iVar.a0().getUsername());
            }
            createMap.putMap("additionalUserInfo", createMap2);
        }
        createMap.putMap(Participant.USER_TYPE, firebaseUserToMap);
        promise.resolve(createMap);
    }

    private void promiseWithUser(A a10, Promise promise) {
        if (a10 != null) {
            promise.resolve(firebaseUserToMap(a10));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void reauthenticateWithCredential(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        C4789h credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        A k10 = instance.k();
        Log.d(TAG, "reauthenticate");
        if (k10 != null) {
            k10.w0(credentialForProvider).addOnCompleteListener((Executor) getExecutor(), new E(this, promise));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void reauthenticateWithProvider(String str, ReadableMap readableMap, Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        if (readableMap.getString("providerId") == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        A k10 = instance.k();
        Log.d(TAG, "reauthenticateWithProvider");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        N.a e10 = N.e(readableMap.getString("providerId"), instance);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
            e10.c(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                e10.a(nextKey, map.getString(nextKey));
            }
        }
        Task o10 = instance.o();
        if (o10 != null) {
            o10.addOnSuccessListener(new C6392p(this, promise)).addOnFailureListener(new C6393q(this, promise));
        } else {
            k10.B0(getCurrentActivity(), e10.b()).addOnSuccessListener(new r(this, promise)).addOnFailureListener(new C6394s(this, promise));
        }
    }

    /* access modifiers changed from: private */
    public void resolveMultiFactorCredential(O o10, String str, Promise promise) {
        S a10 = T.a(o10);
        K k10 = this.mCachedResolvers.get(str);
        if (k10 == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            k10.r0(a10).addOnCompleteListener(new Q(this, promise));
        }
    }

    private WritableMap resolverToMap(String str, K k10) {
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (J multiFactorInfoToMap : k10.p0()) {
            createArray.pushMap(multiFactorInfoToMap(multiFactorInfoToMap));
        }
        createMap.putArray("hints", createArray);
        createMap.putString("session", str);
        return createMap;
    }

    /* access modifiers changed from: private */
    public void sendPhoneStateEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        g i10 = g.i();
        createMap.putString("appName", str);
        createMap.putString("requestKey", str2);
        createMap.putString("type", str3);
        createMap.putMap("state", writableMap);
        i10.o(new C5547b("phone_auth_state_changed", createMap, str));
    }

    @ReactMethod
    private void signInAnonymously(String str, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        Log.d(TAG, "signInAnonymously");
        instance.z().addOnSuccessListener(new O(this, promise)).addOnFailureListener(new P(this, promise));
    }

    @ReactMethod
    private void signInWithCredential(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        C4789h credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        Log.d(TAG, "signInWithCredential");
        instance.A(credentialForProvider).addOnCompleteListener((Executor) getExecutor(), new V(this, promise));
    }

    @ReactMethod
    private void signInWithCustomToken(String str, String str2, Promise promise) {
        Log.d(TAG, "signInWithCustomToken");
        FirebaseAuth.getInstance(C5230g.p(str)).B(str2).addOnSuccessListener(new M(this, promise)).addOnFailureListener(new N(this, promise));
    }

    @ReactMethod
    private void signInWithEmailAndPassword(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "signInWithEmailAndPassword");
        FirebaseAuth.getInstance(C5230g.p(str)).C(str2, str3).addOnSuccessListener(new J(this, promise)).addOnFailureListener(new K(this, promise));
    }

    @ReactMethod
    private void signInWithEmailLink(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "signInWithEmailLink");
        FirebaseAuth.getInstance(C5230g.p(str)).D(str2, str3).addOnSuccessListener(new X(this, promise)).addOnFailureListener(new C6378b(this, promise));
    }

    @ReactMethod
    private void signInWithProvider(String str, ReadableMap readableMap, Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        if (readableMap.getString("providerId") == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        N.a e10 = N.e(readableMap.getString("providerId"), instance);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
            e10.c(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                e10.a(nextKey, map.getString(nextKey));
            }
        }
        Task o10 = instance.o();
        if (o10 != null) {
            o10.addOnSuccessListener(new C6383g(this, promise)).addOnFailureListener(new C6384h(this, promise));
        } else {
            instance.F(getCurrentActivity(), e10.b()).addOnSuccessListener(new C6385i(this, promise)).addOnFailureListener(new C6386j(this, promise));
        }
    }

    @ReactMethod
    private void updatePhoneNumber(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        if (!str2.equals(AttributeType.PHONE)) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential does not have a phone provider.");
        }
        O phoneAuthCredential = getPhoneAuthCredential(str3, str4);
        if (phoneAuthCredential == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updatePhoneNumber:failure:noCurrentUser");
        } else {
            Log.d(TAG, "updatePhoneNumber");
            k10.F0(phoneAuthCredential).addOnCompleteListener((Executor) getExecutor(), new C6381e(this, instance, promise));
        }
    }

    @ReactMethod
    public void addAuthStateListener(String str) {
        Log.d(TAG, "addAuthStateListener");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        if (mAuthListeners.get(str) == null) {
            C6387k kVar = new C6387k(this, str);
            instance.c(kVar);
            mAuthListeners.put(str, kVar);
        }
    }

    @ReactMethod
    public void addIdTokenListener(String str) {
        Log.d(TAG, "addIdTokenListener");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        if (!mIdTokenListeners.containsKey(str)) {
            W w10 = new W(this, str);
            instance.d(w10);
            mIdTokenListeners.put(str, w10);
        }
    }

    @ReactMethod
    public void applyActionCode(String str, String str2, Promise promise) {
        Log.d(TAG, "applyActionCode");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        instance.e(str2).addOnCompleteListener((Executor) getExecutor(), new C6377a(this, instance, promise));
    }

    @ReactMethod
    public void checkActionCode(String str, String str2, Promise promise) {
        Log.d(TAG, "checkActionCode");
        FirebaseAuth.getInstance(C5230g.p(str)).f(str2).addOnCompleteListener((Executor) getExecutor(), new C6391o(this, promise));
    }

    @ReactMethod
    public void configureAuthDomain(String str) {
        Log.d(TAG, "configureAuthDomain");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        String str2 = ReactNativeFirebaseAppModule.authDomains.get(str);
        Log.d(TAG, "configureAuthDomain - app " + str + " domain? " + str2);
        if (str2 != null) {
            instance.w(str2);
        }
    }

    @ReactMethod
    public void confirmPasswordReset(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "confirmPasswordReset");
        FirebaseAuth.getInstance(C5230g.p(str)).g(str2, str3).addOnCompleteListener((Executor) getExecutor(), new U(this, promise));
    }

    @ReactMethod
    public void confirmationResultConfirm(String str, String str2, Promise promise) {
        try {
            FirebaseAuth.getInstance(C5230g.p(str)).A(Q.a(this.mVerificationId, str2)).addOnCompleteListener((Executor) getExecutor(), new C6379c(this, promise));
        } catch (Exception e10) {
            Log.d(TAG, "confirmationResultConfirm::getCredential::failure", e10);
            promiseRejectAuthException(promise, e10);
        }
    }

    @ReactMethod
    public void delete(String str, Promise promise) {
        A k10 = FirebaseAuth.getInstance(C5230g.p(str)).k();
        Log.d(TAG, "delete");
        if (k10 != null) {
            k10.o0().addOnCompleteListener((Executor) getExecutor(), new C6390n(this, promise));
            return;
        }
        Log.e(TAG, "delete:failure:noCurrentUser");
        promiseNoUser(promise, Boolean.TRUE);
    }

    @ReactMethod
    public void fetchSignInMethodsForEmail(String str, String str2, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        Log.d(TAG, "fetchProvidersForEmail");
        instance.i(str2).addOnCompleteListener((Executor) getExecutor(), new C6395t(this, promise));
    }

    @ReactMethod
    public void finalizeMultiFactorEnrollment(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        instance.k().r0().a(T.a(Q.a(str2, str3)), str4).addOnCompleteListener(new C6396u(this, promise));
    }

    @ReactMethod
    public void forceRecaptchaFlowForTesting(String str, boolean z10, Promise promise) {
        Log.d(TAG, "forceRecaptchaFlowForTesting");
        FirebaseAuth.getInstance(C5230g.p(str)).m().a(z10);
        promise.resolve((Object) null);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        List<C5230g> n10 = C5230g.n(getReactApplicationContext());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (C5230g q10 : n10) {
            String q11 = q10.q();
            FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(q11));
            A k10 = instance.k();
            hashMap2.put(q11, instance.n());
            if (k10 != null) {
                hashMap3.put(q11, firebaseUserToMap(k10));
            }
        }
        hashMap.put("APP_LANGUAGE", hashMap2);
        hashMap.put("APP_USER", hashMap3);
        return hashMap;
    }

    @ReactMethod
    public void getCustomAuthDomain(String str, Promise promise) {
        Log.d(TAG, "configureAuthDomain");
        promise.resolve(FirebaseAuth.getInstance(C5230g.p(str)).l());
    }

    @ReactMethod
    public void getIdToken(String str, Boolean bool, Promise promise) {
        Log.d(TAG, "getIdToken");
        A k10 = FirebaseAuth.getInstance(C5230g.p(str)).k();
        if (k10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            k10.p0(bool.booleanValue()).addOnCompleteListener((Executor) getExecutor(), new C6388l(this, promise));
        }
    }

    @ReactMethod
    public void getIdTokenResult(String str, Boolean bool, Promise promise) {
        Log.d(TAG, "getIdTokenResult");
        A k10 = FirebaseAuth.getInstance(C5230g.p(str)).k();
        if (k10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            k10.p0(bool.booleanValue()).addOnCompleteListener((Executor) getExecutor(), new C6399x(this, promise));
        }
    }

    @ReactMethod
    public void getSession(String str, Promise promise) {
        FirebaseAuth.getInstance(C5230g.p(str)).k().r0().c().addOnCompleteListener(new B(this, promise));
    }

    public void initialize() {
        super.initialize();
        Log.d(TAG, "instance-initialized");
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Log.d(TAG, "instance-destroyed");
        Iterator<Map.Entry<String, FirebaseAuth.a>> it = mAuthListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            FirebaseAuth.getInstance(C5230g.p((String) next.getKey())).r((FirebaseAuth.a) next.getValue());
            it.remove();
        }
        Iterator<Map.Entry<String, FirebaseAuth.b>> it2 = mIdTokenListeners.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next2 = it2.next();
            FirebaseAuth.getInstance(C5230g.p((String) next2.getKey())).s((FirebaseAuth.b) next2.getValue());
            it2.remove();
        }
        this.mCachedResolvers.clear();
        this.mMultiFactorSessions.clear();
    }

    @ReactMethod
    public void reload(String str, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        Log.d(TAG, "reload");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "reload:failure:noCurrentUser");
            return;
        }
        k10.x0().addOnCompleteListener((Executor) getExecutor(), new C6397v(this, instance, promise));
    }

    @ReactMethod
    public void removeAuthStateListener(String str) {
        Log.d(TAG, "removeAuthStateListener");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        FirebaseAuth.a aVar = mAuthListeners.get(str);
        if (aVar != null) {
            instance.r(aVar);
            mAuthListeners.remove(str);
        }
    }

    @ReactMethod
    public void removeIdTokenListener(String str) {
        Log.d(TAG, "removeIdTokenListener");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        FirebaseAuth.b bVar = mIdTokenListeners.get(str);
        if (bVar != null) {
            instance.s(bVar);
            mIdTokenListeners.remove(str);
        }
    }

    @ReactMethod
    public void resolveMultiFactorSignIn(String str, String str2, String str3, String str4, Promise promise) {
        resolveMultiFactorCredential(Q.a(str3, str4), str2, promise);
    }

    @ReactMethod
    public void revokeToken(String str, String str2, Promise promise) {
        Log.d(TAG, "revokeToken");
        Log.e(TAG, "revokeToken:failure:noCurrentUser");
        promiseNoUser(promise, Boolean.FALSE);
    }

    @ReactMethod
    public void sendEmailVerification(String str, ReadableMap readableMap, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        Log.d(TAG, "sendEmailVerification");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "sendEmailVerification:failure:noCurrentUser");
            return;
        }
        C c10 = new C(this, instance, promise);
        if (readableMap == null) {
            k10.y0().addOnCompleteListener((Executor) getExecutor(), c10);
        } else {
            k10.z0(buildActionCodeSettings(readableMap)).addOnCompleteListener((Executor) getExecutor(), c10);
        }
    }

    @ReactMethod
    public void sendPasswordResetEmail(String str, String str2, ReadableMap readableMap, Promise promise) {
        Log.d(TAG, "sendPasswordResetEmail");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        F f10 = new F(this, promise);
        if (readableMap == null) {
            instance.t(str2).addOnCompleteListener((Executor) getExecutor(), f10);
        } else {
            instance.u(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener((Executor) getExecutor(), f10);
        }
    }

    @ReactMethod
    public void sendSignInLinkToEmail(String str, String str2, ReadableMap readableMap, Promise promise) {
        Log.d(TAG, "sendSignInLinkToEmail");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        instance.v(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener((Executor) getExecutor(), new C6400y(this, promise));
    }

    @ReactMethod
    public void setAppVerificationDisabledForTesting(String str, boolean z10, Promise promise) {
        Log.d(TAG, "setAppVerificationDisabledForTesting");
        FirebaseAuth.getInstance(C5230g.p(str)).m().b(z10);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "setAutoRetrievedSmsCodeForPhoneNumber");
        FirebaseAuth.getInstance(C5230g.p(str)).m().c(str2, str3);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setLanguageCode(String str, String str2) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        if (str2 == null) {
            instance.G();
        } else {
            instance.x(str2);
        }
    }

    @ReactMethod
    public void setTenantId(String str, String str2) {
        FirebaseAuth.getInstance(C5230g.p(str)).y(str2);
    }

    @ReactMethod
    public void signInWithPhoneNumber(String str, String str2, boolean z10, Promise promise) {
        Log.d(TAG, "signInWithPhoneNumber");
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mVerificationId = null;
        a aVar = new a(instance, promise);
        if (currentActivity == null) {
            return;
        }
        if (!z10 || this.mForceResendingToken == null) {
            Q.b(instance).d(str2, 60, TimeUnit.SECONDS, currentActivity, aVar);
            return;
        }
        Q.b(instance).e(str2, 60, TimeUnit.SECONDS, currentActivity, aVar, this.mForceResendingToken);
    }

    @ReactMethod
    public void signOut(String str, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        Log.d(TAG, "signOut");
        if (instance == null || instance.k() == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        instance.E();
        promiseNoUser(promise, Boolean.FALSE);
    }

    @ReactMethod
    public void unlink(String str, String str2, Promise promise) {
        A k10 = FirebaseAuth.getInstance(C5230g.p(str)).k();
        Log.d(TAG, "unlink");
        if (k10 != null) {
            k10.C0(str2).addOnCompleteListener((Executor) getExecutor(), new I(this, promise));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    public void updateEmail(String str, String str2, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        Log.d(TAG, "updateEmail");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updateEmail:failure:noCurrentUser");
            return;
        }
        k10.D0(str2).addOnCompleteListener((Executor) getExecutor(), new D(this, instance, promise));
    }

    @ReactMethod
    public void updatePassword(String str, String str2, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        Log.d(TAG, "updatePassword");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updatePassword:failure:noCurrentUser");
            return;
        }
        k10.E0(str2).addOnCompleteListener((Executor) getExecutor(), new C6389m(this, instance, promise));
    }

    @ReactMethod
    public void updateProfile(String str, ReadableMap readableMap, Promise promise) {
        Uri uri;
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        Log.d(TAG, "updateProfile");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updateProfile:failure:noCurrentUser");
            return;
        }
        C4780c0.a aVar = new C4780c0.a();
        if (readableMap.hasKey("displayName")) {
            aVar.b(readableMap.getString("displayName"));
        }
        if (readableMap.hasKey("photoURL")) {
            String string = readableMap.getString("photoURL");
            if (string == null) {
                uri = null;
            } else {
                uri = Uri.parse(string);
            }
            aVar.c(uri);
        }
        k10.G0(aVar.a()).addOnCompleteListener((Executor) getExecutor(), new L(this, instance, promise));
    }

    @ReactMethod
    public void useDeviceLanguage(String str) {
        FirebaseAuth.getInstance(C5230g.p(str)).G();
    }

    @ReactMethod
    public void useEmulator(String str, String str2, int i10) {
        if (emulatorConfigs.get(str) == null) {
            emulatorConfigs.put(str, com.amazon.a.a.o.b.f37475af);
            FirebaseAuth.getInstance(C5230g.p(str)).H(str2, i10);
        }
    }

    @ReactMethod
    public void verifyBeforeUpdateEmail(String str, String str2, ReadableMap readableMap, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        A k10 = instance.k();
        Log.d(TAG, "verifyBeforeUpdateEmail");
        if (k10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "verifyBeforeUpdateEmail:failure:noCurrentUser");
            return;
        }
        G g10 = new G(this, instance, promise);
        if (readableMap == null) {
            k10.H0(str2).addOnCompleteListener((Executor) getExecutor(), g10);
        } else {
            k10.I0(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener((Executor) getExecutor(), g10);
        }
    }

    @ReactMethod
    public void verifyPasswordResetCode(String str, String str2, Promise promise) {
        Log.d(TAG, "verifyPasswordResetCode");
        FirebaseAuth.getInstance(C5230g.p(str)).I(str2).addOnCompleteListener((Executor) getExecutor(), new C6380d(this, promise));
    }

    @ReactMethod
    public void verifyPhoneNumber(String str, String str2, String str3, int i10, boolean z10) {
        Log.d(TAG, "verifyPhoneNumber:" + str2);
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mCredential = null;
        d dVar = new d(str, str3);
        if (currentActivity == null) {
            return;
        }
        if (!z10 || this.mForceResendingToken == null) {
            Q.b(instance).d(str2, (long) i10, TimeUnit.SECONDS, currentActivity, dVar);
            return;
        }
        Q.b(instance).e(str2, (long) i10, TimeUnit.SECONDS, currentActivity, dVar, this.mForceResendingToken);
    }

    @ReactMethod
    public void verifyPhoneNumberForMultiFactor(String str, String str2, String str3, Promise promise) {
        L l10 = this.mMultiFactorSessions.get(str3);
        if (l10 == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "can't find session for provided key");
        } else {
            Q.c(P.a(FirebaseAuth.getInstance(C5230g.p(str))).h(str2).c(getCurrentActivity()).i(30L, TimeUnit.SECONDS).g(l10).b(true).d(new c(promise)).a());
        }
    }

    @ReactMethod
    public void verifyPhoneNumberWithMultiFactorInfo(String str, String str2, String str3, Promise promise) {
        J j10;
        K k10 = this.mCachedResolvers.get(str3);
        if (k10 == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
            return;
        }
        Iterator it = k10.p0().iterator();
        while (true) {
            if (!it.hasNext()) {
                j10 = null;
                break;
            }
            j10 = (J) it.next();
            if (str2.equals(j10.a())) {
                break;
            }
        }
        if (j10 == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "multi-factor-info-not-found", "The user does not have a second factor matching the identifier provided.");
        } else if (!AttributeType.PHONE.equals(j10.p0())) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", "Unsupported second factor. Only phone factors are supported.");
        } else {
            FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(str));
            Q.c(P.a(instance).c(getCurrentActivity()).f((U) j10).i(30L, TimeUnit.SECONDS).g(k10.q0()).d(new b(promise, str3)).a());
        }
    }
}
