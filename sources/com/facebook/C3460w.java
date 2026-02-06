package com.facebook;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.w  reason: case insensitive filesystem */
public final class C3460w extends C3459v {

    /* renamed from: b  reason: collision with root package name */
    private final S f42566b;

    public C3460w(S s10, String str) {
        super(str);
        this.f42566b = s10;
    }

    public String toString() {
        C3462y yVar;
        S s10 = this.f42566b;
        if (s10 != null) {
            yVar = s10.b();
        } else {
            yVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        if (yVar != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(yVar.k());
            sb2.append(", facebookErrorCode: ");
            sb2.append(yVar.c());
            sb2.append(", facebookErrorType: ");
            sb2.append(yVar.e());
            sb2.append(", message: ");
            sb2.append(yVar.d());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
