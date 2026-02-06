package io.intercom.android.sdk.blocks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.c;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.HeadingBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.SubheadingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

class Heading implements HeadingBlock, SubheadingBlock {
    private static final int LARGE_MARGIN_BOTTOM_DP = 32;
    private static final int LARGE_TEXT_SP = 24;
    private static final int MARGIN_BOTTOM_DP = 16;
    private static final int MEDIUM_TEXT_SP = 20;
    private static final int SMALL_TEXT_SP = 15;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    /* renamed from: io.intercom.android.sdk.blocks.Heading$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.intercom.android.sdk.blocks.StyleType[] r0 = io.intercom.android.sdk.blocks.StyleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType = r0
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.POST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.NOTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.ARTICLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.CONTAINER_CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x003e }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.CHAT_FULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.CAROUSEL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.Heading.AnonymousClass1.<clinit>():void");
        }
    }

    Heading(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    @SuppressLint({"WrongConstant"})
    private void applyGenericCarouselHeadingStyle(TextView textView, BlockMetadata blockMetadata) {
        textView.setBreakStrategy(0);
        textView.setTypeface((Typeface) null, 1);
        BlockUtils.setMarginBottom(textView, 16);
        String textColor = blockMetadata.getAppearance().getTextColor();
        if (!textColor.isEmpty()) {
            int parseColor = Color.parseColor(textColor);
            textView.setTextColor(parseColor);
            textView.setLinkTextColor(parseColor);
        }
    }

    private void styleAnnouncementHeading(TextView textView, int i10, int i11, int i12) {
        textView.setTextSize((float) i11);
        textView.setTextColor(i10);
        textView.setLinkTextColor(i10);
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.setLargeLineSpacing(textView);
        BlockUtils.setMarginBottom(textView, i12);
    }

    private void styleCarouselHeading1(TextView textView, BlockMetadata blockMetadata) {
        applyGenericCarouselHeadingStyle(textView, blockMetadata);
        textView.setTextSize(48.0f);
        textView.setLineSpacing((float) ScreenUtils.dpToPx(8.0f, textView.getContext()), 1.0f);
    }

    private void styleCarouselHeading2(TextView textView, BlockMetadata blockMetadata) {
        applyGenericCarouselHeadingStyle(textView, blockMetadata);
        textView.setTextSize(34.0f);
        textView.setLineSpacing((float) ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
    }

    private void styleChatHeading(TextView textView, int i10) {
        textView.setTextSize(15.0f);
        textView.setTextColor(i10);
        textView.setLinkTextColor(i10);
        BlockUtils.setSmallLineSpacing(textView);
        BlockUtils.setDefaultMarginBottom(textView);
    }

    public View addHeading(Spanned spanned, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        int i10;
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams(textView, -2, -2);
        ConfigModules configModules = this.appConfigProvider.get().getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel actionContrastWhite = configModules.getCustomization().getActionContrastWhite();
            if (actionContrastWhite == null) {
                actionContrastWhite = configModules.getCustomization().getAction();
            }
            i10 = Color.parseColor(actionContrastWhite.getBackgroundColor());
        } else {
            i10 = -16777216;
        }
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
                styleAnnouncementHeading(textView, ColorUtils.lightenColor(i10), LARGE_TEXT_SP, 32);
                FontUtils.setRobotoLightTypeface(textView);
                break;
            case 2:
                styleAnnouncementHeading(textView, ColorUtils.primaryOrBlackAccessibility(context, this.appConfigProvider.get()), LARGE_TEXT_SP, 32);
                break;
            case 3:
                styleAnnouncementHeading(textView, ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get()), LARGE_TEXT_SP, 32);
                break;
            case 4:
                styleAnnouncementHeading(textView, i10, 20, 32);
                break;
            case 5:
                styleChatHeading(textView, c.getColor(context, R.color.intercom_grey_800));
                textView.setTypeface((Typeface) null, 1);
                break;
            case 6:
                styleCarouselHeading1(textView, blockMetadata);
                break;
            default:
                styleChatHeading(textView, c.getColor(context, R.color.intercom_grey_800));
                textView.setTypeface((Typeface) null, 1);
                break;
        }
        textView.setText(spanned);
        textView.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity(textView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(textView);
        accessibilityUtils.addHeadingAnnouncement(textView);
        return textView;
    }

    public View addSubheading(Spanned spanned, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        int i10;
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams(textView, -2, -2);
        ConfigModules configModules = this.appConfigProvider.get().getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel actionContrastWhite = configModules.getCustomization().getActionContrastWhite();
            if (actionContrastWhite == null) {
                actionContrastWhite = configModules.getCustomization().getAction();
            }
            i10 = Color.parseColor(actionContrastWhite.getBackgroundColor());
        } else {
            i10 = -16777216;
        }
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
                styleAnnouncementHeading(textView, ColorUtils.lightenColor(i10), 15, 16);
                FontUtils.setRobotoLightTypeface(textView);
                break;
            case 2:
            case 4:
                styleAnnouncementHeading(textView, i10, 15, 16);
                break;
            case 3:
                styleAnnouncementHeading(textView, ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get()), 15, 16);
                break;
            case 5:
                styleChatHeading(textView, c.getColor(context, R.color.intercom_grey_800));
                break;
            case 6:
                styleCarouselHeading2(textView, blockMetadata);
                break;
            default:
                styleChatHeading(textView, i10);
                break;
        }
        textView.setText(spanned);
        textView.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity(textView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(textView);
        accessibilityUtils.addHeadingAnnouncement(textView);
        return textView;
    }
}
