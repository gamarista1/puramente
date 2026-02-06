package io.intercom.android.sdk.conversation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import j4.C3622i;
import java.util.ArrayList;
import java.util.List;
import l4.C3737c;

public class ReactionInputView extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex;
    private ReactionListener listener;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded;
    private final View.OnTouchListener touchListener;
    private final Twig twig;
    private final Vibrator vibrator;

    public ReactionInputView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private void resetView() {
        removeAllViews();
        this.reactionViews.clear();
    }

    /* access modifiers changed from: package-private */
    public void deselectViewAtIndex(int i10) {
        ImageView imageView = this.reactionViews.get(i10);
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    /* access modifiers changed from: package-private */
    public Integer getCurrentSelectedIndex() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i10);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void handleTouchUp() {
        Reaction reaction;
        Integer num = this.highlightedViewIndex;
        if (num != null && num.intValue() >= 0 && this.highlightedViewIndex.intValue() < this.reactionReply.getReactionSet().size() && (reaction = this.reactionReply.getReactionSet().get(this.highlightedViewIndex.intValue())) != null && (this.reactionReply.getReactionIndex() == null || reaction.getIndex() != this.reactionReply.getReactionIndex().intValue())) {
            this.reactionReply.setReactionIndex(reaction.getIndex());
            ReactionListener reactionListener = this.listener;
            if (reactionListener != null) {
                reactionListener.onReactionSelected(reaction);
            }
        }
        highlightSelectedReaction();
        this.highlightedViewIndex = null;
    }

    /* access modifiers changed from: package-private */
    public void highlightSelectedReaction() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i10);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                selectViewAtIndex(1.0f, i10);
            } else {
                deselectViewAtIndex(i10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(this.touchListener);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener((View.OnTouchListener) null);
    }

    public void preloadReactionImages(ReactionReply reactionReply2) {
        for (Reaction imageUrl : reactionReply2.getReactionSet()) {
            IntercomCoilKt.loadIntercomImage(getContext(), new C3622i.a(getContext()).d(imageUrl.getImageUrl()).a());
        }
    }

    /* access modifiers changed from: package-private */
    public void selectViewAtIndex(float f10, int i10) {
        ImageView imageView = this.reactionViews.get(i10);
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f10).scaleY(f10).setDuration(200).start();
        imageView.clearColorFilter();
    }

    public void setUpReactions(ReactionReply reactionReply2, boolean z10, ReactionListener reactionListener) {
        Context context = getContext();
        this.reactionReply = reactionReply2;
        this.listener = reactionListener;
        resetView();
        List<Reaction> reactionSet = reactionReply2.getReactionSet();
        int size = reactionSet.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < reactionSet.size()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(z11);
            frameLayout.setClipToPadding(z11);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(z11 ? 1 : 0, -1, 1.0f));
            final ImageView imageView = new ImageView(context);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.intercom_reaction_size);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            imageView.setPivotY((float) getResources().getDimensionPixelSize(R.dimen.intercom_reaction_offset));
            imageView.setPivotX((float) (dimensionPixelSize / 2));
            this.reactionViews.add(imageView);
            frameLayout.addView(imageView);
            Reaction reaction = reactionSet.get(i10);
            C3622i.a aVar = new C3622i.a(context);
            final int i11 = size;
            final boolean z12 = z10;
            AnonymousClass1 r11 = r0;
            final Context context2 = context;
            AnonymousClass1 r02 = new C3737c() {
                public void onError(Drawable drawable) {
                }

                public void onStart(Drawable drawable) {
                }

                public void onSuccess(Drawable drawable) {
                    imageView.setImageDrawable(drawable);
                    ReactionInputView reactionInputView = ReactionInputView.this;
                    int i10 = reactionInputView.reactionsLoaded + 1;
                    reactionInputView.reactionsLoaded = i10;
                    if (i10 != i11) {
                        return;
                    }
                    if (z12) {
                        reactionInputView.setVisibility(0);
                        ReactionInputView reactionInputView2 = ReactionInputView.this;
                        reactionInputView2.setY((float) (reactionInputView2.getHeight() + ScreenUtils.dpToPx(60.0f, context2)));
                        ReactionInputView.this.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300).start();
                        return;
                    }
                    reactionInputView.setVisibility(0);
                }
            };
            IntercomCoilKt.loadIntercomImage(context, aVar.C(r11).d(reaction.getImageUrl()).a());
            Integer reactionIndex = reactionReply2.getReactionIndex();
            if (reactionIndex != null && !reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                deselectViewAtIndex(i10);
            }
            addView(frameLayout);
            i10++;
            z11 = false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public void vibrateForSelection() {
        if (DeviceUtils.hasPermission(getContext(), "android.permission.VIBRATE")) {
            this.vibrator.vibrate(10);
        }
    }

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.twig = LumberMill.getLogger();
        this.highlightedViewIndex = null;
        this.reactionsLoaded = 0;
        this.touchListener = new View.OnTouchListener() {
            private final Rect touchRect = new Rect();

            private void handleTouchMove(MotionEvent motionEvent) {
                ReactionInputView.this.getHitRect(this.touchRect);
                if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    for (int i10 = 0; i10 < ReactionInputView.this.getChildCount(); i10++) {
                        ReactionInputView.this.getChildAt(i10).getHitRect(this.touchRect);
                        if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            Integer num = ReactionInputView.this.highlightedViewIndex;
                            if (num == null || num.intValue() != i10) {
                                ReactionInputView.this.vibrateForSelection();
                                ReactionInputView.this.selectViewAtIndex(ReactionInputView.REACTION_SCALE, i10);
                            }
                            ReactionInputView reactionInputView = ReactionInputView.this;
                            Integer num2 = reactionInputView.highlightedViewIndex;
                            if (num2 == null) {
                                Integer currentSelectedIndex = reactionInputView.getCurrentSelectedIndex();
                                if (!(currentSelectedIndex == null || currentSelectedIndex.intValue() == i10)) {
                                    ReactionInputView.this.deselectViewAtIndex(currentSelectedIndex.intValue());
                                }
                            } else if (num2.intValue() != i10) {
                                ReactionInputView reactionInputView2 = ReactionInputView.this;
                                reactionInputView2.deselectViewAtIndex(reactionInputView2.highlightedViewIndex.intValue());
                            }
                            ReactionInputView.this.highlightedViewIndex = Integer.valueOf(i10);
                        }
                    }
                    return;
                }
                ReactionInputView reactionInputView3 = ReactionInputView.this;
                if (reactionInputView3.highlightedViewIndex != null) {
                    reactionInputView3.highlightSelectedReaction();
                }
                ReactionInputView.this.highlightedViewIndex = null;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
                if (r3 != 2) goto L_0x0016;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                /*
                    r2 = this;
                    int r3 = r4.getActionMasked()
                    r0 = 1
                    if (r3 == 0) goto L_0x0013
                    if (r3 == r0) goto L_0x000d
                    r1 = 2
                    if (r3 == r1) goto L_0x0013
                    goto L_0x0016
                L_0x000d:
                    io.intercom.android.sdk.conversation.ReactionInputView r3 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    r3.handleTouchUp()
                    goto L_0x0016
                L_0x0013:
                    r2.handleTouchMove(r4)
                L_0x0016:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        this.reactionViews = new ArrayList();
        setVisibility(8);
        if (isInEditMode()) {
            this.vibrator = null;
        } else {
            this.vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }
}
