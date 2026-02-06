package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;

public class UpdateUserResponse extends UsersResponse {
    private final String botBehaviourId;
    private final BotIntro botIntro;
    private final Carousel carousel;
    private final SurveyData surveyData;
    private final TeamPresence teamPresence;

    UpdateUserResponse(Builder builder) {
        super(builder);
        TeamPresence teamPresence2 = builder.team_presence;
        this.teamPresence = teamPresence2 == null ? TeamPresence.NULL : teamPresence2;
        Carousel.Builder builder2 = builder.carousel;
        this.carousel = (builder2 == null ? new Carousel.Builder() : builder2).build();
        BotIntro botIntro2 = builder.bot_intro;
        this.botIntro = botIntro2 == null ? BotIntro.NULL : botIntro2;
        SurveyData surveyData2 = builder.survey;
        this.surveyData = surveyData2 == null ? SurveyData.Companion.getNULL() : surveyData2;
        this.botBehaviourId = builder.resolution_bot_behavior_version_id;
    }

    public String getBotBehaviourId() {
        return this.botBehaviourId;
    }

    public BotIntro getBotIntro() {
        return this.botIntro;
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public SurveyData getSurveyData() {
        return this.surveyData;
    }

    public TeamPresence getTeamPresence() {
        return this.teamPresence;
    }

    public static final class Builder extends UsersResponse.Builder {
        BotIntro bot_intro;
        Carousel.Builder carousel;
        String resolution_bot_behavior_version_id;
        SurveyData survey;
        TeamPresence team_presence;

        public UpdateUserResponse build() {
            return new UpdateUserResponse(this);
        }
    }
}
