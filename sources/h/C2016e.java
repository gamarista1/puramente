package h;

import android.content.Context;
import android.content.Intent;
import g.C1998a;
import g.C2004g;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h.e  reason: case insensitive filesystem */
public final class C2016e extends C2012a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21095a = new a((DefaultConstructorMarker) null);

    /* renamed from: h.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: a */
    public Intent createIntent(Context context, C2004g gVar) {
        C6496s.h(context, "context");
        C6496s.h(gVar, MetricTracker.Object.INPUT);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
        C6496s.g(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    /* renamed from: b */
    public C1998a parseResult(int i10, Intent intent) {
        return new C1998a(i10, intent);
    }
}
