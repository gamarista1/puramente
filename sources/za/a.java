package Za;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f53537a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53538b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53539c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53540d;

    public a(Dialog dialog, Rect rect) {
        this.f53537a = dialog;
        this.f53538b = rect.left;
        this.f53539c = rect.top;
        this.f53540d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f53538b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f53539c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f53540d;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.f53537a.onTouchEvent(obtain);
    }
}
