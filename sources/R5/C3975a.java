package r5;

import U5.a;
import android.content.ComponentName;
import android.content.Context;
import oh.C6631c;

/* renamed from: r5.a  reason: case insensitive filesystem */
public class C3975a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3975a f47939c = new C3975a();

    /* renamed from: a  reason: collision with root package name */
    private Boolean f47940a;

    /* renamed from: b  reason: collision with root package name */
    private ComponentName f47941b;

    private C3975a() {
    }

    private void b(Context context, int i10) {
        Boolean bool = this.f47940a;
        if (bool == null) {
            Boolean valueOf = Boolean.valueOf(C6631c.a(context, i10));
            this.f47940a = valueOf;
            if (valueOf.booleanValue()) {
                a.s("ApplicationBadgeHelper", "First attempt to use automatic badger succeeded; permanently enabling method.");
            } else {
                a.s("ApplicationBadgeHelper", "First attempt to use automatic badger failed; permanently disabling method.");
            }
        } else if (bool.booleanValue()) {
            C6631c.a(context, i10);
        }
    }

    public void a(Context context, int i10) {
        if (this.f47941b == null) {
            this.f47941b = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent();
        }
        b(context, i10);
    }
}
