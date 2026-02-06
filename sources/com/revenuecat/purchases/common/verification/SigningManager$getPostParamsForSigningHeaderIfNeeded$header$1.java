package com.revenuecat.purchases.common.verification;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 extends C6498u implements C6798l {
    public static final SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 INSTANCE = new SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1();

    SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1() {
        super(1);
    }

    public final CharSequence invoke(Pair<String, String> pair) {
        C6496s.h(pair, "it");
        return (CharSequence) pair.c();
    }
}
