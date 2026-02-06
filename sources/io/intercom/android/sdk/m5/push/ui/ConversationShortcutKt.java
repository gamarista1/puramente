package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import com.intercom.twig.Twig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import n1.C2258t;
import n1.c0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\n\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/content/Context;", "context", "", "conversationId", "conversationTitle", "Landroid/graphics/Bitmap;", "avatarBitmap", "Lkotlin/Pair;", "", "Ln1/t;", "createTemporaryShortcut", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Pair;", "dynamicShortcuts", "temporaryShortcut", "Lcom/intercom/twig/Twig;", "twig", "Llf/M;", "resetShortcuts", "(Landroid/content/Context;Ljava/util/List;Ln1/t;Lcom/intercom/twig/Twig;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationShortcutKt {
    public static final Pair<List<C2258t>, C2258t> createTemporaryShortcut(Context context, String str, String str2, Bitmap bitmap) {
        Object obj;
        Object obj2;
        C6496s.h(context, "context");
        C6496s.h(str, "conversationId");
        C6496s.h(str2, "conversationTitle");
        List g10 = c0.g(context, 8);
        C6496s.g(g10, "getShortcuts(...)");
        List b10 = c0.b(context);
        C6496s.g(b10, "getDynamicShortcuts(...)");
        Iterator it = g10.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C2258t tVar = (C2258t) obj;
            if (C6496s.c(tVar.c(), str) && C6496s.c(tVar.i(), str2)) {
                break;
            }
        }
        C2258t tVar2 = (C2258t) obj;
        if (tVar2 != null) {
            return C6502A.a((Object) null, tVar2);
        }
        Iterator it2 = b10.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            C2258t tVar3 = (C2258t) obj2;
            if (C6496s.c(tVar3.c(), str) && C6496s.c(tVar3.i(), str2)) {
                break;
            }
        }
        C2258t tVar4 = (C2258t) obj2;
        if (tVar4 != null) {
            return C6502A.a((Object) null, tVar4);
        }
        C2258t.b e10 = new C2258t.b(context, str).f(true).g(str2).c(new Intent("android.intent.action.VIEW")).e();
        if (bitmap != null) {
            IconCompat b11 = IconCompat.b(bitmap);
            C6496s.g(b11, "createWithAdaptiveBitmap(...)");
            e10.b(b11);
        }
        C2258t a10 = e10.a();
        C6496s.g(a10, "build(...)");
        c0.h(context, a10);
        return C6502A.a(b10, a10);
    }

    public static final void resetShortcuts(Context context, List<? extends C2258t> list, C2258t tVar, Twig twig) {
        C6496s.h(context, "context");
        C6496s.h(twig, "twig");
        if (tVar != null) {
            c0.i(context, C6565s.e(tVar.c()));
        }
        if (list != null) {
            try {
                c0.l(context, list);
            } catch (IllegalArgumentException e10) {
                twig.i(e10, "Could not set dynamic shortcuts, max number of dynamic shortcuts exceeded.", new Object[0]);
                C6514M m10 = C6514M.f71813a;
            }
        }
    }
}
