package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import j4.C3622i;
import java.util.ArrayList;
import java.util.List;
import lf.C6514M;

public class ConversationRatingCard implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    /* access modifiers changed from: private */
    public ConversationRating conversationRating;
    private final ColorFilter deselectedFilter;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            int indexOf = ConversationRatingCard.this.ratingViews.indexOf(view);
            if (indexOf != -1 && ConversationRatingCard.this.ratingViews.size() == ConversationRatingCard.this.conversationRating.getOptions().size()) {
                ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
                conversationRatingCard.rateConversation(conversationRatingCard.conversationRating, ConversationRatingCard.this.conversationRating.getOptions().get(indexOf));
                ConversationRatingCard.this.updateSelectedRating();
            }
        }
    };
    /* access modifiers changed from: private */
    public final List<ImageView> ratingViews;
    private LinearLayout rootLayout;

    ConversationRatingCard(Api api2, String str, Provider<AppConfig> provider) {
        this.api = api2;
        this.conversationId = str;
        this.appConfigProvider = provider;
        this.ratingViews = new ArrayList();
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }

    private View createConversationRatingBlock(ConversationRating conversationRating2, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.ratingViews.clear();
        this.conversationRating = conversationRating2;
        this.rootLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        updateViewVisibility();
        IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        intercomPrimaryButton.setText(context.getString(R.string.intercom_tell_us_more));
        intercomPrimaryButton.setOnClick(new a(this, context));
        setupRatingsLayout();
        updateSelectedRating();
        return this.rootLayout;
    }

    private void deselectView(ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(DESELECTED_RATING_SCALE).scaleY(DESELECTED_RATING_SCALE).setDuration(ANIMATION_DURATION_MS).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    private ConversationRatingOption findSelectedOption() {
        for (ConversationRatingOption next : this.conversationRating.getOptions()) {
            if (next.getIndex().equals(this.conversationRating.getRatingIndex())) {
                return next;
            }
        }
        return null;
    }

    private static String imageUrlForUnicode(String str) {
        return "https://js.intercomcdn.com/images/stickers/" + str + ".png";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$createConversationRatingBlock$0(Context context) {
        showRemarkDialog(context);
        return null;
    }

    private void selectView(float f10, ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f10).scaleY(f10).setDuration(ANIMATION_DURATION_MS).start();
        imageView.clearColorFilter();
    }

    private void setupRatingsLayout() {
        LinearLayout linearLayout = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        Context context = this.rootLayout.getContext();
        int dpToPx = ScreenUtils.dpToPx(RATING_VERTICAL_PADDING, context);
        int dpToPx2 = ScreenUtils.dpToPx(RATING_HORIZONTAL_PADDING, context);
        for (int i10 = 0; i10 < this.conversationRating.getOptions().size(); i10++) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, DESELECTED_RATING_SCALE));
            ImageView imageView = new ImageView(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intercom_conversation_rating_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
            layoutParams.setMargins(dpToPx2, dpToPx, dpToPx2, dpToPx);
            imageView.setLayoutParams(layoutParams);
            imageView.setLongClickable(false);
            IntercomCoilKt.loadIntercomImage(context, new C3622i.a(context).d(imageUrlForUnicode(this.conversationRating.getOptions().get(i10).getUnicode())).B(imageView).a());
            imageView.setOnClickListener(this.ratingClickListener);
            frameLayout.addView(imageView);
            linearLayout.addView(frameLayout);
            this.ratingViews.add(imageView);
        }
    }

    private void showRemarkDialog(Context context) {
        c.a aVar = new c.a(context);
        aVar.setTitle(R.string.intercom_tell_us_more);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dpToPx = ScreenUtils.dpToPx(DIALOG_HORIZONTAL_MARGIN, context);
        layoutParams.setMargins(dpToPx, 0, dpToPx, 0);
        final EditText editText = new EditText(context);
        editText.getBackground().mutate().setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_ATOP);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        aVar.setView((View) linearLayout);
        aVar.setPositiveButton(17039370, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                String obj = editText.getText().toString();
                ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
                conversationRatingCard.addRemarkToConversation(conversationRatingCard.conversationRating, obj);
            }
        });
        aVar.setNegativeButton(17039360, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.cancel();
            }
        });
        final c create = aVar.create();
        create.show();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z10) {
                if (z10 && create.getWindow() != null) {
                    create.getWindow().setSoftInputMode(5);
                }
            }
        });
        create.j(-1).setTextColor(this.appConfigProvider.get().getPrimaryColor());
        create.j(-2).setTextColor(this.appConfigProvider.get().getPrimaryColor());
    }

    /* access modifiers changed from: private */
    public void updateSelectedRating() {
        if (this.conversationRating.getOptions().size() == this.ratingViews.size()) {
            for (int i10 = 0; i10 < this.conversationRating.getOptions().size(); i10++) {
                ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i10);
                ImageView imageView = this.ratingViews.get(i10);
                if (this.conversationRating.getRatingIndex().intValue() == -1) {
                    selectView(DESELECTED_RATING_SCALE, imageView);
                } else if (this.conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
                    selectView(SELECTED_RATING_SCALE, imageView);
                } else {
                    deselectView(imageView);
                }
            }
        }
    }

    private void updateViewVisibility() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.rootLayout != null) {
            int i13 = 0;
            if (this.conversationRating.getRatingIndex().intValue() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean isEmpty = TextUtils.isEmpty(this.conversationRating.getRemark());
            TextView textView = (TextView) this.rootLayout.findViewById(R.id.rate_your_conversation_text_view);
            if (!isEmpty) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
            LinearLayout linearLayout = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
            if (!isEmpty) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
            if (!z10 || !isEmpty) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            intercomPrimaryButton.setVisibility(i12);
            LinearLayout linearLayout2 = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_you_rated_layout);
            if (isEmpty) {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            ConversationRatingOption findSelectedOption = findSelectedOption();
            if (findSelectedOption != null) {
                ImageView imageView = (ImageView) this.rootLayout.findViewById(R.id.intercom_you_rated_image_view);
                IntercomCoilKt.loadIntercomImage(imageView.getContext(), new C3622i.a(imageView.getContext()).d(imageUrlForUnicode(findSelectedOption.getUnicode())).B(imageView).a());
            }
        }
    }

    public View addConversationRatingBlock(ConversationRating conversationRating2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        return createConversationRatingBlock(conversationRating2, viewGroup);
    }

    /* access modifiers changed from: package-private */
    public void addRemarkToConversation(ConversationRating conversationRating2, String str) {
        if (TextUtils.isEmpty(conversationRating2.getRemark())) {
            conversationRating2.setRemark(str);
            this.api.addConversationRatingRemark(this.conversationId, str);
            updateViewVisibility();
        }
    }

    /* access modifiers changed from: package-private */
    public void rateConversation(ConversationRating conversationRating2, ConversationRatingOption conversationRatingOption) {
        if (!conversationRating2.getRatingIndex().equals(conversationRatingOption.getIndex())) {
            conversationRating2.setRatingIndex(conversationRatingOption.getIndex().intValue());
            this.api.rateConversation(this.conversationId, conversationRatingOption.getIndex().intValue());
            updateViewVisibility();
        }
    }
}
