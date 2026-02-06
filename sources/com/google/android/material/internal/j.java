package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import fb.C4983d;
import fb.C4985f;
import java.lang.ref.WeakReference;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f56081a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final C4985f f56082b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f56083c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f56084d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f56085e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    private C4983d f56086f;

    class a extends C4985f {
        a() {
        }

        public void a(int i10) {
            boolean unused = j.this.f56084d = true;
            b bVar = (b) j.this.f56085e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z10) {
            if (!z10) {
                boolean unused = j.this.f56084d = true;
                b bVar = (b) j.this.f56085e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f56081a.measureText(charSequence, 0, charSequence.length());
    }

    public C4983d d() {
        return this.f56086f;
    }

    public TextPaint e() {
        return this.f56081a;
    }

    public float f(String str) {
        if (!this.f56084d) {
            return this.f56083c;
        }
        float c10 = c(str);
        this.f56083c = c10;
        this.f56084d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f56085e = new WeakReference(bVar);
    }

    public void h(C4983d dVar, Context context) {
        if (this.f56086f != dVar) {
            this.f56086f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f56081a, this.f56082b);
                b bVar = (b) this.f56085e.get();
                if (bVar != null) {
                    this.f56081a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f56081a, this.f56082b);
                this.f56084d = true;
            }
            b bVar2 = (b) this.f56085e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f56084d = z10;
    }

    public void j(Context context) {
        this.f56086f.n(context, this.f56081a, this.f56082b);
    }
}
