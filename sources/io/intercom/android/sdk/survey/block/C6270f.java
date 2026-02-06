package io.intercom.android.sdk.survey.block;

import Q0.C1326i;
import Q0.C1327j;
import android.content.Context;
import android.text.style.URLSpan;

/* renamed from: io.intercom.android.sdk.survey.block.f  reason: case insensitive filesystem */
public final /* synthetic */ class C6270f implements C1327j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ URLSpan f70132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f70133b;

    public /* synthetic */ C6270f(URLSpan uRLSpan, Context context) {
        this.f70132a = uRLSpan;
        this.f70133b = context;
    }

    public final void a(C1326i iVar) {
        BlockExtensionsKt.appendStringWithLink$lambda$8$lambda$6(this.f70132a, this.f70133b, iVar);
    }
}
