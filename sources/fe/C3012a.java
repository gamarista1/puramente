package Fe;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: Fe.a  reason: case insensitive filesystem */
public class C3012a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31016a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31017b;

    /* renamed from: Fe.a$a  reason: collision with other inner class name */
    class C0511a implements DialogInterface.OnKeyListener {
        C0511a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            if (i10 != 4) {
                return true;
            }
            C3012a.this.d();
            return true;
        }
    }

    public C3012a(Context context, boolean z10) {
        super(context);
        this.f31016a = false;
        this.f31017b = z10;
        b(context);
    }

    private void b(Context context) {
        c();
        setOnKeyListener(new C0511a());
    }

    /* access modifiers changed from: private */
    public void d() {
        if (!this.f31016a) {
            this.f31016a = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(500);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new b());
        }
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
        super.show();
    }

    public void c() {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
        getWindow().addFlags(1024);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 80;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);
        getWindow().setWindowAnimations(17432578);
        setCanceledOnTouchOutside(true);
    }

    public void cancel() {
        d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f31017b) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            getWindow().setAttributes(attributes);
        }
    }

    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    public void show() {
        e();
    }

    public C3012a(Context context, int i10) {
        super(context, i10);
        this.f31016a = false;
        this.f31017b = false;
        b(context);
    }

    /* renamed from: Fe.a$b */
    class b implements Animation.AnimationListener {
        b() {
        }

        public void onAnimationEnd(Animation animation) {
            C3012a.this.dismiss();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }
}
