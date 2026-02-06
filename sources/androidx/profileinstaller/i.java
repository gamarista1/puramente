package androidx.profileinstaller;

import com.revenuecat.purchases.common.Constants;
import java.util.Arrays;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f17870a = {48, 49, 53, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f17871b = {48, 49, 48, 0};

    /* renamed from: c  reason: collision with root package name */
    static final byte[] f17872c = {48, 48, 57, 0};

    /* renamed from: d  reason: collision with root package name */
    static final byte[] f17873d = {48, 48, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    static final byte[] f17874e = {48, 48, 49, 0};

    /* renamed from: f  reason: collision with root package name */
    static final byte[] f17875f = {48, 48, 49, 0};

    /* renamed from: g  reason: collision with root package name */
    static final byte[] f17876g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        if (!Arrays.equals(bArr, f17874e) && !Arrays.equals(bArr, f17873d)) {
            return "!";
        }
        return Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
    }
}
