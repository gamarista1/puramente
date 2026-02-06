package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3408e;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.C3432z;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.w0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.horcrux.svg.VirtualView;
import e8.C3500a;
import e8.C3501b;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.lang.reflect.Array;
import java.util.Locale;

class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();
    private static final c sMatrixDecompositionContext = new c();
    private static final double[] sTransformDecompositionArray = new double[16];
    protected final String mClassName;
    protected w0 mDelegate;
    protected final SVGClass svgClass;

    protected enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58850a;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|(3:53|54|56)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.horcrux.svg.VirtualViewManager$SVGClass[] r0 = com.horcrux.svg.VirtualViewManager.SVGClass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58850a = r0
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGGroup     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGPath     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGCircle     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGEllipse     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGLine     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGRect     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGText     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGTSpan     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGTextPath     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGImage     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGClipPath     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGDefs     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGUse     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGSymbol     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGLinearGradient     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGRadialGradient     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGPattern     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGMask     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFilter     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFeBlend     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFeColorMatrix     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFeFlood     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFeGaussianBlur     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFeMerge     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x012c }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGFeOffset     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGMarker     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f58850a     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.horcrux.svg.VirtualViewManager$SVGClass r1 = com.horcrux.svg.VirtualViewManager.SVGClass.RNSVGForeignObject     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.VirtualViewManager.b.<clinit>():void");
        }
    }

    static class c extends C3432z.a {

        /* renamed from: g  reason: collision with root package name */
        final double[] f58851g = new double[4];

        /* renamed from: h  reason: collision with root package name */
        final double[] f58852h = new double[3];

        /* renamed from: i  reason: collision with root package name */
        final double[] f58853i = new double[3];

        /* renamed from: j  reason: collision with root package name */
        final double[] f58854j = new double[3];

        /* renamed from: k  reason: collision with root package name */
        final double[] f58855k = new double[3];

        c() {
        }
    }

    static class d extends C3428v {
        d() {
        }

        @C3501b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i10, Dynamic dynamic) {
        }
    }

    protected VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    private static void decomposeMatrix() {
        c cVar = sMatrixDecompositionContext;
        double[] dArr = cVar.f58851g;
        double[] dArr2 = cVar.f58852h;
        double[] dArr3 = cVar.f58853i;
        double[] dArr4 = cVar.f58854j;
        double[] dArr5 = cVar.f58855k;
        if (!isZero(sTransformDecompositionArray[15])) {
            int[] iArr = new int[2];
            iArr[1] = 4;
            iArr[0] = 4;
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            double[] dArr7 = new double[16];
            for (int i10 = 0; i10 < 4; i10++) {
                for (int i11 = 0; i11 < 4; i11++) {
                    double[] dArr8 = sTransformDecompositionArray;
                    int i12 = (i10 * 4) + i11;
                    double d10 = dArr8[i12] / dArr8[15];
                    dArr6[i10][i11] = d10;
                    if (i11 == 3) {
                        d10 = 0.0d;
                    }
                    dArr7[i12] = d10;
                }
            }
            dArr7[15] = 1.0d;
            if (!isZero(C3432z.m(dArr7))) {
                if (!isZero(dArr6[0][3]) || !isZero(dArr6[1][3]) || !isZero(dArr6[2][3])) {
                    C3432z.q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, C3432z.t(C3432z.n(dArr7)), dArr);
                } else {
                    dArr[2] = 0.0d;
                    dArr[1] = 0.0d;
                    dArr[0] = 0.0d;
                    dArr[3] = 1.0d;
                }
                System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
                int[] iArr2 = new int[2];
                iArr2[1] = 3;
                iArr2[0] = 3;
                double[][] dArr9 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
                for (int i13 = 0; i13 < 3; i13++) {
                    double[] dArr10 = dArr9[i13];
                    double[] dArr11 = dArr6[i13];
                    dArr10[0] = dArr11[0];
                    dArr10[1] = dArr11[1];
                    dArr10[2] = dArr11[2];
                }
                double x10 = C3432z.x(dArr9[0]);
                dArr2[0] = x10;
                double[] y10 = C3432z.y(dArr9[0], x10);
                dArr9[0] = y10;
                double w10 = C3432z.w(y10, dArr9[1]);
                dArr3[0] = w10;
                double[] u10 = C3432z.u(dArr9[1], dArr9[0], 1.0d, -w10);
                dArr9[1] = u10;
                double w11 = C3432z.w(dArr9[0], u10);
                dArr3[0] = w11;
                double[] u11 = C3432z.u(dArr9[1], dArr9[0], 1.0d, -w11);
                dArr9[1] = u11;
                double x11 = C3432z.x(u11);
                dArr2[1] = x11;
                dArr9[1] = C3432z.y(dArr9[1], x11);
                dArr3[0] = dArr3[0] / dArr2[1];
                double w12 = C3432z.w(dArr9[0], dArr9[2]);
                dArr3[1] = w12;
                double[] u12 = C3432z.u(dArr9[2], dArr9[0], 1.0d, -w12);
                dArr9[2] = u12;
                double w13 = C3432z.w(dArr9[1], u12);
                dArr3[2] = w13;
                double[] u13 = C3432z.u(dArr9[2], dArr9[1], 1.0d, -w13);
                dArr9[2] = u13;
                double x12 = C3432z.x(u13);
                dArr2[2] = x12;
                double[] y11 = C3432z.y(dArr9[2], x12);
                dArr9[2] = y11;
                double d11 = dArr3[1];
                double d12 = dArr2[2];
                dArr3[1] = d11 / d12;
                dArr3[2] = dArr3[2] / d12;
                if (C3432z.w(dArr9[0], C3432z.v(dArr9[1], y11)) < 0.0d) {
                    for (int i14 = 0; i14 < 3; i14++) {
                        dArr2[i14] = dArr2[i14] * -1.0d;
                        double[] dArr12 = dArr9[i14];
                        dArr12[0] = dArr12[0] * -1.0d;
                        dArr12[1] = dArr12[1] * -1.0d;
                        dArr12[2] = dArr12[2] * -1.0d;
                    }
                }
                double[] dArr13 = dArr9[2];
                dArr5[0] = C3432z.s((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
                double[] dArr14 = dArr9[2];
                double d13 = dArr14[1];
                double d14 = dArr14[2];
                dArr5[1] = C3432z.s((-Math.atan2(-dArr14[0], Math.sqrt((d13 * d13) + (d14 * d14)))) * 57.29577951308232d);
                dArr5[2] = C3432z.s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
            }
        }
    }

    static RenderableView getRenderableViewByTag(int i10) {
        return mTagToRenderableView.get(i10);
    }

    /* access modifiers changed from: private */
    public void invalidateSvgView(V v10) {
        SvgView svgView = v10.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v10 instanceof m0) {
            ((m0) v10).B().clearChildCache();
        }
    }

    private static boolean isZero(double d10) {
        if (Double.isNaN(d10) || Math.abs(d10) >= EPSILON) {
            return false;
        }
        return true;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    static void runWhenViewIsAvailable(int i10, Runnable runnable) {
        mTagToRunnable.put(i10, runnable);
    }

    static void setRenderableView(int i10, RenderableView renderableView) {
        mTagToRenderableView.put(i10, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i10);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i10);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        k0.d(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        c cVar = sMatrixDecompositionContext;
        view.setTranslationX(G.h((float) cVar.f58854j[0]));
        view.setTranslationY(G.h((float) cVar.f58854j[1]));
        view.setRotation((float) cVar.f58855k[2]);
        view.setRotationX((float) cVar.f58855k[0]);
        view.setRotationY((float) cVar.f58855k[1]);
        view.setScaleX((float) cVar.f58852h[0]);
        view.setScaleY((float) cVar.f58852h[1]);
        double[] dArr = cVar.f58851g;
        if (dArr.length > 2) {
            float f10 = (float) dArr[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = -1.0f / f10;
            float f12 = C3408e.c().density;
            view.setCameraDistance(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return this.mClassName;
    }

    public Class<? extends C3428v> getShadowNodeClass() {
        return d.class;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3500a(name = "clipPath")
    public void setClipPath(V v10, String str) {
        v10.setClipPath(str);
    }

    @C3500a(name = "clipRule")
    public void setClipRule(V v10, int i10) {
        v10.setClipRule(i10);
    }

    @C3500a(name = "display")
    public void setDisplay(V v10, String str) {
        v10.setDisplay(str);
    }

    @C3500a(name = "markerEnd")
    public void setMarkerEnd(V v10, String str) {
        v10.setMarkerEnd(str);
    }

    @C3500a(name = "markerMid")
    public void setMarkerMid(V v10, String str) {
        v10.setMarkerMid(str);
    }

    @C3500a(name = "markerStart")
    public void setMarkerStart(V v10, String str) {
        v10.setMarkerStart(str);
    }

    @C3500a(name = "mask")
    public void setMask(V v10, String str) {
        v10.setMask(str);
    }

    @C3500a(name = "matrix")
    public void setMatrix(V v10, Dynamic dynamic) {
        v10.setMatrix(dynamic);
    }

    @C3500a(name = "name")
    public void setName(V v10, String str) {
        v10.setName(str);
    }

    @C3500a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v10, float f10) {
        v10.setOpacity(f10);
    }

    @C3500a(name = "pointerEvents")
    public void setPointerEvents(V v10, String str) {
        if (str == null) {
            v10.setPointerEvents(H.AUTO);
        } else {
            v10.setPointerEvents(H.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @C3500a(name = "responsible")
    public void setResponsible(V v10, boolean z10) {
        v10.setResponsible(z10);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, VirtualView virtualView) {
        super.addEventEmitters(h0Var, virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    public C3428v createShadowNodeInstance() {
        return new d();
    }

    /* access modifiers changed from: protected */
    public VirtualView createViewInstance(C3415h0 h0Var) {
        switch (b.f58850a[this.svgClass.ordinal()]) {
            case 1:
                return new C4916z(h0Var);
            case 2:
                return new H(h0Var);
            case 3:
                return new C4892b(h0Var);
            case 4:
                return new C4898h(h0Var);
            case 5:
                return new B(h0Var);
            case 6:
                return new O(h0Var);
            case 7:
                return new m0(h0Var);
            case 8:
                return new Z(h0Var);
            case 9:
                return new a0(h0Var);
            case 10:
                return new A(h0Var);
            case 11:
                return new C4893c(h0Var);
            case 12:
                return new C4896f(h0Var);
            case 13:
                return new n0(h0Var);
            case StdKeyDeserializer.TYPE_URL:
                return new Q(h0Var);
            case StdKeyDeserializer.TYPE_CLASS:
                return new C(h0Var);
            case 16:
                return new N(h0Var);
            case 17:
                return new I(h0Var);
            case 18:
                return new E(h0Var);
            case 19:
                return new C4911u(h0Var);
            case InboxPagingSource.PAGE_SIZE /*20*/:
                return new C4900j(h0Var);
            case 21:
                return new C4901k(h0Var);
            case 22:
                return new C4902l(h0Var);
            case 23:
                return new C4903m(h0Var);
            case 24:
                return new C4904n(h0Var);
            case 25:
                return new C4905o(h0Var);
            case 26:
                return new D(h0Var);
            case 27:
                return new C4913w(h0Var);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v10, ReadableArray readableArray) {
        v10.setMatrix(readableArray);
    }

    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, readableArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @C3500a(name = "transform")
    public void setTransform(V v10, Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Array) {
            setTransform((VirtualView) v10, dynamic.asArray());
        }
    }
}
