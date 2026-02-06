package Ga;

import android.content.Context;

/* renamed from: Ga.e  reason: case insensitive filesystem */
public class C4293e {

    /* renamed from: b  reason: collision with root package name */
    private static final C4293e f50811b = new C4293e();

    /* renamed from: a  reason: collision with root package name */
    private C4292d f50812a = null;

    public static C4292d a(Context context) {
        return f50811b.b(context);
    }

    public final synchronized C4292d b(Context context) {
        try {
            if (this.f50812a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f50812a = new C4292d(context);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f50812a;
    }
}
