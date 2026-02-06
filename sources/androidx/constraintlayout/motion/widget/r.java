package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import androidx.constraintlayout.widget.h;
import g1.C2008c;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private int f14783a;

    /* renamed from: b  reason: collision with root package name */
    private int f14784b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14785c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f14786d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f14787e;

    /* renamed from: f  reason: collision with root package name */
    f f14788f;

    /* renamed from: g  reason: collision with root package name */
    d.a f14789g;

    /* renamed from: h  reason: collision with root package name */
    private int f14790h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f14791i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f14792j;

    /* renamed from: k  reason: collision with root package name */
    private String f14793k;

    /* renamed from: l  reason: collision with root package name */
    private int f14794l = 0;

    /* renamed from: m  reason: collision with root package name */
    private String f14795m = null;

    /* renamed from: n  reason: collision with root package name */
    private int f14796n = -1;

    /* renamed from: o  reason: collision with root package name */
    Context f14797o;

    /* renamed from: p  reason: collision with root package name */
    private int f14798p = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f14799q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f14800r = -1;

    /* renamed from: s  reason: collision with root package name */
    private int f14801s = -1;

    /* renamed from: t  reason: collision with root package name */
    private int f14802t = -1;

    /* renamed from: u  reason: collision with root package name */
    private int f14803u = -1;

    /* renamed from: v  reason: collision with root package name */
    private int f14804v = -1;

    class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2008c f14805a;

        a(C2008c cVar) {
            this.f14805a = cVar;
        }

        public float getInterpolation(float f10) {
            return (float) this.f14805a.a((double) f10);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f14807a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14808b;

        /* renamed from: c  reason: collision with root package name */
        long f14809c;

        /* renamed from: d  reason: collision with root package name */
        l f14810d;

        /* renamed from: e  reason: collision with root package name */
        int f14811e;

        /* renamed from: f  reason: collision with root package name */
        int f14812f;

        /* renamed from: g  reason: collision with root package name */
        g1.d f14813g = new g1.d();

        /* renamed from: h  reason: collision with root package name */
        s f14814h;

        /* renamed from: i  reason: collision with root package name */
        Interpolator f14815i;

        /* renamed from: j  reason: collision with root package name */
        boolean f14816j = false;

        /* renamed from: k  reason: collision with root package name */
        float f14817k;

        /* renamed from: l  reason: collision with root package name */
        float f14818l;

        /* renamed from: m  reason: collision with root package name */
        long f14819m;

        /* renamed from: n  reason: collision with root package name */
        Rect f14820n = new Rect();

        /* renamed from: o  reason: collision with root package name */
        boolean f14821o = false;

        b(s sVar, l lVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            float f10;
            this.f14814h = sVar;
            this.f14810d = lVar;
            this.f14811e = i10;
            this.f14812f = i11;
            long nanoTime = System.nanoTime();
            this.f14809c = nanoTime;
            this.f14819m = nanoTime;
            this.f14814h.b(this);
            this.f14815i = interpolator;
            this.f14807a = i13;
            this.f14808b = i14;
            if (i12 == 3) {
                this.f14821o = true;
            }
            if (i10 == 0) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f / ((float) i10);
            }
            this.f14818l = f10;
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.f14816j) {
                c();
            } else {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f14819m = nanoTime;
            float f10 = this.f14817k + (((float) (((double) (nanoTime - this.f14819m)) * 1.0E-6d)) * this.f14818l);
            this.f14817k = f10;
            if (f10 >= 1.0f) {
                this.f14817k = 1.0f;
            }
            Interpolator interpolator = this.f14815i;
            if (interpolator == null) {
                interpolation = this.f14817k;
            } else {
                interpolation = interpolator.getInterpolation(this.f14817k);
            }
            float f11 = interpolation;
            l lVar = this.f14810d;
            boolean u10 = lVar.u(lVar.f14656b, f11, nanoTime, this.f14813g);
            if (this.f14817k >= 1.0f) {
                if (this.f14807a != -1) {
                    this.f14810d.s().setTag(this.f14807a, Long.valueOf(System.nanoTime()));
                }
                if (this.f14808b != -1) {
                    this.f14810d.s().setTag(this.f14808b, (Object) null);
                }
                if (!this.f14821o) {
                    this.f14814h.f(this);
                }
            }
            if (this.f14817k < 1.0f || u10) {
                this.f14814h.d();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f14819m = nanoTime;
            float f10 = this.f14817k - (((float) (((double) (nanoTime - this.f14819m)) * 1.0E-6d)) * this.f14818l);
            this.f14817k = f10;
            if (f10 < 0.0f) {
                this.f14817k = 0.0f;
            }
            Interpolator interpolator = this.f14815i;
            if (interpolator == null) {
                interpolation = this.f14817k;
            } else {
                interpolation = interpolator.getInterpolation(this.f14817k);
            }
            float f11 = interpolation;
            l lVar = this.f14810d;
            boolean u10 = lVar.u(lVar.f14656b, f11, nanoTime, this.f14813g);
            if (this.f14817k <= 0.0f) {
                if (this.f14807a != -1) {
                    this.f14810d.s().setTag(this.f14807a, Long.valueOf(System.nanoTime()));
                }
                if (this.f14808b != -1) {
                    this.f14810d.s().setTag(this.f14808b, (Object) null);
                }
                this.f14814h.f(this);
            }
            if (this.f14817k > 0.0f || u10) {
                this.f14814h.d();
            }
        }

        public void d(int i10, float f10, float f11) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f14810d.s().getHitRect(this.f14820n);
                    if (!this.f14820n.contains((int) f10, (int) f11) && !this.f14816j) {
                        e(true);
                    }
                }
            } else if (!this.f14816j) {
                e(true);
            }
        }

        /* access modifiers changed from: package-private */
        public void e(boolean z10) {
            int i10;
            float f10;
            this.f14816j = z10;
            if (z10 && (i10 = this.f14812f) != -1) {
                if (i10 == 0) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f / ((float) i10);
                }
                this.f14818l = f10;
            }
            this.f14814h.d();
            this.f14819m = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    r(android.content.Context r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r10.<init>()
            r2 = -1
            r10.f14784b = r2
            r3 = 0
            r10.f14785c = r3
            r10.f14786d = r3
            r10.f14790h = r2
            r10.f14791i = r2
            r10.f14794l = r3
            r4 = 0
            r10.f14795m = r4
            r10.f14796n = r2
            r10.f14798p = r2
            r10.f14799q = r2
            r10.f14800r = r2
            r10.f14801s = r2
            r10.f14802t = r2
            r10.f14803u = r2
            r10.f14804v = r2
            r10.f14797o = r11
            int r4 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
        L_0x002e:
            r5 = 1
            if (r4 == r5) goto L_0x00ed
            r6 = 3
            r7 = 2
            if (r4 == r7) goto L_0x004a
            if (r4 == r6) goto L_0x0039
            goto L_0x00e0
        L_0x0039:
            java.lang.String r4 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            boolean r4 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            if (r4 == 0) goto L_0x00e0
            return
        L_0x0044:
            r11 = move-exception
            goto L_0x00e6
        L_0x0047:
            r11 = move-exception
            goto L_0x00ea
        L_0x004a:
            java.lang.String r4 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            int r8 = r4.hashCode()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r9 = 4
            switch(r8) {
                case -1962203927: goto L_0x007d;
                case -1239391468: goto L_0x0073;
                case 61998586: goto L_0x006b;
                case 366511058: goto L_0x0061;
                case 1791837707: goto L_0x0057;
                default: goto L_0x0056;
            }     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
        L_0x0056:
            goto L_0x0087
        L_0x0057:
            java.lang.String r8 = "CustomAttribute"
            boolean r8 = r4.equals(r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            if (r8 == 0) goto L_0x0087
            r8 = r6
            goto L_0x0088
        L_0x0061:
            java.lang.String r8 = "CustomMethod"
            boolean r8 = r4.equals(r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            if (r8 == 0) goto L_0x0087
            r8 = r9
            goto L_0x0088
        L_0x006b:
            boolean r8 = r4.equals(r1)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            if (r8 == 0) goto L_0x0087
            r8 = r3
            goto L_0x0088
        L_0x0073:
            java.lang.String r8 = "KeyFrameSet"
            boolean r8 = r4.equals(r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            if (r8 == 0) goto L_0x0087
            r8 = r5
            goto L_0x0088
        L_0x007d:
            java.lang.String r8 = "ConstraintOverride"
            boolean r8 = r4.equals(r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            if (r8 == 0) goto L_0x0087
            r8 = r7
            goto L_0x0088
        L_0x0087:
            r8 = r2
        L_0x0088:
            if (r8 == 0) goto L_0x00dd
            if (r8 == r5) goto L_0x00d5
            if (r8 == r7) goto L_0x00ce
            if (r8 == r6) goto L_0x00c6
            if (r8 == r9) goto L_0x00c6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.lang.String r6 = androidx.constraintlayout.motion.widget.a.a()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.lang.String r6 = " unknown tag "
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.lang.String r4 = r5.toString()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            android.util.Log.e(r1, r4)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.lang.String r5 = ".xml:"
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            int r5 = r12.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.lang.String r4 = r4.toString()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            android.util.Log.e(r1, r4)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            goto L_0x00e0
        L_0x00c6:
            androidx.constraintlayout.widget.d$a r4 = r10.f14789g     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            java.util.HashMap r4 = r4.f15006g     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            androidx.constraintlayout.widget.a.i(r11, r12, r4)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            goto L_0x00e0
        L_0x00ce:
            androidx.constraintlayout.widget.d$a r4 = androidx.constraintlayout.widget.d.m(r11, r12)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r10.f14789g = r4     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            goto L_0x00e0
        L_0x00d5:
            androidx.constraintlayout.motion.widget.f r4 = new androidx.constraintlayout.motion.widget.f     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r4.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            r10.f14788f = r4     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            goto L_0x00e0
        L_0x00dd:
            r10.l(r11, r12)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
        L_0x00e0:
            int r4 = r12.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0044 }
            goto L_0x002e
        L_0x00e6:
            android.util.Log.e(r1, r0, r11)
            goto L_0x00ed
        L_0x00ea:
            android.util.Log.e(r1, r0, r11)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.r.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(View[] viewArr) {
        if (this.f14798p != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.f14798p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f14799q != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.f14799q, (Object) null);
            }
        }
    }

    private void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15339T8);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == h.f15349U8) {
                this.f14783a = obtainStyledAttributes.getResourceId(index, this.f14783a);
            } else if (index == h.f15432c9) {
                if (MotionLayout.f14373w1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f14792j);
                    this.f14792j = resourceId;
                    if (resourceId == -1) {
                        this.f14793k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f14793k = obtainStyledAttributes.getString(index);
                } else {
                    this.f14792j = obtainStyledAttributes.getResourceId(index, this.f14792j);
                }
            } else if (index == h.f15443d9) {
                this.f14784b = obtainStyledAttributes.getInt(index, this.f14784b);
            } else if (index == h.f15476g9) {
                this.f14785c = obtainStyledAttributes.getBoolean(index, this.f14785c);
            } else if (index == h.f15454e9) {
                this.f14786d = obtainStyledAttributes.getInt(index, this.f14786d);
            } else if (index == h.f15389Y8) {
                this.f14790h = obtainStyledAttributes.getInt(index, this.f14790h);
            } else if (index == h.f15487h9) {
                this.f14791i = obtainStyledAttributes.getInt(index, this.f14791i);
            } else if (index == h.f15498i9) {
                this.f14787e = obtainStyledAttributes.getInt(index, this.f14787e);
            } else if (index == h.f15421b9) {
                int i11 = obtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f14796n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f14794l = -2;
                    }
                } else if (i11 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f14795m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f14794l = -1;
                    } else {
                        this.f14796n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f14794l = -2;
                    }
                } else {
                    this.f14794l = obtainStyledAttributes.getInteger(index, this.f14794l);
                }
            } else if (index == h.f15465f9) {
                this.f14798p = obtainStyledAttributes.getResourceId(index, this.f14798p);
            } else if (index == h.f15379X8) {
                this.f14799q = obtainStyledAttributes.getResourceId(index, this.f14799q);
            } else if (index == h.f15410a9) {
                this.f14800r = obtainStyledAttributes.getResourceId(index, this.f14800r);
            } else if (index == h.f15399Z8) {
                this.f14801s = obtainStyledAttributes.getResourceId(index, this.f14801s);
            } else if (index == h.f15369W8) {
                this.f14803u = obtainStyledAttributes.getResourceId(index, this.f14803u);
            } else if (index == h.f15359V8) {
                this.f14802t = obtainStyledAttributes.getInteger(index, this.f14802t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void n(o.b bVar, View view) {
        int i10 = this.f14790h;
        if (i10 != -1) {
            bVar.E(i10);
        }
        bVar.G(this.f14786d);
        bVar.F(this.f14794l, this.f14795m, this.f14796n);
        int id2 = view.getId();
        f fVar = this.f14788f;
        if (fVar != null) {
            ArrayList d10 = fVar.d(-1);
            f fVar2 = new f();
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                fVar2.c(((c) it.next()).b().h(id2));
            }
            bVar.t(fVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(s sVar, MotionLayout motionLayout, View view) {
        l lVar = new l(view);
        lVar.y(view);
        this.f14788f.a(lVar);
        lVar.F(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.f14790h, System.nanoTime());
        s sVar2 = sVar;
        l lVar2 = lVar;
        new b(sVar2, lVar2, this.f14790h, this.f14791i, this.f14784b, f(motionLayout.getContext()), this.f14798p, this.f14799q);
    }

    /* access modifiers changed from: package-private */
    public void c(s sVar, MotionLayout motionLayout, int i10, d dVar, View... viewArr) {
        if (!this.f14785c) {
            int i11 = this.f14787e;
            if (i11 == 2) {
                b(sVar, motionLayout, viewArr[0]);
                return;
            }
            if (i11 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i12 : constraintSetIds) {
                    if (i12 != i10) {
                        d o02 = motionLayout.o0(i12);
                        for (View id2 : viewArr) {
                            d.a v10 = o02.v(id2.getId());
                            d.a aVar = this.f14789g;
                            if (aVar != null) {
                                aVar.b(v10);
                                v10.f15006g.putAll(this.f14789g.f15006g);
                            }
                        }
                    }
                }
            }
            d dVar2 = new d();
            dVar2.q(dVar);
            for (View id3 : viewArr) {
                d.a v11 = dVar2.v(id3.getId());
                d.a aVar2 = this.f14789g;
                if (aVar2 != null) {
                    aVar2.b(v11);
                    v11.f15006g.putAll(this.f14789g.f15006g);
                }
            }
            motionLayout.M0(i10, dVar2);
            motionLayout.M0(g.f15139b, dVar);
            motionLayout.A0(g.f15139b, -1, -1);
            o.b bVar = new o.b(-1, motionLayout.f14451z, g.f15139b, i10);
            for (View n10 : viewArr) {
                n(bVar, n10);
            }
            motionLayout.setTransition(bVar);
            motionLayout.G0(new q(this, viewArr));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d(View view) {
        boolean z10;
        boolean z11;
        int i10 = this.f14800r;
        if (i10 != -1 && view.getTag(i10) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = this.f14801s;
        if (i11 == -1 || view.getTag(i11) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f14783a;
    }

    /* access modifiers changed from: package-private */
    public Interpolator f(Context context) {
        int i10 = this.f14794l;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f14796n);
        }
        if (i10 == -1) {
            return new a(C2008c.c(this.f14795m));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.f14802t;
    }

    public int h() {
        return this.f14803u;
    }

    public int i() {
        return this.f14784b;
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f14792j == -1 && this.f14793k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f14792j) {
            return true;
        }
        if (this.f14793k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f14893c0) != null && str.matches(this.f14793k)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m(int i10) {
        int i11 = this.f14784b;
        if (i11 == 1) {
            if (i10 == 0) {
                return true;
            }
            return false;
        } else if (i11 == 2) {
            if (i10 == 1) {
                return true;
            }
            return false;
        } else if (i11 == 3 && i10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "ViewTransition(" + a.c(this.f14797o, this.f14783a) + ")";
    }
}
