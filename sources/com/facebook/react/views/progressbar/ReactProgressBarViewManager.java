package com.facebook.react.views.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.w0;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import e8.C3500a;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C3797c;
import m8.C3799d;

@Q7.a(name = "AndroidProgressBar")
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001JB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0012J!\u0010#\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0014¢\u0006\u0004\b1\u00102JY\u0010A\u001a\u00020@2\u0006\u0010\u000b\u001a\u0002032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bA\u0010BR,\u0010E\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130D0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/progressbar/a;", "Lcom/facebook/react/views/progressbar/b;", "Lm8/d;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/progressbar/a;", "view", "styleName", "Llf/M;", "setStyleAttr", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V", "", "color", "setColor", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Integer;)V", "", "indeterminate", "setIndeterminate", "(Lcom/facebook/react/views/progressbar/a;Z)V", "", "progress", "setProgress", "(Lcom/facebook/react/views/progressbar/a;D)V", "animating", "setAnimating", "value", "setTestID", "setTypeAttr", "createShadowNodeInstance", "()Lcom/facebook/react/views/progressbar/b;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Object;)V", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/progressbar/a;)V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "", "width", "Lcom/facebook/yoga/p;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J", "Ljava/util/WeakHashMap;", "Landroid/util/Pair;", "measuredStyles", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactProgressBarViewManager extends BaseViewManager<a, b> implements C3799d {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    /* access modifiers changed from: private */
    public static final Object progressBarCtorLock = new Object();
    private final w0 delegate = new C3797c(this);
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBar a(Context context, int i10) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, (AttributeSet) null, i10);
            }
            return progressBar;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
            if (r5.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L_0x0065;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "ReactNative"
                r1 = 16842871(0x1010077, float:2.3693892E-38)
                if (r5 == 0) goto L_0x007a
                int r2 = r5.hashCode()
                switch(r2) {
                    case -1955878649: goto L_0x005d;
                    case -1414214583: goto L_0x0050;
                    case -913872828: goto L_0x0043;
                    case -670403824: goto L_0x0036;
                    case -142408811: goto L_0x0029;
                    case 73190171: goto L_0x001c;
                    case 79996135: goto L_0x000f;
                    default: goto L_0x000e;
                }
            L_0x000e:
                goto L_0x0065
            L_0x000f:
                java.lang.String r2 = "Small"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x0018
                goto L_0x0065
            L_0x0018:
                r5 = 16842873(0x1010079, float:2.3693897E-38)
                return r5
            L_0x001c:
                java.lang.String r2 = "Large"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x0025
                goto L_0x0065
            L_0x0025:
                r5 = 16842874(0x101007a, float:2.36939E-38)
                return r5
            L_0x0029:
                java.lang.String r2 = "LargeInverse"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x0032
                goto L_0x0065
            L_0x0032:
                r5 = 16843401(0x1010289, float:2.3695377E-38)
                return r5
            L_0x0036:
                java.lang.String r2 = "Inverse"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x003f
                goto L_0x0065
            L_0x003f:
                r5 = 16843399(0x1010287, float:2.369537E-38)
                return r5
            L_0x0043:
                java.lang.String r2 = "Horizontal"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x004c
                goto L_0x0065
            L_0x004c:
                r5 = 16842872(0x1010078, float:2.3693894E-38)
                return r5
            L_0x0050:
                java.lang.String r2 = "SmallInverse"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x0059
                goto L_0x0065
            L_0x0059:
                r5 = 16843400(0x1010288, float:2.3695374E-38)
                return r5
            L_0x005d:
                java.lang.String r2 = "Normal"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x0079
            L_0x0065:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unknown ProgressBar style: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                U5.a.I(r0, r5)
            L_0x0079:
                return r1
            L_0x007a:
                java.lang.String r5 = "ProgressBar needs to have a style, null received"
                U5.a.I(r0, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.progressbar.ReactProgressBarViewManager.a.b(java.lang.String):int");
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        C6496s.h(context, "context");
        C6496s.h(readableMap, "localData");
        C6496s.h(readableMap2, "props");
        C6496s.h(readableMap3, "state");
        C6496s.h(pVar, "widthMode");
        C6496s.h(pVar2, "heightMode");
        a aVar = Companion;
        int b10 = aVar.b(readableMap2.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer valueOf = Integer.valueOf(b10);
        Pair<Integer, Integer> pair = weakHashMap.get(valueOf);
        if (pair == null) {
            ProgressBar a10 = aVar.a(context, b10);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a10.measure(makeMeasureSpec, makeMeasureSpec);
            pair = Pair.create(Integer.valueOf(a10.getMeasuredWidth()), Integer.valueOf(a10.getMeasuredHeight()));
            weakHashMap.put(valueOf, pair);
        }
        Pair pair2 = pair;
        return q.a(G.f((float) ((Number) pair2.first).intValue()), G.f((float) ((Number) pair2.second).intValue()));
    }

    @C3500a(name = "typeAttr")
    public void setTypeAttr(a aVar, String str) {
        C6496s.h(aVar, "view");
    }

    public void updateExtraData(a aVar, Object obj) {
        C6496s.h(aVar, "root");
        C6496s.h(obj, "extraData");
    }

    public b createShadowNodeInstance() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public a createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new a(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(a aVar) {
        C6496s.h(aVar, "view");
        aVar.a();
    }

    @C3500a(name = "animating")
    public void setAnimating(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setAnimating$ReactAndroid_release(z10);
    }

    @C3500a(customType = "Color", name = "color")
    public void setColor(a aVar, Integer num) {
        C6496s.h(aVar, "view");
        aVar.setColor$ReactAndroid_release(num);
    }

    @C3500a(name = "indeterminate")
    public void setIndeterminate(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setIndeterminate$ReactAndroid_release(z10);
    }

    @C3500a(name = "progress")
    public void setProgress(a aVar, double d10) {
        C6496s.h(aVar, "view");
        aVar.setProgress$ReactAndroid_release(d10);
    }

    @C3500a(name = "styleAttr")
    public void setStyleAttr(a aVar, String str) {
        C6496s.h(aVar, "view");
        aVar.setStyle$ReactAndroid_release(str);
    }

    public void setTestID(a aVar, String str) {
        C6496s.h(aVar, "view");
        super.setTestId(aVar, str);
    }
}
