package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import i.C2037a;

/* renamed from: androidx.appcompat.widget.x  reason: case insensitive filesystem */
public class C1584x extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final C1585y f12014a;

    public C1584x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21252G);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12014a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f12014a.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12014a.g(canvas);
    }

    public C1584x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c0.a(this, getContext());
        C1585y yVar = new C1585y(this);
        this.f12014a = yVar;
        yVar.c(attributeSet, i10);
    }
}
