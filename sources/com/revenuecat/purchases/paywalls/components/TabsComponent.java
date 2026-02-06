package com.revenuecat.purchases.paywalls.components;

import Ff.d;
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
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.C6448e0;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000 G2\u00020\u0001:\u0004HGIJB\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0013¢\u0006\u0004\b\u0019\u0010\u001aB\u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÇ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b.\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\bF\u0010E¨\u0006K"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "control", "", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "tabs", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;Ljava/util/List;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "getControl", "()Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "getOverrides", "Companion", "$serializer", "Tab", "TabControl", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class TabsComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, new C5983g("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", O.b(TabControl.class), new d[]{O.b(TabControl.Buttons.class), O.b(TabControl.Toggle.class)}, new C5978b[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]), new C6449f(TabsComponent$Tab$$serializer.INSTANCE), new C6449f(ComponentOverride.Companion.serializer(PartialTabsComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final TabControl control;
    private final Padding margin;
    private final List<ComponentOverride<PartialTabsComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final List<Tab> tabs;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return TabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public static final class Tab {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final StackComponent stack;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return TabsComponent$Tab$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ Tab(int i10, StackComponent stackComponent, t0 t0Var) {
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, TabsComponent$Tab$$serializer.INSTANCE.getDescriptor());
            }
            this.stack = stackComponent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Tab) && C6496s.c(this.stack, ((Tab) obj).stack);
        }

        public final /* synthetic */ StackComponent getStack() {
            return this.stack;
        }

        public int hashCode() {
            return this.stack.hashCode();
        }

        public String toString() {
            return "Tab(stack=" + this.stack + ')';
        }

        public Tab(StackComponent stackComponent) {
            C6496s.h(stackComponent, "stack");
            this.stack = stackComponent;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "", "Buttons", "Companion", "Toggle", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public interface TabControl {
        public static final Companion Companion = Companion.$$INSTANCE;

        @C5985i
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @InternalRevenueCatAPI
        public static final class Buttons implements TabControl {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final StackComponent stack;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return TabsComponent$TabControl$Buttons$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Buttons(int i10, StackComponent stackComponent, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, TabsComponent$TabControl$Buttons$$serializer.INSTANCE.getDescriptor());
                }
                this.stack = stackComponent;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Buttons) && C6496s.c(this.stack, ((Buttons) obj).stack);
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Buttons(stack=" + this.stack + ')';
            }

            public Buttons(StackComponent stackComponent) {
                C6496s.h(stackComponent, "stack");
                this.stack = stackComponent;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final C5978b serializer() {
                return new C5983g("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", O.b(TabControl.class), new d[]{O.b(Buttons.class), O.b(Toggle.class)}, new C5978b[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @C5985i
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @InternalRevenueCatAPI
        public static final class Toggle implements TabControl {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final StackComponent stack;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return TabsComponent$TabControl$Toggle$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Toggle(int i10, StackComponent stackComponent, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, TabsComponent$TabControl$Toggle$$serializer.INSTANCE.getDescriptor());
                }
                this.stack = stackComponent;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Toggle) && C6496s.c(this.stack, ((Toggle) obj).stack);
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Toggle(stack=" + this.stack + ')';
            }

            public Toggle(StackComponent stackComponent) {
                C6496s.h(stackComponent, "stack");
                this.stack = stackComponent;
            }
        }
    }

    @C6521e
    public /* synthetic */ TabsComponent(int i10, Size size2, Padding padding2, Padding padding3, ColorScheme colorScheme, Background background2, Shape shape2, Border border2, Shadow shadow2, TabControl tabControl, List list, List list2, t0 t0Var) {
        if (768 != (i10 & 768)) {
            C6456i0.a(i10, 768, TabsComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.size = (i10 & 1) == 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size2;
        if ((i10 & 2) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding2;
        }
        if ((i10 & 4) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding3;
        }
        if ((i10 & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i10 & 16) == 0) {
            this.background = null;
        } else {
            this.background = background2;
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
        this.control = tabControl;
        this.tabs = list;
        if ((i10 & 1024) == 0) {
            this.overrides = C6565s.n();
        } else {
            this.overrides = list2;
        }
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(TabsComponent tabsComponent, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || !C6496s.c(tabsComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.B(fVar, 0, Size$$serializer.INSTANCE, tabsComponent.size);
        }
        if (dVar.q(fVar, 1) || !C6496s.c(tabsComponent.padding, Padding.Companion.getZero())) {
            dVar.B(fVar, 1, Padding$$serializer.INSTANCE, tabsComponent.padding);
        }
        if (dVar.q(fVar, 2) || !C6496s.c(tabsComponent.margin, Padding.Companion.getZero())) {
            dVar.B(fVar, 2, Padding$$serializer.INSTANCE, tabsComponent.margin);
        }
        if (dVar.q(fVar, 3) || tabsComponent.backgroundColor != null) {
            dVar.p(fVar, 3, ColorScheme$$serializer.INSTANCE, tabsComponent.backgroundColor);
        }
        if (dVar.q(fVar, 4) || tabsComponent.background != null) {
            dVar.p(fVar, 4, bVarArr[4], tabsComponent.background);
        }
        if (dVar.q(fVar, 5) || tabsComponent.shape != null) {
            dVar.p(fVar, 5, bVarArr[5], tabsComponent.shape);
        }
        if (dVar.q(fVar, 6) || tabsComponent.border != null) {
            dVar.p(fVar, 6, Border$$serializer.INSTANCE, tabsComponent.border);
        }
        if (dVar.q(fVar, 7) || tabsComponent.shadow != null) {
            dVar.p(fVar, 7, Shadow$$serializer.INSTANCE, tabsComponent.shadow);
        }
        dVar.B(fVar, 8, bVarArr[8], tabsComponent.control);
        dVar.B(fVar, 9, bVarArr[9], tabsComponent.tabs);
        if (dVar.q(fVar, 10) || !C6496s.c(tabsComponent.overrides, C6565s.n())) {
            dVar.B(fVar, 10, bVarArr[10], tabsComponent.overrides);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsComponent)) {
            return false;
        }
        TabsComponent tabsComponent = (TabsComponent) obj;
        return C6496s.c(this.size, tabsComponent.size) && C6496s.c(this.padding, tabsComponent.padding) && C6496s.c(this.margin, tabsComponent.margin) && C6496s.c(this.backgroundColor, tabsComponent.backgroundColor) && C6496s.c(this.background, tabsComponent.background) && C6496s.c(this.shape, tabsComponent.shape) && C6496s.c(this.border, tabsComponent.border) && C6496s.c(this.shadow, tabsComponent.shadow) && C6496s.c(this.control, tabsComponent.control) && C6496s.c(this.tabs, tabsComponent.tabs) && C6496s.c(this.overrides, tabsComponent.overrides);
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

    public final /* synthetic */ TabControl getControl() {
        return this.control;
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

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ List getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        int hashCode = ((((this.size.hashCode() * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int i10 = 0;
        int hashCode2 = (hashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background2 = this.background;
        int hashCode3 = (hashCode2 + (background2 == null ? 0 : background2.hashCode())) * 31;
        Shape shape2 = this.shape;
        int hashCode4 = (hashCode3 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode5 = (hashCode4 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        if (shadow2 != null) {
            i10 = shadow2.hashCode();
        }
        return ((((((hashCode5 + i10) * 31) + this.control.hashCode()) * 31) + this.tabs.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TabsComponent(size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", control=" + this.control + ", tabs=" + this.tabs + ", overrides=" + this.overrides + ')';
    }

    public TabsComponent(Size size2, Padding padding2, Padding padding3, ColorScheme colorScheme, Background background2, Shape shape2, Border border2, Shadow shadow2, TabControl tabControl, List<Tab> list, List<ComponentOverride<PartialTabsComponent>> list2) {
        C6496s.h(size2, "size");
        C6496s.h(padding2, "padding");
        C6496s.h(padding3, "margin");
        C6496s.h(tabControl, "control");
        C6496s.h(list, "tabs");
        C6496s.h(list2, "overrides");
        this.size = size2;
        this.padding = padding2;
        this.margin = padding3;
        this.backgroundColor = colorScheme;
        this.background = background2;
        this.shape = shape2;
        this.border = border2;
        this.shadow = shadow2;
        this.control = tabControl;
        this.tabs = list;
        this.overrides = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TabsComponent(com.revenuecat.purchases.paywalls.components.properties.Size r17, com.revenuecat.purchases.paywalls.components.properties.Padding r18, com.revenuecat.purchases.paywalls.components.properties.Padding r19, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r20, com.revenuecat.purchases.paywalls.components.common.Background r21, com.revenuecat.purchases.paywalls.components.properties.Shape r22, com.revenuecat.purchases.paywalls.components.properties.Border r23, com.revenuecat.purchases.paywalls.components.properties.Shadow r24, com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl r25, java.util.List r26, java.util.List r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r16 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0011
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill r2 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r1.<init>(r2, r3)
            r5 = r1
            goto L_0x0013
        L_0x0011:
            r5 = r17
        L_0x0013:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x001f
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r6 = r1
            goto L_0x0021
        L_0x001f:
            r6 = r18
        L_0x0021:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x002d
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r7 = r1
            goto L_0x002f
        L_0x002d:
            r7 = r19
        L_0x002f:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r20
        L_0x0038:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r21
        L_0x0040:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r22
        L_0x0048:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r23
        L_0x0050:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0056
            r12 = r2
            goto L_0x0058
        L_0x0056:
            r12 = r24
        L_0x0058:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0062
            java.util.List r0 = mf.C6565s.n()
            r15 = r0
            goto L_0x0064
        L_0x0062:
            r15 = r27
        L_0x0064:
            r4 = r16
            r13 = r25
            r14 = r26
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TabsComponent.<init>(com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, com.revenuecat.purchases.paywalls.components.TabsComponent$TabControl, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
