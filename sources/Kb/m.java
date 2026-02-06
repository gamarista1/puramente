package kb;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import lb.C5076i;
import lb.C5082o;
import lb.C5087t;
import lb.C5090w;

public final class m {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C5076i f60914c = new C5076i("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    C5087t f60915a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f60916b;

    public m(Context context) {
        this.f60916b = context.getPackageName();
        if (C5090w.a(context)) {
            Context context2 = context;
            this.f60915a = new C5087t(context2, f60914c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), i.f60907a, (C5082o) null, (byte[]) null);
        }
    }

    public final Task a() {
        C5076i iVar = f60914c;
        iVar.d("requestInAppReview (%s)", this.f60916b);
        if (this.f60915a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new C5061a(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f60915a.p(new j(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
