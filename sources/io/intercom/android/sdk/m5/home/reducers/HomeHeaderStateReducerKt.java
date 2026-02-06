package io.intercom.android.sdk.m5.home.reducers;

import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HeaderBackgroundModel;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import r0.C2544x0;
import r0.C2550z0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/models/ConfigModules;", "configModules", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "computeErrorHeader", "(Lio/intercom/android/sdk/models/ConfigModules;)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "Lio/intercom/android/sdk/models/TeamPresence;", "teamPresence", "", "isHeaderImageLoaded", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "computeContentHeader", "(Lio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/sdk/models/TeamPresence;Z)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "headerBackgroundModel", "Lr0/x0;", "fallbackBackgroundColor", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "getHeaderBackdropStyle-4WTKRHQ", "(Lio/intercom/android/sdk/models/HeaderBackgroundModel;J)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "getHeaderBackdropStyle", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeHeaderStateReducerKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.models.HeaderBackdropType[] r0 = io.intercom.android.sdk.models.HeaderBackdropType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.HeaderBackdropType r1 = io.intercom.android.sdk.models.HeaderBackdropType.SOLID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.HeaderBackdropType r1 = io.intercom.android.sdk.models.HeaderBackdropType.COLORS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.models.HeaderBackdropType r1 = io.intercom.android.sdk.models.HeaderBackdropType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.reducers.HomeHeaderStateReducerKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x02c7 A[LOOP:0: B:24:0x02c1->B:26:0x02c7, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader computeContentHeader(io.intercom.android.sdk.models.ConfigModules r19, io.intercom.android.sdk.models.TeamPresence r20, boolean r21) {
        /*
            java.lang.String r0 = "teamPresence"
            r1 = r20
            kotlin.jvm.internal.C6496s.h(r1, r0)
            r0 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r3 = "#000000"
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r19 == 0) goto L_0x02f5
            io.intercom.android.sdk.models.HomeConfig r5 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r5 = r5.getHeader()
            io.intercom.android.sdk.models.HeaderBackgroundModel r5 = r5.getBackground()
            io.intercom.android.sdk.models.HeaderBackdropType r5 = r5.getType()
            int[] r6 = io.intercom.android.sdk.m5.home.reducers.HomeHeaderStateReducerKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r7 = 2
            r8 = 3
            r9 = 1
            if (r5 == r9) goto L_0x0114
            if (r5 == r7) goto L_0x0114
            if (r5 != r8) goto L_0x010e
            if (r21 == 0) goto L_0x00bc
            kotlin.Pair r4 = new kotlin.Pair
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r5 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            io.intercom.android.sdk.models.HomeConfig r10 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r10 = r10.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r10 = r10.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r10 = r10.getIntro()
            java.lang.String r10 = r10.getText()
            io.intercom.android.sdk.models.HomeConfig r11 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r11 = r11.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r11 = r11.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r11 = r11.getIntro()
            java.lang.String r11 = r11.getColor()
            io.intercom.android.sdk.models.HomeConfig r12 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r12 = r12.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r12 = r12.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r12 = r12.getIntro()
            float r12 = r12.getOpacity()
            r5.<init>(r10, r11, r12)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r10 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            io.intercom.android.sdk.models.HomeConfig r11 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r11 = r11.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r11 = r11.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r11 = r11.getGreeting()
            java.lang.String r11 = r11.getText()
            io.intercom.android.sdk.models.HomeConfig r12 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r12 = r12.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r12 = r12.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r12 = r12.getGreeting()
            java.lang.String r12 = r12.getColor()
            io.intercom.android.sdk.models.HomeConfig r13 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r13 = r13.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r13 = r13.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r13 = r13.getGreeting()
            float r13 = r13.getOpacity()
            r10.<init>(r11, r12, r13)
            r4.<init>(r5, r10)
            goto L_0x019b
        L_0x00bc:
            kotlin.Pair r5 = new kotlin.Pair
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r10 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            io.intercom.android.sdk.models.HomeConfig r11 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r11 = r11.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r11 = r11.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r11 = r11.getIntro()
            java.lang.String r11 = r11.getText()
            io.intercom.android.sdk.models.CustomizationModel r12 = r19.getCustomization()
            io.intercom.android.sdk.models.CustomizationColorsModel r12 = r12.getHeader()
            java.lang.String r12 = r12.getForegroundColor()
            r10.<init>(r11, r12, r4)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r11 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            io.intercom.android.sdk.models.HomeConfig r12 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r12 = r12.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r12 = r12.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r12 = r12.getGreeting()
            java.lang.String r12 = r12.getText()
            io.intercom.android.sdk.models.CustomizationModel r13 = r19.getCustomization()
            io.intercom.android.sdk.models.CustomizationColorsModel r13 = r13.getHeader()
            java.lang.String r13 = r13.getForegroundColor()
            r11.<init>(r12, r13, r4)
            r5.<init>(r10, r11)
            r4 = r5
            goto L_0x019b
        L_0x010e:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0114:
            kotlin.Pair r4 = new kotlin.Pair
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r5 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            io.intercom.android.sdk.models.HomeConfig r10 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r10 = r10.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r10 = r10.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r10 = r10.getIntro()
            java.lang.String r10 = r10.getText()
            io.intercom.android.sdk.models.HomeConfig r11 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r11 = r11.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r11 = r11.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r11 = r11.getIntro()
            java.lang.String r11 = r11.getColor()
            io.intercom.android.sdk.models.HomeConfig r12 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r12 = r12.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r12 = r12.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r12 = r12.getIntro()
            float r12 = r12.getOpacity()
            r5.<init>(r10, r11, r12)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r10 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            io.intercom.android.sdk.models.HomeConfig r11 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r11 = r11.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r11 = r11.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r11 = r11.getGreeting()
            java.lang.String r11 = r11.getText()
            io.intercom.android.sdk.models.HomeConfig r12 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r12 = r12.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r12 = r12.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r12 = r12.getGreeting()
            java.lang.String r12 = r12.getColor()
            io.intercom.android.sdk.models.HomeConfig r13 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r13 = r13.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r13 = r13.getContent()
            io.intercom.android.sdk.models.HeaderTextModel r13 = r13.getGreeting()
            float r13 = r13.getOpacity()
            r10.<init>(r11, r12, r13)
            r4.<init>(r5, r10)
        L_0x019b:
            java.lang.Object r5 = r4.a()
            r14 = r5
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r14 = (io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.ColoredText) r14
            java.lang.Object r4 = r4.b()
            r13 = r4
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r13 = (io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.ColoredText) r13
            io.intercom.android.sdk.models.HomeConfig r4 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r4 = r4.getHeader()
            io.intercom.android.sdk.models.HeaderBackgroundModel r4 = r4.getBackground()
            io.intercom.android.sdk.models.HeaderBackdropType r4 = r4.getType()
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r9) goto L_0x0225
            if (r4 == r7) goto L_0x0225
            if (r4 != r8) goto L_0x021f
            if (r21 == 0) goto L_0x020b
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor r2 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor
            io.intercom.android.sdk.models.HomeConfig r3 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r3 = r3.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r3 = r3.getContent()
            io.intercom.android.sdk.models.CloseButtonModel r3 = r3.getCloseButton()
            java.lang.String r3 = r3.getBackgroundColor()
            io.intercom.android.sdk.models.HomeConfig r4 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r4 = r4.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r4 = r4.getContent()
            io.intercom.android.sdk.models.CloseButtonModel r4 = r4.getCloseButton()
            java.lang.String r4 = r4.getForegroundColor()
            io.intercom.android.sdk.models.HomeConfig r5 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r5 = r5.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r5 = r5.getContent()
            io.intercom.android.sdk.models.CloseButtonModel r5 = r5.getCloseButton()
            float r5 = r5.getBackgroundOpacity()
            r2.<init>(r3, r4, r5)
        L_0x0208:
            r18 = r2
            goto L_0x0267
        L_0x020b:
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor r4 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor
            io.intercom.android.sdk.models.CustomizationModel r5 = r19.getCustomization()
            io.intercom.android.sdk.models.CustomizationColorsModel r5 = r5.getHeader()
            java.lang.String r5 = r5.getForegroundColor()
            r4.<init>(r3, r5, r2)
            r18 = r4
            goto L_0x0267
        L_0x021f:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0225:
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor r2 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor
            io.intercom.android.sdk.models.HomeConfig r3 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r3 = r3.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r3 = r3.getContent()
            io.intercom.android.sdk.models.CloseButtonModel r3 = r3.getCloseButton()
            java.lang.String r3 = r3.getBackgroundColor()
            io.intercom.android.sdk.models.HomeConfig r4 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r4 = r4.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r4 = r4.getContent()
            io.intercom.android.sdk.models.CloseButtonModel r4 = r4.getCloseButton()
            java.lang.String r4 = r4.getForegroundColor()
            io.intercom.android.sdk.models.HomeConfig r5 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r5 = r5.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r5 = r5.getContent()
            io.intercom.android.sdk.models.CloseButtonModel r5 = r5.getCloseButton()
            float r5 = r5.getBackgroundOpacity()
            r2.<init>(r3, r4, r5)
            goto L_0x0208
        L_0x0267:
            io.intercom.android.sdk.models.HomeConfig r2 = r19.getHome()
            io.intercom.android.sdk.models.HeaderConfig r2 = r2.getHeader()
            io.intercom.android.sdk.models.HeaderContentModel r3 = r2.getContent()
            java.lang.String r3 = r3.getLogoUrl()
            boolean r3 = Sg.p.d0(r3)
            r11 = r3 ^ 1
            io.intercom.android.sdk.models.HeaderContentModel r3 = r2.getContent()
            java.lang.String r12 = r3.getLogoUrl()
            io.intercom.android.sdk.models.HeaderBackgroundModel r3 = r2.getBackground()
            io.intercom.android.sdk.models.CustomizationModel r4 = r19.getCustomization()
            io.intercom.android.sdk.models.CustomizationColorsModel r4 = r4.getHeader()
            java.lang.String r4 = r4.getBackgroundColor()
            r5 = 0
            long r4 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r4, r5, r9, r0)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle r15 = m360getHeaderBackdropStyle4WTKRHQ(r3, r4)
            io.intercom.android.sdk.models.HeaderContentModel r0 = r2.getContent()
            boolean r16 = r0.getShowAvatars()
            java.util.List r0 = r20.getBuiltActiveAdmins()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = mf.C6565s.V0(r0, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = mf.C6565s.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x02c1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02ec
            java.lang.Object r2 = r0.next()
            io.intercom.android.sdk.models.Participant r2 = (io.intercom.android.sdk.models.Participant) r2
            io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r3 = new io.intercom.android.sdk.m5.components.avatar.AvatarWrapper
            io.intercom.android.sdk.models.Avatar r4 = r2.getAvatar()
            java.lang.String r5 = "getAvatar(...)"
            kotlin.jvm.internal.C6496s.g(r4, r5)
            java.lang.Boolean r2 = r2.isBot()
            java.lang.String r5 = "isBot(...)"
            kotlin.jvm.internal.C6496s.g(r2, r5)
            boolean r2 = r2.booleanValue()
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L_0x02c1
        L_0x02ec:
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader r0 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader
            r10 = r0
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x02f5:
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r6 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            java.lang.String r1 = ""
            java.lang.String r5 = "#FFFFFF"
            r6.<init>(r1, r5, r4)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText r7 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$ColoredText
            r7.<init>(r1, r5, r4)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid r1 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid
            r0.x0$a r4 = r0.C2544x0.f25560b
            long r8 = r4.a()
            r4 = 0
            r1.<init>(r8, r4, r0)
            java.util.List r9 = mf.C6565s.n()
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor r10 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor
            r10.<init>(r3, r5, r2)
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader r0 = new io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader
            r4 = 0
            r8 = 0
            r3 = 0
            r2 = r0
            r5 = r7
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.reducers.HomeHeaderStateReducerKt.computeContentHeader(io.intercom.android.sdk.models.ConfigModules, io.intercom.android.sdk.models.TeamPresence, boolean):io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader");
    }

    public static final HomeUiState.Error.ErrorHeader computeErrorHeader(ConfigModules configModules) {
        if (configModules == null) {
            return new HomeUiState.Error.ErrorHeader("#000000", "#FFFFFF");
        }
        return new HomeUiState.Error.ErrorHeader(configModules.getCustomization().getHeader().getBackgroundColor(), configModules.getCustomization().getHeader().getForegroundColor());
    }

    /* renamed from: getHeaderBackdropStyle-4WTKRHQ  reason: not valid java name */
    public static final HomeUiState.Content.ContentHeader.HeaderBackdropStyle m360getHeaderBackdropStyle4WTKRHQ(HeaderBackgroundModel headerBackgroundModel, long j10) {
        List list;
        C6496s.h(headerBackgroundModel, "headerBackgroundModel");
        int i10 = WhenMappings.$EnumSwitchMapping$0[headerBackgroundModel.getType().ordinal()];
        if (i10 == 1) {
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(C2550z0.b(ColorUtils.parseColor(headerBackgroundModel.getColor())), headerBackgroundModel.getFade(), (DefaultConstructorMarker) null);
        }
        if (i10 == 2) {
            List<String> gradient = headerBackgroundModel.getGradient();
            if (gradient != null) {
                Iterable<String> iterable = gradient;
                list = new ArrayList(C6565s.y(iterable, 10));
                for (String parseColor : iterable) {
                    list.add(C2544x0.k(C2550z0.b(ColorUtils.parseColor(parseColor))));
                }
            } else {
                list = C6565s.q(C2544x0.k(j10), C2544x0.k(j10));
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(list, headerBackgroundModel.getFade());
        } else if (i10 == 3) {
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image(j10, headerBackgroundModel.getImageUrl(), headerBackgroundModel.getFade(), (DefaultConstructorMarker) null);
        } else {
            throw new C6535s();
        }
    }
}
