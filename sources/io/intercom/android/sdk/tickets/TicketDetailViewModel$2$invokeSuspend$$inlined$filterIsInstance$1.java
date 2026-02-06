package io.intercom.android.sdk.tickets;

import Xg.C5694f;
import Xg.C5695g;
import kotlin.Metadata;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LXg/f;", "LXg/g;", "collector", "Llf/M;", "collect", "(LXg/g;Lqf/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1 implements C5694f {
    final /* synthetic */ C5694f $this_unsafeTransform$inlined;

    public TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1(C5694f fVar) {
        this.$this_unsafeTransform$inlined = fVar;
    }

    public Object collect(final C5695g gVar, C6658d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C5695g() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = (io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = new io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r6)
                    goto L_0x0043
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    lf.w.b(r6)
                    Xg.g r6 = r3
                    boolean r2 = r5 instanceof io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent.NewComment
                    if (r2 == 0) goto L_0x0043
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0043
                    return r1
                L_0x0043:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }
}
