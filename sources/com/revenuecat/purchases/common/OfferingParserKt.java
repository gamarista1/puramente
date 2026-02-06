package com.revenuecat.purchases.common;

import Sg.p;
import com.revenuecat.purchases.PackageType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toPackageType", "Lcom/revenuecat/purchases/PackageType;", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OfferingParserKt {
    /* access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] values = PackageType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                packageType = null;
                break;
            }
            packageType = values[i10];
            if (C6496s.c(packageType.getIdentifier(), str)) {
                break;
            }
            i10++;
        }
        if (packageType != null) {
            return packageType;
        }
        if (p.J(str, "$rc_", false, 2, (Object) null)) {
            return PackageType.UNKNOWN;
        }
        return PackageType.CUSTOM;
    }
}
