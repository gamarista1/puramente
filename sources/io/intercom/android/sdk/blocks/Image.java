package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.widget.ImageView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ResizableImageView;
import j4.C3622i;

class Image {
    private final StyleType style;

    /* renamed from: io.intercom.android.sdk.blocks.Image$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
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
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.USER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.ADMIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.POST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x003e }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.ARTICLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.NOTE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.CONTAINER_CARD     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.CHAT_FULL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType     // Catch:{ NoSuchFieldError -> 0x006c }
                io.intercom.android.sdk.blocks.StyleType r1 = io.intercom.android.sdk.blocks.StyleType.CAROUSEL     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.Image.AnonymousClass1.<clinit>():void");
        }
    }

    Image(StyleType styleType) {
        this.style = styleType;
    }

    private int calculateChatFullPadding(Context context) {
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.intercom_chat_overlay_width);
        float dimension2 = resources.getDimension(R.dimen.intercom_chat_overlay_padding_right);
        float dimension3 = resources.getDimension(R.dimen.intercom_chat_overlay_text_margin_left);
        return (int) (((float) ScreenUtils.getScreenDimensions(context).x) - (dimension - (((dimension2 + dimension3) + resources.getDimension(R.dimen.intercom_chat_overlay_text_padding_left)) + resources.getDimension(R.dimen.intercom_chat_overlay_text_padding_right))));
    }

    private int getTotalViewPadding(Context context) {
        Resources resources = context.getResources();
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
            case 2:
            case 3:
                float dimension = resources.getDimension(R.dimen.intercom_avatar_size);
                float dimension2 = resources.getDimension(R.dimen.intercom_conversation_row_icon_spacer);
                return (int) (dimension + dimension2 + resources.getDimension(R.dimen.intercom_conversation_row_margin) + (resources.getDimension(R.dimen.intercom_cell_horizontal_padding) * 3.0f));
            case 4:
                return ((int) (resources.getDimension(R.dimen.intercom_cell_content_padding) + resources.getDimension(R.dimen.intercom_post_cell_padding))) * 2;
            case 5:
            case 6:
                return ((int) (resources.getDimension(R.dimen.intercom_cell_content_padding) + resources.getDimension(R.dimen.intercom_note_cell_padding) + resources.getDimension(R.dimen.intercom_note_layout_margin))) * 2;
            case 7:
                return ((int) (resources.getDimension(R.dimen.intercom_cell_content_padding) + resources.getDimension(R.dimen.intercom_note_cell_padding) + resources.getDimension(R.dimen.intercom_note_layout_margin))) * 2;
            case 8:
                return calculateChatFullPadding(context);
            case 9:
                return ((int) resources.getDimension(R.dimen.intercom_carousel_padding)) * 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public StyleType getStyle() {
        return this.style;
    }

    /* access modifiers changed from: protected */
    public void setBackground(ImageView imageView) {
        if (this.style == StyleType.CAROUSEL) {
            imageView.setBackgroundResource(R.drawable.intercom_square_image_preview);
        } else {
            imageView.setBackgroundResource(R.drawable.intercom_rounded_image_preview);
        }
    }

    /* access modifiers changed from: protected */
    public void setImageViewBounds(int i10, int i11, ResizableImageView resizableImageView, C3622i.a aVar) {
        int i12;
        resizableImageView.setTotalViewPadding(getTotalViewPadding(resizableImageView.getContext()));
        resizableImageView.setDisplayImageDimensions(i10, i11);
        Point imageDimens = resizableImageView.getImageDimens();
        int i13 = imageDimens.x;
        if (i13 > 0 && (i12 = imageDimens.y) > 0) {
            aVar.y(i13, i12);
        }
    }
}
