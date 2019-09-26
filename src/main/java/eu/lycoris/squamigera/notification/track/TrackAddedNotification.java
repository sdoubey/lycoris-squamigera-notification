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
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class TrackAddedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "TRACK_ADDED_NOTIFICATION";

  public static TrackAddedNotificationBuilder builder(
      @NonNull UUID id,
      @NonNull String title,
      @NonNull String fileName,
      @NonNull String sourceFileName,
      @NonNull String fileHash) {
    return new TrackAddedNotificationBuilder()
        .id(id)
        .title(title)
        .fileName(fileName)
        .sourceFileName(sourceFileName)
        .fileHash(fileHash);
  }

  @NonNull private UUID id;

  @NonNull private String title;

  @NonNull private String fileName;

  @NonNull private String sourceFileName;

  @NonNull private String fileHash;

  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
