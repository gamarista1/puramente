package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.Background$Color$$serializer;
import com.revenuecat.purchases.paywalls.components.common.Background$Image$$serializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.C6448e0;
import kh.C6449f;
import kh.C6456i0;
import kh.H0;
import kh.I;
import kh.t0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6506E;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0007\u0018\u0000 g2\u00020\u0001:\u0004higjBÕ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0002¢\u0006\u0004\b$\u0010%Bå\u0001\b\u0017\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J(\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-HÇ\u0001¢\u0006\u0004\b0\u00101R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b=\u00109\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010@R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\bB\u00109\u001a\u0004\bA\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010C\u0012\u0004\bF\u00109\u001a\u0004\bD\u0010ER\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bJ\u00109\u001a\u0004\bH\u0010IR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bQ\u0010PR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\bY\u0010ZR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010[\u0012\u0004\b^\u00109\u001a\u0004\b\\\u0010]R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010_\u001a\u0004\b`\u0010aR\"\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010b\u0012\u0004\be\u00109\u001a\u0004\bc\u0010dR#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00028\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\bf\u00104¨\u0006k"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "pages", "", "initialPageIndex", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "pagePeek", "", "pageSpacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "pageControl", "", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "overrides", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;Ljh/d;Lih/f;)V", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Ljava/lang/Integer;", "getInitialPageIndex", "()Ljava/lang/Integer;", "getInitialPageIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getPagePeek", "getPagePeek$annotations", "Ljava/lang/Float;", "getPageSpacing", "()Ljava/lang/Float;", "getPageSpacing$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl$annotations", "Ljava/lang/Boolean;", "getLoop", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance$annotations", "getOverrides", "Companion", "$serializer", "AutoAdvancePages", "PageControl", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class CarouselComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {new C6449f(StackComponent$$serializer.INSTANCE), null, VerticalAlignment.Companion.serializer(), null, null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), null, null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null, new C6449f(ComponentOverride.Companion.serializer(PartialCarouselComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final List<ComponentOverride<PartialCarouselComponent>> overrides;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final List<StackComponent> pages;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return CarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ CarouselComponent(int i10, List list, Integer num, VerticalAlignment verticalAlignment, Size size2, Integer num2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, PageControl pageControl2, Boolean bool, AutoAdvancePages autoAdvancePages, List list2, t0 t0Var) {
        Size size3;
        Padding padding4;
        Padding padding5;
        List list3;
        int i11 = i10;
        if (5 != (i11 & 5)) {
            C6456i0.a(i10, 5, CarouselComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.pages = list;
        if ((i11 & 2) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        this.pageAlignment = verticalAlignment;
        if ((i11 & 8) == 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size3 = new Size(fit, fit);
        } else {
            size3 = size2;
        }
        this.size = size3;
        if ((i11 & 16) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i11 & 32) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f10;
        }
        if ((i11 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i11 & 128) == 0) {
            this.background = null;
        } else {
            this.background = background2;
        }
        if ((i11 & 256) == 0) {
            padding4 = Padding.Companion.getZero();
        } else {
            padding4 = padding2;
        }
        this.padding = padding4;
        if ((i11 & 512) == 0) {
            padding5 = Padding.Companion.getZero();
        } else {
            padding5 = padding3;
        }
        this.margin = padding5;
        if ((i11 & 1024) == 0) {
            this.shape = null;
        } else {
            this.shape = shape2;
        }
        if ((i11 & 2048) == 0) {
            this.border = null;
        } else {
            this.border = border2;
        }
        if ((i11 & 4096) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow2;
        }
        if ((i11 & 8192) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl2;
        }
        if ((i11 & 16384) == 0) {
            this.loop = null;
        } else {
            this.loop = bool;
        }
        if ((32768 & i11) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
        if ((i11 & 65536) == 0) {
            list3 = C6565s.n();
        } else {
            list3 = list2;
        }
        this.overrides = list3;
    }

    public static /* synthetic */ void getAutoAdvance$annotations() {
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getInitialPageIndex$annotations() {
    }

    public static /* synthetic */ void getPageAlignment$annotations() {
    }

    public static /* synthetic */ void getPageControl$annotations() {
    }

    public static /* synthetic */ void getPagePeek$annotations() {
    }

    public static /* synthetic */ void getPageSpacing$annotations() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (kotlin.jvm.internal.C6496s.c(r2, new com.revenuecat.purchases.paywalls.components.properties.Size(r4, r4)) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void write$Self(com.revenuecat.purchases.paywalls.components.CarouselComponent r5, jh.d r6, ih.f r7) {
        /*
            gh.b[] r0 = $childSerializers
            r1 = 0
            r2 = r0[r1]
            java.util.List<com.revenuecat.purchases.paywalls.components.StackComponent> r3 = r5.pages
            r6.B(r7, r1, r2, r3)
            r1 = 1
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            java.lang.Integer r2 = r5.initialPageIndex
            if (r2 == 0) goto L_0x001d
        L_0x0016:
            kh.I r2 = kh.I.f71604a
            java.lang.Integer r3 = r5.initialPageIndex
            r6.p(r7, r1, r2, r3)
        L_0x001d:
            r1 = 2
            r2 = r0[r1]
            com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment r3 = r5.pageAlignment
            r6.B(r7, r1, r2, r3)
            r1 = 3
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            com.revenuecat.purchases.paywalls.components.properties.Size r2 = r5.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r4 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r3.<init>(r4, r4)
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 != 0) goto L_0x0043
        L_0x003c:
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            r6.B(r7, r1, r2, r3)
        L_0x0043:
            r1 = 4
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            java.lang.Integer r2 = r5.pagePeek
            if (r2 == 0) goto L_0x0056
        L_0x004f:
            kh.I r2 = kh.I.f71604a
            java.lang.Integer r3 = r5.pagePeek
            r6.p(r7, r1, r2, r3)
        L_0x0056:
            r1 = 5
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            java.lang.Float r2 = r5.pageSpacing
            if (r2 == 0) goto L_0x0069
        L_0x0062:
            kh.C r2 = kh.C.f71587a
            java.lang.Float r3 = r5.pageSpacing
            r6.p(r7, r1, r2, r3)
        L_0x0069:
            r1 = 6
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r2 = r5.backgroundColor
            if (r2 == 0) goto L_0x007c
        L_0x0075:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.backgroundColor
            r6.p(r7, r1, r2, r3)
        L_0x007c:
            r1 = 7
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            com.revenuecat.purchases.paywalls.components.common.Background r2 = r5.background
            if (r2 == 0) goto L_0x008f
        L_0x0088:
            r2 = r0[r1]
            com.revenuecat.purchases.paywalls.components.common.Background r3 = r5.background
            r6.p(r7, r1, r2, r3)
        L_0x008f:
            r1 = 8
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0098
            goto L_0x00a6
        L_0x0098:
            com.revenuecat.purchases.paywalls.components.properties.Padding r2 = r5.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r3 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r3.getZero()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 != 0) goto L_0x00ad
        L_0x00a6:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            r6.B(r7, r1, r2, r3)
        L_0x00ad:
            r1 = 9
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x00b6
            goto L_0x00c4
        L_0x00b6:
            com.revenuecat.purchases.paywalls.components.properties.Padding r2 = r5.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r3 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r3.getZero()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 != 0) goto L_0x00cb
        L_0x00c4:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            r6.B(r7, r1, r2, r3)
        L_0x00cb:
            r1 = 10
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            com.revenuecat.purchases.paywalls.components.properties.Shape r2 = r5.shape
            if (r2 == 0) goto L_0x00df
        L_0x00d8:
            r2 = r0[r1]
            com.revenuecat.purchases.paywalls.components.properties.Shape r3 = r5.shape
            r6.p(r7, r1, r2, r3)
        L_0x00df:
            r1 = 11
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x00e8
            goto L_0x00ec
        L_0x00e8:
            com.revenuecat.purchases.paywalls.components.properties.Border r2 = r5.border
            if (r2 == 0) goto L_0x00f3
        L_0x00ec:
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            r6.p(r7, r1, r2, r3)
        L_0x00f3:
            r1 = 12
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x00fc
            goto L_0x0100
        L_0x00fc:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r2 = r5.shadow
            if (r2 == 0) goto L_0x0107
        L_0x0100:
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.Shadow r3 = r5.shadow
            r6.p(r7, r1, r2, r3)
        L_0x0107:
            r1 = 13
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl r2 = r5.pageControl
            if (r2 == 0) goto L_0x011b
        L_0x0114:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer r2 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl r3 = r5.pageControl
            r6.p(r7, r1, r2, r3)
        L_0x011b:
            r1 = 14
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0124
            goto L_0x0128
        L_0x0124:
            java.lang.Boolean r2 = r5.loop
            if (r2 == 0) goto L_0x012f
        L_0x0128:
            kh.i r2 = kh.C6455i.f71663a
            java.lang.Boolean r3 = r5.loop
            r6.p(r7, r1, r2, r3)
        L_0x012f:
            r1 = 15
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x0138
            goto L_0x013c
        L_0x0138:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r2 = r5.autoAdvance
            if (r2 == 0) goto L_0x0143
        L_0x013c:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer r2 = com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer.INSTANCE
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r3 = r5.autoAdvance
            r6.p(r7, r1, r2, r3)
        L_0x0143:
            r1 = 16
            boolean r2 = r6.q(r7, r1)
            if (r2 == 0) goto L_0x014c
            goto L_0x0158
        L_0x014c:
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialCarouselComponent>> r2 = r5.overrides
            java.util.List r3 = mf.C6565s.n()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 != 0) goto L_0x015f
        L_0x0158:
            r0 = r0[r1]
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialCarouselComponent>> r5 = r5.overrides
            r6.B(r7, r1, r0, r5)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent.write$Self(com.revenuecat.purchases.paywalls.components.CarouselComponent, jh.d, ih.f):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselComponent)) {
            return false;
        }
        CarouselComponent carouselComponent = (CarouselComponent) obj;
        return C6496s.c(this.pages, carouselComponent.pages) && C6496s.c(this.initialPageIndex, carouselComponent.initialPageIndex) && this.pageAlignment == carouselComponent.pageAlignment && C6496s.c(this.size, carouselComponent.size) && C6496s.c(this.pagePeek, carouselComponent.pagePeek) && C6496s.c(this.pageSpacing, carouselComponent.pageSpacing) && C6496s.c(this.backgroundColor, carouselComponent.backgroundColor) && C6496s.c(this.background, carouselComponent.background) && C6496s.c(this.padding, carouselComponent.padding) && C6496s.c(this.margin, carouselComponent.margin) && C6496s.c(this.shape, carouselComponent.shape) && C6496s.c(this.border, carouselComponent.border) && C6496s.c(this.shadow, carouselComponent.shadow) && C6496s.c(this.pageControl, carouselComponent.pageControl) && C6496s.c(this.loop, carouselComponent.loop) && C6496s.c(this.autoAdvance, carouselComponent.autoAdvance) && C6496s.c(this.overrides, carouselComponent.overrides);
    }

    public final /* synthetic */ AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final /* synthetic */ Boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ PageControl getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ Integer getPagePeek() {
        return this.pagePeek;
    }

    public final /* synthetic */ Float getPageSpacing() {
        return this.pageSpacing;
    }

    public final /* synthetic */ List getPages() {
        return this.pages;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = this.pages.hashCode() * 31;
        Integer num = this.initialPageIndex;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.pageAlignment.hashCode()) * 31) + this.size.hashCode()) * 31;
        Integer num2 = this.pagePeek;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f10 = this.pageSpacing;
        int hashCode4 = (hashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode5 = (hashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background2 = this.background;
        int hashCode6 = (((((hashCode5 + (background2 == null ? 0 : background2.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Shape shape2 = this.shape;
        int hashCode7 = (hashCode6 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode8 = (hashCode7 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        int hashCode9 = (hashCode8 + (shadow2 == null ? 0 : shadow2.hashCode())) * 31;
        PageControl pageControl2 = this.pageControl;
        int hashCode10 = (hashCode9 + (pageControl2 == null ? 0 : pageControl2.hashCode())) * 31;
        Boolean bool = this.loop;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        AutoAdvancePages autoAdvancePages = this.autoAdvance;
        if (autoAdvancePages != null) {
            i10 = autoAdvancePages.hashCode();
        }
        return ((hashCode11 + i10) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "CarouselComponent(pages=" + this.pages + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", size=" + this.size + ", pagePeek=" + this.pagePeek + ", pageSpacing=" + this.pageSpacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ", overrides=" + this.overrides + ')';
    }

    @C5985i
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "", "", "msTimePerPage", "msTransitionTime", "<init>", "(II)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IIILkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljh/d;Lih/f;)V", "I", "getMsTimePerPage", "()I", "getMsTimePerPage$annotations", "()V", "getMsTransitionTime", "getMsTransitionTime$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AutoAdvancePages {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final int msTimePerPage;
        private final int msTransitionTime;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CarouselComponent$AutoAdvancePages$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AutoAdvancePages(int i10, int i11) {
            this.msTimePerPage = i10;
            this.msTransitionTime = i11;
        }

        public static /* synthetic */ void getMsTimePerPage$annotations() {
        }

        public static /* synthetic */ void getMsTransitionTime$annotations() {
        }

        public static final /* synthetic */ void write$Self(AutoAdvancePages autoAdvancePages, jh.d dVar, f fVar) {
            dVar.i(fVar, 0, autoAdvancePages.msTimePerPage);
            dVar.i(fVar, 1, autoAdvancePages.msTransitionTime);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoAdvancePages)) {
                return false;
            }
            AutoAdvancePages autoAdvancePages = (AutoAdvancePages) obj;
            return this.msTimePerPage == autoAdvancePages.msTimePerPage && this.msTransitionTime == autoAdvancePages.msTransitionTime;
        }

        public final /* synthetic */ int getMsTimePerPage() {
            return this.msTimePerPage;
        }

        public final /* synthetic */ int getMsTransitionTime() {
            return this.msTransitionTime;
        }

        public int hashCode() {
            return (Integer.hashCode(this.msTimePerPage) * 31) + Integer.hashCode(this.msTransitionTime);
        }

        public String toString() {
            return "AutoAdvancePages(msTimePerPage=" + this.msTimePerPage + ", msTransitionTime=" + this.msTransitionTime + ')';
        }

        @C6521e
        public /* synthetic */ AutoAdvancePages(int i10, int i11, int i12, t0 t0Var) {
            if (3 != (i10 & 3)) {
                C6456i0.a(i10, 3, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE.getDescriptor());
            }
            this.msTimePerPage = i11;
            this.msTransitionTime = i12;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000 >2\u00020\u0001:\u0004?>@ABo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B\u0001\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÇ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b=\u0010<¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "position", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "active", "default", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "getPosition", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "Ljava/lang/Integer;", "getSpacing", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getActive", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getDefault", "Companion", "$serializer", "Indicator", "Position", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PageControl {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {Position.Companion.serializer(), null, null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Indicator active;
        private final ColorScheme backgroundColor;
        private final Border border;

        /* renamed from: default  reason: not valid java name */
        private final Indicator f2default;
        private final Padding margin;
        private final Padding padding;
        private final Position position;
        private final Shadow shadow;
        private final Shape shape;
        private final Integer spacing;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CarouselComponent$PageControl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bB<\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "", "Llf/E;", "width", "height", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILlf/E;Llf/E;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Ljh/d;Lih/f;)V", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Indicator {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final ColorScheme color;
            private final int height;
            private final int width;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ Indicator(int i10, int i11, ColorScheme colorScheme, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, colorScheme);
            }

            public static final /* synthetic */ void write$Self(Indicator indicator, jh.d dVar, f fVar) {
                H0 h02 = H0.f71602a;
                dVar.B(fVar, 0, h02, C6506E.a(indicator.width));
                dVar.B(fVar, 1, h02, C6506E.a(indicator.height));
                dVar.B(fVar, 2, ColorScheme$$serializer.INSTANCE, indicator.color);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Indicator)) {
                    return false;
                }
                Indicator indicator = (Indicator) obj;
                return this.width == indicator.width && this.height == indicator.height && C6496s.c(this.color, indicator.color);
            }

            public final /* synthetic */ ColorScheme getColor() {
                return this.color;
            }

            /* renamed from: getHeight-pVg5ArA  reason: not valid java name */
            public final /* synthetic */ int m70getHeightpVg5ArA() {
                return this.height;
            }

            /* renamed from: getWidth-pVg5ArA  reason: not valid java name */
            public final /* synthetic */ int m71getWidthpVg5ArA() {
                return this.width;
            }

            public int hashCode() {
                return (((C6506E.e(this.width) * 31) + C6506E.e(this.height)) * 31) + this.color.hashCode();
            }

            public String toString() {
                return "Indicator(width=" + C6506E.f(this.width) + ", height=" + C6506E.f(this.height) + ", color=" + this.color + ')';
            }

            @C6521e
            public /* synthetic */ Indicator(int i10, C6506E e10, C6506E e11, ColorScheme colorScheme, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, e10, e11, colorScheme, t0Var);
            }

            private Indicator(int i10, int i11, ColorScheme colorScheme) {
                C6496s.h(colorScheme, "color");
                this.width = i10;
                this.height = i11;
                this.color = colorScheme;
            }

            private Indicator(int i10, C6506E e10, C6506E e11, ColorScheme colorScheme, t0 t0Var) {
                if (7 != (i10 & 7)) {
                    C6456i0.a(i10, 7, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE.getDescriptor());
                }
                this.width = e10.i();
                this.height = e11.i();
                this.color = colorScheme;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Position {
            TOP,
            BOTTOM;
            
            /* access modifiers changed from: private */
            public static final Lazy $cachedSerializer$delegate = null;
            public static final Companion Companion = null;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ C5978b get$cachedSerializer() {
                    return (C5978b) Position.$cachedSerializer$delegate.getValue();
                }

                public final C5978b serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            static {
                Companion = new Companion((DefaultConstructorMarker) null);
                $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
            }
        }

        @C6521e
        public /* synthetic */ PageControl(int i10, Position position2, Integer num, Padding padding2, Padding padding3, ColorScheme colorScheme, Shape shape2, Border border2, Shadow shadow2, Indicator indicator, Indicator indicator2, t0 t0Var) {
            if (769 != (i10 & 769)) {
                C6456i0.a(i10, 769, CarouselComponent$PageControl$$serializer.INSTANCE.getDescriptor());
            }
            this.position = position2;
            if ((i10 & 2) == 0) {
                this.spacing = null;
            } else {
                this.spacing = num;
            }
            if ((i10 & 4) == 0) {
                this.padding = Padding.Companion.getZero();
            } else {
                this.padding = padding2;
            }
            if ((i10 & 8) == 0) {
                this.margin = Padding.Companion.getZero();
            } else {
                this.margin = padding3;
            }
            if ((i10 & 16) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = colorScheme;
            }
            if ((i10 & 32) == 0) {
                this.shape = null;
            } else {
                this.shape = shape2;
            }
            if ((i10 & 64) == 0) {
                this.border = null;
            } else {
                this.border = border2;
            }
            if ((i10 & 128) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow2;
            }
            this.active = indicator;
            this.f2default = indicator2;
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static final /* synthetic */ void write$Self(PageControl pageControl, jh.d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            dVar.B(fVar, 0, bVarArr[0], pageControl.position);
            if (dVar.q(fVar, 1) || pageControl.spacing != null) {
                dVar.p(fVar, 1, I.f71604a, pageControl.spacing);
            }
            if (dVar.q(fVar, 2) || !C6496s.c(pageControl.padding, Padding.Companion.getZero())) {
                dVar.B(fVar, 2, Padding$$serializer.INSTANCE, pageControl.padding);
            }
            if (dVar.q(fVar, 3) || !C6496s.c(pageControl.margin, Padding.Companion.getZero())) {
                dVar.B(fVar, 3, Padding$$serializer.INSTANCE, pageControl.margin);
            }
            if (dVar.q(fVar, 4) || pageControl.backgroundColor != null) {
                dVar.p(fVar, 4, ColorScheme$$serializer.INSTANCE, pageControl.backgroundColor);
            }
            if (dVar.q(fVar, 5) || pageControl.shape != null) {
                dVar.p(fVar, 5, bVarArr[5], pageControl.shape);
            }
            if (dVar.q(fVar, 6) || pageControl.border != null) {
                dVar.p(fVar, 6, Border$$serializer.INSTANCE, pageControl.border);
            }
            if (dVar.q(fVar, 7) || pageControl.shadow != null) {
                dVar.p(fVar, 7, Shadow$$serializer.INSTANCE, pageControl.shadow);
            }
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            dVar.B(fVar, 8, carouselComponent$PageControl$Indicator$$serializer, pageControl.active);
            dVar.B(fVar, 9, carouselComponent$PageControl$Indicator$$serializer, pageControl.f2default);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageControl)) {
                return false;
            }
            PageControl pageControl = (PageControl) obj;
            return this.position == pageControl.position && C6496s.c(this.spacing, pageControl.spacing) && C6496s.c(this.padding, pageControl.padding) && C6496s.c(this.margin, pageControl.margin) && C6496s.c(this.backgroundColor, pageControl.backgroundColor) && C6496s.c(this.shape, pageControl.shape) && C6496s.c(this.border, pageControl.border) && C6496s.c(this.shadow, pageControl.shadow) && C6496s.c(this.active, pageControl.active) && C6496s.c(this.f2default, pageControl.f2default);
        }

        public final /* synthetic */ Indicator getActive() {
            return this.active;
        }

        public final /* synthetic */ ColorScheme getBackgroundColor() {
            return this.backgroundColor;
        }

        public final /* synthetic */ Border getBorder() {
            return this.border;
        }

        public final /* synthetic */ Indicator getDefault() {
            return this.f2default;
        }

        public final /* synthetic */ Padding getMargin() {
            return this.margin;
        }

        public final /* synthetic */ Padding getPadding() {
            return this.padding;
        }

        public final /* synthetic */ Position getPosition() {
            return this.position;
        }

        public final /* synthetic */ Shadow getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ Shape getShape() {
            return this.shape;
        }

        public final /* synthetic */ Integer getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int hashCode = this.position.hashCode() * 31;
            Integer num = this.spacing;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
            ColorScheme colorScheme = this.backgroundColor;
            int hashCode3 = (hashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
            Shape shape2 = this.shape;
            int hashCode4 = (hashCode3 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
            Border border2 = this.border;
            int hashCode5 = (hashCode4 + (border2 == null ? 0 : border2.hashCode())) * 31;
            Shadow shadow2 = this.shadow;
            if (shadow2 != null) {
                i10 = shadow2.hashCode();
            }
            return ((((hashCode5 + i10) * 31) + this.active.hashCode()) * 31) + this.f2default.hashCode();
        }

        public String toString() {
            return "PageControl(position=" + this.position + ", spacing=" + this.spacing + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.f2default + ')';
        }

        public PageControl(Position position2, Integer num, Padding padding2, Padding padding3, ColorScheme colorScheme, Shape shape2, Border border2, Shadow shadow2, Indicator indicator, Indicator indicator2) {
            C6496s.h(position2, "position");
            C6496s.h(padding2, "padding");
            C6496s.h(padding3, "margin");
            C6496s.h(indicator, AppStateModule.APP_STATE_ACTIVE);
            C6496s.h(indicator2, "default");
            this.position = position2;
            this.spacing = num;
            this.padding = padding2;
            this.margin = padding3;
            this.backgroundColor = colorScheme;
            this.shape = shape2;
            this.border = border2;
            this.shadow = shadow2;
            this.active = indicator;
            this.f2default = indicator2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ PageControl(com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Position r15, java.lang.Integer r16, com.revenuecat.purchases.paywalls.components.properties.Padding r17, com.revenuecat.purchases.paywalls.components.properties.Padding r18, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19, com.revenuecat.purchases.paywalls.components.properties.Shape r20, com.revenuecat.purchases.paywalls.components.properties.Border r21, com.revenuecat.purchases.paywalls.components.properties.Shadow r22, com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator r23, com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
            /*
                r14 = this;
                r0 = r25
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r5 = r2
                goto L_0x000b
            L_0x0009:
                r5 = r16
            L_0x000b:
                r1 = r0 & 4
                if (r1 == 0) goto L_0x0017
                com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
                com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
                r6 = r1
                goto L_0x0019
            L_0x0017:
                r6 = r17
            L_0x0019:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0025
                com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
                com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
                r7 = r1
                goto L_0x0027
            L_0x0025:
                r7 = r18
            L_0x0027:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x002d
                r8 = r2
                goto L_0x002f
            L_0x002d:
                r8 = r19
            L_0x002f:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0035
                r9 = r2
                goto L_0x0037
            L_0x0035:
                r9 = r20
            L_0x0037:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x003d
                r10 = r2
                goto L_0x003f
            L_0x003d:
                r10 = r21
            L_0x003f:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0045
                r11 = r2
                goto L_0x0047
            L_0x0045:
                r11 = r22
            L_0x0047:
                r3 = r14
                r4 = r15
                r12 = r23
                r13 = r24
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.<init>(com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Position, java.lang.Integer, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator, com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public CarouselComponent(List<StackComponent> list, Integer num, VerticalAlignment verticalAlignment, Size size2, Integer num2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, PageControl pageControl2, Boolean bool, AutoAdvancePages autoAdvancePages, List<ComponentOverride<PartialCarouselComponent>> list2) {
        Padding padding4 = padding2;
        Padding padding5 = padding3;
        List<ComponentOverride<PartialCarouselComponent>> list3 = list2;
        C6496s.h(list, "pages");
        C6496s.h(verticalAlignment, "pageAlignment");
        C6496s.h(size2, "size");
        C6496s.h(padding4, "padding");
        C6496s.h(padding5, "margin");
        C6496s.h(list3, "overrides");
        this.pages = list;
        this.initialPageIndex = num;
        this.pageAlignment = verticalAlignment;
        this.size = size2;
        this.pagePeek = num2;
        this.pageSpacing = f10;
        this.backgroundColor = colorScheme;
        this.background = background2;
        this.padding = padding4;
        this.margin = padding5;
        this.shape = shape2;
        this.border = border2;
        this.shadow = shadow2;
        this.pageControl = pageControl2;
        this.loop = bool;
        this.autoAdvance = autoAdvancePages;
        this.overrides = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CarouselComponent(java.util.List r22, java.lang.Integer r23, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment r24, com.revenuecat.purchases.paywalls.components.properties.Size r25, java.lang.Integer r26, java.lang.Float r27, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r28, com.revenuecat.purchases.paywalls.components.common.Background r29, com.revenuecat.purchases.paywalls.components.properties.Padding r30, com.revenuecat.purchases.paywalls.components.properties.Padding r31, com.revenuecat.purchases.paywalls.components.properties.Shape r32, com.revenuecat.purchases.paywalls.components.properties.Border r33, com.revenuecat.purchases.paywalls.components.properties.Shadow r34, com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl r35, java.lang.Boolean r36, com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages r37, java.util.List r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r23
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0018
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r1.<init>(r3, r3)
            r7 = r1
            goto L_0x001a
        L_0x0018:
            r7 = r25
        L_0x001a:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0020
            r8 = r2
            goto L_0x0022
        L_0x0020:
            r8 = r26
        L_0x0022:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0028
            r9 = r2
            goto L_0x002a
        L_0x0028:
            r9 = r27
        L_0x002a:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0030
            r10 = r2
            goto L_0x0032
        L_0x0030:
            r10 = r28
        L_0x0032:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0038
            r11 = r2
            goto L_0x003a
        L_0x0038:
            r11 = r29
        L_0x003a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0046
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r12 = r1
            goto L_0x0048
        L_0x0046:
            r12 = r30
        L_0x0048:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0054
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r13 = r1
            goto L_0x0056
        L_0x0054:
            r13 = r31
        L_0x0056:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005c
            r14 = r2
            goto L_0x005e
        L_0x005c:
            r14 = r32
        L_0x005e:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0064
            r15 = r2
            goto L_0x0066
        L_0x0064:
            r15 = r33
        L_0x0066:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x006d
            r16 = r2
            goto L_0x006f
        L_0x006d:
            r16 = r34
        L_0x006f:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0076
            r17 = r2
            goto L_0x0078
        L_0x0076:
            r17 = r35
        L_0x0078:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007f
            r18 = r2
            goto L_0x0081
        L_0x007f:
            r18 = r36
        L_0x0081:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008a
            r19 = r2
            goto L_0x008c
        L_0x008a:
            r19 = r37
        L_0x008c:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0098
            java.util.List r0 = mf.C6565s.n()
            r20 = r0
            goto L_0x009a
        L_0x0098:
            r20 = r38
        L_0x009a:
            r3 = r21
            r4 = r22
            r6 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent.<init>(java.util.List, java.lang.Integer, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment, com.revenuecat.purchases.paywalls.components.properties.Size, java.lang.Integer, java.lang.Float, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl, java.lang.Boolean, com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
