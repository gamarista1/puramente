package expo.modules.av.video;

import Hd.p;
import Hd.q;
import Hd.r;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import expo.modules.av.player.g;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Locale;

public class e extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    private View.OnClickListener f60314A;

    /* renamed from: B  reason: collision with root package name */
    private View.OnClickListener f60315B;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public g f60316a;

    /* renamed from: b  reason: collision with root package name */
    private Context f60317b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f60318c;

    /* renamed from: d  reason: collision with root package name */
    private View f60319d;

    /* renamed from: e  reason: collision with root package name */
    private ProgressBar f60320e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f60321f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public TextView f60322g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f60323h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f60324i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f60325j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f60326k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f60327l;

    /* renamed from: m  reason: collision with root package name */
    private View.OnClickListener f60328m;

    /* renamed from: n  reason: collision with root package name */
    private View.OnClickListener f60329n;

    /* renamed from: o  reason: collision with root package name */
    private StringBuilder f60330o;

    /* renamed from: p  reason: collision with root package name */
    private Formatter f60331p;

    /* renamed from: q  reason: collision with root package name */
    private ImageButton f60332q;

    /* renamed from: r  reason: collision with root package name */
    private ImageButton f60333r;

    /* renamed from: s  reason: collision with root package name */
    private ImageButton f60334s;

    /* renamed from: t  reason: collision with root package name */
    private ImageButton f60335t;

    /* renamed from: u  reason: collision with root package name */
    private ImageButton f60336u;

    /* renamed from: v  reason: collision with root package name */
    private ImageButton f60337v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public Handler f60338w;

    /* renamed from: x  reason: collision with root package name */
    private View.OnClickListener f60339x;

    /* renamed from: y  reason: collision with root package name */
    private View.OnClickListener f60340y;

    /* renamed from: z  reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f60341z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            e.this.t(3000);
            e.this.l();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            e.this.t(3000);
            e.this.m();
        }
    }

    class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (e.this.f60316a != null && z10) {
                int duration = (int) ((((long) e.this.f60316a.getDuration()) * ((long) i10)) / 1000);
                e.this.f60316a.seekTo(duration);
                if (e.this.f60322g != null) {
                    e.this.f60322g.setText(e.this.u(duration));
                }
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            e.this.t(Constants.ONE_HOUR);
            e.this.f60324i = true;
            e.this.f60338w.removeMessages(2);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            e.this.f60324i = false;
            int unused = e.this.r();
            e.this.x();
            e.this.t(3000);
            e.this.f60338w.sendEmptyMessage(2);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            if (e.this.f60316a != null) {
                e.this.f60316a.seekTo(e.this.f60316a.getCurrentPosition() - 5000);
                int unused = e.this.r();
                e.this.t(3000);
            }
        }
    }

    /* renamed from: expo.modules.av.video.e$e  reason: collision with other inner class name */
    class C0884e implements View.OnClickListener {
        C0884e() {
        }

        public void onClick(View view) {
            if (e.this.f60316a != null) {
                e.this.f60316a.seekTo(e.this.f60316a.getCurrentPosition() + 15000);
                int unused = e.this.r();
                e.this.t(3000);
            }
        }
    }

    private static class f extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f60347a;

        f(e eVar) {
            this.f60347a = new WeakReference(eVar);
        }

        public void handleMessage(Message message) {
            e eVar = (e) this.f60347a.get();
            if (eVar != null && eVar.f60316a != null) {
                int i10 = message.what;
                if (i10 == 1) {
                    eVar.n();
                } else if (i10 == 2) {
                    int i11 = eVar.r();
                    if (!eVar.f60324i && eVar.f60323h && eVar.f60316a.isPlaying()) {
                        sendMessageDelayed(obtainMessage(2), (long) (1000 - (i11 % 1000)));
                    }
                }
            }
        }
    }

    public e(Context context, boolean z10) {
        super(context);
        this.f60338w = new f(this);
        this.f60339x = new a();
        this.f60340y = new b();
        this.f60341z = new c();
        this.f60314A = new d();
        this.f60315B = new C0884e();
        this.f60317b = context;
        this.f60325j = z10;
    }

    private void k() {
        g gVar = this.f60316a;
        if (gVar != null) {
            try {
                if (this.f60332q != null && !gVar.canPause()) {
                    this.f60332q.setEnabled(false);
                }
                if (this.f60334s != null && !this.f60316a.canSeekBackward()) {
                    this.f60334s.setEnabled(false);
                }
                if (this.f60333r != null && !this.f60316a.canSeekForward()) {
                    this.f60333r.setEnabled(false);
                }
            } catch (IncompatibleClassChangeError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        g gVar = this.f60316a;
        if (gVar != null) {
            if (gVar.isPlaying()) {
                this.f60316a.pause();
            } else {
                this.f60316a.start();
            }
            x();
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        g gVar = this.f60316a;
        if (gVar != null) {
            gVar.b();
        }
    }

    private void o(View view) {
        int i10;
        ImageButton imageButton = (ImageButton) view.findViewById(q.f51114e);
        this.f60332q = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.f60332q.setOnClickListener(this.f60339x);
        }
        ImageButton imageButton2 = (ImageButton) view.findViewById(q.f51113d);
        this.f60337v = imageButton2;
        if (imageButton2 != null) {
            imageButton2.requestFocus();
            this.f60337v.setOnClickListener(this.f60340y);
        }
        ImageButton imageButton3 = (ImageButton) view.findViewById(q.f51112c);
        this.f60333r = imageButton3;
        int i11 = 0;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this.f60315B);
            if (!this.f60326k) {
                ImageButton imageButton4 = this.f60333r;
                if (this.f60325j) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageButton4.setVisibility(i10);
            }
        }
        ImageButton imageButton5 = (ImageButton) view.findViewById(q.f51115f);
        this.f60334s = imageButton5;
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(this.f60314A);
            if (!this.f60326k) {
                ImageButton imageButton6 = this.f60334s;
                if (!this.f60325j) {
                    i11 = 8;
                }
                imageButton6.setVisibility(i11);
            }
        }
        ImageButton imageButton7 = (ImageButton) view.findViewById(q.f51117h);
        this.f60335t = imageButton7;
        if (imageButton7 != null && !this.f60326k && !this.f60327l) {
            imageButton7.setVisibility(8);
        }
        ImageButton imageButton8 = (ImageButton) view.findViewById(q.f51118i);
        this.f60336u = imageButton8;
        if (imageButton8 != null && !this.f60326k && !this.f60327l) {
            imageButton8.setVisibility(8);
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(q.f51116g);
        this.f60320e = progressBar;
        if (progressBar != null) {
            if (progressBar instanceof SeekBar) {
                ((SeekBar) progressBar).setOnSeekBarChangeListener(this.f60341z);
            }
            this.f60320e.setMax(1000);
        }
        this.f60321f = (TextView) view.findViewById(q.f51111b);
        this.f60322g = (TextView) view.findViewById(q.f51110a);
        this.f60330o = new StringBuilder();
        this.f60331p = new Formatter(this.f60330o, Locale.getDefault());
        p();
    }

    private void p() {
        boolean z10;
        ImageButton imageButton = this.f60335t;
        boolean z11 = false;
        if (imageButton != null) {
            imageButton.setOnClickListener(this.f60328m);
            ImageButton imageButton2 = this.f60335t;
            if (this.f60328m != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            imageButton2.setEnabled(z10);
        }
        ImageButton imageButton3 = this.f60336u;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this.f60329n);
            ImageButton imageButton4 = this.f60336u;
            if (this.f60329n != null) {
                z11 = true;
            }
            imageButton4.setEnabled(z11);
        }
    }

    /* access modifiers changed from: private */
    public int r() {
        g gVar = this.f60316a;
        if (gVar == null || this.f60324i) {
            return 0;
        }
        int currentPosition = gVar.getCurrentPosition();
        int duration = this.f60316a.getDuration();
        ProgressBar progressBar = this.f60320e;
        if (progressBar != null) {
            if (duration > 0) {
                progressBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.f60320e.setSecondaryProgress(this.f60316a.getBufferPercentage() * 10);
        }
        TextView textView = this.f60321f;
        if (textView != null) {
            textView.setText(u(duration));
        }
        TextView textView2 = this.f60322g;
        if (textView2 != null) {
            textView2.setText(u(currentPosition));
        }
        return currentPosition;
    }

    /* access modifiers changed from: private */
    public String u(int i10) {
        int i11 = i10 / 1000;
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        this.f60330o.setLength(0);
        if (i14 > 0) {
            return this.f60331p.format("%d:%02d:%02d", new Object[]{Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12)}).toString();
        }
        return this.f60331p.format("%02d:%02d", new Object[]{Integer.valueOf(i13), Integer.valueOf(i12)}).toString();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (this.f60316a != null && isEnabled()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
                if (z10) {
                    l();
                    t(3000);
                    ImageButton imageButton = this.f60332q;
                    if (imageButton != null) {
                        imageButton.requestFocus();
                    }
                }
            } else if (keyCode == 126) {
                if (z10 && !this.f60316a.isPlaying()) {
                    this.f60316a.start();
                    x();
                    t(3000);
                }
                return true;
            } else if (keyCode == 86 || keyCode == 127) {
                if (z10 && this.f60316a.isPlaying()) {
                    this.f60316a.pause();
                    x();
                    t(3000);
                }
                return true;
            } else if (keyCode == 25 || keyCode == 24 || keyCode == 164) {
                return super.dispatchKeyEvent(keyEvent);
            } else {
                if (keyCode == 4 || keyCode == 82) {
                    if (z10) {
                        n();
                    }
                    return true;
                }
                t(3000);
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return true;
    }

    public void n() {
        ViewGroup viewGroup = this.f60318c;
        if (viewGroup != null) {
            try {
                viewGroup.removeView(this);
                this.f60338w.removeMessages(2);
            } catch (IllegalArgumentException unused) {
                Log.w("MediaController", "already removed");
            }
            this.f60323h = false;
        }
    }

    public void onFinishInflate() {
        View view = this.f60319d;
        if (view != null) {
            o(view);
        }
        super.onFinishInflate();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(e.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(e.class.getName());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        t(3000);
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        t(3000);
        return false;
    }

    /* access modifiers changed from: protected */
    public View q() {
        View inflate = ((LayoutInflater) this.f60317b.getSystemService("layout_inflater")).inflate(r.f51119a, (ViewGroup) null);
        this.f60319d = inflate;
        o(inflate);
        return this.f60319d;
    }

    public void s() {
        t(3000);
    }

    public void setAnchorView(ViewGroup viewGroup) {
        this.f60318c = viewGroup;
        if (this.f60319d == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            removeAllViews();
            addView(q(), layoutParams);
        }
    }

    public void setEnabled(boolean z10) {
        boolean z11;
        ImageButton imageButton = this.f60332q;
        if (imageButton != null) {
            imageButton.setEnabled(z10);
        }
        ImageButton imageButton2 = this.f60333r;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z10);
        }
        ImageButton imageButton3 = this.f60334s;
        if (imageButton3 != null) {
            imageButton3.setEnabled(z10);
        }
        ImageButton imageButton4 = this.f60335t;
        boolean z12 = false;
        if (imageButton4 != null) {
            if (!z10 || this.f60328m == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            imageButton4.setEnabled(z11);
        }
        ImageButton imageButton5 = this.f60336u;
        if (imageButton5 != null) {
            if (z10 && this.f60329n != null) {
                z12 = true;
            }
            imageButton5.setEnabled(z12);
        }
        ProgressBar progressBar = this.f60320e;
        if (progressBar != null) {
            progressBar.setEnabled(z10);
        }
        k();
        super.setEnabled(z10);
    }

    public void setMediaPlayer(g gVar) {
        this.f60316a = gVar;
        v();
    }

    public void t(int i10) {
        if (!this.f60323h && this.f60318c != null) {
            r();
            ImageButton imageButton = this.f60332q;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            k();
            this.f60318c.addView(this, new FrameLayout.LayoutParams(-1, -1));
            this.f60323h = true;
        }
        v();
        this.f60338w.sendEmptyMessage(2);
        Message obtainMessage = this.f60338w.obtainMessage(1);
        if (i10 != 0) {
            this.f60338w.removeMessages(1);
            this.f60338w.sendMessageDelayed(obtainMessage, (long) i10);
        }
    }

    public void v() {
        r();
        x();
        w();
    }

    public void w() {
        g gVar;
        if (this.f60319d != null && this.f60337v != null && (gVar = this.f60316a) != null) {
            if (gVar.a()) {
                this.f60337v.setImageResource(p.f51109b);
            } else {
                this.f60337v.setImageResource(p.f51108a);
            }
        }
    }

    public void x() {
        g gVar;
        if (this.f60319d != null && this.f60332q != null && (gVar = this.f60316a) != null) {
            if (gVar.isPlaying()) {
                this.f60332q.setImageResource(ha.c.f44141a);
            } else {
                this.f60332q.setImageResource(ha.c.f44142b);
            }
        }
    }

    public e(Context context) {
        this(context, true);
    }
}
