package h;

import android.content.Context;
import android.content.Intent;
import g.C1998a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h.d  reason: case insensitive filesystem */
public final class C2015d extends C2012a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21094a = new a((DefaultConstructorMarker) null);

    /* renamed from: h.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: a */
    public Intent createIntent(Context context, Intent intent) {
        C6496s.h(context, "context");
        C6496s.h(intent, MetricTracker.Object.INPUT);
        return intent;
    }

    /* renamed from: b */
    public C1998a parseResult(int i10, Intent intent) {
        return new C1998a(i10, intent);
    }
}
