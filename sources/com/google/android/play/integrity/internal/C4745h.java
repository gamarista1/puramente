package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* renamed from: com.google.android.play.integrity.internal.h  reason: case insensitive filesystem */
public abstract class C4745h {

    /* renamed from: a  reason: collision with root package name */
    private static final C f56581a = new C("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                    f56581a.d("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature byteArray : signatureArr) {
                        String a10 = C4744g.a(byteArray.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a10)) {
                            return true;
                        }
                        String str = Build.TAGS;
                        if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a10)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
