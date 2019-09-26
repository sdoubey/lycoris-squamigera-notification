package eu.lycoris.squamigera.notification.track;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Getter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class TrackConvertionDelayedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "TRACK_CONVERTION_DELAYED_NOTIFICATION";

  public static TrackConvertionDelayedNotificationBuilder builder(@NonNull UUID id) {
    return new TrackConvertionDelayedNotificationBuilder().id(id);
  }

  @NonNull private UUID id;

  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
