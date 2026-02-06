package com.reactnativegooglesignin;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import io.intercom.android.sdk.models.Participant;

public abstract class e {
    static Scope[] a(ReadableArray readableArray) {
        int size = readableArray.size();
        Scope[] scopeArr = new Scope[size];
        for (int i10 = 0; i10 < size; i10++) {
            scopeArr[i10] = new Scope(readableArray.getString(i10));
        }
        return scopeArr;
    }

    public static int b(Task task) {
        Exception exception = task.getException();
        if (exception instanceof b) {
            return ((b) exception).getStatusCode();
        }
        return 8;
    }

    static GoogleSignInOptions c(Scope[] scopeArr, String str, boolean z10, boolean z11, String str2, String str3) {
        GoogleSignInOptions.a e10 = new GoogleSignInOptions.a(GoogleSignInOptions.f53847l).e(new Scope("email"), scopeArr);
        if (str != null && !str.isEmpty()) {
            e10.c(str);
            if (z10) {
                e10.f(str, z11);
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            e10.g(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            e10.h(str3);
        }
        return e10.a();
    }

    static WritableMap d(GoogleSignInAccount googleSignInAccount) {
        String str;
        Uri h10 = googleSignInAccount.h();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", googleSignInAccount.r0());
        createMap.putString("name", googleSignInAccount.g());
        createMap.putString("givenName", googleSignInAccount.p0());
        createMap.putString("familyName", googleSignInAccount.o0());
        createMap.putString("email", googleSignInAccount.j0());
        if (h10 != null) {
            str = h10.toString();
        } else {
            str = null;
        }
        createMap.putString("photo", str);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap(Participant.USER_TYPE, createMap);
        createMap2.putString("idToken", googleSignInAccount.s0());
        createMap2.putString("serverAuthCode", googleSignInAccount.u0());
        WritableArray createArray = Arguments.createArray();
        for (Scope scope : googleSignInAccount.q0()) {
            String scope2 = scope.toString();
            if (scope2.startsWith("http")) {
                createArray.pushString(scope2);
            }
        }
        createMap2.putArray("scopes", createArray);
        return createMap2;
    }

    static String e(ReadableArray readableArray) {
        StringBuilder sb2 = new StringBuilder("oauth2:");
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            sb2.append(readableArray.getString(i10));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb2.toString().trim();
    }
}
