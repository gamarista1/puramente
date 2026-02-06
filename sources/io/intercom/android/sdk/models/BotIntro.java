package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/BotIntro;", "", "id", "", "operator", "Lio/intercom/android/sdk/models/Participant$Builder;", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/models/Participant$Builder;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getOperator", "()Lio/intercom/android/sdk/models/Participant$Builder;", "getBlocks", "()Ljava/util/List;", "getBuiltParticipant", "Lio/intercom/android/sdk/models/Participant;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BotIntro {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final BotIntro NULL = new BotIntro((String) null, (Participant.Builder) null, (List) null, 7, (DefaultConstructorMarker) null);
    @c("parts")
    private final List<List<Block.Builder>> blocks;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f70030id;
    @c("operator")
    private final Participant.Builder operator;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/BotIntro$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/BotIntro;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BotIntro() {
        this((String) null, (Participant.Builder) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BotIntro copy$default(BotIntro botIntro, String str, Participant.Builder builder, List<List<Block.Builder>> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = botIntro.f70030id;
        }
        if ((i10 & 2) != 0) {
            builder = botIntro.operator;
        }
        if ((i10 & 4) != 0) {
            list = botIntro.blocks;
        }
        return botIntro.copy(str, builder, list);
    }

    public final String component1() {
        return this.f70030id;
    }

    public final Participant.Builder component2() {
        return this.operator;
    }

    public final List<List<Block.Builder>> component3() {
        return this.blocks;
    }

    public final BotIntro copy(String str, Participant.Builder builder, List<? extends List<Block.Builder>> list) {
        C6496s.h(str, "id");
        C6496s.h(builder, "operator");
        C6496s.h(list, "blocks");
        return new BotIntro(str, builder, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotIntro)) {
            return false;
        }
        BotIntro botIntro = (BotIntro) obj;
        return C6496s.c(this.f70030id, botIntro.f70030id) && C6496s.c(this.operator, botIntro.operator) && C6496s.c(this.blocks, botIntro.blocks);
    }

    public final List<List<Block.Builder>> getBlocks() {
        return this.blocks;
    }

    public final Participant getBuiltParticipant() {
        Participant build = this.operator.build();
        C6496s.g(build, "build(...)");
        return build;
    }

    public final String getId() {
        return this.f70030id;
    }

    public final Participant.Builder getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return (((this.f70030id.hashCode() * 31) + this.operator.hashCode()) * 31) + this.blocks.hashCode();
    }

    public String toString() {
        return "BotIntro(id=" + this.f70030id + ", operator=" + this.operator + ", blocks=" + this.blocks + ')';
    }

    public BotIntro(String str, Participant.Builder builder, List<? extends List<Block.Builder>> list) {
        C6496s.h(str, "id");
        C6496s.h(builder, "operator");
        C6496s.h(list, "blocks");
        this.f70030id = str;
        this.operator = builder;
        this.blocks = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BotIntro(String str, Participant.Builder builder, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new Participant.Builder() : builder, (i10 & 4) != 0 ? C6565s.n() : list);
    }
}
