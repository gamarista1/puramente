package io.intercom.android.sdk.models;

import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Card;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AutoValue
public abstract class Link {
    public static final String ARTICLE_TYPE = "educate.article";
    public static final String HELP_CENTER_TYPE = "educate.help_center";
    public static final String SUGGESTION_TYPE = "educate.suggestion";

    public static final class Builder {
        List<Block.Builder> blocks;
        Card.Builder card;
        long created_at;

        /* renamed from: id  reason: collision with root package name */
        String f70036id;
        ReactionReply.Builder reactions_reply;
        long updated_at;

        public Link build() {
            ReactionReply build;
            String str = this.f70036id;
            if (str == null) {
                str = UUID.randomUUID().toString();
            }
            String str2 = str;
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.blocks));
            List<Block.Builder> list = this.blocks;
            if (list != null) {
                for (Block.Builder next : list) {
                    if (next != null) {
                        arrayList.add(next.build());
                    }
                }
            }
            ReactionReply.Builder builder = this.reactions_reply;
            if (builder == null) {
                build = ReactionReply.NULL;
            } else {
                build = builder.build();
            }
            ReactionReply reactionReply = build;
            Card.Builder builder2 = this.card;
            if (builder2 == null) {
                builder2 = new Card.Builder();
            }
            return new AutoValue_Link(str2, builder2.build(), arrayList, reactionReply, this.created_at, this.updated_at);
        }
    }

    public Author getAuthor() {
        return getCard().getAuthor();
    }

    public abstract List<Block> getBlocks();

    public abstract Card getCard();

    public abstract long getCreatedAt();

    public String getDescription() {
        return getCard().getDescription();
    }

    public abstract String getId();

    public abstract ReactionReply getReactionReply();

    public String getText() {
        return getCard().getText();
    }

    public String getTitle() {
        return getCard().getTitle();
    }

    public String getType() {
        return getCard().getType();
    }

    public abstract long getUpdatedAt();
}
