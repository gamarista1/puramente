package io.intercom.android.sdk.utilities;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import r0.C2544x0;
import r0.C2550z0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\b\u001a\u0013\u0010\u000f\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0002\u001a\u0013\u0010\u0013\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0002\u001a\u0013\u0010\u0015\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0002\u001a\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\b\u001a\u001d\u0010\u001b\u001a\u00020\u0000*\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u0002\"\u0014\u0010\u001f\u001a\u00020\u00198\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00198\u0002XT¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lr0/x0;", "darken-8_81llA", "(J)J", "darken", "lighten-8_81llA", "lighten", "", "isDarkColor-8_81llA", "(J)Z", "isDarkColor", "isLightColor-8_81llA", "isLightColor", "isWhite-8_81llA", "isWhite", "isBlack-8_81llA", "isBlack", "generateTextColor-8_81llA", "generateTextColor", "getAccessibleBorderColor-8_81llA", "getAccessibleBorderColor", "getAccessibleColorOnWhiteBackground-8_81llA", "getAccessibleColorOnWhiteBackground", "isColorTooWhite-8_81llA", "isColorTooWhite", "", "", "opacity", "toComposeColor", "(Ljava/lang/String;F)J", "getAccessibleColorOnDarkBackground-8_81llA", "getAccessibleColorOnDarkBackground", "BRIGHTNESS_CUTOFF", "F", "WHITENESS_CUTOFF", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorExtensionsKt {
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float WHITENESS_CUTOFF = 0.9411765f;

    /* renamed from: darken-8_81llA  reason: not valid java name */
    public static final long m711darken8_81llA(long j10) {
        return C2550z0.b(ColorUtils.darkenColor(C2550z0.k(j10)));
    }

    /* renamed from: generateTextColor-8_81llA  reason: not valid java name */
    public static final long m712generateTextColor8_81llA(long j10) {
        if (m718isDarkColor8_81llA(j10)) {
            return C2544x0.f25560b.i();
        }
        return C2544x0.f25560b.a();
    }

    /* renamed from: getAccessibleBorderColor-8_81llA  reason: not valid java name */
    public static final long m713getAccessibleBorderColor8_81llA(long j10) {
        if (m718isDarkColor8_81llA(j10)) {
            return m721lighten8_81llA(j10);
        }
        return m711darken8_81llA(j10);
    }

    /* renamed from: getAccessibleColorOnDarkBackground-8_81llA  reason: not valid java name */
    public static final long m714getAccessibleColorOnDarkBackground8_81llA(long j10) {
        if (m718isDarkColor8_81llA(j10)) {
            return m721lighten8_81llA(j10);
        }
        return j10;
    }

    /* renamed from: getAccessibleColorOnWhiteBackground-8_81llA  reason: not valid java name */
    public static final long m715getAccessibleColorOnWhiteBackground8_81llA(long j10) {
        if (m717isColorTooWhite8_81llA(j10)) {
            return C2544x0.f25560b.a();
        }
        return j10;
    }

    /* renamed from: isBlack-8_81llA  reason: not valid java name */
    public static final boolean m716isBlack8_81llA(long j10) {
        return C2544x0.q(j10, C2544x0.f25560b.a());
    }

    /* renamed from: isColorTooWhite-8_81llA  reason: not valid java name */
    private static final boolean m717isColorTooWhite8_81llA(long j10) {
        if (C2544x0.v(j10) < WHITENESS_CUTOFF || C2544x0.u(j10) < WHITENESS_CUTOFF || C2544x0.s(j10) < WHITENESS_CUTOFF) {
            return false;
        }
        return true;
    }

    /* renamed from: isDarkColor-8_81llA  reason: not valid java name */
    public static final boolean m718isDarkColor8_81llA(long j10) {
        if (C2550z0.j(j10) < BRIGHTNESS_CUTOFF) {
            return true;
        }
        return false;
    }

    /* renamed from: isLightColor-8_81llA  reason: not valid java name */
    public static final boolean m719isLightColor8_81llA(long j10) {
        return !m718isDarkColor8_81llA(j10);
    }

    /* renamed from: isWhite-8_81llA  reason: not valid java name */
    public static final boolean m720isWhite8_81llA(long j10) {
        return C2544x0.q(j10, C2544x0.f25560b.i());
    }

    /* renamed from: lighten-8_81llA  reason: not valid java name */
    public static final long m721lighten8_81llA(long j10) {
        return C2550z0.b(ColorUtils.lightenColor(C2550z0.k(j10)));
    }

    public static final long toComposeColor(String str, float f10) {
        C6496s.h(str, "<this>");
        return C2544x0.o(C2550z0.b(ColorUtils.parseColor(str)), f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public static /* synthetic */ long toComposeColor$default(String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return toComposeColor(str, f10);
    }
}
