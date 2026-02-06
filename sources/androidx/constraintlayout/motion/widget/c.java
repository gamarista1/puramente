package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

public abstract class c {

    /* renamed from: f  reason: collision with root package name */
    public static int f14511f = -1;

    /* renamed from: a  reason: collision with root package name */
    int f14512a;

    /* renamed from: b  reason: collision with root package name */
    int f14513b;

    /* renamed from: c  reason: collision with root package name */
    String f14514c = null;

    /* renamed from: d  reason: collision with root package name */
    protected int f14515d;

    /* renamed from: e  reason: collision with root package name */
    HashMap f14516e;

    public c() {
        int i10 = f14511f;
        this.f14512a = i10;
        this.f14513b = i10;
    }

    public abstract void a(HashMap hashMap);

    public abstract c b();

    public c c(c cVar) {
        this.f14512a = cVar.f14512a;
        this.f14513b = cVar.f14513b;
        this.f14514c = cVar.f14514c;
        this.f14515d = cVar.f14515d;
        this.f14516e = cVar.f14516e;
        return this;
    }

    /* access modifiers changed from: package-private */
    public abstract void d(HashSet hashSet);

    /* access modifiers changed from: package-private */
    public abstract void e(Context context, AttributeSet attributeSet);

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        String str2 = this.f14514c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(HashMap hashMap) {
    }

    public c h(int i10) {
        this.f14513b = i10;
        return this;
    }
}
