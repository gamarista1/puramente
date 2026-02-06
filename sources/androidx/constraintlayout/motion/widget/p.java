package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.h;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

class p {

    /* renamed from: G  reason: collision with root package name */
    private static final float[][] f14745G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H  reason: collision with root package name */
    private static final float[][] f14746H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A  reason: collision with root package name */
    private float f14747A = 10.0f;

    /* renamed from: B  reason: collision with root package name */
    private float f14748B = 1.0f;

    /* renamed from: C  reason: collision with root package name */
    private float f14749C = Float.NaN;

    /* renamed from: D  reason: collision with root package name */
    private float f14750D = Float.NaN;

    /* renamed from: E  reason: collision with root package name */
    private int f14751E = 0;

    /* renamed from: F  reason: collision with root package name */
    private int f14752F = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f14753a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f14754b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f14755c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f14756d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f14757e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f14758f = -1;

    /* renamed from: g  reason: collision with root package name */
    private float f14759g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    private float f14760h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    float f14761i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    float f14762j = 0.5f;

    /* renamed from: k  reason: collision with root package name */
    private int f14763k = -1;

    /* renamed from: l  reason: collision with root package name */
    boolean f14764l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f14765m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f14766n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14767o = false;

    /* renamed from: p  reason: collision with root package name */
    private float[] f14768p = new float[2];

    /* renamed from: q  reason: collision with root package name */
    private int[] f14769q = new int[2];

    /* renamed from: r  reason: collision with root package name */
    private float f14770r;

    /* renamed from: s  reason: collision with root package name */
    private float f14771s;

    /* renamed from: t  reason: collision with root package name */
    private final MotionLayout f14772t;

    /* renamed from: u  reason: collision with root package name */
    private float f14773u = 4.0f;

    /* renamed from: v  reason: collision with root package name */
    private float f14774v = 1.2f;

    /* renamed from: w  reason: collision with root package name */
    private boolean f14775w = true;

    /* renamed from: x  reason: collision with root package name */
    private float f14776x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    private int f14777y = 0;

    /* renamed from: z  reason: collision with root package name */
    private float f14778z = 10.0f;

    class a implements View.OnTouchListener {
        a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class b implements NestedScrollView.e {
        b() {
        }

        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        }
    }

    p(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f14772t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == h.f15409a8) {
                this.f14756d = typedArray.getResourceId(index, this.f14756d);
            } else if (index == h.f15420b8) {
                int i11 = typedArray.getInt(index, this.f14753a);
                this.f14753a = i11;
                float[] fArr = f14745G[i11];
                this.f14760h = fArr[0];
                this.f14759g = fArr[1];
            } else if (index == h.f15258L7) {
                int i12 = typedArray.getInt(index, this.f14754b);
                this.f14754b = i12;
                float[][] fArr2 = f14746H;
                if (i12 < fArr2.length) {
                    float[] fArr3 = fArr2[i12];
                    this.f14765m = fArr3[0];
                    this.f14766n = fArr3[1];
                } else {
                    this.f14766n = Float.NaN;
                    this.f14765m = Float.NaN;
                    this.f14764l = true;
                }
            } else if (index == h.f15308Q7) {
                this.f14773u = typedArray.getFloat(index, this.f14773u);
            } else if (index == h.f15298P7) {
                this.f14774v = typedArray.getFloat(index, this.f14774v);
            } else if (index == h.f15318R7) {
                this.f14775w = typedArray.getBoolean(index, this.f14775w);
            } else if (index == h.f15268M7) {
                this.f14776x = typedArray.getFloat(index, this.f14776x);
            } else if (index == h.f15278N7) {
                this.f14778z = typedArray.getFloat(index, this.f14778z);
            } else if (index == h.f15431c8) {
                this.f14757e = typedArray.getResourceId(index, this.f14757e);
            } else if (index == h.f15338T7) {
                this.f14755c = typedArray.getInt(index, this.f14755c);
            } else if (index == h.f15328S7) {
                this.f14777y = typedArray.getInteger(index, 0);
            } else if (index == h.f15288O7) {
                this.f14758f = typedArray.getResourceId(index, 0);
            } else if (index == h.f15348U7) {
                this.f14763k = typedArray.getResourceId(index, this.f14763k);
            } else if (index == h.f15368W7) {
                this.f14747A = typedArray.getFloat(index, this.f14747A);
            } else if (index == h.f15378X7) {
                this.f14748B = typedArray.getFloat(index, this.f14748B);
            } else if (index == h.f15388Y7) {
                this.f14749C = typedArray.getFloat(index, this.f14749C);
            } else if (index == h.f15398Z7) {
                this.f14750D = typedArray.getFloat(index, this.f14750D);
            } else if (index == h.f15358V7) {
                this.f14751E = typedArray.getInt(index, this.f14751E);
            } else if (index == h.f15248K7) {
                this.f14752F = typedArray.getInt(index, this.f14752F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15238J7);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public float a(float f10, float f11) {
        return (f10 * this.f14765m) + (f11 * this.f14766n);
    }

    public int d() {
        return this.f14752F;
    }

    public int e() {
        return this.f14777y;
    }

    /* access modifiers changed from: package-private */
    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f14758f;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f14774v;
    }

    public float h() {
        return this.f14773u;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f14775w;
    }

    /* access modifiers changed from: package-private */
    public float j(float f10, float f11) {
        this.f14772t.n0(this.f14756d, this.f14772t.getProgress(), this.f14760h, this.f14759g, this.f14768p);
        float f12 = this.f14765m;
        if (f12 != 0.0f) {
            float[] fArr = this.f14768p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f10 * f12) / fArr[0];
        }
        float[] fArr2 = this.f14768p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f11 * this.f14766n) / fArr2[1];
    }

    public int k() {
        return this.f14751E;
    }

    public float l() {
        return this.f14747A;
    }

    public float m() {
        return this.f14748B;
    }

    public float n() {
        return this.f14749C;
    }

    public float o() {
        return this.f14750D;
    }

    /* access modifiers changed from: package-private */
    public RectF p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f14757e;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f14757e;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.f14767o;
    }

    /* access modifiers changed from: package-private */
    public void s(MotionEvent motionEvent, MotionLayout.f fVar, int i10, o oVar) {
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        MotionLayout.f fVar2 = fVar;
        if (this.f14764l) {
            t(motionEvent, fVar, i10, oVar);
            return;
        }
        fVar2.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14770r = motionEvent.getRawX();
            this.f14771s = motionEvent.getRawY();
            this.f14767o = false;
        } else if (action == 1) {
            this.f14767o = false;
            fVar2.d(1000);
            float c10 = fVar.c();
            float b10 = fVar.b();
            float progress = this.f14772t.getProgress();
            int i12 = this.f14756d;
            if (i12 != -1) {
                this.f14772t.n0(i12, progress, this.f14760h, this.f14759g, this.f14768p);
            } else {
                float min = (float) Math.min(this.f14772t.getWidth(), this.f14772t.getHeight());
                float[] fArr = this.f14768p;
                fArr[1] = this.f14766n * min;
                fArr[0] = min * this.f14765m;
            }
            float f15 = this.f14765m;
            float[] fArr2 = this.f14768p;
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            if (f15 != 0.0f) {
                f10 = c10 / f16;
            } else {
                f10 = b10 / f17;
            }
            if (!Float.isNaN(f10)) {
                f11 = (f10 / 3.0f) + progress;
            } else {
                f11 = progress;
            }
            if (f11 != 0.0f && f11 != 1.0f && (i11 = this.f14755c) != 3) {
                if (((double) f11) < 0.5d) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                if (i11 == 6) {
                    if (progress + f10 < 0.0f) {
                        f10 = Math.abs(f10);
                    }
                    f12 = 1.0f;
                }
                if (this.f14755c == 7) {
                    if (progress + f10 > 1.0f) {
                        f10 = -Math.abs(f10);
                    }
                    f12 = 0.0f;
                }
                this.f14772t.E0(this.f14755c, f12, f10);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.f14772t.setState(MotionLayout.j.FINISHED);
                }
            } else if (0.0f >= f11 || 1.0f <= f11) {
                this.f14772t.setState(MotionLayout.j.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f14771s;
            float rawX = motionEvent.getRawX() - this.f14770r;
            if (Math.abs((this.f14765m * rawX) + (this.f14766n * rawY)) > this.f14778z || this.f14767o) {
                float progress2 = this.f14772t.getProgress();
                if (!this.f14767o) {
                    this.f14767o = true;
                    this.f14772t.setProgress(progress2);
                }
                int i13 = this.f14756d;
                if (i13 != -1) {
                    this.f14772t.n0(i13, progress2, this.f14760h, this.f14759g, this.f14768p);
                } else {
                    float min2 = (float) Math.min(this.f14772t.getWidth(), this.f14772t.getHeight());
                    float[] fArr3 = this.f14768p;
                    fArr3[1] = this.f14766n * min2;
                    fArr3[0] = min2 * this.f14765m;
                }
                float f18 = this.f14765m;
                float[] fArr4 = this.f14768p;
                if (((double) Math.abs(((f18 * fArr4[0]) + (this.f14766n * fArr4[1])) * this.f14776x)) < 0.01d) {
                    float[] fArr5 = this.f14768p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f14765m != 0.0f) {
                    f13 = rawX / this.f14768p[0];
                } else {
                    f13 = rawY / this.f14768p[1];
                }
                float max = Math.max(Math.min(progress2 + f13, 1.0f), 0.0f);
                if (this.f14755c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f14755c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f14772t.getProgress();
                if (max != progress3) {
                    int i14 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i14 == 0 || progress3 == 1.0f) {
                        MotionLayout motionLayout = this.f14772t;
                        if (i14 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        motionLayout.g0(z10);
                    }
                    this.f14772t.setProgress(max);
                    fVar2.d(1000);
                    float c11 = fVar.c();
                    float b11 = fVar.b();
                    if (this.f14765m != 0.0f) {
                        f14 = c11 / this.f14768p[0];
                    } else {
                        f14 = b11 / this.f14768p[1];
                    }
                    this.f14772t.f14378C = f14;
                } else {
                    this.f14772t.f14378C = 0.0f;
                }
                this.f14770r = motionEvent.getRawX();
                this.f14771s = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0320  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.f r25, int r26, androidx.constraintlayout.motion.widget.o r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.a(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x0333
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01c1
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0341
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f14763k
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            int[] r12 = r0.f14769q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f14769q
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.f14769q
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00b3
        L_0x006c:
            int r12 = r0.f14756d
            if (r12 == r6) goto L_0x00b3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f14772t
            androidx.constraintlayout.motion.widget.l r12 = r13.p0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f14772t
            int r12 = r12.h()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x008a
            java.lang.String r9 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r9, r12)
            goto L_0x00b3
        L_0x008a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            int[] r11 = r0.f14769q
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.f14769q
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.f14769q
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00b3:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.f14771s
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.f14770r
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f2
            float r6 = r6 - r5
            goto L_0x00f9
        L_0x00f2:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f9
            float r6 = r6 + r5
        L_0x00f9:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x010b
            boolean r7 = r0.f14767o
            if (r7 == 0) goto L_0x0341
        L_0x010b:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f14772t
            float r7 = r7.getProgress()
            boolean r11 = r0.f14767o
            if (r11 != 0) goto L_0x011c
            r0.f14767o = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            r11.setProgress(r7)
        L_0x011c:
            int r11 = r0.f14756d
            r3 = -1
            if (r11 == r3) goto L_0x0145
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            float r5 = r0.f14760h
            float r13 = r0.f14759g
            float[] r14 = r0.f14768p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.n0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f14768p
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x0149
        L_0x0145:
            float[] r3 = r0.f14768p
            r3[r10] = r5
        L_0x0149:
            float r3 = r0.f14776x
            float r6 = r6 * r3
            float[] r3 = r0.f14768p
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f14772t
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01ae
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x016f
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0177
        L_0x016f:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            if (r6 != 0) goto L_0x0174
            r4 = r10
        L_0x0174:
            r3.g0(r4)
        L_0x0177:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.d(r3)
            float r3 = r25.c()
            float r1 = r25.b()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.f14378C = r1
            goto L_0x01b3
        L_0x01ae:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f14772t
            r3 = 0
            r1.f14378C = r3
        L_0x01b3:
            float r1 = r24.getRawX()
            r0.f14770r = r1
            float r1 = r24.getRawY()
            r0.f14771s = r1
            goto L_0x0341
        L_0x01c1:
            r0.f14767o = r4
            r6 = 16
            r1.d(r6)
            float r6 = r25.c()
            float r1 = r25.b()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f14772t
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f14772t
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f14763k
            r3 = -1
            if (r12 == r3) goto L_0x021c
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f14772t
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            int[] r12 = r0.f14769q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f14769q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f14769q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L_0x0216:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x0257
        L_0x021c:
            int r12 = r0.f14756d
            r3 = -1
            if (r12 == r3) goto L_0x0257
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f14772t
            androidx.constraintlayout.motion.widget.l r8 = r8.p0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            int r8 = r8.h()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f14772t
            int[] r12 = r0.f14769q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f14769q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f14769q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L_0x0216
        L_0x0257:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.f14756d
            r3 = -1
            if (r11 == r3) goto L_0x0294
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f14772t
            float r5 = r0.f14760h
            float r12 = r0.f14759g
            float[] r13 = r0.f14768p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.n0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f14768p
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x0298
        L_0x0294:
            float[] r3 = r0.f14768p
            r3[r10] = r5
        L_0x0298:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02be
            float r2 = r1 * r3
            float r4 = r0.f14776x
            float r2 = r2 * r4
            float[] r4 = r0.f14768p
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
        L_0x02bc:
            r4 = 0
            goto L_0x02c0
        L_0x02be:
            r2 = r7
            goto L_0x02bc
        L_0x02c0:
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0320
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0320
            int r4 = r0.f14755c
            r5 = 3
            if (r4 == r5) goto L_0x0320
            float r5 = r0.f14776x
            float r1 = r1 * r5
            float[] r5 = r0.f14768p
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e0
            r2 = 0
            goto L_0x02e2
        L_0x02e0:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02e2:
            r5 = 6
            if (r4 != r5) goto L_0x02f2
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02f0
            float r1 = java.lang.Math.abs(r1)
        L_0x02f0:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02f2:
            int r4 = r0.f14755c
            r5 = 7
            if (r4 != r5) goto L_0x0305
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0304
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x0304:
            r2 = 0
        L_0x0305:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f14772t
            int r5 = r0.f14755c
            float r1 = r1 * r3
            r4.E0(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0318
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0341
        L_0x0318:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f14772t
            androidx.constraintlayout.motion.widget.MotionLayout$j r2 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r1.setState(r2)
            goto L_0x0341
        L_0x0320:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x032b
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0341
        L_0x032b:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f14772t
            androidx.constraintlayout.motion.widget.MotionLayout$j r2 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r1.setState(r2)
            goto L_0x0341
        L_0x0333:
            float r1 = r24.getRawX()
            r0.f14770r = r1
            float r1 = r24.getRawY()
            r0.f14771s = r1
            r0.f14767o = r4
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.t(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$f, int, androidx.constraintlayout.motion.widget.o):void");
    }

    public String toString() {
        if (Float.isNaN(this.f14765m)) {
            return "rotation";
        }
        return this.f14765m + " , " + this.f14766n;
    }

    /* access modifiers changed from: package-private */
    public void u(float f10, float f11) {
        float f12;
        float progress = this.f14772t.getProgress();
        if (!this.f14767o) {
            this.f14767o = true;
            this.f14772t.setProgress(progress);
        }
        this.f14772t.n0(this.f14756d, progress, this.f14760h, this.f14759g, this.f14768p);
        float f13 = this.f14765m;
        float[] fArr = this.f14768p;
        if (((double) Math.abs((f13 * fArr[0]) + (this.f14766n * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f14768p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f14 = this.f14765m;
        if (f14 != 0.0f) {
            f12 = (f10 * f14) / this.f14768p[0];
        } else {
            f12 = (f11 * this.f14766n) / this.f14768p[1];
        }
        float max = Math.max(Math.min(progress + f12, 1.0f), 0.0f);
        if (max != this.f14772t.getProgress()) {
            this.f14772t.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(float f10, float f11) {
        float f12;
        int i10;
        this.f14767o = false;
        float progress = this.f14772t.getProgress();
        this.f14772t.n0(this.f14756d, progress, this.f14760h, this.f14759g, this.f14768p);
        float f13 = this.f14765m;
        float[] fArr = this.f14768p;
        float f14 = fArr[0];
        float f15 = this.f14766n;
        float f16 = fArr[1];
        float f17 = 0.0f;
        if (f13 != 0.0f) {
            f12 = (f10 * f13) / f14;
        } else {
            f12 = (f11 * f15) / f16;
        }
        if (!Float.isNaN(f12)) {
            progress += f12 / 3.0f;
        }
        if (progress != 0.0f && progress != 1.0f && (i10 = this.f14755c) != 3) {
            MotionLayout motionLayout = this.f14772t;
            if (((double) progress) >= 0.5d) {
                f17 = 1.0f;
            }
            motionLayout.E0(i10, f17, f12);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(float f10, float f11) {
        this.f14770r = f10;
        this.f14771s = f11;
    }

    public void x(boolean z10) {
        if (z10) {
            float[][] fArr = f14746H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f14745G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f14746H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f14745G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f14745G[this.f14753a];
        this.f14760h = fArr5[0];
        this.f14759g = fArr5[1];
        int i10 = this.f14754b;
        float[][] fArr6 = f14746H;
        if (i10 < fArr6.length) {
            float[] fArr7 = fArr6[i10];
            this.f14765m = fArr7[0];
            this.f14766n = fArr7[1];
        }
    }

    /* access modifiers changed from: package-private */
    public void y(float f10, float f11) {
        this.f14770r = f10;
        this.f14771s = f11;
        this.f14767o = false;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        View view;
        int i10 = this.f14756d;
        if (i10 != -1) {
            view = this.f14772t.findViewById(i10);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + a.c(this.f14772t.getContext(), this.f14756d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }
}
