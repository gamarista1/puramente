package com.revenuecat.purchases;

import Ff.d;
import com.BV.LinearGradient.LinearGradientManager;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import java.util.Map;
import kh.C6456i0;
import kh.M;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0004'(&)B@\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fBX\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\"\b\u0001\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR;\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/UiConfig;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "app", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "localizations", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableConfig", "<init>", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/UiConfig;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "getApp", "()Lcom/revenuecat/purchases/UiConfig$AppConfig;", "Ljava/util/Map;", "getLocalizations", "()Ljava/util/Map;", "getLocalizations$annotations", "()V", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig", "()Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig$annotations", "Companion", "$serializer", "AppConfig", "VariableConfig", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class UiConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: app  reason: collision with root package name */
    private final AppConfig f59458app;
    private final Map<LocaleId, Map<VariableLocalizationKey, String>> localizations;
    private final VariableConfig variableConfig;

    @C5985i
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB6\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nBJ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig;", "", "", "Lcom/revenuecat/purchases/ColorAlias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colors", "Lcom/revenuecat/purchases/FontAlias;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "fonts", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Ljh/d;Lih/f;)V", "Ljava/util/Map;", "getColors", "()Ljava/util/Map;", "getFonts", "Companion", "$serializer", "FontsConfig", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public static final class AppConfig {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {new M(ColorAlias$$serializer.INSTANCE, ColorScheme$$serializer.INSTANCE), new M(FontAlias$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE)};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Map<ColorAlias, ColorScheme> colors;
        private final Map<FontAlias, FontsConfig> fonts;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return UiConfig$AppConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C5985i
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0016\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "android", "<init>", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "getAndroid", "()Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "Companion", "$serializer", "FontInfo", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @InternalRevenueCatAPI
        public static final class FontsConfig {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {new C5983g("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", O.b(FontInfo.class), new d[]{O.b(FontInfo.GoogleFonts.class), O.b(FontInfo.Name.class)}, new C5978b[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0])};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

            /* renamed from: android  reason: collision with root package name */
            private final FontInfo f59459android;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C5985i
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "Companion", "GoogleFonts", "Name", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @InternalRevenueCatAPI
            public interface FontInfo {
                public static final Companion Companion = Companion.$$INSTANCE;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    private Companion() {
                    }

                    public final C5978b serializer() {
                        return new C5983g("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", O.b(FontInfo.class), new d[]{O.b(GoogleFonts.class), O.b(Name.class)}, new C5978b[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                @C5985i
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                @InternalRevenueCatAPI
                public static final class GoogleFonts implements FontInfo {
                    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                    private final String value;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final C5978b serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @C6521e
                    public /* synthetic */ GoogleFonts(int i10, String str, t0 t0Var) {
                        if (1 != (i10 & 1)) {
                            C6456i0.a(i10, 1, UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE.getDescriptor());
                        }
                        this.value = str;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof GoogleFonts) && C6496s.c(this.value, ((GoogleFonts) obj).value);
                    }

                    public final /* synthetic */ String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "GoogleFonts(value=" + this.value + ')';
                    }

                    public GoogleFonts(String str) {
                        C6496s.h(str, "value");
                        this.value = str;
                    }
                }

                @C5985i
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                @InternalRevenueCatAPI
                public static final class Name implements FontInfo {
                    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                    private final String value;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final C5978b serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @C6521e
                    public /* synthetic */ Name(int i10, String str, t0 t0Var) {
                        if (1 != (i10 & 1)) {
                            C6456i0.a(i10, 1, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE.getDescriptor());
                        }
                        this.value = str;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Name) && C6496s.c(this.value, ((Name) obj).value);
                    }

                    public final /* synthetic */ String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Name(value=" + this.value + ')';
                    }

                    public Name(String str) {
                        C6496s.h(str, "value");
                        this.value = str;
                    }
                }
            }

            @C6521e
            public /* synthetic */ FontsConfig(int i10, FontInfo fontInfo, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE.getDescriptor());
                }
                this.f59459android = fontInfo;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FontsConfig) && C6496s.c(this.f59459android, ((FontsConfig) obj).f59459android);
            }

            public final /* synthetic */ FontInfo getAndroid() {
                return this.f59459android;
            }

            public int hashCode() {
                return this.f59459android.hashCode();
            }

            public String toString() {
                return "FontsConfig(android=" + this.f59459android + ')';
            }

            public FontsConfig(FontInfo fontInfo) {
                C6496s.h(fontInfo, "android");
                this.f59459android = fontInfo;
            }
        }

        public AppConfig() {
            this((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void write$Self(AppConfig appConfig, jh.d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            if (dVar.q(fVar, 0) || !C6496s.c(appConfig.colors, mf.O.i())) {
                dVar.B(fVar, 0, bVarArr[0], appConfig.colors);
            }
            if (dVar.q(fVar, 1) || !C6496s.c(appConfig.fonts, mf.O.i())) {
                dVar.B(fVar, 1, bVarArr[1], appConfig.fonts);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppConfig)) {
                return false;
            }
            AppConfig appConfig = (AppConfig) obj;
            return C6496s.c(this.colors, appConfig.colors) && C6496s.c(this.fonts, appConfig.fonts);
        }

        public final /* synthetic */ Map getColors() {
            return this.colors;
        }

        public final /* synthetic */ Map getFonts() {
            return this.fonts;
        }

        public int hashCode() {
            return (this.colors.hashCode() * 31) + this.fonts.hashCode();
        }

        public String toString() {
            return "AppConfig(colors=" + this.colors + ", fonts=" + this.fonts + ')';
        }

        @C6521e
        public /* synthetic */ AppConfig(int i10, Map<ColorAlias, ColorScheme> map, Map map2, t0 t0Var) {
            this.colors = (i10 & 1) == 0 ? mf.O.i() : map;
            if ((i10 & 2) == 0) {
                this.fonts = mf.O.i();
            } else {
                this.fonts = map2;
            }
        }

        public AppConfig(Map<ColorAlias, ColorScheme> map, Map<FontAlias, FontsConfig> map2) {
            C6496s.h(map, LinearGradientManager.PROP_COLORS);
            C6496s.h(map2, "fonts");
            this.colors = map;
            this.fonts = map2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AppConfig(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? mf.O.i() : map, (i10 & 2) != 0 ? mf.O.i() : map2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return UiConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB3\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "", "", "", "variableCompatibilityMap", "functionCompatibilityMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/UiConfig$VariableConfig;Ljh/d;Lih/f;)V", "Ljava/util/Map;", "getVariableCompatibilityMap", "()Ljava/util/Map;", "getVariableCompatibilityMap$annotations", "()V", "getFunctionCompatibilityMap", "getFunctionCompatibilityMap$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public static final class VariableConfig {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Map<String, String> functionCompatibilityMap;
        private final Map<String, String> variableCompatibilityMap;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$VariableConfig$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return UiConfig$VariableConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            x0 x0Var = x0.f71726a;
            $childSerializers = new C5978b[]{new M(x0Var, x0Var), new M(x0Var, x0Var)};
        }

        public VariableConfig() {
            this((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ void getFunctionCompatibilityMap$annotations() {
        }

        public static /* synthetic */ void getVariableCompatibilityMap$annotations() {
        }

        public static final /* synthetic */ void write$Self(VariableConfig variableConfig, jh.d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            if (dVar.q(fVar, 0) || !C6496s.c(variableConfig.variableCompatibilityMap, mf.O.i())) {
                dVar.B(fVar, 0, bVarArr[0], variableConfig.variableCompatibilityMap);
            }
            if (dVar.q(fVar, 1) || !C6496s.c(variableConfig.functionCompatibilityMap, mf.O.i())) {
                dVar.B(fVar, 1, bVarArr[1], variableConfig.functionCompatibilityMap);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VariableConfig)) {
                return false;
            }
            VariableConfig variableConfig = (VariableConfig) obj;
            return C6496s.c(this.variableCompatibilityMap, variableConfig.variableCompatibilityMap) && C6496s.c(this.functionCompatibilityMap, variableConfig.functionCompatibilityMap);
        }

        public final /* synthetic */ Map getFunctionCompatibilityMap() {
            return this.functionCompatibilityMap;
        }

        public final /* synthetic */ Map getVariableCompatibilityMap() {
            return this.variableCompatibilityMap;
        }

        public int hashCode() {
            return (this.variableCompatibilityMap.hashCode() * 31) + this.functionCompatibilityMap.hashCode();
        }

        public String toString() {
            return "VariableConfig(variableCompatibilityMap=" + this.variableCompatibilityMap + ", functionCompatibilityMap=" + this.functionCompatibilityMap + ')';
        }

        @C6521e
        public /* synthetic */ VariableConfig(int i10, Map<String, String> map, Map map2, t0 t0Var) {
            this.variableCompatibilityMap = (i10 & 1) == 0 ? mf.O.i() : map;
            if ((i10 & 2) == 0) {
                this.functionCompatibilityMap = mf.O.i();
            } else {
                this.functionCompatibilityMap = map2;
            }
        }

        public VariableConfig(Map<String, String> map, Map<String, String> map2) {
            C6496s.h(map, "variableCompatibilityMap");
            C6496s.h(map2, "functionCompatibilityMap");
            this.variableCompatibilityMap = map;
            this.functionCompatibilityMap = map2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ VariableConfig(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? mf.O.i() : map, (i10 & 2) != 0 ? mf.O.i() : map2);
        }
    }

    public UiConfig() {
        this((AppConfig) null, (Map) null, (VariableConfig) null, 7, (DefaultConstructorMarker) null);
    }

    @C5985i(with = LocalizedVariableLocalizationKeyMapSerializer.class)
    public static /* synthetic */ void getLocalizations$annotations() {
    }

    public static /* synthetic */ void getVariableConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self(UiConfig uiConfig, jh.d dVar, f fVar) {
        if (dVar.q(fVar, 0) || !C6496s.c(uiConfig.f59458app, new AppConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null))) {
            dVar.B(fVar, 0, UiConfig$AppConfig$$serializer.INSTANCE, uiConfig.f59458app);
        }
        if (dVar.q(fVar, 1) || !C6496s.c(uiConfig.localizations, mf.O.i())) {
            dVar.B(fVar, 1, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, uiConfig.localizations);
        }
        if (dVar.q(fVar, 2) || !C6496s.c(uiConfig.variableConfig, new VariableConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null))) {
            dVar.B(fVar, 2, UiConfig$VariableConfig$$serializer.INSTANCE, uiConfig.variableConfig);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfig)) {
            return false;
        }
        UiConfig uiConfig = (UiConfig) obj;
        return C6496s.c(this.f59458app, uiConfig.f59458app) && C6496s.c(this.localizations, uiConfig.localizations) && C6496s.c(this.variableConfig, uiConfig.variableConfig);
    }

    public final /* synthetic */ AppConfig getApp() {
        return this.f59458app;
    }

    public final /* synthetic */ Map getLocalizations() {
        return this.localizations;
    }

    public final /* synthetic */ VariableConfig getVariableConfig() {
        return this.variableConfig;
    }

    public int hashCode() {
        return (((this.f59458app.hashCode() * 31) + this.localizations.hashCode()) * 31) + this.variableConfig.hashCode();
    }

    public String toString() {
        return "UiConfig(app=" + this.f59458app + ", localizations=" + this.localizations + ", variableConfig=" + this.variableConfig + ')';
    }

    @C6521e
    public /* synthetic */ UiConfig(int i10, AppConfig appConfig, @C5985i(with = LocalizedVariableLocalizationKeyMapSerializer.class) Map map, VariableConfig variableConfig2, t0 t0Var) {
        this.f59458app = (i10 & 1) == 0 ? new AppConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null) : appConfig;
        if ((i10 & 2) == 0) {
            this.localizations = mf.O.i();
        } else {
            this.localizations = map;
        }
        if ((i10 & 4) == 0) {
            this.variableConfig = new VariableConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.variableConfig = variableConfig2;
        }
    }

    public UiConfig(AppConfig appConfig, Map<LocaleId, ? extends Map<VariableLocalizationKey, String>> map, VariableConfig variableConfig2) {
        C6496s.h(appConfig, "app");
        C6496s.h(map, "localizations");
        C6496s.h(variableConfig2, "variableConfig");
        this.f59458app = appConfig;
        this.localizations = map;
        this.variableConfig = variableConfig2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiConfig(AppConfig appConfig, Map map, VariableConfig variableConfig2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new AppConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null) : appConfig, (i10 & 2) != 0 ? mf.O.i() : map, (i10 & 4) != 0 ? new VariableConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null) : variableConfig2);
    }
}
