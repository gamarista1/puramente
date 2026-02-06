package io.intercom.android.sdk.utilities;

import Ug.K;
import Xg.C5695g;
import android.content.Context;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1", f = "FirstMessageUtils.kt", l = {27}, m = "invokeSuspend")
final class FirstMessageUtilsKt$handleFirstMessageToast$1 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomDataLayer $dataLayer;
    final /* synthetic */ Twig $twig;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FirstMessageUtilsKt$handleFirstMessageToast$1(IntercomDataLayer intercomDataLayer, Twig twig, Context context, C6658d<? super FirstMessageUtilsKt$handleFirstMessageToast$1> dVar) {
        super(2, dVar);
        this.$dataLayer = intercomDataLayer;
        this.$twig = twig;
        this.$context = context;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new FirstMessageUtilsKt$handleFirstMessageToast$1(this.$dataLayer, this.$twig, this.$context, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((FirstMessageUtilsKt$handleFirstMessageToast$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1 firstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1(this.$dataLayer.getEvent());
            final Twig twig = this.$twig;
            final Context context = this.$context;
            AnonymousClass1 r62 = new C5695g() {
                /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(io.intercom.android.sdk.m5.data.IntercomEvent.BaseResponseReceived r6, qf.C6658d<? super lf.C6514M> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 r0 = (io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 r0 = new io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0037
                        if (r2 != r3) goto L_0x002f
                        java.lang.Object r6 = r0.L$0
                        io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1 r6 = (io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1.AnonymousClass1) r6
                        lf.w.b(r7)     // Catch:{ Exception -> 0x002d }
                        goto L_0x008b
                    L_0x002d:
                        r7 = move-exception
                        goto L_0x0071
                    L_0x002f:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L_0x0037:
                        lf.w.b(r7)
                        io.intercom.android.sdk.models.BaseResponse r6 = r6.getBaseResponse()
                        io.intercom.android.sdk.models.Config r6 = r6.getConfig()
                        boolean r6 = r6.isFirstRequest()
                        if (r6 == 0) goto L_0x008b
                        com.intercom.twig.Twig r6 = r3
                        android.content.Context r7 = r4
                        int r2 = io.intercom.android.sdk.R.string.intercom_android_activated_message
                        java.lang.String r7 = r7.getString(r2)
                        r2 = 0
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r6.i(r7, r2)
                        Ug.I0 r6 = Ug.Z.c()     // Catch:{ Exception -> 0x006f }
                        io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1 r7 = new io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1     // Catch:{ Exception -> 0x006f }
                        android.content.Context r2 = r4     // Catch:{ Exception -> 0x006f }
                        r4 = 0
                        r7.<init>(r2, r4)     // Catch:{ Exception -> 0x006f }
                        r0.L$0 = r5     // Catch:{ Exception -> 0x006f }
                        r0.label = r3     // Catch:{ Exception -> 0x006f }
                        java.lang.Object r6 = Ug.C5572i.g(r6, r7, r0)     // Catch:{ Exception -> 0x006f }
                        if (r6 != r1) goto L_0x008b
                        return r1
                    L_0x006f:
                        r7 = move-exception
                        r6 = r5
                    L_0x0071:
                        com.intercom.twig.Twig r6 = r3
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Couldn't show first message toast: "
                        r0.append(r1)
                        java.lang.String r7 = r7.getMessage()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        r6.internal(r7)
                    L_0x008b:
                        lf.M r6 = lf.C6514M.f71813a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1.AnonymousClass1.emit(io.intercom.android.sdk.m5.data.IntercomEvent$BaseResponseReceived, qf.d):java.lang.Object");
                }
            };
            this.label = 1;
            if (firstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1.collect(r62, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
