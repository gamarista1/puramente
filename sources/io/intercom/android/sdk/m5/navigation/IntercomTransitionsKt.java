package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.d;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import w.C2760D;
import w.C2798j;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\",\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\",\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lj3/k;", "Landroidx/compose/animation/i;", "slideUpEnterTransition", "Lyf/l;", "getSlideUpEnterTransition", "()Lyf/l;", "Landroidx/compose/animation/k;", "slideDownExitTransition", "getSlideDownExitTransition", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomTransitionsKt {
    private static final C6798l slideDownExitTransition = new C6233j0();
    private static final C6798l slideUpEnterTransition = new C6231i0();

    public static final C6798l getSlideDownExitTransition() {
        return slideDownExitTransition;
    }

    public static final C6798l getSlideUpEnterTransition() {
        return slideUpEnterTransition;
    }

    /* access modifiers changed from: private */
    public static final k slideDownExitTransition$lambda$1(d dVar) {
        C6496s.h(dVar, "<this>");
        return d.c(dVar, d.a.f12266a.a(), C2798j.j(300, 0, (C2760D) null, 6, (Object) null), (C6798l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final i slideUpEnterTransition$lambda$0(d dVar) {
        C6496s.h(dVar, "<this>");
        return d.f(dVar, d.a.f12266a.f(), C2798j.j(300, 0, (C2760D) null, 6, (Object) null), (C6798l) null, 4, (Object) null);
    }
}
