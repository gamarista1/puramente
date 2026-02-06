package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBU\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001fR \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b$\u0010\u001c\u001a\u0004\b#\u0010\u001fR \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u0012\u0004\b&\u0010\u001c\u001a\u0004\b%\u0010\u001f¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "defaultValue", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "thumbColorOn", "thumbColorOff", "trackColorOn", "trackColorOff", "<init>", "(ZLcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IZLcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;Ljh/d;Lih/f;)V", "Z", "getDefaultValue", "()Z", "getDefaultValue$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getThumbColorOn", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getThumbColorOn$annotations", "getThumbColorOff", "getThumbColorOff$annotations", "getTrackColorOn", "getTrackColorOn$annotations", "getTrackColorOff", "getTrackColorOff$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class TabControlToggleComponent implements PaywallComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean defaultValue;
    private final ColorScheme thumbColorOff;
    private final ColorScheme thumbColorOn;
    private final ColorScheme trackColorOff;
    private final ColorScheme trackColorOn;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return TabControlToggleComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ TabControlToggleComponent(int i10, boolean z10, ColorScheme colorScheme, ColorScheme colorScheme2, ColorScheme colorScheme3, ColorScheme colorScheme4, t0 t0Var) {
        if (31 != (i10 & 31)) {
            C6456i0.a(i10, 31, TabControlToggleComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.defaultValue = z10;
        this.thumbColorOn = colorScheme;
        this.thumbColorOff = colorScheme2;
        this.trackColorOn = colorScheme3;
        this.trackColorOff = colorScheme4;
    }

    public static /* synthetic */ void getDefaultValue$annotations() {
    }

    public static /* synthetic */ void getThumbColorOff$annotations() {
    }

    public static /* synthetic */ void getThumbColorOn$annotations() {
    }

    public static /* synthetic */ void getTrackColorOff$annotations() {
    }

    public static /* synthetic */ void getTrackColorOn$annotations() {
    }

    public static final /* synthetic */ void write$Self(TabControlToggleComponent tabControlToggleComponent, d dVar, f fVar) {
        dVar.A(fVar, 0, tabControlToggleComponent.defaultValue);
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        dVar.B(fVar, 1, colorScheme$$serializer, tabControlToggleComponent.thumbColorOn);
        dVar.B(fVar, 2, colorScheme$$serializer, tabControlToggleComponent.thumbColorOff);
        dVar.B(fVar, 3, colorScheme$$serializer, tabControlToggleComponent.trackColorOn);
        dVar.B(fVar, 4, colorScheme$$serializer, tabControlToggleComponent.trackColorOff);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControlToggleComponent)) {
            return false;
        }
        TabControlToggleComponent tabControlToggleComponent = (TabControlToggleComponent) obj;
        return this.defaultValue == tabControlToggleComponent.defaultValue && C6496s.c(this.thumbColorOn, tabControlToggleComponent.thumbColorOn) && C6496s.c(this.thumbColorOff, tabControlToggleComponent.thumbColorOff) && C6496s.c(this.trackColorOn, tabControlToggleComponent.trackColorOn) && C6496s.c(this.trackColorOff, tabControlToggleComponent.trackColorOff);
    }

    public final /* synthetic */ boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final /* synthetic */ ColorScheme getThumbColorOff() {
        return this.thumbColorOff;
    }

    public final /* synthetic */ ColorScheme getThumbColorOn() {
        return this.thumbColorOn;
    }

    public final /* synthetic */ ColorScheme getTrackColorOff() {
        return this.trackColorOff;
    }

    public final /* synthetic */ ColorScheme getTrackColorOn() {
        return this.trackColorOn;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.defaultValue) * 31) + this.thumbColorOn.hashCode()) * 31) + this.thumbColorOff.hashCode()) * 31) + this.trackColorOn.hashCode()) * 31) + this.trackColorOff.hashCode();
    }

    public String toString() {
        return "TabControlToggleComponent(defaultValue=" + this.defaultValue + ", thumbColorOn=" + this.thumbColorOn + ", thumbColorOff=" + this.thumbColorOff + ", trackColorOn=" + this.trackColorOn + ", trackColorOff=" + this.trackColorOff + ')';
    }

    public TabControlToggleComponent(boolean z10, ColorScheme colorScheme, ColorScheme colorScheme2, ColorScheme colorScheme3, ColorScheme colorScheme4) {
        C6496s.h(colorScheme, "thumbColorOn");
        C6496s.h(colorScheme2, "thumbColorOff");
        C6496s.h(colorScheme3, "trackColorOn");
        C6496s.h(colorScheme4, "trackColorOff");
        this.defaultValue = z10;
        this.thumbColorOn = colorScheme;
        this.thumbColorOff = colorScheme2;
        this.trackColorOn = colorScheme3;
        this.trackColorOff = colorScheme4;
    }
}
