package io.intercom.android.sdk.survey.block;

import Q0.C;
import Q0.C1321d;
import Q0.C1326i;
import Q0.M;
import Q0.z;
import Sg.p;
import V0.h;
import V0.n;
import V0.o;
import X0.e;
import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import b1.C1869a;
import b1.j;
import b1.k;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2550z0;
import r0.e2;
import t0.C2606g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/BlockAlignment;", "Lb1/j;", "getTextAlign", "(Lio/intercom/android/sdk/blocks/lib/BlockAlignment;)I", "", "Landroid/content/Context;", "context", "LQ0/C;", "urlSpanStyle", "LQ0/d;", "toAnnotatedString", "(Ljava/lang/CharSequence;Landroid/content/Context;LQ0/C;)LQ0/d;", "LQ0/d$a;", "Landroid/text/Spanned;", "source", "Llf/M;", "appendStringWithLink", "(LQ0/d$a;LQ0/C;Landroid/content/Context;Landroid/text/Spanned;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BlockExtensionsKt {
    /* JADX INFO: finally extract failed */
    private static final void appendStringWithLink(C1321d.a aVar, C c10, Context context, Spanned spanned) {
        C1321d.a aVar2 = aVar;
        Spanned spanned2 = spanned;
        int i10 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned2.getSpans(0, spanned.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i11 = 0;
        while (i10 < length) {
            URLSpan uRLSpan = uRLSpanArr[i10];
            C6270f fVar = new C6270f(uRLSpan, context);
            URLSpan[] uRLSpanArr2 = uRLSpanArr;
            M m10 = r9;
            M m11 = new M(c10, (C) null, (C) null, (C) null, 14, (DefaultConstructorMarker) null);
            C1326i.a aVar3 = new C1326i.a("url", m10, fVar);
            int spanStart = spanned2.getSpanStart(uRLSpan);
            int spanEnd = spanned2.getSpanEnd(uRLSpan);
            if (spanStart > i11) {
                aVar2.h(spanned2.subSequence(i11, spanStart).toString());
            }
            int k10 = aVar2.k(aVar3);
            try {
                aVar2.h(spanned2.subSequence(spanStart, spanEnd).toString());
                C6514M m12 = C6514M.f71813a;
                aVar2.j(k10);
                i10++;
                i11 = spanEnd;
                uRLSpanArr = uRLSpanArr2;
            } catch (Throwable th2) {
                aVar2.j(k10);
                throw th2;
            }
        }
        if (i11 < spanned.length()) {
            aVar2.h(spanned2.subSequence(i11, spanned.length()).toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void appendStringWithLink$lambda$8$lambda$6(URLSpan uRLSpan, Context context, C1326i iVar) {
        C6496s.h(uRLSpan, "$urlSpan");
        C6496s.h(context, "$context");
        C6496s.h(iVar, "it");
        String url = uRLSpan.getURL();
        C6496s.g(url, "getURL(...)");
        if (!p.d0(url)) {
            LinkOpener.handleUrl(uRLSpan.getURL(), context, Injector.get().getApi());
        }
    }

    public static final int getTextAlign(BlockAlignment blockAlignment) {
        C6496s.h(blockAlignment, "<this>");
        int gravity = blockAlignment.getGravity();
        if (gravity == 1) {
            return j.f19110b.a();
        }
        if (gravity == 8388611) {
            return j.f19110b.f();
        }
        if (gravity != 8388613) {
            return j.f19110b.f();
        }
        return j.f19110b.b();
    }

    public static final C1321d toAnnotatedString(CharSequence charSequence, Context context, C c10) {
        CharSequence charSequence2 = charSequence;
        Context context2 = context;
        C c11 = c10;
        C6496s.h(charSequence2, "<this>");
        C6496s.h(context2, "context");
        C6496s.h(c11, "urlSpanStyle");
        if (charSequence2 instanceof Spanned) {
            C1321d.a aVar = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
            Spanned spanned = (Spanned) charSequence2;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
            UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spanned.getSpans(0, spanned.length(), UnderlineSpan.class);
            StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) spanned.getSpans(0, spanned.length(), StrikethroughSpan.class);
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class);
            appendStringWithLink(aVar, c11, context2, spanned);
            for (StyleSpan styleSpan : styleSpanArr) {
                int spanStart = spanned.getSpanStart(styleSpan);
                int spanEnd = spanned.getSpanEnd(styleSpan);
                int style = styleSpan.getStyle();
                if (style == 1) {
                    aVar.b(new C(0, 0, V0.p.f8210b.a(), (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 2) {
                    aVar.b(new C(0, 0, (V0.p) null, n.c(n.f8200b.a()), (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 3) {
                    aVar.b(new C(0, 0, V0.p.f8210b.a(), n.c(n.f8200b.a()), (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                }
            }
            for (UnderlineSpan underlineSpan : underlineSpanArr) {
                int spanStart2 = spanned.getSpanStart(underlineSpan);
                int spanEnd2 = spanned.getSpanEnd(underlineSpan);
                C c12 = r10;
                C c13 = new C(0, 0, (V0.p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, k.f19119b.d(), (e2) null, (z) null, (C2606g) null, 61439, (DefaultConstructorMarker) null);
                aVar.b(c12, spanStart2, spanEnd2);
            }
            for (StrikethroughSpan strikethroughSpan : strikethroughSpanArr) {
                aVar.b(new C(0, 0, (V0.p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, k.f19119b.b(), (e2) null, (z) null, (C2606g) null, 61439, (DefaultConstructorMarker) null), spanned.getSpanStart(strikethroughSpan), spanned.getSpanEnd(strikethroughSpan));
            }
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                aVar.b(new C(C2550z0.b(foregroundColorSpan.getForegroundColor()), 0, (V0.p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65534, (DefaultConstructorMarker) null), spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan));
            }
            return aVar.n();
        }
        C1321d.a aVar2 = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
        aVar2.h(aVar2.toString());
        return aVar2.n();
    }

    public static /* synthetic */ C1321d toAnnotatedString$default(CharSequence charSequence, Context context, C c10, int i10, Object obj) {
        Context context2;
        CharSequence charSequence2;
        C c11;
        if ((i10 & 2) != 0) {
            c11 = new C(0, 0, (V0.p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, k.f19119b.d(), (e2) null, (z) null, (C2606g) null, 61439, (DefaultConstructorMarker) null);
            charSequence2 = charSequence;
            context2 = context;
        } else {
            charSequence2 = charSequence;
            context2 = context;
            c11 = c10;
        }
        return toAnnotatedString(charSequence2, context2, c11);
    }
}
